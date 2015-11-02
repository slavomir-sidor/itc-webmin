/**
 * Plugin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.pom.form;


/**
 *  Plugin bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Plugin implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Plugin
       Namespace URI = http://maven.apache.org/POM/4.0.0
       Namespace Prefix = ns1
     */

    /**
     * field for GroupId
     */
    protected java.lang.String localGroupId = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "org.apache.maven.plugins");

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
     * field for Extensions
     */
    protected java.lang.String localExtensions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExtensionsTracker = false;

    /**
     * field for Executions
     */
    protected sk.itcloud.maven.pom.form.Executions_type0 localExecutions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExecutionsTracker = false;

    /**
     * field for Dependencies
     */
    protected sk.itcloud.maven.pom.form.Dependencies_type2 localDependencies;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDependenciesTracker = false;

    /**
     * field for Goals
     */
    protected sk.itcloud.maven.pom.form.Goals_type1 localGoals;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGoalsTracker = false;

    /**
     * field for Inherited
     */
    protected java.lang.String localInherited;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localInheritedTracker = false;

    /**
     * field for Configuration
     */
    protected sk.itcloud.maven.pom.form.Configuration_type2 localConfiguration;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localConfigurationTracker = false;

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

    public boolean isExtensionsSpecified() {
        return localExtensionsTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getExtensions() {
        return localExtensions;
    }

    /**
     * Auto generated setter method
     * @param param Extensions
     */
    public void setExtensions(java.lang.String param) {
        localExtensionsTracker = param != null;

        this.localExtensions = param;
    }

    public boolean isExecutionsSpecified() {
        return localExecutionsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Executions_type0
     */
    public sk.itcloud.maven.pom.form.Executions_type0 getExecutions() {
        return localExecutions;
    }

    /**
     * Auto generated setter method
     * @param param Executions
     */
    public void setExecutions(
        sk.itcloud.maven.pom.form.Executions_type0 param) {
        localExecutionsTracker = param != null;

        this.localExecutions = param;
    }

    public boolean isDependenciesSpecified() {
        return localDependenciesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Dependencies_type2
     */
    public sk.itcloud.maven.pom.form.Dependencies_type2 getDependencies() {
        return localDependencies;
    }

    /**
     * Auto generated setter method
     * @param param Dependencies
     */
    public void setDependencies(
        sk.itcloud.maven.pom.form.Dependencies_type2 param) {
        localDependenciesTracker = param != null;

        this.localDependencies = param;
    }

    public boolean isGoalsSpecified() {
        return localGoalsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Goals_type1
     */
    public sk.itcloud.maven.pom.form.Goals_type1 getGoals() {
        return localGoals;
    }

    /**
     * Auto generated setter method
     * @param param Goals
     */
    public void setGoals(sk.itcloud.maven.pom.form.Goals_type1 param) {
        localGoalsTracker = param != null;

        this.localGoals = param;
    }

    public boolean isInheritedSpecified() {
        return localInheritedTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getInherited() {
        return localInherited;
    }

    /**
     * Auto generated setter method
     * @param param Inherited
     */
    public void setInherited(java.lang.String param) {
        localInheritedTracker = param != null;

        this.localInherited = param;
    }

    public boolean isConfigurationSpecified() {
        return localConfigurationTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Configuration_type2
     */
    public sk.itcloud.maven.pom.form.Configuration_type2 getConfiguration() {
        return localConfiguration;
    }

    /**
     * Auto generated setter method
     * @param param Configuration
     */
    public void setConfiguration(
        sk.itcloud.maven.pom.form.Configuration_type2 param) {
        localConfigurationTracker = param != null;

        this.localConfiguration = param;
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
                    namespacePrefix + ":Plugin", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Plugin", xmlWriter);
            }
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

        if (localExtensionsTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "extensions", xmlWriter);

            if (localExtensions == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "extensions cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localExtensions);
            }

            xmlWriter.writeEndElement();
        }

        if (localExecutionsTracker) {
            if (localExecutions == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "executions cannot be null!!");
            }

            localExecutions.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "executions"),
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

        if (localGoalsTracker) {
            if (localGoals == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "goals cannot be null!!");
            }

            localGoals.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "goals"), xmlWriter);
        }

        if (localInheritedTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "inherited", xmlWriter);

            if (localInherited == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "inherited cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localInherited);
            }

            xmlWriter.writeEndElement();
        }

        if (localConfigurationTracker) {
            if (localConfiguration == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "configuration cannot be null!!");
            }

            localConfiguration.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/POM/4.0.0", "configuration"),
                xmlWriter);
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
        public static Plugin parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Plugin object = new Plugin();

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

                        if (!"Plugin".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Plugin) sk.itcloud.maven.pom.form.ExtensionMapper.getTypeObject(nsUri,
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
                                    "extensions").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "extensions").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "extensions" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setExtensions(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "executions").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "executions").equals(
                                    reader.getName())) {
                            object.setExecutions(sk.itcloud.maven.pom.form.Executions_type0.Factory.parse(
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
                            object.setDependencies(sk.itcloud.maven.pom.form.Dependencies_type2.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0", "goals").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("", "goals").equals(
                                    reader.getName())) {
                            object.setGoals(sk.itcloud.maven.pom.form.Goals_type1.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "inherited").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "inherited").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "inherited" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setInherited(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "configuration").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "configuration").equals(reader.getName())) {
                            object.setConfiguration(sk.itcloud.maven.pom.form.Configuration_type2.Factory.parse(
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
