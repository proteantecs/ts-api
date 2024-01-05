
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

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for groupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="groupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domain" type="{http://tableau.com/api}domainDirectiveType" minOccurs="0"/>
 *         &lt;element name="import" type="{http://tableau.com/api}importDirectiveType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://tableau.com/api}resourceIdType" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="minimumSiteRole" type="{http://tableau.com/api}siteRoleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupType", namespace = "http://tableau.com/api", propOrder = {
    "domain",
    "_import"
})
public class GroupType {

    @XmlElement(namespace = "http://tableau.com/api")
    protected DomainDirectiveType domain;
    @XmlElement(name = "import", namespace = "http://tableau.com/api")
    protected ImportDirectiveType _import;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "userCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger userCount;
    @XmlAttribute(name = "minimumSiteRole")
    protected SiteRoleType minimumSiteRole;

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link DomainDirectiveType }
     *     
     */
    public DomainDirectiveType getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainDirectiveType }
     *     
     */
    public void setDomain(DomainDirectiveType value) {
        this.domain = value;
    }

    /**
     * Gets the value of the import property.
     * 
     * @return
     *     possible object is
     *     {@link ImportDirectiveType }
     *     
     */
    public ImportDirectiveType getImport() {
        return _import;
    }

    /**
     * Sets the value of the import property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDirectiveType }
     *     
     */
    public void setImport(ImportDirectiveType value) {
        this._import = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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

    /**
     * Gets the value of the userCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserCount() {
        return userCount;
    }

    /**
     * Sets the value of the userCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserCount(BigInteger value) {
        this.userCount = value;
    }

    /**
     * Gets the value of the minimumSiteRole property.
     * 
     * @return
     *     possible object is
     *     {@link SiteRoleType }
     *     
     */
    public SiteRoleType getMinimumSiteRole() {
        return minimumSiteRole;
    }

    /**
     * Sets the value of the minimumSiteRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteRoleType }
     *     
     */
    public void setMinimumSiteRole(SiteRoleType value) {
        this.minimumSiteRole = value;
    }

}
