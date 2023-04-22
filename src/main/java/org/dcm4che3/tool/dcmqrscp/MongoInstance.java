package org.dcm4che3.tool.dcmqrscp;

import org.bson.Document;
import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.Tag;

import java.io.File;
import java.nio.file.Paths;

public class MongoInstance extends MongoSeries {
    private final Document instance;
    private final String storeRootPath;

    public MongoInstance(Document patient, Document study, Document series, Document instance, String rootPath) {
        super(patient, study, series);
        this.instance = instance;
        this.storeRootPath = rootPath;
    }

    public String getSOPInstanceUID() {
        return MongoDicomJson.getString(this.instance, "00080018");
    }

    public String getInstanceNumber() {
        return MongoDicomJson.getString(this.instance, "00200013");
    }

    public String getTransferSyntaxUID() {
        return MongoDicomJson.getString(this.instance, "00020010");
    }

    public String getSOPClassUID() {
        return MongoDicomJson.getString(this.instance, "00080016");
    }

    public String getStorePath() {
        String path = this.instance.getString("instancePath");
        return Paths.get(this.storeRootPath, path).toAbsolutePath().toString();
    }

    public File getInstanceFile() {
        String filePath = this.getStorePath();
        return new File(filePath);
    }

    public String getStorePathURI() {
        File instanceFile = this.getInstanceFile();
        return instanceFile.toURI().toString();
    }

    @Override
    public Attributes getAttributes() {
        Attributes attributes = new Attributes();
        Attributes seriesAttr = super.getAttributes();

        attributes.addAll(seriesAttr);

        if (!this.getInstanceNumber().equals("")) {
            attributes.setValue(Tag.InstanceNumber, dict.vrOf(Tag.InstanceNumber), this.getInstanceNumber());
        }

        attributes.setValue(Tag.TransferSyntaxUID, dict.vrOf(Tag.TransferSyntaxUID), this.getTransferSyntaxUID());
        attributes.setValue(Tag.SOPClassUID, dict.vrOf(Tag.SOPClassUID), this.getSOPClassUID());
        attributes.setValue(Tag.SOPInstanceUID, dict.vrOf(Tag.SOPInstanceUID), this.getSOPInstanceUID());

        return attributes;
    }
}
