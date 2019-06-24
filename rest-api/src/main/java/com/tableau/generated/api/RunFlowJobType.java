
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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for runFlowJobType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="runFlowJobType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flow" type="{http://tableau.com/api}flowType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runFlowJobType", namespace = "http://tableau.com/api", propOrder = {
    "notes",
    "flow"
})
public class RunFlowJobType {

    @XmlElement(namespace = "http://tableau.com/api", required = true)
    protected String notes;
    @XmlElement(namespace = "http://tableau.com/api", required = true)
    protected FlowType flow;

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the flow property.
     * 
     * @return
     *     possible object is
     *     {@link FlowType }
     *     
     */
    public FlowType getFlow() {
        return flow;
    }

    /**
     * Sets the value of the flow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowType }
     *     
     */
    public void setFlow(FlowType value) {
        this.flow = value;
    }

}
