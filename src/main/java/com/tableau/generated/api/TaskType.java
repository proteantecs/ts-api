
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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="extractRefresh" type="{http://tableau.com/api}taskExtractRefreshType"/>
 *         &lt;element name="flowRun" type="{http://tableau.com/api}taskRunFlowType"/>
 *       &lt;/choice>
 *       &lt;attribute name="runNow" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskType", namespace = "http://tableau.com/api", propOrder = {
    "extractRefresh",
    "flowRun"
})
public class TaskType {

    @XmlElement(namespace = "http://tableau.com/api")
    protected TaskExtractRefreshType extractRefresh;
    @XmlElement(namespace = "http://tableau.com/api")
    protected TaskRunFlowType flowRun;
    @XmlAttribute(name = "runNow")
    protected Boolean runNow;

    /**
     * Gets the value of the extractRefresh property.
     * 
     * @return
     *     possible object is
     *     {@link TaskExtractRefreshType }
     *     
     */
    public TaskExtractRefreshType getExtractRefresh() {
        return extractRefresh;
    }

    /**
     * Sets the value of the extractRefresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskExtractRefreshType }
     *     
     */
    public void setExtractRefresh(TaskExtractRefreshType value) {
        this.extractRefresh = value;
    }

    /**
     * Gets the value of the flowRun property.
     * 
     * @return
     *     possible object is
     *     {@link TaskRunFlowType }
     *     
     */
    public TaskRunFlowType getFlowRun() {
        return flowRun;
    }

    /**
     * Sets the value of the flowRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskRunFlowType }
     *     
     */
    public void setFlowRun(TaskRunFlowType value) {
        this.flowRun = value;
    }

    /**
     * Gets the value of the runNow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunNow() {
        return runNow;
    }

    /**
     * Sets the value of the runNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunNow(Boolean value) {
        this.runNow = value;
    }

}
