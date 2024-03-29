
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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueConceptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valueConceptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldConceptURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="names" type="{http://tableau.com/api}nameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nameCharacteristics" type="{http://tableau.com/api}nameCharacteristicsType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentValueConceptURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueConceptType", namespace = "http://tableau.com/api", propOrder = {
    "uri",
    "fieldConceptURI",
    "names",
    "nameCharacteristics",
    "description",
    "parentValueConceptURI"
})
public class ValueConceptType {

    @XmlElement(namespace = "http://tableau.com/api", required = true)
    protected String uri;
    @XmlElement(namespace = "http://tableau.com/api", required = true)
    protected String fieldConceptURI;
    @XmlElement(namespace = "http://tableau.com/api")
    protected List<NameType> names;
    @XmlElement(namespace = "http://tableau.com/api")
    protected NameCharacteristicsType nameCharacteristics;
    @XmlElement(namespace = "http://tableau.com/api")
    protected String description;
    @XmlElement(namespace = "http://tableau.com/api")
    protected String parentValueConceptURI;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
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

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getNames() {
        if (names == null) {
            names = new ArrayList<NameType>();
        }
        return this.names;
    }

    /**
     * Gets the value of the nameCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link NameCharacteristicsType }
     *     
     */
    public NameCharacteristicsType getNameCharacteristics() {
        return nameCharacteristics;
    }

    /**
     * Sets the value of the nameCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameCharacteristicsType }
     *     
     */
    public void setNameCharacteristics(NameCharacteristicsType value) {
        this.nameCharacteristics = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the parentValueConceptURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentValueConceptURI() {
        return parentValueConceptURI;
    }

    /**
     * Sets the value of the parentValueConceptURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentValueConceptURI(String value) {
        this.parentValueConceptURI = value;
    }

}
