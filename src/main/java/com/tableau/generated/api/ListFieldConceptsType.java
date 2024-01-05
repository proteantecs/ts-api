
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
 * <p>Java class for listFieldConceptsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listFieldConceptsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldConcepts" type="{http://tableau.com/api}fieldConceptType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nextPageToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listFieldConceptsType", namespace = "http://tableau.com/api", propOrder = {
    "fieldConcepts",
    "nextPageToken"
})
public class ListFieldConceptsType {

    @XmlElement(namespace = "http://tableau.com/api")
    protected List<FieldConceptType> fieldConcepts;
    @XmlElement(namespace = "http://tableau.com/api", required = true)
    protected String nextPageToken;

    /**
     * Gets the value of the fieldConcepts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldConcepts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldConcepts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldConceptType }
     * 
     * 
     */
    public List<FieldConceptType> getFieldConcepts() {
        if (fieldConcepts == null) {
            fieldConcepts = new ArrayList<FieldConceptType>();
        }
        return this.fieldConcepts;
    }

    /**
     * Gets the value of the nextPageToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * Sets the value of the nextPageToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextPageToken(String value) {
        this.nextPageToken = value;
    }

}
