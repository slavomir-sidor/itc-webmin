/**
 * Profile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.pom;


/**
 *  Profile bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Profile implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Profile
       Namespace URI = http://maven.apache.org/POM/4.0.0
       Namespace Prefix = ns1
     */

    /**
     * field for Id
     */
    protected java.lang.String localId = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "default");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIdTracker = false;

    /**
     * field for Activation
     */
    protected sk.itcloud.maven.pom.Activation localActivation;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localActivationTracker = false;

    /**
     * field for Build
     */
    protected sk.itcloud.maven.pom.BuildBase localBuild;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBuildTracker = false;

    /**
     * field for Modules
     */
    protected sk.itcloud.maven.pom.Modules_type1 localModules;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localModulesTracker = false;

    /**
     * field for DistributionManagement
     */
    protected sk.itcloud.maven.pom.DistributionManagement localDistributionManagement;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDistributionManagementTracker = false;

    /**
     * field for Properties
     */
    protected sk.itcloud.maven.pom.Properties_type3 localProperties;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPropertiesTracker = false;

    /**
     * field for DependencyManagement
     */
    protected sk.itcloud.maven.pom.DependencyManagement localDependencyManagement;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDependencyManagementTracker = false;

    /**
     * field for Dependencies
     */
    protected sk.itcloud.maven.pom.Dependencies_type3 localDependencies;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDependenciesTracker = false;

    /**
     * field for Repositories
     */
    protected sk.itcloud.maven.pom.Repositories_type1 localRepositories;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRepositoriesTracker = false;

    /**
     * field for PluginRepositories
     */
    protected sk.itcloud.maven.pom.PluginRepositories_type1 localPluginRepositories;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPluginRepositoriesTracker = false;

    /**
     * field for Reports
     */
    protected sk.itcloud.maven.pom.Reports_type2 localReports;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReportsTracker = false;

    /**
     * field for Reporting
     */
    protected sk.itcloud.maven.pom.Reporting localReporting;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReportingTracker = false;

    public boolean isIdSpecified() {
        return localIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getId() {
        return localId;
    }

    /**
     * Auto generated setter method
     * @param param Id
     */
    public void setId(java.lang.String param) {
        localIdTracker = param != null;

        this.localId = param;
    }

    public boolean isActivationSpecified() {
        return localActivationTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Activation
     */
    public sk.itcloud.maven.pom.Activation getActivation() {
        return localActivation;
    }

    /**
     * Auto generated setter method
     * @param param Activation
     */
    public void setActivation(sk.itcloud.maven.pom.Activation param) {
        localActivationTracker = param != null;

        this.localActivation = param;
    }

    public boolean isBuildSpecified() {
        return localBuildTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.BuildBase
     */
    public sk.itcloud.maven.pom.BuildBase getBuild() {
        return localBuild;
    }

    /**
     * Auto generated setter method
     * @param param Build
     */
    public void setBuild(sk.itcloud.maven.pom.BuildBase param) {
        localBuildTracker = param != null;

        this.localBuild = param;
    }

    public boolean isModulesSpecified() {
        return localModulesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Modules_type1
     */
    public sk.itcloud.maven.pom.Modules_type1 getModules() {
        return localModules;
    }

    /**
     * Auto generated setter method
     * @param param Modules
     */
    public void setModules(sk.itcloud.maven.pom.Modules_type1 param) {
        localModulesTracker = param != null;

        this.localModules = param;
    }

    public boolean isDistributionManagementSpecified() {
        return localDistributionManagementTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.DistributionManagement
     */
    public sk.itcloud.maven.pom.DistributionManagement getDistributionManagement() {
        return localDistributionManagement;
    }

    /**
     * Auto generated setter method
     * @param param DistributionManagement
     */
    public void setDistributionManagement(
        sk.itcloud.maven.pom.DistributionManagement param) {
        localDistributionManagementTracker = param != null;

        this.localDistributionManagement = param;
    }

    public boolean isPropertiesSpecified() {
        return localPropertiesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Properties_type3
     */
    public sk.itcloud.maven.pom.Properties_type3 getProperties() {
        return localProperties;
    }

    /**
     * Auto generated setter method
     * @param param Properties
     */
    public void setProperties(
        sk.itcloud.maven.pom.Properties_type3 param) {
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
    public sk.itcloud.maven.pom.DependencyManagement getDependencyManagement() {
        return localDependencyManagement;
    }

    /**
     * Auto generated setter method
     * @param param DependencyManagement
     */
    public void setDependencyManagement(
        sk.itcloud.maven.pom.DependencyManagement param) {
        localDependencyManagementTracker = param != null;

        this.localDependencyManagement = param;
    }

    public boolean isDependenciesSpecified() {
        return localDependenciesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Dependencies_type3
     */
    public sk.itcloud.maven.pom.Dependencies_type3 getDependencies() {
        return localDependencies;
    }

    /**
     * Auto generated setter method
     * @param param Dependencies
     */
    public void setDependencies(
        sk.itcloud.maven.pom.Dependencies_type3 param) {
        localDependenciesTracker = param != null;

        this.localDependencies = param;
    }

    public boolean isRepositoriesSpecified() {
        return localRepositoriesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Repositories_type1
     */
    public sk.itcloud.maven.pom.Repositories_type1 getRepositories() {
        return localRepositories;
    }

    /**
     * Auto generated setter method
     * @param param Repositories
     */
    public void setRepositories(
        sk.itcloud.maven.pom.Repositories_type1 param) {
        localRepositoriesTracker = param != null;

        this.localRepositories = param;
    }

    public boolean isPluginRepositoriesSpecified() {
        return localPluginRepositoriesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.PluginRepositories_type1
     */
    public sk.itcloud.maven.pom.PluginRepositories_type1 getPluginRepositories() {
        return localPluginRepositories;
    }

    /**
     * Auto generated setter method
     * @param param PluginRepositories
     */
    public void setPluginRepositories(
        sk.itcloud.maven.pom.PluginRepositories_type1 param) {
        localPluginRepositoriesTracker = param != null;

        this.localPluginRepositories = param;
    }

    public boolean isReportsSpecified() {
        return localReportsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Reports_type2
     */
    public sk.itcloud.maven.pom.Reports_type2 getReports() {
        return localReports;
    }

    /**
     * Auto generated setter method
     * @param param Reports
     */
    public void setReports(sk.itcloud.maven.pom.Reports_type2 param) {
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
    public sk.itcloud.maven.pom.Reporting getReporting() {
        return localReporting;
    }

    /**
     * Auto generated setter method
     * @param param Reporting
     */
    public void setReporting(sk.itcloud.maven.pom.Reporting param) {
        localReportingTracker = param != null;

        this.localReporting = param;
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
                    namespacePrefix + ":Profile", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Profile", xmlWriter);
            }
        }

        if (localIdTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "id", xmlWriter);

            if (localId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localId);
            }

            xmlWriter.writeEndElement();
        }

        if (localActivationTracker) {
            if (localActivation == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "activation cannot be null!!");
            }

            localActivation.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "activation"),
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

        if (localModulesTracker) {
            if (localModules == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "modules cannot be null!!");
            }

            localModules.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "modules"), xmlWriter);
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
        public static Profile parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Profile object = new Profile();

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

                        if (!"Profile".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Profile) sk.itcloud.maven.pom.ExtensionMapper.getTypeObject(nsUri,
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
                                    "http://maven.apache.org/POM/4.0.0", "id").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("", "id").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "id" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "activation").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "activation").equals(
                                    reader.getName())) {
                            object.setActivation(sk.itcloud.maven.pom.Activation.Factory.parse(
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
                            object.setBuild(sk.itcloud.maven.pom.BuildBase.Factory.parse(
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
                            object.setModules(sk.itcloud.maven.pom.Modules_type1.Factory.parse(
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
                            object.setDistributionManagement(sk.itcloud.maven.pom.DistributionManagement.Factory.parse(
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
                            object.setProperties(sk.itcloud.maven.pom.Properties_type3.Factory.parse(
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
                            object.setDependencyManagement(sk.itcloud.maven.pom.DependencyManagement.Factory.parse(
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
                            object.setDependencies(sk.itcloud.maven.pom.Dependencies_type3.Factory.parse(
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
                            object.setRepositories(sk.itcloud.maven.pom.Repositories_type1.Factory.parse(
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
                            object.setPluginRepositories(sk.itcloud.maven.pom.PluginRepositories_type1.Factory.parse(
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
                            object.setReports(sk.itcloud.maven.pom.Reports_type2.Factory.parse(
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
                            object.setReporting(sk.itcloud.maven.pom.Reporting.Factory.parse(
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
