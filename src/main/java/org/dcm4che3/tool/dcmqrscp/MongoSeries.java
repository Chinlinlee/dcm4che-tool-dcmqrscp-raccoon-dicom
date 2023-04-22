package org.dcm4che3.tool.dcmqrscp;

import org.bson.Document;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;

import java.util.List;

public class MongoSeries extends MongoStudy {
    protected final Document series;

    public MongoSeries(Document patient, Document study, Document series) {
        super(patient, study);
        this.series = series;
    }

    public String getModality() {
        return MongoDicomJson.getString(this.series, "00080060");
    }

    public String getSeriesInstanceUID() {
        return MongoDicomJson.getString(this.series, "0020000E");
    }

    public String getSeriesNumber() {
        return MongoDicomJson.getString(this.series, "00200011");
    }


    @Override
    public Attributes getAttributes() {
        Attributes attributes = new Attributes();
        Attributes studyAttr = super.getAttributes();

        attributes.addAll(studyAttr);

        if (!this.getModality().equals(""))
            attributes.setValue(Tag.Modality, dict.vrOf(Tag.Modality), this.getModality());

        if (!this.getSeriesNumber().equals(""))
            attributes.setValue(Tag.SeriesNumber, dict.vrOf(Tag.SeriesNumber), this.getSeriesNumber());


        attributes.setValue(Tag.SeriesInstanceUID, dict.vrOf(Tag.SeriesInstanceUID), this.getSeriesInstanceUID());

        return attributes;
    }
}
