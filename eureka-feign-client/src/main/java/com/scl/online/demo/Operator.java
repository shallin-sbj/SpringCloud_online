/******************************************************************************* 
 * Copyright (C) Microfountain Technology, Inc. All Rights Reserved. 
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.   
 * Proprietary and confidential
 ******************************************************************************/
package com.scl.online.demo;

import java.util.HashMap;
import java.util.Map;

public enum Operator {

    /**
     * 中国联通
     */
    CUCC("联通"),
    /**
     * 中国移动
     */
    CMCC("移动"),
    /**
     * 中国电信
     */
    CTCC("电信");

    private String name;

    Operator(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    private static Map<String, Operator> iccidMap = new HashMap<String, Operator>() {
        {
            put("898601", CUCC);
            put("898609", CUCC);
            put("898600", CMCC);
            put("898602", CMCC);
            put("898603", CTCC);
            put("898606", CTCC);
        }
    };

    private static Map<String, Operator> imsiMap = new HashMap<String, Operator>() {
        {
            put("46001", CUCC);
            put("46006", CUCC);
            put("46009", CUCC);

            put("46000", CMCC);
            put("46002", CMCC);
            put("46004", CMCC);
            put("46007", CMCC);

            put("46003", CTCC);
            put("46005", CTCC);
            put("46011", CTCC);
        }
    };


    public static Operator fromIccid(String iccid) {
        return iccidMap.get(iccid);
    }

    public static Operator fromImsi(String imsi) {
        return imsiMap.get(imsi);
    }
}
