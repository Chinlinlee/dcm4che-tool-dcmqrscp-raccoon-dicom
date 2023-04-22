package org.dcm4che3.tool.dcmqrscp;

import org.bson.Document;
import org.dcm4che3.data.*;
import org.dcm4che3.util.TagUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MongoPatient {
    protected final Document patient;
    protected static final ElementDictionary dict = ElementDictionary.getStandardElementDictionary();
    public static int[] PATIENT_SUPPORT_TAG = new int[]{
            Tag.PatientName,
            Tag.PatientID,
            Tag.PatientBirthDate,
            Tag.PatientBirthTime,
            Tag.PatientSex
    };

    public MongoPatient(Document patient) {
        this.patient = patient;
    }

    public String getPatientName() {

        List<Document> patientNameList = MongoDicomJson.getValueItem(this.patient, "00100010");

        if (patientNameList != null && patientNameList.size() > 0 ) {
            return patientNameList.get(0).getString("Alphabetic");
        }

        return "";

    }

    public String getPatientID() {
        return MongoDicomJson.getString(this.patient, "00100020");
    }

    public String getPatientBirthDate() {
        List<Date> patientBirthDateList;
        try {
            patientBirthDateList = this.patient
                    .get("00100030", Document.class)
                    .getList("Value", Date.class);
        } catch (Exception e) {
            return "";
        }

        if (patientBirthDateList != null && patientBirthDateList.size() > 0) {
            Date patientBirthDate = patientBirthDateList.get(0);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            return simpleDateFormat.format(patientBirthDate);
        }

        return "";
    }

    public String getPatientBirthTime() {
        return MongoDicomJson.getString(this.patient, "00100032");
    }

    public String getPatientSex() {
        return MongoDicomJson.getString(this.patient, "00100040");
    }

    public String getSpecificCharacterSet() {
        return MongoDicomJson.getString(this.patient, "00080005");
    }

    public Attributes getAttributes() {
        Attributes attributes = new Attributes();

        if (!this.getPatientName().equals(""))
            attributes.setValue(Tag.PatientName, dict.vrOf(Tag.PatientName), this.getPatientName());

        if (!this.getPatientID().equals(""))
            attributes.setValue(Tag.PatientID, dict.vrOf(Tag.PatientID), this.getPatientID());

        if (!this.getPatientBirthDate().equals(""))
            attributes.setValue(Tag.PatientBirthDate, dict.vrOf(Tag.PatientBirthDate), this.getPatientBirthDate());

        if (!this.getPatientBirthTime().equals(""))
            attributes.setValue(Tag.PatientBirthTime, dict.vrOf(Tag.PatientBirthTime), this.getPatientBirthTime());

        if (!this.getPatientSex().equals(""))
            attributes.setValue(Tag.PatientSex, dict.vrOf(Tag.PatientSex), this.getPatientSex());

        if (!this.getSpecificCharacterSet().equals("") && !this.getSpecificCharacterSet().equals("ISO_IR 192"))
            attributes.setValue(Tag.SpecificCharacterSet, dict.vrOf(Tag.SpecificCharacterSet), this.getSpecificCharacterSet());

        return attributes;
    }
}
