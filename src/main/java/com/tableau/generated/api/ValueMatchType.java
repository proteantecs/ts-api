
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueMatchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valueMatchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://tableau.com/api}semanticsValueType" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valueConcept" type="{http://tableau.com/api}valueConceptType" minOccurs="0"/>
 *         &lt;element name="valueConceptURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldConceptURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueMatchType", namespace = "http://tableau.com/api", propOrder = {
    "value",
    "weight",
    "valueConcept",
    "valueConceptURI",
    "fieldConceptURI"
})
public class ValueMatchType {

    @XmlElement(namespace = "http://tableau.com/api")
    protected SemanticsValueType value;
    @XmlElement(namespace = "http://tableau.com/api")
    protected Double weight;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ValueConceptType valueConcept;
    @XmlElement(namespace = "http://tableau.com/api")
    protected String valueConceptURI;
    @XmlElement(namespace = "http://tableau.com/api")
    protected String fieldConceptURI;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link SemanticsValueType }
     *     
     */
    public SemanticsValueType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticsValueType }
     *     
     */
    public void setValue(SemanticsValueType value) {
        this.value = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the valueConcept property.
     * 
     * @return
     *     possible object is
     *     {@link ValueConceptType }
     *     
     */
    public ValueConceptType getValueConcept() {
        return valueConcept;
    }

    /**
     * Sets the value of the valueConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueConceptType }
     *     
     */
    public void setValueConcept(ValueConceptType value) {
        this.valueConcept = value;
    }

    /**
     * Gets the value of the valueConceptURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueConceptURI() {
        return valueConceptURI;
    }

    /**
     * Sets the value of the valueConceptURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueConceptURI(String value) {
        this.valueConceptURI = value;
    }

    /**
     * Gets the value of the fieldConceptURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldConceptURI() {
        return fieldConceptURI;
    }

    /**
     * Sets the value of the fieldConceptURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldConceptURI(String value) {
        this.fieldConceptURI = value;
    }

}
