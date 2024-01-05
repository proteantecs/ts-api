
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
 * <p>Java class for favoriteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="favoriteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="view" type="{http://tableau.com/api}viewType"/>
 *         &lt;element name="workbook" type="{http://tableau.com/api}workbookType"/>
 *         &lt;element name="datasource" type="{http://tableau.com/api}dataSourceType"/>
 *         &lt;element name="project" type="{http://tableau.com/api}projectType"/>
 *         &lt;element name="flow" type="{http://tableau.com/api}flowType"/>
 *       &lt;/choice>
 *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentProjectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="targetOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "favoriteType", namespace = "http://tableau.com/api", propOrder = {
    "view",
    "workbook",
    "datasource",
    "project",
    "flow"
})
public class FavoriteType {

    @XmlElement(namespace = "http://tableau.com/api")
    protected ViewType view;
    @XmlElement(namespace = "http://tableau.com/api")
    protected WorkbookType workbook;
    @XmlElement(namespace = "http://tableau.com/api")
    protected DataSourceType datasource;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ProjectType project;
    @XmlElement(namespace = "http://tableau.com/api")
    protected FlowType flow;
    @XmlAttribute(name = "label", required = true)
    protected String label;
    @XmlAttribute(name = "parentProjectName")
    protected String parentProjectName;
    @XmlAttribute(name = "targetOwnerName")
    protected String targetOwnerName;

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
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectType }
     *     
     */
    public ProjectType getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectType }
     *     
     */
    public void setProject(ProjectType value) {
        this.project = value;
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

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the parentProjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProjectName() {
        return parentProjectName;
    }

    /**
     * Sets the value of the parentProjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProjectName(String value) {
        this.parentProjectName = value;
    }

    /**
     * Gets the value of the targetOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetOwnerName() {
        return targetOwnerName;
    }

    /**
     * Sets the value of the targetOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetOwnerName(String value) {
        this.targetOwnerName = value;
    }

}
