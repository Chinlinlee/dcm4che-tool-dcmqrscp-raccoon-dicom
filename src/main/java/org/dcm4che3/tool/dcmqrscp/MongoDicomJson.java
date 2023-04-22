package org.dcm4che3.tool.dcmqrscp;

import org.bson.Document;
import org.bson.types.Decimal128;

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

    static public double getDouble(Document dicomJson, String tag) {
        List<Decimal128> bigDecimalList;
        try {
            bigDecimalList = dicomJson.get(tag, Document.class)
                    .getList("Value", Decimal128.class);
        } catch (Exception e) {
            return 0;
        }

        if (bigDecimalList != null && bigDecimalList.size() > 0) {
            return bigDecimalList.get(0).doubleValue();
        }

        return 0;
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
