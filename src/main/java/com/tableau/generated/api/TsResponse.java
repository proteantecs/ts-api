
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
 *         &lt;group ref="{http://tableau.com/api}paginatedResponseGroup"/>
 *         &lt;element name="backgroundJob" type="{http://tableau.com/api}backgroundJobType"/>
 *         &lt;element name="backgroundJobs" type="{http://tableau.com/api}backgroundJobListType"/>
 *         &lt;element name="connection" type="{http://tableau.com/api}connectionType"/>
 *         &lt;element name="connections" type="{http://tableau.com/api}connectionListType"/>
 *         &lt;element name="credentials" type="{http://tableau.com/api}tableauCredentialsType"/>
 *         &lt;element name="dataAlert" type="{http://tableau.com/api}dataAlertType"/>
 *         &lt;element name="dataAlerts" type="{http://tableau.com/api}dataAlertListType"/>
 *         &lt;element name="datasource" type="{http://tableau.com/api}dataSourceType"/>
 *         &lt;element name="error" type="{http://tableau.com/api}errorType"/>
 *         &lt;element name="favorites" type="{http://tableau.com/api}favoriteListType"/>
 *         &lt;element name="fileUpload" type="{http://tableau.com/api}fileUploadType"/>
 *         &lt;element name="flow" type="{http://tableau.com/api}flowType"/>
 *         &lt;element name="group" type="{http://tableau.com/api}groupType"/>
 *         &lt;element name="job" type="{http://tableau.com/api}jobType"/>
 *         &lt;element name="metric" type="{http://tableau.com/api}metricType"/>
 *         &lt;element name="permissions" type="{http://tableau.com/api}permissionsType"/>
 *         &lt;element name="project" type="{http://tableau.com/api}projectType"/>
 *         &lt;element name="dataAlertsRecipient" type="{http://tableau.com/api}dataAlertsRecipientType"/>
 *         &lt;element name="dataAlertsRecipientList" type="{http://tableau.com/api}dataAlertsRecipientListType"/>
 *         &lt;element name="schedule" type="{http://tableau.com/api}scheduleType"/>
 *         &lt;element name="serverInfo" type="{http://tableau.com/api}serverInfo"/>
 *         &lt;element name="serverSettings" type="{http://tableau.com/api}serverSettings"/>
 *         &lt;element name="site" type="{http://tableau.com/api}siteType"/>
 *         &lt;element name="tags" type="{http://tableau.com/api}tagListType"/>
 *         &lt;element name="user" type="{http://tableau.com/api}userType"/>
 *         &lt;element name="view" type="{http://tableau.com/api}viewType"/>
 *         &lt;element name="views" type="{http://tableau.com/api}viewListType"/>
 *         &lt;element name="workbook" type="{http://tableau.com/api}workbookType"/>
 *         &lt;element name="subscription" type="{http://tableau.com/api}subscriptionType"/>
 *         &lt;element name="task" type="{http://tableau.com/api}taskType"/>
 *         &lt;element name="tasks" type="{http://tableau.com/api}taskListType"/>
 *         &lt;element name="warnings" type="{http://tableau.com/api}warningListType"/>
 *         &lt;element name="degradations" type="{http://tableau.com/api}degradationListType"/>
 *         &lt;element name="listFieldConcepts" type="{http://tableau.com/api}listFieldConceptsType"/>
 *         &lt;element name="fieldMatches" type="{http://tableau.com/api}fieldMatchListType"/>
 *         &lt;element name="valueMatches" type="{http://tableau.com/api}matchValuesResultType"/>
 *         &lt;element name="valueConceptCount" type="{http://tableau.com/api}valueConceptCountType"/>
 *         &lt;element name="listValueConcepts" type="{http://tableau.com/api}listValueConceptsType"/>
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
    "pagination",
    "datasources",
    "extracts",
    "flows",
    "flowOutputSteps",
    "groups",
    "metrics",
    "projects",
    "revisions",
    "schedules",
    "sites",
    "users",
    "workbooks",
    "subscriptions",
    "backgroundJob",
    "backgroundJobs",
    "connection",
    "connections",
    "credentials",
    "dataAlert",
    "dataAlerts",
    "datasource",
    "error",
    "favorites",
    "fileUpload",
    "flow",
    "group",
    "job",
    "metric",
    "permissions",
    "project",
    "dataAlertsRecipient",
    "dataAlertsRecipientList",
    "schedule",
    "serverInfo",
    "serverSettings",
    "site",
    "tags",
    "user",
    "view",
    "views",
    "workbook",
    "subscription",
    "task",
    "tasks",
    "warnings",
    "degradations",
    "listFieldConcepts",
    "fieldMatches",
    "valueMatches",
    "valueConceptCount",
    "listValueConcepts",
    "fieldConcept"
})
@XmlRootElement(name = "tsResponse", namespace = "http://tableau.com/api")
public class TsResponse {

    @XmlElement(namespace = "http://tableau.com/api")
    protected PaginationType pagination;
    @XmlElement(namespace = "http://tableau.com/api")
    protected DataSourceListType datasources;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ExtractListType extracts;
    @XmlElement(namespace = "http://tableau.com/api")
    protected FlowListType flows;
    @XmlElement(namespace = "http://tableau.com/api")
    protected FlowOutputStepListType flowOutputSteps;
    @XmlElement(namespace = "http://tableau.com/api")
    protected GroupListType groups;
    @XmlElement(namespace = "http://tableau.com/api")
    protected MetricListType metrics;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ProjectListType projects;
    @XmlElement(namespace = "http://tableau.com/api")
    protected RevisionListType revisions;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ScheduleListType schedules;
    @XmlElement(namespace = "http://tableau.com/api")
    protected SiteListType sites;
    @XmlElement(namespace = "http://tableau.com/api")
    protected UserListType users;
    @XmlElement(namespace = "http://tableau.com/api")
    protected WorkbookListType workbooks;
    @XmlElement(namespace = "http://tableau.com/api")
    protected SubscriptionListType subscriptions;
    @XmlElement(namespace = "http://tableau.com/api")
    protected BackgroundJobType backgroundJob;
    @XmlElement(namespace = "http://tableau.com/api")
    protected BackgroundJobListType backgroundJobs;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ConnectionType connection;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ConnectionListType connections;
    @XmlElement(namespace = "http://tableau.com/api")
    protected TableauCredentialsType credentials;
    @XmlElement(namespace = "http://tableau.com/api")
    protected DataAlertType dataAlert;
    @XmlElement(namespace = "http://tableau.com/api")
    protected DataAlertListType dataAlerts;
    @XmlElement(namespace = "http://tableau.com/api")
    protected DataSourceType datasource;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ErrorType error;
    @XmlElement(namespace = "http://tableau.com/api")
    protected FavoriteListType favorites;
    @XmlElement(namespace = "http://tableau.com/api")
    protected FileUploadType fileUpload;
    @XmlElement(namespace = "http://tableau.com/api")
    protected FlowType flow;
    @XmlElement(namespace = "http://tableau.com/api")
    protected GroupType group;
    @XmlElement(namespace = "http://tableau.com/api")
    protected JobType job;
    @XmlElement(namespace = "http://tableau.com/api")
    protected MetricType metric;
    @XmlElement(namespace = "http://tableau.com/api")
    protected PermissionsType permissions;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ProjectType project;
    @XmlElement(namespace = "http://tableau.com/api")
    protected DataAlertsRecipientType dataAlertsRecipient;
    @XmlElement(namespace = "http://tableau.com/api")
    protected DataAlertsRecipientListType dataAlertsRecipientList;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ScheduleType schedule;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ServerInfo serverInfo;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ServerSettings serverSettings;
    @XmlElement(namespace = "http://tableau.com/api")
    protected SiteType site;
    @XmlElement(namespace = "http://tableau.com/api")
    protected TagListType tags;
    @XmlElement(namespace = "http://tableau.com/api")
    protected UserType user;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ViewType view;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ViewListType views;
    @XmlElement(namespace = "http://tableau.com/api")
    protected WorkbookType workbook;
    @XmlElement(namespace = "http://tableau.com/api")
    protected SubscriptionType subscription;
    @XmlElement(namespace = "http://tableau.com/api")
    protected TaskType task;
    @XmlElement(namespace = "http://tableau.com/api")
    protected TaskListType tasks;
    @XmlElement(namespace = "http://tableau.com/api")
    protected WarningListType warnings;
    @XmlElement(namespace = "http://tableau.com/api")
    protected DegradationListType degradations;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ListFieldConceptsType listFieldConcepts;
    @XmlElement(namespace = "http://tableau.com/api")
    protected FieldMatchListType fieldMatches;
    @XmlElement(namespace = "http://tableau.com/api")
    protected MatchValuesResultType valueMatches;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ValueConceptCountType valueConceptCount;
    @XmlElement(namespace = "http://tableau.com/api")
    protected ListValueConceptsType listValueConcepts;
    @XmlElement(namespace = "http://tableau.com/api")
    protected FieldConceptType fieldConcept;

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationType }
     *     
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationType }
     *     
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the datasources property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceListType }
     *     
     */
    public DataSourceListType getDatasources() {
        return datasources;
    }

    /**
     * Sets the value of the datasources property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceListType }
     *     
     */
    public void setDatasources(DataSourceListType value) {
        this.datasources = value;
    }

    /**
     * Gets the value of the extracts property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractListType }
     *     
     */
    public ExtractListType getExtracts() {
        return extracts;
    }

    /**
     * Sets the value of the extracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractListType }
     *     
     */
    public void setExtracts(ExtractListType value) {
        this.extracts = value;
    }

    /**
     * Gets the value of the flows property.
     * 
     * @return
     *     possible object is
     *     {@link FlowListType }
     *     
     */
    public FlowListType getFlows() {
        return flows;
    }

    /**
     * Sets the value of the flows property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowListType }
     *     
     */
    public void setFlows(FlowListType value) {
        this.flows = value;
    }

    /**
     * Gets the value of the flowOutputSteps property.
     * 
     * @return
     *     possible object is
     *     {@link FlowOutputStepListType }
     *     
     */
    public FlowOutputStepListType getFlowOutputSteps() {
        return flowOutputSteps;
    }

    /**
     * Sets the value of the flowOutputSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowOutputStepListType }
     *     
     */
    public void setFlowOutputSteps(FlowOutputStepListType value) {
        this.flowOutputSteps = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * @return
     *     possible object is
     *     {@link GroupListType }
     *     
     */
    public GroupListType getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupListType }
     *     
     */
    public void setGroups(GroupListType value) {
        this.groups = value;
    }

    /**
     * Gets the value of the metrics property.
     * 
     * @return
     *     possible object is
     *     {@link MetricListType }
     *     
     */
    public MetricListType getMetrics() {
        return metrics;
    }

    /**
     * Sets the value of the metrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetricListType }
     *     
     */
    public void setMetrics(MetricListType value) {
        this.metrics = value;
    }

    /**
     * Gets the value of the projects property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *     
     */
    public ProjectListType getProjects() {
        return projects;
    }

    /**
     * Sets the value of the projects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *     
     */
    public void setProjects(ProjectListType value) {
        this.projects = value;
    }

    /**
     * Gets the value of the revisions property.
     * 
     * @return
     *     possible object is
     *     {@link RevisionListType }
     *     
     */
    public RevisionListType getRevisions() {
        return revisions;
    }

    /**
     * Sets the value of the revisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisionListType }
     *     
     */
    public void setRevisions(RevisionListType value) {
        this.revisions = value;
    }

    /**
     * Gets the value of the schedules property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleListType }
     *     
     */
    public ScheduleListType getSchedules() {
        return schedules;
    }

    /**
     * Sets the value of the schedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleListType }
     *     
     */
    public void setSchedules(ScheduleListType value) {
        this.schedules = value;
    }

    /**
     * Gets the value of the sites property.
     * 
     * @return
     *     possible object is
     *     {@link SiteListType }
     *     
     */
    public SiteListType getSites() {
        return sites;
    }

    /**
     * Sets the value of the sites property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteListType }
     *     
     */
    public void setSites(SiteListType value) {
        this.sites = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link UserListType }
     *     
     */
    public UserListType getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserListType }
     *     
     */
    public void setUsers(UserListType value) {
        this.users = value;
    }

    /**
     * Gets the value of the workbooks property.
     * 
     * @return
     *     possible object is
     *     {@link WorkbookListType }
     *     
     */
    public WorkbookListType getWorkbooks() {
        return workbooks;
    }

    /**
     * Sets the value of the workbooks property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkbookListType }
     *     
     */
    public void setWorkbooks(WorkbookListType value) {
        this.workbooks = value;
    }

    /**
     * Gets the value of the subscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionListType }
     *     
     */
    public SubscriptionListType getSubscriptions() {
        return subscriptions;
    }

    /**
     * Sets the value of the subscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionListType }
     *     
     */
    public void setSubscriptions(SubscriptionListType value) {
        this.subscriptions = value;
    }

    /**
     * Gets the value of the backgroundJob property.
     * 
     * @return
     *     possible object is
     *     {@link BackgroundJobType }
     *     
     */
    public BackgroundJobType getBackgroundJob() {
        return backgroundJob;
    }

    /**
     * Sets the value of the backgroundJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackgroundJobType }
     *     
     */
    public void setBackgroundJob(BackgroundJobType value) {
        this.backgroundJob = value;
    }

    /**
     * Gets the value of the backgroundJobs property.
     * 
     * @return
     *     possible object is
     *     {@link BackgroundJobListType }
     *     
     */
    public BackgroundJobListType getBackgroundJobs() {
        return backgroundJobs;
    }

    /**
     * Sets the value of the backgroundJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackgroundJobListType }
     *     
     */
    public void setBackgroundJobs(BackgroundJobListType value) {
        this.backgroundJobs = value;
    }

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
     * Gets the value of the dataAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link DataAlertListType }
     *     
     */
    public DataAlertListType getDataAlerts() {
        return dataAlerts;
    }

    /**
     * Sets the value of the dataAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataAlertListType }
     *     
     */
    public void setDataAlerts(DataAlertListType value) {
        this.dataAlerts = value;
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
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setError(ErrorType value) {
        this.error = value;
    }

    /**
     * Gets the value of the favorites property.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteListType }
     *     
     */
    public FavoriteListType getFavorites() {
        return favorites;
    }

    /**
     * Sets the value of the favorites property.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteListType }
     *     
     */
    public void setFavorites(FavoriteListType value) {
        this.favorites = value;
    }

    /**
     * Gets the value of the fileUpload property.
     * 
     * @return
     *     possible object is
     *     {@link FileUploadType }
     *     
     */
    public FileUploadType getFileUpload() {
        return fileUpload;
    }

    /**
     * Sets the value of the fileUpload property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileUploadType }
     *     
     */
    public void setFileUpload(FileUploadType value) {
        this.fileUpload = value;
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
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link JobType }
     *     
     */
    public JobType getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobType }
     *     
     */
    public void setJob(JobType value) {
        this.job = value;
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
     * Gets the value of the dataAlertsRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link DataAlertsRecipientType }
     *     
     */
    public DataAlertsRecipientType getDataAlertsRecipient() {
        return dataAlertsRecipient;
    }

    /**
     * Sets the value of the dataAlertsRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataAlertsRecipientType }
     *     
     */
    public void setDataAlertsRecipient(DataAlertsRecipientType value) {
        this.dataAlertsRecipient = value;
    }

    /**
     * Gets the value of the dataAlertsRecipientList property.
     * 
     * @return
     *     possible object is
     *     {@link DataAlertsRecipientListType }
     *     
     */
    public DataAlertsRecipientListType getDataAlertsRecipientList() {
        return dataAlertsRecipientList;
    }

    /**
     * Sets the value of the dataAlertsRecipientList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataAlertsRecipientListType }
     *     
     */
    public void setDataAlertsRecipientList(DataAlertsRecipientListType value) {
        this.dataAlertsRecipientList = value;
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
     * Gets the value of the serverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServerInfo }
     *     
     */
    public ServerInfo getServerInfo() {
        return serverInfo;
    }

    /**
     * Sets the value of the serverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerInfo }
     *     
     */
    public void setServerInfo(ServerInfo value) {
        this.serverInfo = value;
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
     * Gets the value of the views property.
     * 
     * @return
     *     possible object is
     *     {@link ViewListType }
     *     
     */
    public ViewListType getViews() {
        return views;
    }

    /**
     * Sets the value of the views property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewListType }
     *     
     */
    public void setViews(ViewListType value) {
        this.views = value;
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
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link TaskListType }
     *     
     */
    public TaskListType getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskListType }
     *     
     */
    public void setTasks(TaskListType value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link WarningListType }
     *     
     */
    public WarningListType getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningListType }
     *     
     */
    public void setWarnings(WarningListType value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the degradations property.
     * 
     * @return
     *     possible object is
     *     {@link DegradationListType }
     *     
     */
    public DegradationListType getDegradations() {
        return degradations;
    }

    /**
     * Sets the value of the degradations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DegradationListType }
     *     
     */
    public void setDegradations(DegradationListType value) {
        this.degradations = value;
    }

    /**
     * Gets the value of the listFieldConcepts property.
     * 
     * @return
     *     possible object is
     *     {@link ListFieldConceptsType }
     *     
     */
    public ListFieldConceptsType getListFieldConcepts() {
        return listFieldConcepts;
    }

    /**
     * Sets the value of the listFieldConcepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListFieldConceptsType }
     *     
     */
    public void setListFieldConcepts(ListFieldConceptsType value) {
        this.listFieldConcepts = value;
    }

    /**
     * Gets the value of the fieldMatches property.
     * 
     * @return
     *     possible object is
     *     {@link FieldMatchListType }
     *     
     */
    public FieldMatchListType getFieldMatches() {
        return fieldMatches;
    }

    /**
     * Sets the value of the fieldMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldMatchListType }
     *     
     */
    public void setFieldMatches(FieldMatchListType value) {
        this.fieldMatches = value;
    }

    /**
     * Gets the value of the valueMatches property.
     * 
     * @return
     *     possible object is
     *     {@link MatchValuesResultType }
     *     
     */
    public MatchValuesResultType getValueMatches() {
        return valueMatches;
    }

    /**
     * Sets the value of the valueMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchValuesResultType }
     *     
     */
    public void setValueMatches(MatchValuesResultType value) {
        this.valueMatches = value;
    }

    /**
     * Gets the value of the valueConceptCount property.
     * 
     * @return
     *     possible object is
     *     {@link ValueConceptCountType }
     *     
     */
    public ValueConceptCountType getValueConceptCount() {
        return valueConceptCount;
    }

    /**
     * Sets the value of the valueConceptCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueConceptCountType }
     *     
     */
    public void setValueConceptCount(ValueConceptCountType value) {
        this.valueConceptCount = value;
    }

    /**
     * Gets the value of the listValueConcepts property.
     * 
     * @return
     *     possible object is
     *     {@link ListValueConceptsType }
     *     
     */
    public ListValueConceptsType getListValueConcepts() {
        return listValueConcepts;
    }

    /**
     * Sets the value of the listValueConcepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListValueConceptsType }
     *     
     */
    public void setListValueConcepts(ListValueConceptsType value) {
        this.listValueConcepts = value;
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
