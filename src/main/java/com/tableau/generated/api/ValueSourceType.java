
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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valueSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="datasourceValueStore" type="{http://tableau.com/api}dataSourceValueStoreType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueSourceType", namespace = "http://tableau.com/api", propOrder = {
    "datasourceValueStore"
})
public class ValueSourceType {

    @XmlElement(namespace = "http://tableau.com/api")
    protected DataSourceValueStoreType datasourceValueStore;

    /**
     * Gets the value of the datasourceValueStore property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceValueStoreType }
     *     
     */
    public DataSourceValueStoreType getDatasourceValueStore() {
        return datasourceValueStore;
    }

    /**
     * Sets the value of the datasourceValueStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceValueStoreType }
     *     
     */
    public void setDatasourceValueStore(DataSourceValueStoreType value) {
        this.datasourceValueStore = value;
    }

}
