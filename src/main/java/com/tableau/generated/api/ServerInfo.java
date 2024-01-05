
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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serverInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serverInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productVersion" type="{http://tableau.com/api}productVersion"/>
 *         &lt;element name="prepConductorVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="restApiVersion" type="{http://tableau.com/api}restApiVersion"/>
 *         &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverSettings" type="{http://tableau.com/api}serverSettings"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serverInfo", namespace = "http://tableau.com/api", propOrder = {
    "productVersion",
    "prepConductorVersion",
    "restApiVersion",
    "platform",
    "serverSettings"
})
public class ServerInfo {

    @XmlElement(namespace = "http://tableau.com/api", required = true)
    protected ProductVersion productVersion;
    @XmlElement(namespace = "http://tableau.com/api", required = true)
    protected String prepConductorVersion;
    @XmlElement(namespace = "http://tableau.com/api", required = true)
    protected String restApiVersion;
    @XmlElement(namespace = "http://tableau.com/api", required = true)
    protected String platform;
    @XmlElement(namespace = "http://tableau.com/api", required = true)
    protected ServerSettings serverSettings;

    /**
     * Gets the value of the productVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ProductVersion }
     *     
     */
    public ProductVersion getProductVersion() {
        return productVersion;
    }

    /**
     * Sets the value of the productVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductVersion }
     *     
     */
    public void setProductVersion(ProductVersion value) {
        this.productVersion = value;
    }

    /**
     * Gets the value of the prepConductorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepConductorVersion() {
        return prepConductorVersion;
    }

    /**
     * Sets the value of the prepConductorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepConductorVersion(String value) {
        this.prepConductorVersion = value;
    }

    /**
     * Gets the value of the restApiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestApiVersion() {
        return restApiVersion;
    }

    /**
     * Sets the value of the restApiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestApiVersion(String value) {
        this.restApiVersion = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * Gets the value of the serverSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ServerSettings }
     *     
     */
    public ServerSettings getServerSettings() {
        return serverSettings;
    }

    /**
     * Sets the value of the serverSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerSettings }
     *     
     */
    public void setServerSettings(ServerSettings value) {
        this.serverSettings = value;
    }

}
