
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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sampleValues" type="{http://tableau.com/api}distinctValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://tableau.com/api}dataTypeType" minOccurs="0"/>
 *         &lt;element name="fieldRole" type="{http://tableau.com/api}fieldRoleType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldType", namespace = "http://tableau.com/api", propOrder = {
    "sampleValues",
    "dataType",
    "fieldRole",
    "name"
})
public class FieldType {

    @XmlElement(namespace = "http://tableau.com/api")
    protected List<DistinctValueType> sampleValues;
    @XmlElement(namespace = "http://tableau.com/api")
    @XmlSchemaType(name = "string")
    protected DataTypeType dataType;
    @XmlElement(namespace = "http://tableau.com/api")
    @XmlSchemaType(name = "string")
    protected FieldRoleType fieldRole;
    @XmlElement(namespace = "http://tableau.com/api")
    protected String name;

    /**
     * Gets the value of the sampleValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sampleValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSampleValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistinctValueType }
     * 
     * 
     */
    public List<DistinctValueType> getSampleValues() {
        if (sampleValues == null) {
            sampleValues = new ArrayList<DistinctValueType>();
        }
        return this.sampleValues;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataTypeType }
     *     
     */
    public DataTypeType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeType }
     *     
     */
    public void setDataType(DataTypeType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the fieldRole property.
     * 
     * @return
     *     possible object is
     *     {@link FieldRoleType }
     *     
     */
    public FieldRoleType getFieldRole() {
        return fieldRole;
    }

    /**
     * Sets the value of the fieldRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldRoleType }
     *     
     */
    public void setFieldRole(FieldRoleType value) {
        this.fieldRole = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
