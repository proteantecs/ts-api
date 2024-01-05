
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
 * <p>Java class for taskExtractRefreshType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskExtractRefreshType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schedule" type="{http://tableau.com/api}scheduleType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="view" type="{http://tableau.com/api}viewType"/>
 *           &lt;element name="workbook" type="{http://tableau.com/api}workbookType"/>
 *           &lt;element name="datasource" type="{http://tableau.com/api}dataSourceType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="consecutiveFailedCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="incremental" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskExtractRefreshType", namespace = "http://tableau.com/api", propOrder = {
    "schedule",
    "view",
    "workbook",
    "datasource"
})
public class TaskExtractRefreshType {

    @XmlElement(namespace = "http://tableau.com/api")
    protected ScheduleType schedule;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ViewType view;
    @XmlElement(namespace = "http://tableau.com/api")
    protected WorkbookType workbook;
    @XmlElement(namespace = "http://tableau.com/api")
    protected DataSourceType datasource;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "priority")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger priority;
    @XmlAttribute(name = "consecutiveFailedCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger consecutiveFailedCount;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "incremental")
    protected Boolean incremental;

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleType }
     *     
     */
    public ScheduleType getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleType }
     *     
     */
    public void setSchedule(ScheduleType value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link ViewType }
     *     
     */
    public ViewType getView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewType }
     *     
     */
    public void setView(ViewType value) {
        this.view = value;
    }

    /**
     * Gets the value of the workbook property.
     * 
     * @return
     *     possible object is
     *     {@link WorkbookType }
     *     
     */
    public WorkbookType getWorkbook() {
        return workbook;
    }

    /**
     * Sets the value of the workbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkbookType }
     *     
     */
    public void setWorkbook(WorkbookType value) {
        this.workbook = value;
    }

    /**
     * Gets the value of the datasource property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceType }
     *     
     */
    public DataSourceType getDatasource() {
        return datasource;
    }

    /**
     * Sets the value of the datasource property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceType }
     *     
     */
    public void setDatasource(DataSourceType value) {
        this.datasource = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the consecutiveFailedCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsecutiveFailedCount() {
        return consecutiveFailedCount;
    }

    /**
     * Sets the value of the consecutiveFailedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsecutiveFailedCount(BigInteger value) {
        this.consecutiveFailedCount = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the incremental property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncremental() {
        return incremental;
    }

    /**
     * Sets the value of the incremental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncremental(Boolean value) {
        this.incremental = value;
    }

}
