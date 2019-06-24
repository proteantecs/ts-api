
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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importDirectiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importDirectiveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="source" use="required" type="{http://tableau.com/api}importSourceType" />
 *       &lt;attribute name="domainName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteRole" use="required" type="{http://tableau.com/api}siteRoleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importDirectiveType", namespace = "http://tableau.com/api")
public class ImportDirectiveType {

    @XmlAttribute(name = "source", required = true)
    protected ImportSourceType source;
    @XmlAttribute(name = "domainName", required = true)
    protected String domainName;
    @XmlAttribute(name = "siteRole", required = true)
    protected SiteRoleType siteRole;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ImportSourceType }
     *     
     */
    public ImportSourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportSourceType }
     *     
     */
    public void setSource(ImportSourceType value) {
        this.source = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the siteRole property.
     * 
     * @return
     *     possible object is
     *     {@link SiteRoleType }
     *     
     */
    public SiteRoleType getSiteRole() {
        return siteRole;
    }

    /**
     * Sets the value of the siteRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteRoleType }
     *     
     */
    public void setSiteRole(SiteRoleType value) {
        this.siteRole = value;
    }

}
