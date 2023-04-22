package org.dcm4che3.tool.dcmqrscp;

import org.bson.Document;

import java.util.List;

public class MongoDicomJson {
    static public String getString(Document dicomJson, String tag) {
        List<String> stringList;

        try {
            stringList = dicomJson.get(tag, Document.class)
                    .getList("Value", String.class);
        } catch (Exception e) {
            return "";
        }

        if (stringList != null && stringList.size() > 0) {
            return stringList.get(0);
        }

        return "";
    }

    static public List<Document> getValueItem(Document dicomJson, String tag) {
        return dicomJson
                .get(tag, Document.class)
                .getList("Value", Document.class);
    }

    static public Document getDicomJson(Document doc) {
        return doc.get("dicomJson", Document.class);
    }
}
