/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.settings.forms;


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
        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "pluginGroups_type0".equals(typeName)) {
            return sk.itcloud.maven.settings.form.PluginGroups_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "RepositoryPolicy".equals(typeName)) {
            return sk.itcloud.maven.settings.form.RepositoryPolicy.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "mirrors_type0".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Mirrors_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "repositories_type0".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Repositories_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "ActivationProperty".equals(typeName)) {
            return sk.itcloud.maven.settings.form.ActivationProperty.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "Proxy".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Proxy.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "activeProfiles_type0".equals(typeName)) {
            return sk.itcloud.maven.settings.form.ActiveProfiles_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "configuration_type0".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Configuration_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "proxies_type0".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Proxies_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "ActivationOS".equals(typeName)) {
            return sk.itcloud.maven.settings.form.ActivationOS.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "Profile".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Profile.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "pluginRepositories_type0".equals(typeName)) {
            return sk.itcloud.maven.settings.form.PluginRepositories_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "Mirror".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Mirror.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "Server".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Server.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "servers_type0".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Servers_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "properties_type0".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Properties_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "Activation".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Activation.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "ActivationFile".equals(typeName)) {
            return sk.itcloud.maven.settings.form.ActivationFile.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "profiles_type0".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Profiles_type0.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "Repository".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Repository.Factory.parse(reader);
        }

        if ("http://maven.apache.org/SETTINGS/1.0.0".equals(namespaceURI) &&
                "Settings".equals(typeName)) {
            return sk.itcloud.maven.settings.form.Settings.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
