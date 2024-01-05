
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
 * <p>Java class for serverSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serverSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oAuthEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sheetImageMaxAgeFloor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sheetImageMaxAgeCeiling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="offlineInteractionSupportedPhase" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serverSettings", namespace = "http://tableau.com/api", propOrder = {
    "oAuthEnabled",
    "sheetImageMaxAgeFloor",
    "sheetImageMaxAgeCeiling",
    "offlineInteractionSupportedPhase"
})
public class ServerSettings {

    @XmlElement(namespace = "http://tableau.com/api")
    protected boolean oAuthEnabled;
    @XmlElement(namespace = "http://tableau.com/api")
    protected int sheetImageMaxAgeFloor;
    @XmlElement(namespace = "http://tableau.com/api")
    protected int sheetImageMaxAgeCeiling;
    @XmlElement(namespace = "http://tableau.com/api")
    protected int offlineInteractionSupportedPhase;

    /**
     * Gets the value of the oAuthEnabled property.
     * 
     */
    public boolean isOAuthEnabled() {
        return oAuthEnabled;
    }

    /**
     * Sets the value of the oAuthEnabled property.
     * 
     */
    public void setOAuthEnabled(boolean value) {
        this.oAuthEnabled = value;
    }

    /**
     * Gets the value of the sheetImageMaxAgeFloor property.
     * 
     */
    public int getSheetImageMaxAgeFloor() {
        return sheetImageMaxAgeFloor;
    }

    /**
     * Sets the value of the sheetImageMaxAgeFloor property.
     * 
     */
    public void setSheetImageMaxAgeFloor(int value) {
        this.sheetImageMaxAgeFloor = value;
    }

    /**
     * Gets the value of the sheetImageMaxAgeCeiling property.
     * 
     */
    public int getSheetImageMaxAgeCeiling() {
        return sheetImageMaxAgeCeiling;
    }

    /**
     * Sets the value of the sheetImageMaxAgeCeiling property.
     * 
     */
    public void setSheetImageMaxAgeCeiling(int value) {
        this.sheetImageMaxAgeCeiling = value;
    }

    /**
     * Gets the value of the offlineInteractionSupportedPhase property.
     * 
     */
    public int getOfflineInteractionSupportedPhase() {
        return offlineInteractionSupportedPhase;
    }

    /**
     * Sets the value of the offlineInteractionSupportedPhase property.
     * 
     */
    public void setOfflineInteractionSupportedPhase(int value) {
        this.offlineInteractionSupportedPhase = value;
    }

}
