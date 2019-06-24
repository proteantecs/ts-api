
/*
 * Copyright (c)  2019 proteanTecs Ltd. All rights reserved.
 *
 * NOTICE:  All information contained herein is and remains the sole property of proteanTecs Ltd. ("proteanTecs"),
 * and any unauthorized use of this information is prohibited.  The intellectual property rights contained herein
 * are proprietary and confidential to proteanTecs,  may be covered by patents or patents applications,
 * and are protected by trade secret or copyright law. Dissemination, distribution or reproduction of this information,
 * in any form or by any means, including photocopying, recording, or other electronic or mechanical methods,
 * is strictly forbidden unless prior written permission is expressly obtained from proteanTecs.
 * Nothing contained herein shall be construed as conferring any license or right under any proteanTecs patent,
 * copyright, or trademark.
 */

package com.tableau.generated.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATA_TYPE_UNSPECIFIED"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="DATETIME"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="FLOAT"/>
 *     &lt;enumeration value="BOOL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataTypeType", namespace = "http://tableau.com/api")
@XmlEnum
public enum DataTypeType {

    DATA_TYPE_UNSPECIFIED,
    DATE,
    DATETIME,
    STRING,
    INT,
    FLOAT,
    BOOL;

    public String value() {
        return name();
    }

    public static DataTypeType fromValue(String v) {
        return valueOf(v);
    }

}
