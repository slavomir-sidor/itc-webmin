/**
 * Model.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.pom.form;


/**
 *  Model bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Model implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Model
       Namespace URI = http://maven.apache.org/POM/4.0.0
       Namespace Prefix = ns1
     */

    /**
     * field for ModelVersion
     */
    protected java.lang.String localModelVersion;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localModelVersionTracker = false;

    /**
     * field for Parent
     */
    protected sk.itcloud.maven.pom.form.Parent localParent;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localParentTracker = false;

    /**
     * field for GroupId
     */
    protected java.lang.String localGroupId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGroupIdTracker = false;

    /**
     * field for ArtifactId
     */
    protected java.lang.String localArtifactId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localArtifactIdTracker = false;

    /**
     * field for Version
     */
    protected java.lang.String localVersion;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localVersionTracker = false;

    /**
     * field for Packaging
     */
    protected java.lang.String localPackaging = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "jar");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPackagingTracker = false;

    /**
     * field for Name
     */
    protected java.lang.String localName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNameTracker = false;

    /**
     * field for Description
     */
    protected java.lang.String localDescription;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDescriptionTracker = false;

    /**
     * field for Url
     */
    protected java.lang.String localUrl;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUrlTracker = false;

    /**
     * field for InceptionYear
     */
    protected java.lang.String localInceptionYear;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localInceptionYearTracker = false;

    /**
     * field for Organization
     */
    protected sk.itcloud.maven.pom.form.Organization localOrganization;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOrganizationTracker = false;

    /**
     * field for Licenses
     */
    protected sk.itcloud.maven.pom.form.Licenses_type0 localLicenses;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLicensesTracker = false;

    /**
     * field for Developers
     */
    protected sk.itcloud.maven.pom.form.Developers_type0 localDevelopers;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDevelopersTracker = false;

    /**
     * field for Contributors
     */
    protected sk.itcloud.maven.pom.form.Contributors_type0 localContributors;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localContributorsTracker = false;

    /**
     * field for MailingLists
     */
    protected sk.itcloud.maven.pom.form.MailingLists_type0 localMailingLists;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMailingListsTracker = false;

    /**
     * field for Prerequisites
     */
    protected sk.itcloud.maven.pom.form.Prerequisites localPrerequisites;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPrerequisitesTracker = false;

    /**
     * field for Modules
     */
    protected sk.itcloud.maven.pom.form.Modules_type0 localModules;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localModulesTracker = false;

    /**
     * field for Scm
     */
    protected sk.itcloud.maven.pom.form.Scm localScm;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localScmTracker = false;

    /**
     * field for IssueManagement
     */
    protected sk.itcloud.maven.pom.form.IssueManagement localIssueManagement;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIssueManagementTracker = false;

    /**
     * field for CiManagement
     */
    protected sk.itcloud.maven.pom.form.CiManagement localCiManagement;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCiManagementTracker = false;

    /**
     * field for DistributionManagement
     */
    protected sk.itcloud.maven.pom.form.DistributionManagement localDistributionManagement;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDistributionManagementTracker = false;

    /**
     * field for Properties
     */
    protected sk.itcloud.maven.pom.form.Properties_type2 localProperties;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPropertiesTracker = false;

    /**
     * field for DependencyManagement
     */
    protected sk.itcloud.maven.pom.form.DependencyManagement localDependencyManagement;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDependencyManagementTracker = false;

    /**
     * field for Dependencies
     */
    protected sk.itcloud.maven.pom.form.Dependencies_type1 localDependencies;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDependenciesTracker = false;

    /**
     * field for Repositories
     */
    protected sk.itcloud.maven.pom.form.Repositories_type0 localRepositories;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRepositoriesTracker = false;

    /**
     * field for PluginRepositories
     */
    protected sk.itcloud.maven.pom.form.PluginRepositories_type0 localPluginRepositories;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPluginRepositoriesTracker = false;

    /**
     * field for Build
     */
    protected sk.itcloud.maven.pom.form.Build localBuild;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBuildTracker = false;

    /**
     * field for Reports
     */
    protected sk.itcloud.maven.pom.form.Reports_type0 localReports;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReportsTracker = false;

    /**
     * field for Reporting
     */
    protected sk.itcloud.maven.pom.form.Reporting localReporting;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReportingTracker = false;

    /**
     * field for Profiles
     */
    protected sk.itcloud.maven.pom.form.Profiles_type0 localProfiles;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localProfilesTracker = false;

    public boolean isModelVersionSpecified() {
        return localModelVersionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getModelVersion() {
        return localModelVersion;
    }

    /**
     * Auto generated setter method
     * @param param ModelVersion
     */
    public void setModelVersion(java.lang.String param) {
        localModelVersionTracker = param != null;

        this.localModelVersion = param;
    }

    public boolean isParentSpecified() {
        return localParentTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Parent
     */
    public sk.itcloud.maven.pom.form.Parent getParent() {
        return localParent;
    }

    /**
     * Auto generated setter method
     * @param param Parent
     */
    public void setParent(sk.itcloud.maven.pom.form.Parent param) {
        localParentTracker = param != null;

        this.localParent = param;
    }

    public boolean isGroupIdSpecified() {
        return localGroupIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getGroupId() {
        return localGroupId;
    }

    /**
     * Auto generated setter method
     * @param param GroupId
     */
    public void setGroupId(java.lang.String param) {
        localGroupIdTracker = param != null;

        this.localGroupId = param;
    }

    public boolean isArtifactIdSpecified() {
        return localArtifactIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getArtifactId() {
        return localArtifactId;
    }

    /**
     * Auto generated setter method
     * @param param ArtifactId
     */
    public void setArtifactId(java.lang.String param) {
        localArtifactIdTracker = param != null;

        this.localArtifactId = param;
    }

    public boolean isVersionSpecified() {
        return localVersionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getVersion() {
        return localVersion;
    }

    /**
     * Auto generated setter method
     * @param param Version
     */
    public void setVersion(java.lang.String param) {
        localVersionTracker = param != null;

        this.localVersion = param;
    }

    public boolean isPackagingSpecified() {
        return localPackagingTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPackaging() {
        return localPackaging;
    }

    /**
     * Auto generated setter method
     * @param param Packaging
     */
    public void setPackaging(java.lang.String param) {
        localPackagingTracker = param != null;

        this.localPackaging = param;
    }

    public boolean isNameSpecified() {
        return localNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     * @param param Name
     */
    public void setName(java.lang.String param) {
        localNameTracker = param != null;

        this.localName = param;
    }

    public boolean isDescriptionSpecified() {
        return localDescriptionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDescription() {
        return localDescription;
    }

    /**
     * Auto generated setter method
     * @param param Description
     */
    public void setDescription(java.lang.String param) {
        localDescriptionTracker = param != null;

        this.localDescription = param;
    }

    public boolean isUrlSpecified() {
        return localUrlTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUrl() {
        return localUrl;
    }

    /**
     * Auto generated setter method
     * @param param Url
     */
    public void setUrl(java.lang.String param) {
        localUrlTracker = param != null;

        this.localUrl = param;
    }

    public boolean isInceptionYearSpecified() {
        return localInceptionYearTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getInceptionYear() {
        return localInceptionYear;
    }

    /**
     * Auto generated setter method
     * @param param InceptionYear
     */
    public void setInceptionYear(java.lang.String param) {
        localInceptionYearTracker = param != null;

        this.localInceptionYear = param;
    }

    public boolean isOrganizationSpecified() {
        return localOrganizationTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Organization
     */
    public sk.itcloud.maven.pom.form.Organization getOrganization() {
        return localOrganization;
    }

    /**
     * Auto generated setter method
     * @param param Organization
     */
    public void setOrganization(sk.itcloud.maven.pom.form.Organization param) {
        localOrganizationTracker = param != null;

        this.localOrganization = param;
    }

    public boolean isLicensesSpecified() {
        return localLicensesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Licenses_type0
     */
    public sk.itcloud.maven.pom.form.Licenses_type0 getLicenses() {
        return localLicenses;
    }

    /**
     * Auto generated setter method
     * @param param Licenses
     */
    public void setLicenses(sk.itcloud.maven.pom.form.Licenses_type0 param) {
        localLicensesTracker = param != null;

        this.localLicenses = param;
    }

    public boolean isDevelopersSpecified() {
        return localDevelopersTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Developers_type0
     */
    public sk.itcloud.maven.pom.form.Developers_type0 getDevelopers() {
        return localDevelopers;
    }

    /**
     * Auto generated setter method
     * @param param Developers
     */
    public void setDevelopers(
        sk.itcloud.maven.pom.form.Developers_type0 param) {
        localDevelopersTracker = param != null;

        this.localDevelopers = param;
    }

    public boolean isContributorsSpecified() {
        return localContributorsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Contributors_type0
     */
    public sk.itcloud.maven.pom.form.Contributors_type0 getContributors() {
        return localContributors;
    }

    /**
     * Auto generated setter method
     * @param param Contributors
     */
    public void setContributors(
        sk.itcloud.maven.pom.form.Contributors_type0 param) {
        localContributorsTracker = param != null;

        this.localContributors = param;
    }

    public boolean isMailingListsSpecified() {
        return localMailingListsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.MailingLists_type0
     */
    public sk.itcloud.maven.pom.form.MailingLists_type0 getMailingLists() {
        return localMailingLists;
    }

    /**
     * Auto generated setter method
     * @param param MailingLists
     */
    public void setMailingLists(
        sk.itcloud.maven.pom.form.MailingLists_type0 param) {
        localMailingListsTracker = param != null;

        this.localMailingLists = param;
    }

    public boolean isPrerequisitesSpecified() {
        return localPrerequisitesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Prerequisites
     */
    public sk.itcloud.maven.pom.form.Prerequisites getPrerequisites() {
        return localPrerequisites;
    }

    /**
     * Auto generated setter method
     * @param param Prerequisites
     */
    public void setPrerequisites(
        sk.itcloud.maven.pom.form.Prerequisites param) {
        localPrerequisitesTracker = param != null;

        this.localPrerequisites = param;
    }

    public boolean isModulesSpecified() {
        return localModulesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Modules_type0
     */
    public sk.itcloud.maven.pom.form.Modules_type0 getModules() {
        return localModules;
    }

    /**
     * Auto generated setter method
     * @param param Modules
     */
    public void setModules(sk.itcloud.maven.pom.form.Modules_type0 param) {
        localModulesTracker = param != null;

        this.localModules = param;
    }

    public boolean isScmSpecified() {
        return localScmTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Scm
     */
    public sk.itcloud.maven.pom.form.Scm getScm() {
        return localScm;
    }

    /**
     * Auto generated setter method
     * @param param Scm
     */
    public void setScm(sk.itcloud.maven.pom.form.Scm param) {
        localScmTracker = param != null;

        this.localScm = param;
    }

    public boolean isIssueManagementSpecified() {
        return localIssueManagementTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.IssueManagement
     */
    public sk.itcloud.maven.pom.form.IssueManagement getIssueManagement() {
        return localIssueManagement;
    }

    /**
     * Auto generated setter method
     * @param param IssueManagement
     */
    public void setIssueManagement(
        sk.itcloud.maven.pom.form.IssueManagement param) {
        localIssueManagementTracker = param != null;

        this.localIssueManagement = param;
    }

    public boolean isCiManagementSpecified() {
        return localCiManagementTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.CiManagement
     */
    public sk.itcloud.maven.pom.form.CiManagement getCiManagement() {
        return localCiManagement;
    }

    /**
     * Auto generated setter method
     * @param param CiManagement
     */
    public void setCiManagement(sk.itcloud.maven.pom.form.CiManagement param) {
        localCiManagementTracker = param != null;

        this.localCiManagement = param;
    }

    public boolean isDistributionManagementSpecified() {
        return localDistributionManagementTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.DistributionManagement
     */
    public sk.itcloud.maven.pom.form.DistributionManagement getDistributionManagement() {
        return localDistributionManagement;
    }

    /**
     * Auto generated setter method
     * @param param DistributionManagement
     */
    public void setDistributionManagement(
        sk.itcloud.maven.pom.form.DistributionManagement param) {
        localDistributionManagementTracker = param != null;

        this.localDistributionManagement = param;
    }

    public boolean isPropertiesSpecified() {
        return localPropertiesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Properties_type2
     */
    public sk.itcloud.maven.pom.form.Properties_type2 getProperties() {
        return localProperties;
    }

    /**
     * Auto generated setter method
     * @param param Properties
     */
    public void setProperties(
        sk.itcloud.maven.pom.form.Properties_type2 param) {
        localPropertiesTracker = param != null;

        this.localProperties = param;
    }

    public boolean isDependencyManagementSpecified() {
        return localDependencyManagementTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.DependencyManagement
     */
    public sk.itcloud.maven.pom.form.DependencyManagement getDependencyManagement() {
        return localDependencyManagement;
    }

    /**
     * Auto generated setter method
     * @param param DependencyManagement
     */
    public void setDependencyManagement(
        sk.itcloud.maven.pom.form.DependencyManagement param) {
        localDependencyManagementTracker = param != null;

        this.localDependencyManagement = param;
    }

    public boolean isDependenciesSpecified() {
        return localDependenciesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Dependencies_type1
     */
    public sk.itcloud.maven.pom.form.Dependencies_type1 getDependencies() {
        return localDependencies;
    }

    /**
     * Auto generated setter method
     * @param param Dependencies
     */
    public void setDependencies(
        sk.itcloud.maven.pom.form.Dependencies_type1 param) {
        localDependenciesTracker = param != null;

        this.localDependencies = param;
    }

    public boolean isRepositoriesSpecified() {
        return localRepositoriesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Repositories_type0
     */
    public sk.itcloud.maven.pom.form.Repositories_type0 getRepositories() {
        return localRepositories;
    }

    /**
     * Auto generated setter method
     * @param param Repositories
     */
    public void setRepositories(
        sk.itcloud.maven.pom.form.Repositories_type0 param) {
        localRepositoriesTracker = param != null;

        this.localRepositories = param;
    }

    public boolean isPluginRepositoriesSpecified() {
        return localPluginRepositoriesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.PluginRepositories_type0
     */
    public sk.itcloud.maven.pom.form.PluginRepositories_type0 getPluginRepositories() {
        return localPluginRepositories;
    }

    /**
     * Auto generated setter method
     * @param param PluginRepositories
     */
    public void setPluginRepositories(
        sk.itcloud.maven.pom.form.PluginRepositories_type0 param) {
        localPluginRepositoriesTracker = param != null;

        this.localPluginRepositories = param;
    }

    public boolean isBuildSpecified() {
        return localBuildTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Build
     */
    public sk.itcloud.maven.pom.form.Build getBuild() {
        return localBuild;
    }

    /**
     * Auto generated setter method
     * @param param Build
     */
    public void setBuild(sk.itcloud.maven.pom.form.Build param) {
        localBuildTracker = param != null;

        this.localBuild = param;
    }

    public boolean isReportsSpecified() {
        return localReportsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Reports_type0
     */
    public sk.itcloud.maven.pom.form.Reports_type0 getReports() {
        return localReports;
    }

    /**
     * Auto generated setter method
     * @param param Reports
     */
    public void setReports(sk.itcloud.maven.pom.form.Reports_type0 param) {
        localReportsTracker = param != null;

        this.localReports = param;
    }

    public boolean isReportingSpecified() {
        return localReportingTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Reporting
     */
    public sk.itcloud.maven.pom.form.Reporting getReporting() {
        return localReporting;
    }

    /**
     * Auto generated setter method
     * @param param Reporting
     */
    public void setReporting(sk.itcloud.maven.pom.form.Reporting param) {
        localReportingTracker = param != null;

        this.localReporting = param;
    }

    public boolean isProfilesSpecified() {
        return localProfilesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Profiles_type0
     */
    public sk.itcloud.maven.pom.form.Profiles_type0 getProfiles() {
        return localProfiles;
    }

    /**
     * Auto generated setter method
     * @param param Profiles
     */
    public void setProfiles(sk.itcloud.maven.pom.form.Profiles_type0 param) {
        localProfilesTracker = param != null;

        this.localProfiles = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, parentQName));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://maven.apache.org/POM/4.0.0");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":Model", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Model", xmlWriter);
            }
        }

        if (localModelVersionTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "modelVersion", xmlWriter);

            if (localModelVersion == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "modelVersion cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localModelVersion);
            }

            xmlWriter.writeEndElement();
        }

        if (localParentTracker) {
            if (localParent == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "parent cannot be null!!");
            }

            localParent.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "parent"), xmlWriter);
        }

        if (localGroupIdTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "groupId", xmlWriter);

            if (localGroupId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "groupId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localGroupId);
            }

            xmlWriter.writeEndElement();
        }

        if (localArtifactIdTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "artifactId", xmlWriter);

            if (localArtifactId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "artifactId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localArtifactId);
            }

            xmlWriter.writeEndElement();
        }

        if (localVersionTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "version", xmlWriter);

            if (localVersion == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "version cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localVersion);
            }

            xmlWriter.writeEndElement();
        }

        if (localPackagingTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "packaging", xmlWriter);

            if (localPackaging == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "packaging cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPackaging);
            }

            xmlWriter.writeEndElement();
        }

        if (localNameTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "name", xmlWriter);

            if (localName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "name cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localName);
            }

            xmlWriter.writeEndElement();
        }

        if (localDescriptionTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "description", xmlWriter);

            if (localDescription == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "description cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDescription);
            }

            xmlWriter.writeEndElement();
        }

        if (localUrlTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "url", xmlWriter);

            if (localUrl == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "url cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localUrl);
            }

            xmlWriter.writeEndElement();
        }

        if (localInceptionYearTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "inceptionYear", xmlWriter);

            if (localInceptionYear == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "inceptionYear cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localInceptionYear);
            }

            xmlWriter.writeEndElement();
        }

        if (localOrganizationTracker) {
            if (localOrganization == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "organization cannot be null!!");
            }

            localOrganization.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "organization"),
                xmlWriter);
        }

        if (localLicensesTracker) {
            if (localLicenses == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "licenses cannot be null!!");
            }

            localLicenses.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "licenses"), xmlWriter);
        }

        if (localDevelopersTracker) {
            if (localDevelopers == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "developers cannot be null!!");
            }

            localDevelopers.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "developers"),
                xmlWriter);
        }

        if (localContributorsTracker) {
            if (localContributors == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "contributors cannot be null!!");
            }

            localContributors.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "contributors"),
                xmlWriter);
        }

        if (localMailingListsTracker) {
            if (localMailingLists == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "mailingLists cannot be null!!");
            }

            localMailingLists.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "mailingLists"),
                xmlWriter);
        }

        if (localPrerequisitesTracker) {
            if (localPrerequisites == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "prerequisites cannot be null!!");
            }

            localPrerequisites.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "prerequisites"),
                xmlWriter);
        }

        if (localModulesTracker) {
            if (localModules == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "modules cannot be null!!");
            }

            localModules.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "modules"), xmlWriter);
        }

        if (localScmTracker) {
            if (localScm == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "scm cannot be null!!");
            }

            localScm.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "scm"), xmlWriter);
        }

        if (localIssueManagementTracker) {
            if (localIssueManagement == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "issueManagement cannot be null!!");
            }

            localIssueManagement.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "issueManagement"),
                xmlWriter);
        }

        if (localCiManagementTracker) {
            if (localCiManagement == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ciManagement cannot be null!!");
            }

            localCiManagement.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "ciManagement"),
                xmlWriter);
        }

        if (localDistributionManagementTracker) {
            if (localDistributionManagement == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "distributionManagement cannot be null!!");
            }

            localDistributionManagement.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0",
                    "distributionManagement"), xmlWriter);
        }

        if (localPropertiesTracker) {
            if (localProperties == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "properties cannot be null!!");
            }

            localProperties.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "properties"),
                xmlWriter);
        }

        if (localDependencyManagementTracker) {
            if (localDependencyManagement == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "dependencyManagement cannot be null!!");
            }

            localDependencyManagement.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "dependencyManagement"),
                xmlWriter);
        }

        if (localDependenciesTracker) {
            if (localDependencies == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "dependencies cannot be null!!");
            }

            localDependencies.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "dependencies"),
                xmlWriter);
        }

        if (localRepositoriesTracker) {
            if (localRepositories == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "repositories cannot be null!!");
            }

            localRepositories.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "repositories"),
                xmlWriter);
        }

        if (localPluginRepositoriesTracker) {
            if (localPluginRepositories == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "pluginRepositories cannot be null!!");
            }

            localPluginRepositories.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "pluginRepositories"),
                xmlWriter);
        }

        if (localBuildTracker) {
            if (localBuild == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "build cannot be null!!");
            }

            localBuild.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "build"), xmlWriter);
        }

        if (localReportsTracker) {
            if (localReports == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "reports cannot be null!!");
            }

            localReports.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "reports"), xmlWriter);
        }

        if (localReportingTracker) {
            if (localReporting == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "reporting cannot be null!!");
            }

            localReporting.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "reporting"), xmlWriter);
        }

        if (localProfilesTracker) {
            if (localProfiles == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "profiles cannot be null!!");
            }

            localProfiles.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "profiles"), xmlWriter);
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://maven.apache.org/POM/4.0.0")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static Model parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Model object = new Model();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"Model".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Model) sk.itcloud.maven.pom.form.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement()) {
                        if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "modelVersion").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "modelVersion").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "modelVersion" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setModelVersion(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "parent").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "parent").equals(
                                    reader.getName())) {
                            object.setParent(sk.itcloud.maven.pom.form.Parent.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "groupId").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "groupId").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "groupId" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setGroupId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "artifactId").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "artifactId").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "artifactId" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setArtifactId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "version").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "version").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "version" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setVersion(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "packaging").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "packaging").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "packaging" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPackaging(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0", "name").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("", "name").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "name" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "description").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "description").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "description" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0", "url").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("", "url").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "url" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setUrl(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "inceptionYear").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "inceptionYear").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "inceptionYear" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setInceptionYear(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "organization").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "organization").equals(
                                    reader.getName())) {
                            object.setOrganization(sk.itcloud.maven.pom.form.Organization.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "licenses").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "licenses").equals(
                                    reader.getName())) {
                            object.setLicenses(sk.itcloud.maven.pom.form.Licenses_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "developers").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "developers").equals(
                                    reader.getName())) {
                            object.setDevelopers(sk.itcloud.maven.pom.form.Developers_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "contributors").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "contributors").equals(
                                    reader.getName())) {
                            object.setContributors(sk.itcloud.maven.pom.form.Contributors_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "mailingLists").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "mailingLists").equals(
                                    reader.getName())) {
                            object.setMailingLists(sk.itcloud.maven.pom.form.MailingLists_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "prerequisites").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "prerequisites").equals(reader.getName())) {
                            object.setPrerequisites(sk.itcloud.maven.pom.form.Prerequisites.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "modules").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "modules").equals(
                                    reader.getName())) {
                            object.setModules(sk.itcloud.maven.pom.form.Modules_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0", "scm").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("", "scm").equals(
                                    reader.getName())) {
                            object.setScm(sk.itcloud.maven.pom.form.Scm.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "issueManagement").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "issueManagement").equals(reader.getName())) {
                            object.setIssueManagement(sk.itcloud.maven.pom.form.IssueManagement.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "ciManagement").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "ciManagement").equals(
                                    reader.getName())) {
                            object.setCiManagement(sk.itcloud.maven.pom.form.CiManagement.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "distributionManagement").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "distributionManagement").equals(
                                    reader.getName())) {
                            object.setDistributionManagement(sk.itcloud.maven.pom.form.DistributionManagement.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "properties").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "properties").equals(
                                    reader.getName())) {
                            object.setProperties(sk.itcloud.maven.pom.form.Properties_type2.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "dependencyManagement").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "dependencyManagement").equals(
                                    reader.getName())) {
                            object.setDependencyManagement(sk.itcloud.maven.pom.form.DependencyManagement.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "dependencies").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "dependencies").equals(
                                    reader.getName())) {
                            object.setDependencies(sk.itcloud.maven.pom.form.Dependencies_type1.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "repositories").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "repositories").equals(
                                    reader.getName())) {
                            object.setRepositories(sk.itcloud.maven.pom.form.Repositories_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "pluginRepositories").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "pluginRepositories").equals(
                                    reader.getName())) {
                            object.setPluginRepositories(sk.itcloud.maven.pom.form.PluginRepositories_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0", "build").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("", "build").equals(
                                    reader.getName())) {
                            object.setBuild(sk.itcloud.maven.pom.form.Build.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "reports").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "reports").equals(
                                    reader.getName())) {
                            object.setReports(sk.itcloud.maven.pom.form.Reports_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "reporting").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "reporting").equals(
                                    reader.getName())) {
                            object.setReporting(sk.itcloud.maven.pom.form.Reporting.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "profiles").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "profiles").equals(
                                    reader.getName())) {
                            object.setProfiles(sk.itcloud.maven.pom.form.Profiles_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else {
                            // 3 - A start element we are not expecting indicates an invalid parameter was passed
                            throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
                        }
                    } else {
                        reader.next();
                    }
                } // end of while loop
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
