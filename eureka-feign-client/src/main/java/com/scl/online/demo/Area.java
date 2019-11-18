/******************************************************************************* 
 * Copyright (C) Microfountain Technology, Inc. All Rights Reserved. 
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.   
 * Proprietary and confidential
 ******************************************************************************/
package com.scl.online.demo;

import lombok.Data;


@Data
public class Area {

    public static final Area DEFAULT = new Area() {
        {
            setCountry(new SubArea("CN", "中国"));
        }
    };

    public Area() {
    }

    /**
     * 国家
     */
    private SubArea country;

    /**
     * 省份
     */
    private SubArea province;

    /**
     * 城市
     */
    private SubArea city;

    /**
     * 区县
     */
    private SubArea county;

    /**
     * 乡镇
     */
    private SubArea town;

    /**
     * 村庄
     */
    private SubArea village;

}
