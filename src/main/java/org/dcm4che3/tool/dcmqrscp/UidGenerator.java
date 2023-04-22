package org.dcm4che3.tool.dcmqrscp;

import java.math.BigInteger;

public class UidGenerator {
    public static String generateUidFromGuid(String iGuid) {
        String guidBytes = iGuid.replaceAll("-", ""); //add prefix 0 and remove `-`
        BigInteger bigInteger = new BigInteger(guidBytes, 16); //parse the integer with base 16 from uuid string
        return "2.25." + bigInteger.toString(); //Output the previus parsed integer as string by adding `2.25.` as prefix
    }
}
