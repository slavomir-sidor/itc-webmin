/**
 * Build.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.pom;


/**
 *  Build bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Build implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Build
       Namespace URI = http://maven.apache.org/POM/4.0.0
       Namespace Prefix = ns1
     */

    /**
     * field for SourceDirectory
     */
    protected java.lang.String localSourceDirectory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSourceDirectoryTracker = false;

    /**
     * field for ScriptSourceDirectory
     */
    protected java.lang.String localScriptSourceDirectory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localScriptSourceDirectoryTracker = false;

    /**
     * field for TestSourceDirectory
     */
    protected java.lang.String localTestSourceDirectory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTestSourceDirectoryTracker = false;

    /**
     * field for OutputDirectory
     */
    protected java.lang.String localOutputDirectory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOutputDirectoryTracker = false;

    /**
     * field for TestOutputDirectory
     */
    protected java.lang.String localTestOutputDirectory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTestOutputDirectoryTracker = false;

    /**
     * field for Extensions
     */
    protected sk.itcloud.maven.pom.Extensions_type0 localExtensions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExtensionsTracker = false;

    /**
     * field for DefaultGoal
     */
    protected java.lang.String localDefaultGoal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDefaultGoalTracker = false;

    /**
     * field for Resources
     */
    protected sk.itcloud.maven.pom.Resources_type0 localResources;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResourcesTracker = false;

    /**
     * field for TestResources
     */
    protected sk.itcloud.maven.pom.TestResources_type0 localTestResources;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTestResourcesTracker = false;

    /**
     * field for Directory
     */
    protected java.lang.String localDirectory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDirectoryTracker = false;

    /**
     * field for FinalName
     */
    protected java.lang.String localFinalName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFinalNameTracker = false;

    /**
     * field for Filters
     */
    protected sk.itcloud.maven.pom.Filters_type0 localFilters;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFiltersTracker = false;

    /**
     * field for PluginManagement
     */
    protected sk.itcloud.maven.pom.PluginManagement localPluginManagement;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPluginManagementTracker = false;

    /**
     * field for Plugins
     */
    protected sk.itcloud.maven.pom.Plugins_type1 localPlugins;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPluginsTracker = false;

    public boolean isSourceDirectorySpecified() {
        return localSourceDirectoryTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSourceDirectory() {
        return localSourceDirectory;
    }

    /**
     * Auto generated setter method
     * @param param SourceDirectory
     */
    public void setSourceDirectory(java.lang.String param) {
        localSourceDirectoryTracker = param != null;

        this.localSourceDirectory = param;
    }

    public boolean isScriptSourceDirectorySpecified() {
        return localScriptSourceDirectoryTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getScriptSourceDirectory() {
        return localScriptSourceDirectory;
    }

    /**
     * Auto generated setter method
     * @param param ScriptSourceDirectory
     */
    public void setScriptSourceDirectory(java.lang.String param) {
        localScriptSourceDirectoryTracker = param != null;

        this.localScriptSourceDirectory = param;
    }

    public boolean isTestSourceDirectorySpecified() {
        return localTestSourceDirectoryTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTestSourceDirectory() {
        return localTestSourceDirectory;
    }

    /**
     * Auto generated setter method
     * @param param TestSourceDirectory
     */
    public void setTestSourceDirectory(java.lang.String param) {
        localTestSourceDirectoryTracker = param != null;

        this.localTestSourceDirectory = param;
    }

    public boolean isOutputDirectorySpecified() {
        return localOutputDirectoryTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOutputDirectory() {
        return localOutputDirectory;
    }

    /**
     * Auto generated setter method
     * @param param OutputDirectory
     */
    public void setOutputDirectory(java.lang.String param) {
        localOutputDirectoryTracker = param != null;

        this.localOutputDirectory = param;
    }

    public boolean isTestOutputDirectorySpecified() {
        return localTestOutputDirectoryTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTestOutputDirectory() {
        return localTestOutputDirectory;
    }

    /**
     * Auto generated setter method
     * @param param TestOutputDirectory
     */
    public void setTestOutputDirectory(java.lang.String param) {
        localTestOutputDirectoryTracker = param != null;

        this.localTestOutputDirectory = param;
    }

    public boolean isExtensionsSpecified() {
        return localExtensionsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Extensions_type0
     */
    public sk.itcloud.maven.pom.Extensions_type0 getExtensions() {
        return localExtensions;
    }

    /**
     * Auto generated setter method
     * @param param Extensions
     */
    public void setExtensions(
        sk.itcloud.maven.pom.Extensions_type0 param) {
        localExtensionsTracker = param != null;

        this.localExtensions = param;
    }

    public boolean isDefaultGoalSpecified() {
        return localDefaultGoalTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDefaultGoal() {
        return localDefaultGoal;
    }

    /**
     * Auto generated setter method
     * @param param DefaultGoal
     */
    public void setDefaultGoal(java.lang.String param) {
        localDefaultGoalTracker = param != null;

        this.localDefaultGoal = param;
    }

    public boolean isResourcesSpecified() {
        return localResourcesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Resources_type0
     */
    public sk.itcloud.maven.pom.Resources_type0 getResources() {
        return localResources;
    }

    /**
     * Auto generated setter method
     * @param param Resources
     */
    public void setResources(sk.itcloud.maven.pom.Resources_type0 param) {
        localResourcesTracker = param != null;

        this.localResources = param;
    }

    public boolean isTestResourcesSpecified() {
        return localTestResourcesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.TestResources_type0
     */
    public sk.itcloud.maven.pom.TestResources_type0 getTestResources() {
        return localTestResources;
    }

    /**
     * Auto generated setter method
     * @param param TestResources
     */
    public void setTestResources(
        sk.itcloud.maven.pom.TestResources_type0 param) {
        localTestResourcesTracker = param != null;

        this.localTestResources = param;
    }

    public boolean isDirectorySpecified() {
        return localDirectoryTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDirectory() {
        return localDirectory;
    }

    /**
     * Auto generated setter method
     * @param param Directory
     */
    public void setDirectory(java.lang.String param) {
        localDirectoryTracker = param != null;

        this.localDirectory = param;
    }

    public boolean isFinalNameSpecified() {
        return localFinalNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFinalName() {
        return localFinalName;
    }

    /**
     * Auto generated setter method
     * @param param FinalName
     */
    public void setFinalName(java.lang.String param) {
        localFinalNameTracker = param != null;

        this.localFinalName = param;
    }

    public boolean isFiltersSpecified() {
        return localFiltersTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Filters_type0
     */
    public sk.itcloud.maven.pom.Filters_type0 getFilters() {
        return localFilters;
    }

    /**
     * Auto generated setter method
     * @param param Filters
     */
    public void setFilters(sk.itcloud.maven.pom.Filters_type0 param) {
        localFiltersTracker = param != null;

        this.localFilters = param;
    }

    public boolean isPluginManagementSpecified() {
        return localPluginManagementTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.PluginManagement
     */
    public sk.itcloud.maven.pom.PluginManagement getPluginManagement() {
        return localPluginManagement;
    }

    /**
     * Auto generated setter method
     * @param param PluginManagement
     */
    public void setPluginManagement(
        sk.itcloud.maven.pom.PluginManagement param) {
        localPluginManagementTracker = param != null;

        this.localPluginManagement = param;
    }

    public boolean isPluginsSpecified() {
        return localPluginsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Plugins_type1
     */
    public sk.itcloud.maven.pom.Plugins_type1 getPlugins() {
        return localPlugins;
    }

    /**
     * Auto generated setter method
     * @param param Plugins
     */
    public void setPlugins(sk.itcloud.maven.pom.Plugins_type1 param) {
        localPluginsTracker = param != null;

        this.localPlugins = param;
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
                    namespacePrefix + ":Build", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Build", xmlWriter);
            }
        }

        if (localSourceDirectoryTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "sourceDirectory", xmlWriter);

            if (localSourceDirectory == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "sourceDirectory cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSourceDirectory);
            }

            xmlWriter.writeEndElement();
        }

        if (localScriptSourceDirectoryTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "scriptSourceDirectory",
                xmlWriter);

            if (localScriptSourceDirectory == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "scriptSourceDirectory cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localScriptSourceDirectory);
            }

            xmlWriter.writeEndElement();
        }

        if (localTestSourceDirectoryTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "testSourceDirectory", xmlWriter);

            if (localTestSourceDirectory == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "testSourceDirectory cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTestSourceDirectory);
            }

            xmlWriter.writeEndElement();
        }

        if (localOutputDirectoryTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "outputDirectory", xmlWriter);

            if (localOutputDirectory == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "outputDirectory cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localOutputDirectory);
            }

            xmlWriter.writeEndElement();
        }

        if (localTestOutputDirectoryTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "testOutputDirectory", xmlWriter);

            if (localTestOutputDirectory == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "testOutputDirectory cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTestOutputDirectory);
            }

            xmlWriter.writeEndElement();
        }

        if (localExtensionsTracker) {
            if (localExtensions == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "extensions cannot be null!!");
            }

            localExtensions.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "extensions"),
                xmlWriter);
        }

        if (localDefaultGoalTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "defaultGoal", xmlWriter);

            if (localDefaultGoal == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "defaultGoal cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDefaultGoal);
            }

            xmlWriter.writeEndElement();
        }

        if (localResourcesTracker) {
            if (localResources == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "resources cannot be null!!");
            }

            localResources.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "resources"), xmlWriter);
        }

        if (localTestResourcesTracker) {
            if (localTestResources == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "testResources cannot be null!!");
            }

            localTestResources.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "testResources"),
                xmlWriter);
        }

        if (localDirectoryTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "directory", xmlWriter);

            if (localDirectory == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "directory cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDirectory);
            }

            xmlWriter.writeEndElement();
        }

        if (localFinalNameTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "finalName", xmlWriter);

            if (localFinalName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "finalName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFinalName);
            }

            xmlWriter.writeEndElement();
        }

        if (localFiltersTracker) {
            if (localFilters == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "filters cannot be null!!");
            }

            localFilters.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "filters"), xmlWriter);
        }

        if (localPluginManagementTracker) {
            if (localPluginManagement == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "pluginManagement cannot be null!!");
            }

            localPluginManagement.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "pluginManagement"),
                xmlWriter);
        }

        if (localPluginsTracker) {
            if (localPlugins == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "plugins cannot be null!!");
            }

            localPlugins.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "plugins"), xmlWriter);
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
        public static Build parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Build object = new Build();

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

                        if (!"Build".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Build) sk.itcloud.maven.pom.ExtensionMapper.getTypeObject(nsUri,
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
                                    "sourceDirectory").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "sourceDirectory").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "sourceDirectory" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSourceDirectory(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "scriptSourceDirectory").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "scriptSourceDirectory").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "scriptSourceDirectory" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setScriptSourceDirectory(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "testSourceDirectory").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "testSourceDirectory").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "testSourceDirectory" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setTestSourceDirectory(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "outputDirectory").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "outputDirectory").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "outputDirectory" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setOutputDirectory(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "testOutputDirectory").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "testOutputDirectory").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "testOutputDirectory" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setTestOutputDirectory(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "extensions").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "extensions").equals(
                                    reader.getName())) {
                            object.setExtensions(sk.itcloud.maven.pom.Extensions_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "defaultGoal").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "defaultGoal").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "defaultGoal" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDefaultGoal(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "resources").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "resources").equals(
                                    reader.getName())) {
                            object.setResources(sk.itcloud.maven.pom.Resources_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "testResources").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "testResources").equals(reader.getName())) {
                            object.setTestResources(sk.itcloud.maven.pom.TestResources_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "directory").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "directory").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "directory" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDirectory(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "finalName").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "finalName").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "finalName" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setFinalName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "filters").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "filters").equals(
                                    reader.getName())) {
                            object.setFilters(sk.itcloud.maven.pom.Filters_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "pluginManagement").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "pluginManagement").equals(reader.getName())) {
                            object.setPluginManagement(sk.itcloud.maven.pom.PluginManagement.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "plugins").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "plugins").equals(
                                    reader.getName())) {
                            object.setPlugins(sk.itcloud.maven.pom.Plugins_type1.Factory.parse(
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
