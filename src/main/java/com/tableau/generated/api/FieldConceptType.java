
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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for fieldConceptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fieldConceptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectConceptURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="names" type="{http://tableau.com/api}nameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nameCharacteristics" type="{http://tableau.com/api}nameCharacteristicsType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentFieldConceptURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataTypes" type="{http://tableau.com/api}dataTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fieldRoles" type="{http://tableau.com/api}fieldRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="defaultFormats" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valueCharacteristics" type="{http://tableau.com/api}valueCharacteristicsType" minOccurs="0"/>
 *         &lt;element name="ownerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="valueSource" type="{http://tableau.com/api}valueSourceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldConceptType", namespace = "http://tableau.com/api", propOrder = {
    "uri",
    "objectConceptURI",
    "names",
    "nameCharacteristics",
    "description",
    "parentFieldConceptURI",
    "dataTypes",
    "fieldRoles",
    "defaultFormats",
    "valueCharacteristics",
    "ownerID",
    "createdAt",
    "updatedAt",
    "valueSource"
})
public class FieldConceptType {

    @XmlElement(namespace = "http://tableau.com/api", required = true)
    protected String uri;
    @XmlElement(namespace = "http://tableau.com/api", required = true)
    protected String objectConceptURI;
    @XmlElement(namespace = "http://tableau.com/api")
    protected List<NameType> names;
    @XmlElement(namespace = "http://tableau.com/api")
    protected NameCharacteristicsType nameCharacteristics;
    @XmlElement(namespace = "http://tableau.com/api")
    protected String description;
    @XmlElement(namespace = "http://tableau.com/api")
    protected String parentFieldConceptURI;
    @XmlElement(namespace = "http://tableau.com/api")
    @XmlSchemaType(name = "string")
    protected List<DataTypeType> dataTypes;
    @XmlElement(namespace = "http://tableau.com/api")
    @XmlSchemaType(name = "string")
    protected List<FieldRoleType> fieldRoles;
    @XmlElement(namespace = "http://tableau.com/api")
    protected List<String> defaultFormats;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ValueCharacteristicsType valueCharacteristics;
    @XmlElement(namespace = "http://tableau.com/api")
    protected String ownerID;
    @XmlElement(namespace = "http://tableau.com/api")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(namespace = "http://tableau.com/api")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ValueSourceType valueSource;

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
     * Gets the value of the objectConceptURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectConceptURI() {
        return objectConceptURI;
    }

    /**
     * Sets the value of the objectConceptURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectConceptURI(String value) {
        this.objectConceptURI = value;
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
     * Gets the value of the parentFieldConceptURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentFieldConceptURI() {
        return parentFieldConceptURI;
    }

    /**
     * Sets the value of the parentFieldConceptURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentFieldConceptURI(String value) {
        this.parentFieldConceptURI = value;
    }

    /**
     * Gets the value of the dataTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataTypeType }
     * 
     * 
     */
    public List<DataTypeType> getDataTypes() {
        if (dataTypes == null) {
            dataTypes = new ArrayList<DataTypeType>();
        }
        return this.dataTypes;
    }

    /**
     * Gets the value of the fieldRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldRoleType }
     * 
     * 
     */
    public List<FieldRoleType> getFieldRoles() {
        if (fieldRoles == null) {
            fieldRoles = new ArrayList<FieldRoleType>();
        }
        return this.fieldRoles;
    }

    /**
     * Gets the value of the defaultFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDefaultFormats() {
        if (defaultFormats == null) {
            defaultFormats = new ArrayList<String>();
        }
        return this.defaultFormats;
    }

    /**
     * Gets the value of the valueCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link ValueCharacteristicsType }
     *     
     */
    public ValueCharacteristicsType getValueCharacteristics() {
        return valueCharacteristics;
    }

    /**
     * Sets the value of the valueCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueCharacteristicsType }
     *     
     */
    public void setValueCharacteristics(ValueCharacteristicsType value) {
        this.valueCharacteristics = value;
    }

    /**
     * Gets the value of the ownerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the value of the ownerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerID(String value) {
        this.ownerID = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedAt(XMLGregorianCalendar value) {
        this.updatedAt = value;
    }

    /**
     * Gets the value of the valueSource property.
     * 
     * @return
     *     possible object is
     *     {@link ValueSourceType }
     *     
     */
    public ValueSourceType getValueSource() {
        return valueSource;
    }

    /**
     * Sets the value of the valueSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSourceType }
     *     
     */
    public void setValueSource(ValueSourceType value) {
        this.valueSource = value;
    }

}
