
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="connection" type="{http://tableau.com/api}connectionType"/>
 *         &lt;element name="connections" type="{http://tableau.com/api}connectionListType"/>
 *         &lt;element name="credentials" type="{http://tableau.com/api}tableauCredentialsType"/>
 *         &lt;element name="dataAlert" type="{http://tableau.com/api}dataAlertType"/>
 *         &lt;element name="datasource" type="{http://tableau.com/api}dataSourceType"/>
 *         &lt;element name="favorite" type="{http://tableau.com/api}favoriteType"/>
 *         &lt;element name="flow" type="{http://tableau.com/api}flowType"/>
 *         &lt;element name="group" type="{http://tableau.com/api}groupType"/>
 *         &lt;element name="metric" type="{http://tableau.com/api}metricType"/>
 *         &lt;element name="permissions" type="{http://tableau.com/api}permissionsType"/>
 *         &lt;element name="project" type="{http://tableau.com/api}projectType"/>
 *         &lt;element name="schedule" type="{http://tableau.com/api}scheduleType"/>
 *         &lt;element name="site" type="{http://tableau.com/api}siteType"/>
 *         &lt;element name="tags" type="{http://tableau.com/api}tagListType"/>
 *         &lt;element name="user" type="{http://tableau.com/api}userType"/>
 *         &lt;element name="workbook" type="{http://tableau.com/api}workbookType"/>
 *         &lt;element name="subscription" type="{http://tableau.com/api}subscriptionType"/>
 *         &lt;element name="task" type="{http://tableau.com/api}taskType"/>
 *         &lt;element name="field" type="{http://tableau.com/api}fieldType"/>
 *         &lt;element name="distinctValues" type="{http://tableau.com/api}distinctValueListType"/>
 *         &lt;element name="fieldConcept" type="{http://tableau.com/api}fieldConceptType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "connection",
    "connections",
    "credentials",
    "dataAlert",
    "datasource",
    "favorite",
    "flow",
    "group",
    "metric",
    "permissions",
    "project",
    "schedule",
    "site",
    "tags",
    "user",
    "workbook",
    "subscription",
    "task",
    "field",
    "distinctValues",
    "fieldConcept"
})
@XmlRootElement(name = "tsRequest", namespace = "http://tableau.com/api")
public class TsRequest {

    @XmlElement(namespace = "http://tableau.com/api")
    protected ConnectionType connection;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ConnectionListType connections;
    @XmlElement(namespace = "http://tableau.com/api")
    protected TableauCredentialsType credentials;
    @XmlElement(namespace = "http://tableau.com/api")
    protected DataAlertType dataAlert;
    @XmlElement(namespace = "http://tableau.com/api")
    protected DataSourceType datasource;
    @XmlElement(namespace = "http://tableau.com/api")
    protected FavoriteType favorite;
    @XmlElement(namespace = "http://tableau.com/api")
    protected FlowType flow;
    @XmlElement(namespace = "http://tableau.com/api")
    protected GroupType group;
    @XmlElement(namespace = "http://tableau.com/api")
    protected MetricType metric;
    @XmlElement(namespace = "http://tableau.com/api")
    protected PermissionsType permissions;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ProjectType project;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ScheduleType schedule;
    @XmlElement(namespace = "http://tableau.com/api")
    protected SiteType site;
    @XmlElement(namespace = "http://tableau.com/api")
    protected TagListType tags;
    @XmlElement(namespace = "http://tableau.com/api")
    protected UserType user;
    @XmlElement(namespace = "http://tableau.com/api")
    protected WorkbookType workbook;
    @XmlElement(namespace = "http://tableau.com/api")
    protected SubscriptionType subscription;
    @XmlElement(namespace = "http://tableau.com/api")
    protected TaskType task;
    @XmlElement(namespace = "http://tableau.com/api")
    protected FieldType field;
    @XmlElement(namespace = "http://tableau.com/api")
    protected DistinctValueListType distinctValues;
    @XmlElement(namespace = "http://tableau.com/api")
    protected FieldConceptType fieldConcept;

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionType }
     *     
     */
    public ConnectionType getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionType }
     *     
     */
    public void setConnection(ConnectionType value) {
        this.connection = value;
    }

    /**
     * Gets the value of the connections property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionListType }
     *     
     */
    public ConnectionListType getConnections() {
        return connections;
    }

    /**
     * Sets the value of the connections property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionListType }
     *     
     */
    public void setConnections(ConnectionListType value) {
        this.connections = value;
    }

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link TableauCredentialsType }
     *     
     */
    public TableauCredentialsType getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableauCredentialsType }
     *     
     */
    public void setCredentials(TableauCredentialsType value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the dataAlert property.
     * 
     * @return
     *     possible object is
     *     {@link DataAlertType }
     *     
     */
    public DataAlertType getDataAlert() {
        return dataAlert;
    }

    /**
     * Sets the value of the dataAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataAlertType }
     *     
     */
    public void setDataAlert(DataAlertType value) {
        this.dataAlert = value;
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
     * Gets the value of the favorite property.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteType }
     *     
     */
    public FavoriteType getFavorite() {
        return favorite;
    }

    /**
     * Sets the value of the favorite property.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteType }
     *     
     */
    public void setFavorite(FavoriteType value) {
        this.favorite = value;
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
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link GroupType }
     *     
     */
    public GroupType getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupType }
     *     
     */
    public void setGroup(GroupType value) {
        this.group = value;
    }

    /**
     * Gets the value of the metric property.
     * 
     * @return
     *     possible object is
     *     {@link MetricType }
     *     
     */
    public MetricType getMetric() {
        return metric;
    }

    /**
     * Sets the value of the metric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetricType }
     *     
     */
    public void setMetric(MetricType value) {
        this.metric = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionsType }
     *     
     */
    public PermissionsType getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionsType }
     *     
     */
    public void setPermissions(PermissionsType value) {
        this.permissions = value;
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
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link SiteType }
     *     
     */
    public SiteType getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteType }
     *     
     */
    public void setSite(SiteType value) {
        this.site = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link TagListType }
     *     
     */
    public TagListType getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagListType }
     *     
     */
    public void setTags(TagListType value) {
        this.tags = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser(UserType value) {
        this.user = value;
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
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionType }
     *     
     */
    public SubscriptionType getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionType }
     *     
     */
    public void setSubscription(SubscriptionType value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link TaskType }
     *     
     */
    public TaskType getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskType }
     *     
     */
    public void setTask(TaskType value) {
        this.task = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link FieldType }
     *     
     */
    public FieldType getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldType }
     *     
     */
    public void setField(FieldType value) {
        this.field = value;
    }

    /**
     * Gets the value of the distinctValues property.
     * 
     * @return
     *     possible object is
     *     {@link DistinctValueListType }
     *     
     */
    public DistinctValueListType getDistinctValues() {
        return distinctValues;
    }

    /**
     * Sets the value of the distinctValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinctValueListType }
     *     
     */
    public void setDistinctValues(DistinctValueListType value) {
        this.distinctValues = value;
    }

    /**
     * Gets the value of the fieldConcept property.
     * 
     * @return
     *     possible object is
     *     {@link FieldConceptType }
     *     
     */
    public FieldConceptType getFieldConcept() {
        return fieldConcept;
    }

    /**
     * Sets the value of the fieldConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldConceptType }
     *     
     */
    public void setFieldConcept(FieldConceptType value) {
        this.fieldConcept = value;
    }

}
