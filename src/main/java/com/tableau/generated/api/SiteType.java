
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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for siteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="siteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="numUsers" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="storage" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://tableau.com/api}resourceIdType" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contentUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="adminMode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ContentOnly"/>
 *             &lt;enumeration value="ContentAndUsers"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="userQuota" type="{http://tableau.com/api}siteQuotaType" />
 *       &lt;attribute name="storageQuota" type="{http://tableau.com/api}siteQuotaType" />
 *       &lt;attribute name="tierCreatorCapacity" type="{http://tableau.com/api}siteCapacityType" />
 *       &lt;attribute name="tierExplorerCapacity" type="{http://tableau.com/api}siteCapacityType" />
 *       &lt;attribute name="tierViewerCapacity" type="{http://tableau.com/api}siteCapacityType" />
 *       &lt;attribute name="disableSubscriptions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="state" type="{http://tableau.com/api}stateType" />
 *       &lt;attribute name="revisionHistoryEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="revisionLimit" type="{http://tableau.com/api}revisionLimitType" />
 *       &lt;attribute name="subscribeOthersEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="guestAccessEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="cacheWarmupEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="commentingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="cacheeWarmupThreshold" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="flowsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="extractEncryptionMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "siteType", namespace = "http://tableau.com/api", propOrder = {
    "usage"
})
public class SiteType {

    @XmlElement(namespace = "http://tableau.com/api")
    protected SiteType.Usage usage;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "contentUrl")
    protected String contentUrl;
    @XmlAttribute(name = "adminMode")
    protected String adminMode;
    @XmlAttribute(name = "userQuota")
    protected BigInteger userQuota;
    @XmlAttribute(name = "storageQuota")
    protected BigInteger storageQuota;
    @XmlAttribute(name = "tierCreatorCapacity")
    protected BigInteger tierCreatorCapacity;
    @XmlAttribute(name = "tierExplorerCapacity")
    protected BigInteger tierExplorerCapacity;
    @XmlAttribute(name = "tierViewerCapacity")
    protected BigInteger tierViewerCapacity;
    @XmlAttribute(name = "disableSubscriptions")
    protected Boolean disableSubscriptions;
    @XmlAttribute(name = "state")
    protected StateType state;
    @XmlAttribute(name = "revisionHistoryEnabled")
    protected Boolean revisionHistoryEnabled;
    @XmlAttribute(name = "revisionLimit")
    protected String revisionLimit;
    @XmlAttribute(name = "subscribeOthersEnabled")
    protected Boolean subscribeOthersEnabled;
    @XmlAttribute(name = "guestAccessEnabled")
    protected Boolean guestAccessEnabled;
    @XmlAttribute(name = "cacheWarmupEnabled")
    protected Boolean cacheWarmupEnabled;
    @XmlAttribute(name = "commentingEnabled")
    protected Boolean commentingEnabled;
    @XmlAttribute(name = "cacheeWarmupThreshold")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cacheeWarmupThreshold;
    @XmlAttribute(name = "flowsEnabled")
    protected Boolean flowsEnabled;
    @XmlAttribute(name = "extractEncryptionMode")
    protected String extractEncryptionMode;

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link SiteType.Usage }
     *     
     */
    public SiteType.Usage getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteType.Usage }
     *     
     */
    public void setUsage(SiteType.Usage value) {
        this.usage = value;
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
     * Gets the value of the contentUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * Sets the value of the contentUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentUrl(String value) {
        this.contentUrl = value;
    }

    /**
     * Gets the value of the adminMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminMode() {
        return adminMode;
    }

    /**
     * Sets the value of the adminMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminMode(String value) {
        this.adminMode = value;
    }

    /**
     * Gets the value of the userQuota property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserQuota() {
        return userQuota;
    }

    /**
     * Sets the value of the userQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserQuota(BigInteger value) {
        this.userQuota = value;
    }

    /**
     * Gets the value of the storageQuota property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStorageQuota() {
        return storageQuota;
    }

    /**
     * Sets the value of the storageQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStorageQuota(BigInteger value) {
        this.storageQuota = value;
    }

    /**
     * Gets the value of the tierCreatorCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTierCreatorCapacity() {
        return tierCreatorCapacity;
    }

    /**
     * Sets the value of the tierCreatorCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTierCreatorCapacity(BigInteger value) {
        this.tierCreatorCapacity = value;
    }

    /**
     * Gets the value of the tierExplorerCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTierExplorerCapacity() {
        return tierExplorerCapacity;
    }

    /**
     * Sets the value of the tierExplorerCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTierExplorerCapacity(BigInteger value) {
        this.tierExplorerCapacity = value;
    }

    /**
     * Gets the value of the tierViewerCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTierViewerCapacity() {
        return tierViewerCapacity;
    }

    /**
     * Sets the value of the tierViewerCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTierViewerCapacity(BigInteger value) {
        this.tierViewerCapacity = value;
    }

    /**
     * Gets the value of the disableSubscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableSubscriptions() {
        return disableSubscriptions;
    }

    /**
     * Sets the value of the disableSubscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableSubscriptions(Boolean value) {
        this.disableSubscriptions = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setState(StateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the revisionHistoryEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevisionHistoryEnabled() {
        return revisionHistoryEnabled;
    }

    /**
     * Sets the value of the revisionHistoryEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevisionHistoryEnabled(Boolean value) {
        this.revisionHistoryEnabled = value;
    }

    /**
     * Gets the value of the revisionLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionLimit() {
        return revisionLimit;
    }

    /**
     * Sets the value of the revisionLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionLimit(String value) {
        this.revisionLimit = value;
    }

    /**
     * Gets the value of the subscribeOthersEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscribeOthersEnabled() {
        return subscribeOthersEnabled;
    }

    /**
     * Sets the value of the subscribeOthersEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscribeOthersEnabled(Boolean value) {
        this.subscribeOthersEnabled = value;
    }

    /**
     * Gets the value of the guestAccessEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestAccessEnabled() {
        return guestAccessEnabled;
    }

    /**
     * Sets the value of the guestAccessEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestAccessEnabled(Boolean value) {
        this.guestAccessEnabled = value;
    }

    /**
     * Gets the value of the cacheWarmupEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCacheWarmupEnabled() {
        return cacheWarmupEnabled;
    }

    /**
     * Sets the value of the cacheWarmupEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCacheWarmupEnabled(Boolean value) {
        this.cacheWarmupEnabled = value;
    }

    /**
     * Gets the value of the commentingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommentingEnabled() {
        return commentingEnabled;
    }

    /**
     * Sets the value of the commentingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommentingEnabled(Boolean value) {
        this.commentingEnabled = value;
    }

    /**
     * Gets the value of the cacheeWarmupThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCacheeWarmupThreshold() {
        return cacheeWarmupThreshold;
    }

    /**
     * Sets the value of the cacheeWarmupThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCacheeWarmupThreshold(BigInteger value) {
        this.cacheeWarmupThreshold = value;
    }

    /**
     * Gets the value of the flowsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlowsEnabled() {
        return flowsEnabled;
    }

    /**
     * Sets the value of the flowsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlowsEnabled(Boolean value) {
        this.flowsEnabled = value;
    }

    /**
     * Gets the value of the extractEncryptionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractEncryptionMode() {
        return extractEncryptionMode;
    }

    /**
     * Sets the value of the extractEncryptionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractEncryptionMode(String value) {
        this.extractEncryptionMode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="numUsers" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="storage" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Usage {

        @XmlAttribute(name = "numUsers", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger numUsers;
        @XmlAttribute(name = "storage", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger storage;

        /**
         * Gets the value of the numUsers property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumUsers() {
            return numUsers;
        }

        /**
         * Sets the value of the numUsers property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumUsers(BigInteger value) {
            this.numUsers = value;
        }

        /**
         * Gets the value of the storage property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStorage() {
            return storage;
        }

        /**
         * Sets the value of the storage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStorage(BigInteger value) {
            this.storage = value;
        }

    }

}
