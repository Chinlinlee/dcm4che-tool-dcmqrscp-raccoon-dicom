package org.dcm4che3.tool.dcmqrscp;

import org.bson.Document;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class MongoStudy extends  MongoPatient{

    protected final Document study;

    public MongoStudy(Document patient, Document study) {
        super(patient);
        this.study = study;
    }

    public String getStudyDate() {
        List<Date> studyDateList;
        try {
            studyDateList = this.study
                    .get("00080020", Document.class)
                    .getList("Value", Date.class);
        } catch(Exception e) {
            System.out.println(e.getStackTrace());
            return "";
        }

        if (studyDateList != null && studyDateList.size() > 0) {
            Instant studyDate = studyDateList.get(0).toInstant();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd").withZone(ZoneId.of("UTC"));;
            return dateTimeFormatter.format(studyDate);
        }

        return "";
    }

    public String getStudyTime() {
        return MongoDicomJson.getString(this.study, "00080030");
    }

    public String getAccessionNumber() {
        return MongoDicomJson.getString(this.study, "00080050");
    }

    public String getStudyDescription() {
        return MongoDicomJson.getString(this.study, "00081030");
    }

    public String getStudyID() {
        return MongoDicomJson.getString(this.study, "00200010");
    }

    public String getStudyInstanceUID() {
        return MongoDicomJson.getString(this.study, "0020000D");
    }


    public Attributes getAttributes() {
        Attributes attributes = new Attributes();
        Attributes patientAttr = super.getAttributes();

        attributes.addAll(patientAttr);

        if (!this.getStudyDate().equals(""))
            attributes.setValue(Tag.StudyDate, dict.vrOf(Tag.StudyDate), this.getStudyDate());

        if (!this.getStudyTime().equals(""))
            attributes.setValue(Tag.StudyTime, dict.vrOf(Tag.StudyTime), this.getStudyTime());

        if (!this.getAccessionNumber().equals(""))
            attributes.setValue(Tag.AccessionNumber, dict.vrOf(Tag.AccessionNumber), this.getAccessionNumber());

        if (!this.getStudyDescription().equals(""))
            attributes.setValue(Tag.PatientBirthTime, dict.vrOf(Tag.PatientBirthTime), this.getStudyDescription());

        if (!this.getStudyID().equals(""))
            attributes.setValue(Tag.StudyID, dict.vrOf(Tag.StudyID), this.getStudyID());

        attributes.setValue(Tag.StudyInstanceUID, dict.vrOf(Tag.StudyInstanceUID), this.getStudyInstanceUID());

        return attributes;
    }

}
