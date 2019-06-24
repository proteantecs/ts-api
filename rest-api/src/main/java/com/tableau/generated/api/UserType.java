
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

import com.proteantecs.services.bi.tableau.generated.DomainDirectiveType;
import com.proteantecs.services.bi.tableau.generated.SiteRoleType;
import com.proteantecs.services.bi.tableau.generated.SiteUserAuthSettingType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for userType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domain" type="{http://tableau.com/api}domainDirectiveType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://tableau.com/api}resourceIdType" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="email" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteRole" type="{http://tableau.com/api}siteRoleType" />
 *       &lt;attribute name="authSetting" type="{http://tableau.com/api}siteUserAuthSettingType" />
 *       &lt;attribute name="lastLogin" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="externalAuthUserId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userType", namespace = "http://tableau.com/api", propOrder = {
    "domain"
})
public class UserType {

    @XmlElement(namespace = "http://tableau.com/api")
    protected DomainDirectiveType domain;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "fullName")
    protected String fullName;
    @XmlAttribute(name = "email")
    protected String email;
    @XmlAttribute(name = "password")
    protected String password;
    @XmlAttribute(name = "siteRole")
    protected SiteRoleType siteRole;
    @XmlAttribute(name = "authSetting")
    protected SiteUserAuthSettingType authSetting;
    @XmlAttribute(name = "lastLogin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLogin;
    @XmlAttribute(name = "externalAuthUserId")
    protected String externalAuthUserId;

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
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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

    /**
     * Gets the value of the authSetting property.
     * 
     * @return
     *     possible object is
     *     {@link SiteUserAuthSettingType }
     *     
     */
    public SiteUserAuthSettingType getAuthSetting() {
        return authSetting;
    }

    /**
     * Sets the value of the authSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteUserAuthSettingType }
     *     
     */
    public void setAuthSetting(SiteUserAuthSettingType value) {
        this.authSetting = value;
    }

    /**
     * Gets the value of the lastLogin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLogin() {
        return lastLogin;
    }

    /**
     * Sets the value of the lastLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLogin(XMLGregorianCalendar value) {
        this.lastLogin = value;
    }

    /**
     * Gets the value of the externalAuthUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAuthUserId() {
        return externalAuthUserId;
    }

    /**
     * Sets the value of the externalAuthUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAuthUserId(String value) {
        this.externalAuthUserId = value;
    }

}
