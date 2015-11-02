/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.pom;


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
            return sk.itcloud.maven.pom.Configuration_type4.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "configuration_type3".equals(typeName)) {
            return sk.itcloud.maven.pom.Configuration_type3.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Developer".equals(typeName)) {
            return sk.itcloud.maven.pom.Developer.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "PluginExecution".equals(typeName)) {
            return sk.itcloud.maven.pom.PluginExecution.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Repository".equals(typeName)) {
            return sk.itcloud.maven.pom.Repository.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "mailingLists_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.MailingLists_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "DeploymentRepository".equals(typeName)) {
            return sk.itcloud.maven.pom.DeploymentRepository.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "excludes_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Excludes_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "notifiers_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Notifiers_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Scm".equals(typeName)) {
            return sk.itcloud.maven.pom.Scm.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "configuration_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Configuration_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "configuration_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.Configuration_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "configuration_type2".equals(typeName)) {
            return sk.itcloud.maven.pom.Configuration_type2.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "reports_type2".equals(typeName)) {
            return sk.itcloud.maven.pom.Reports_type2.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Reporting".equals(typeName)) {
            return sk.itcloud.maven.pom.Reporting.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "goals_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.Goals_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Notifier".equals(typeName)) {
            return sk.itcloud.maven.pom.Notifier.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Resource".equals(typeName)) {
            return sk.itcloud.maven.pom.Resource.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "BuildBase".equals(typeName)) {
            return sk.itcloud.maven.pom.BuildBase.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "goals_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Goals_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "reports_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Reports_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "reports_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.Reports_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "reportSets_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.ReportSets_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "filters_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.Filters_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "filters_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Filters_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Contributor".equals(typeName)) {
            return sk.itcloud.maven.pom.Contributor.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "executions_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Executions_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "License".equals(typeName)) {
            return sk.itcloud.maven.pom.License.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "includes_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Includes_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "ActivationOS".equals(typeName)) {
            return sk.itcloud.maven.pom.ActivationOS.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "dependencies_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.Dependencies_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "exclusions_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Exclusions_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "dependencies_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Dependencies_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "dependencies_type3".equals(typeName)) {
            return sk.itcloud.maven.pom.Dependencies_type3.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "MailingList".equals(typeName)) {
            return sk.itcloud.maven.pom.MailingList.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "dependencies_type2".equals(typeName)) {
            return sk.itcloud.maven.pom.Dependencies_type2.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Organization".equals(typeName)) {
            return sk.itcloud.maven.pom.Organization.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "contributors_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Contributors_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Dependency".equals(typeName)) {
            return sk.itcloud.maven.pom.Dependency.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "modules_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.Modules_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "modules_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Modules_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "properties_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.Properties_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Model".equals(typeName)) {
            return sk.itcloud.maven.pom.Model.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "properties_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Properties_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Activation".equals(typeName)) {
            return sk.itcloud.maven.pom.Activation.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "extensions_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Extensions_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "ActivationFile".equals(typeName)) {
            return sk.itcloud.maven.pom.ActivationFile.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "DistributionManagement".equals(typeName)) {
            return sk.itcloud.maven.pom.DistributionManagement.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "properties_type3".equals(typeName)) {
            return sk.itcloud.maven.pom.Properties_type3.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "resources_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.Resources_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "profiles_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Profiles_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "properties_type2".equals(typeName)) {
            return sk.itcloud.maven.pom.Properties_type2.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "resources_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Resources_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Prerequisites".equals(typeName)) {
            return sk.itcloud.maven.pom.Prerequisites.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Plugin".equals(typeName)) {
            return sk.itcloud.maven.pom.Plugin.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "repositories_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Repositories_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Extension".equals(typeName)) {
            return sk.itcloud.maven.pom.Extension.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Build".equals(typeName)) {
            return sk.itcloud.maven.pom.Build.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "developers_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Developers_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Relocation".equals(typeName)) {
            return sk.itcloud.maven.pom.Relocation.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "PluginManagement".equals(typeName)) {
            return sk.itcloud.maven.pom.PluginManagement.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Exclusion".equals(typeName)) {
            return sk.itcloud.maven.pom.Exclusion.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "pluginRepositories_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.PluginRepositories_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Profile".equals(typeName)) {
            return sk.itcloud.maven.pom.Profile.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "pluginRepositories_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.PluginRepositories_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "otherArchives_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.OtherArchives_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "DependencyManagement".equals(typeName)) {
            return sk.itcloud.maven.pom.DependencyManagement.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "ReportSet".equals(typeName)) {
            return sk.itcloud.maven.pom.ReportSet.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Site".equals(typeName)) {
            return sk.itcloud.maven.pom.Site.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "repositories_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.Repositories_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "Parent".equals(typeName)) {
            return sk.itcloud.maven.pom.Parent.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "roles_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Roles_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "testResources_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.TestResources_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "testResources_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.TestResources_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "roles_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.Roles_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "plugins_type2".equals(typeName)) {
            return sk.itcloud.maven.pom.Plugins_type2.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "plugins_type1".equals(typeName)) {
            return sk.itcloud.maven.pom.Plugins_type1.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "CiManagement".equals(typeName)) {
            return sk.itcloud.maven.pom.CiManagement.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "IssueManagement".equals(typeName)) {
            return sk.itcloud.maven.pom.IssueManagement.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "licenses_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Licenses_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "plugins_type3".equals(typeName)) {
            return sk.itcloud.maven.pom.Plugins_type3.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "ReportPlugin".equals(typeName)) {
            return sk.itcloud.maven.pom.ReportPlugin.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "RepositoryPolicy".equals(typeName)) {
            return sk.itcloud.maven.pom.RepositoryPolicy.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "ActivationProperty".equals(typeName)) {
            return sk.itcloud.maven.pom.ActivationProperty.Factory.parse(reader);
        }

        if ("http://maven.apache.org/POM/4.0.0".equals(namespaceURI) &&
                "plugins_type0".equals(typeName)) {
            return sk.itcloud.maven.pom.Plugins_type0.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
