
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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revisionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revisionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="revision" type="{http://tableau.com/api}revisionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revisionListType", namespace = "http://tableau.com/api", propOrder = {
    "revision"
})
public class RevisionListType {

    @XmlElement(namespace = "http://tableau.com/api")
    protected List<RevisionType> revision;

    /**
     * Gets the value of the revision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevisionType }
     * 
     * 
     */
    public List<RevisionType> getRevision() {
        if (revision == null) {
            revision = new ArrayList<RevisionType>();
        }
        return this.revision;
    }

}