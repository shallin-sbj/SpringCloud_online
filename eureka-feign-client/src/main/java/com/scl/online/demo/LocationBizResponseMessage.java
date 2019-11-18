/******************************************************************************* 
 * Copyright (C) Microfountain Technology, Inc. All Rights Reserved. 
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.   
 * Proprietary and confidential
 ******************************************************************************/
package com.scl.online.demo;


import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @date 2019/9/23
 * 原V2接口响应对象
 */
@Data
public class LocationBizResponseMessage implements Serializable {

    private Area area;

    private Map<String, String> operator = new HashMap<>(2);

    public LocationBizResponseMessage(Area area, Operator operator) {
        this.area = area;
        this.operator.put("code", operator.name());
        this.operator.put("name", operator.getName());
    }
}
