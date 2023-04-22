package org.dcm4che3.tool.dcmqrscp;

import com.mongodb.client.*;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.ElementDictionary;
import org.dcm4che3.data.Tag;
import org.dcm4che3.util.StringUtils;
import org.dcm4che3.util.TagUtils;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class MongoDbReader {
    private MongoClient mongoClient;
    static private MongoDatabase mongoDatabase;
    static protected  MongoCollection patientCollection;
    static protected MongoCollection studyCollection;
    static protected MongoCollection seriesCollection;
    static private MongoCollection imageCollection;
    static protected String storageMediaFileSetUID;

    public MongoDbReader(MongoClient iMongoClient, RaccoonAppConfig.MongodbConfig mongoDbConfig) {
        this.mongoClient = iMongoClient;
        mongoDatabase = this.mongoClient.getDatabase(mongoDbConfig.getDatabase());
        patientCollection = mongoDatabase.getCollection("patient");
        studyCollection = mongoDatabase.getCollection("dicomStudy");
        seriesCollection = mongoDatabase.getCollection("dicomSeries");
        imageCollection = mongoDatabase.getCollection("dicom");

        storageMediaFileSetUID = UidGenerator.generateUidFromGuid(
                UUID5.nameUUIDFromNamespaceAndString(
                        UUID.fromString("be81894e-49fc-50cf-8c11-5983da942dac"),
                        mongoDbConfig.getDatabase()
                ).toString()
        );
    }


    public String getStorageMediaFileSetUID() {
        return storageMediaFileSetUID;
    }

    public MongoCursor<Document> findPatientRecord(String[] patientIds) {
        Bson[] patientIdFilter = new Bson[patientIds.length];
        for (int i = 0; i < patientIds.length; i++) {
            patientIdFilter[i] = Filters.eq("00100020.Value", patientIds[i]);
        }
        Bson orFilter = Filters.or(patientIdFilter);

        MongoCursor<Document> cursor = imageCollection.find(orFilter).iterator();
        return cursor;
    }


    public MongoCursor<Document> findPatientRecord(Attributes keys) {

        MongoCursor<Document> cursor;
        Bson query = MongoQueryFactory.getPatientQuery(keys);
        if (query!=null) {
            System.out.println(query.toBsonDocument().toJson().toString());
            cursor = patientCollection.find(query).iterator();
        } else {
            cursor = patientCollection.find().iterator();
        }

        return cursor;
    }


    public MongoCursor<Document> findStudyRecord(MongoPatient patient, String[] studyUIDs) {

        Bson patientIDFilter = Filters.eq("00100020.Value", patient.getPatientID());
        Bson orFilter;

        if (studyUIDs != null) {
            Bson[] studyUIDFilter = new Bson[studyUIDs.length];
            for (int i = 0; i < studyUIDs.length; i++) {
                studyUIDFilter[i] = Filters.eq("0020000D.Value", studyUIDs[i]);
            }
            Bson studyUIDsOrFilter = Filters.or(studyUIDFilter);

            orFilter = Filters.or(patientIDFilter, studyUIDsOrFilter);
        } else {
            orFilter = Filters.or(patientIDFilter);
        }

        MongoCursor<Document> cursor = studyCollection.find(
                orFilter
        ).cursor();

        return cursor;
    }

    public MongoCursor<Document> findStudyRecord(Attributes keys) {

        MongoCursor<Document> cursor;
        Bson query = MongoQueryFactory.getStudyQuery(keys);
        if (query!=null) {
            System.out.println(query.toBsonDocument().toJson().toString());
            cursor = studyCollection.find(query).cursor();
        } else {
            cursor = studyCollection.find().cursor();
        }

        return cursor;
    }


    public MongoCursor<Document> findSeriesRecord(MongoStudy study, String[] seriesUIDs) {
        String studyInstanceUID = study.getStudyInstanceUID();
        Bson studyInstanceUIDEq = Filters.eq("0020000D.Value", studyInstanceUID);

        if (seriesUIDs != null) {

            Bson[] seriesUIDsFilters = new Bson[seriesUIDs.length];
            for (int i = 0 ; i < seriesUIDs.length ; i++) {
                seriesUIDsFilters[i] = Filters.eq("0020000E.Value", seriesUIDs[i]);
            }

            return seriesCollection.find(
                    Filters.and(
                        studyInstanceUIDEq, Filters.or(seriesUIDsFilters)
                    )
            ).cursor();


        }

        return seriesCollection.find(studyInstanceUIDEq).cursor();

    }

    public MongoCursor<Document> findSeriesRecord(Attributes keys) {
        MongoCursor<Document> cursor;

        Bson query = MongoQueryFactory.getSeriesQuery(keys);

        if (query!=null) {
            System.out.println(query.toBsonDocument().toJson().toString());
            cursor = seriesCollection.find(query).cursor();
        } else {
            cursor = seriesCollection.find().cursor();
        }

        return cursor;
    }

    public MongoCursor<Document> findLowerInstanceRecord(MongoPatient patient,MongoStudy study, MongoSeries series, String[] sopUIDs) {
        String studyInstanceUID = study.getStudyInstanceUID();
        String seriesInstanceUID = series.getSeriesInstanceUID();

        Bson studyInstanceUIDEq = Filters.eq("0020000D.Value", studyInstanceUID);
        Bson seriesInstanceUIDEq = Filters.eq("0020000E.Value", seriesInstanceUID);

        if (sopUIDs != null) {

            Bson[] instanceUIDsFilters = new Bson[sopUIDs.length];
            for (int i = 0 ; i < sopUIDs.length ; i++) {
                instanceUIDsFilters[i] = Filters.eq("series.instance.dicomJson.00080018.Value", sopUIDs[i]);
            }


            return imageCollection.find(
                    Filters.and(
                            studyInstanceUIDEq,
                            seriesInstanceUIDEq,
                            Filters.or(instanceUIDsFilters)
                    )
            ).cursor();

        }

        return imageCollection.find(
                Filters.and(
                        studyInstanceUIDEq,
                        seriesInstanceUIDEq
                )
        ).cursor();

    }

    public MongoCursor<Document> findLowerInstanceRecord(Attributes keys) {
        MongoCursor<Document> cursor;
        Bson query = MongoQueryFactory.getInstanceQuery(keys);

        if (query!=null) {
            cursor = imageCollection.find(query).cursor();
        } else {
            cursor = imageCollection.find().cursor();
        }

        return cursor;
    }

}

class MongoQueryFactory {
    static protected ElementDictionary dict = ElementDictionary.getStandardElementDictionary();
    static protected int[] patientQueryTags = new int[] {
            Tag.PatientName,
            Tag.PatientID,
            Tag.PatientBirthDate
    };

    static protected int[] studyQueryTags = new int[] {
            Tag.PatientID,
            Tag.StudyInstanceUID,
            Tag.StudyDate,
            Tag.StudyTime,
            Tag.AccessionNumber
    };

    static protected int[] seriesQueryTags = new int[] {
            Tag.PatientID,
            Tag.StudyInstanceUID,
            Tag.SeriesInstanceUID,
            Tag.Modality,
            Tag.SeriesNumber
    };

    static protected int[] instanceQueryTags = new int[] {
            Tag.PatientID,
            Tag.StudyInstanceUID,
            Tag.SeriesInstanceUID,
            Tag.SOPInstanceUID,
            Tag.SOPClassUID,
            Tag.InstanceNumber
    };

    public static Bson getStringsQuery(String[] strings, String field) {
        Bson[] filterArr = new Bson[strings.length];
        for(int i = 0 ; i < strings.length ;i++) {
            if (strings[i].contains("*")) {
                strings[i] = strings[i].replace("*",".*");
                filterArr[i] = Filters.regex(field, strings[i], "gm");
            } else {
                filterArr[i] = Filters.eq(field, strings[i]);
            }
        }
        return Filters.or(filterArr);
    }


    public static Bson getDatesQuery(String[] dateStrs, String field) {
        Bson[] filterArr = new Bson[dateStrs.length];
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        for (int i = 0 ; i < dateStrs.length ; i++) {
            String dateStr = dateStrs[i];

            int dashIndex = dateStr.indexOf("-");
            if (dashIndex == 0) { // -YYYYMMDD

                LocalDate localDate = LocalDate.parse(dateStr.substring(1), dateTimeFormatter);
                filterArr[i] = Filters.lte(field, localDate.atTime(LocalTime.MAX));

            } else if (dashIndex == (dateStr.length()-1)) { // YYYYMMDD-

                LocalDate localDate = LocalDate.parse(dateStr.substring(0, dashIndex), dateTimeFormatter);
                filterArr[i] = Filters.gte(field, localDate.atTime(LocalTime.MIN));

            } else if (dashIndex > 0) { // YYYYMMDD-YYYYMMDD

                LocalDate startLocalDate = LocalDate.parse(dateStr.substring(0, dashIndex), dateTimeFormatter);
                LocalDate endLocalDate = LocalDate.parse(dateStr.substring(dashIndex+1), dateTimeFormatter);
                filterArr[i] = Filters.and(
                        Filters.gte(field, startLocalDate.atTime(LocalTime.MIN)),
                        Filters.lte(field, endLocalDate.atTime(LocalTime.MAX))
                );

            } else { // YYYYMMDD

                LocalDate localDate = LocalDate.parse(dateStr, dateTimeFormatter);
                filterArr[i] = Filters.and(
                        Filters.gte(field, localDate.atTime(LocalTime.MIN)),
                        Filters.lte(field, localDate.atTime(LocalTime.MAX))
                );

            }
        }

        return Filters.or(filterArr);
    }

    public static double getTimeFromStr(String str) {
        double inputTimeD = Double.parseDouble(str);
        String timeStrPaddingZero = String.format("%06.6f", inputTimeD);
        return Double.parseDouble(timeStrPaddingZero);
    }

    public static Bson getTimeQuery(String[] timeStrs, String field) {
        Bson[] filterArr = new Bson[timeStrs.length];

        for (int i = 0 ; i < timeStrs.length ; i++) {

            int dashIndex = timeStrs[i].indexOf("-");
            if (dashIndex == 0) { // -HHmmss

                String timeStr = timeStrs[i].substring(1);
                Double time = getTimeFromStr(timeStr);
                filterArr[i] = Filters.lte(field, time);

            } else if (dashIndex == (timeStrs[i].length()-1)) { // HHmmss-

                String timeStr = timeStrs[i].substring(dashIndex);
                Double time = getTimeFromStr(timeStr);
                filterArr[i] = Filters.gte(field,  time);

            } else if (dashIndex > 0) { // HHmmss-HHmmss

                String startTimeStr = timeStrs[i].substring(1, dashIndex);
                String endTimeStr = timeStrs[i].substring(dashIndex);

                Double startTime = getTimeFromStr(startTimeStr);
                Double endTime = getTimeFromStr(endTimeStr);

                filterArr[i] = Filters.and(
                        Filters.gte(field, startTime),
                        Filters.lte(field, endTime)
                );

            } else { // HHmmss

                Double time = getTimeFromStr(timeStrs[i]);
                filterArr[i] = Filters.eq(field, time);

            }
        }

        return Filters.or(filterArr);
    }

    public static Bson getPatientQuery(Attributes keys) {
        return getBsonQuery(keys, patientQueryTags);
    }

    public static Bson getStudyQuery(Attributes keys) {
        return getBsonQuery(keys, studyQueryTags);
    }

    public static Bson getSeriesQuery(Attributes keys) {
        return getBsonQuery(keys, seriesQueryTags);
    }

    public static Bson getInstanceQuery(Attributes keys) {
        return getBsonQuery(keys, instanceQueryTags);
    }


    public static Bson getBsonQuery(Attributes keys, int[] tags) {
        List<Bson> queries = new ArrayList<>();


        for (int tag : tags) {
            String[] tagStringValues = StringUtils.maskNull(keys.getStrings(tag));
            String tagVR = dict.vrOf(tag).toString();

            Bson myFilter;
            if (tagVR.equals("DA")) {

                myFilter = MongoQueryFactory.getDatesQuery(
                        tagStringValues,
                        MessageFormat.format("{0}.Value", TagUtils.toHexString(tag))
                );

            } else if (tagVR.equals("TM")) {

                myFilter = MongoQueryFactory.getTimeQuery(
                        tagStringValues,
                        MessageFormat.format("{0}.Value", TagUtils.toHexString(tag))
                );

            } else {

                myFilter = MongoQueryFactory.getStringsQuery(
                        tagStringValues,
                        MessageFormat.format("{0}.Value", TagUtils.toHexString(tag))
                );
                if (tagVR.equals("PN")) {
                    myFilter = MongoQueryFactory.getStringsQuery(
                            tagStringValues,
                            MessageFormat.format("{0}.Value.Alphabetic", TagUtils.toHexString(tag))
                    );
                }

            }

            if (!myFilter.toBsonDocument().get("$or").asArray().isEmpty())
                queries.add(myFilter);

        }

        if (queries.size() > 0 )
            return Filters.and(queries);

        return null;
    }

}
