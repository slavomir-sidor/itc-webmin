/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.pom.form;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "configuration_type4".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Configuration_type4.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "configuration_type3".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Configuration_type3.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Developer".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Developer.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "PluginExecution".equals(typeName)) {
            return sk.itcloud.maven.pom.form.PluginExecution.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Repository".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Repository.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "mailingLists_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.MailingLists_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "DeploymentRepository".equals(typeName)) {
            return sk.itcloud.maven.pom.form.DeploymentRepository.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "excludes_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Excludes_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "notifiers_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Notifiers_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Scm".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Scm.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "configuration_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Configuration_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "configuration_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Configuration_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "configuration_type2".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Configuration_type2.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "reports_type2".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Reports_type2.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Reporting".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Reporting.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "goals_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Goals_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Notifier".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Notifier.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Resource".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Resource.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "BuildBase".equals(typeName)) {
            return sk.itcloud.maven.pom.form.BuildBase.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "goals_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Goals_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "reports_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Reports_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "reports_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Reports_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "reportSets_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.ReportSets_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "filters_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Filters_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "filters_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Filters_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Contributor".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Contributor.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "executions_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Executions_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "License".equals(typeName)) {
            return sk.itcloud.maven.pom.form.License.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "includes_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Includes_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "ActivationOS".equals(typeName)) {
            return sk.itcloud.maven.pom.form.ActivationOS.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "dependencies_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Dependencies_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "exclusions_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Exclusions_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "dependencies_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Dependencies_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "dependencies_type3".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Dependencies_type3.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "MailingList".equals(typeName)) {
            return sk.itcloud.maven.pom.form.MailingList.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "dependencies_type2".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Dependencies_type2.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Organization".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Organization.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "contributors_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Contributors_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Dependency".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Dependency.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "modules_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Modules_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "modules_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Modules_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "properties_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Properties_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Model".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Model.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "properties_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Properties_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Activation".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Activation.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "extensions_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Extensions_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "ActivationFile".equals(typeName)) {
            return sk.itcloud.maven.pom.form.ActivationFile.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "DistributionManagement".equals(typeName)) {
            return sk.itcloud.maven.pom.form.DistributionManagement.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "properties_type3".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Properties_type3.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "resources_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Resources_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "profiles_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Profiles_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "properties_type2".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Properties_type2.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "resources_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Resources_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Prerequisites".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Prerequisites.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Plugin".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Plugin.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "repositories_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Repositories_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Extension".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Extension.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Build".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Build.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "developers_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Developers_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Relocation".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Relocation.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "PluginManagement".equals(typeName)) {
            return sk.itcloud.maven.pom.form.PluginManagement.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Exclusion".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Exclusion.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "pluginRepositories_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.PluginRepositories_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Profile".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Profile.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "pluginRepositories_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.form.PluginRepositories_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "otherArchives_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.OtherArchives_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "DependencyManagement".equals(typeName)) {
            return sk.itcloud.maven.pom.form.DependencyManagement.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "ReportSet".equals(typeName)) {
            return sk.itcloud.maven.pom.form.ReportSet.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Site".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Site.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "repositories_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Repositories_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Parent".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Parent.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "roles_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Roles_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "testResources_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.TestResources_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "testResources_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.form.TestResources_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "roles_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Roles_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "plugins_type2".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Plugins_type2.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "plugins_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Plugins_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "CiManagement".equals(typeName)) {
            return sk.itcloud.maven.pom.form.CiManagement.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "IssueManagement".equals(typeName)) {
            return sk.itcloud.maven.pom.form.IssueManagement.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "licenses_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Licenses_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "plugins_type3".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Plugins_type3.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "ReportPlugin".equals(typeName)) {
            return sk.itcloud.maven.pom.form.ReportPlugin.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "RepositoryPolicy".equals(typeName)) {
            return sk.itcloud.maven.pom.form.RepositoryPolicy.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "ActivationProperty".equals(typeName)) {
            return sk.itcloud.maven.pom.form.ActivationProperty.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "plugins_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.form.Plugins_type0.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
