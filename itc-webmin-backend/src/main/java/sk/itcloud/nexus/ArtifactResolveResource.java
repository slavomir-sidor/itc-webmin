/**
 * ArtifactResolveResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.nexus;


/**
 *  ArtifactResolveResource bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ArtifactResolveResource implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = artifact-resolve-resource
       Namespace URI =
       Namespace Prefix =
     */

    /**
     * field for Extension
     */
    protected java.lang.String localExtension;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExtensionTracker = false;

    /**
     * field for Sha1
     */
    protected java.lang.String localSha1;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSha1Tracker = false;

    /**
     * field for FileName
     */
    protected java.lang.String localFileName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFileNameTracker = false;

    /**
     * field for Snapshot
     */
    protected boolean localSnapshot;

    /**
     * field for Classifier
     */
    protected java.lang.String localClassifier;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localClassifierTracker = false;

    /**
     * field for SnapshotBuildNumber
     */
    protected long localSnapshotBuildNumber;

    /**
     * field for PresentLocally
     */
    protected boolean localPresentLocally;

    /**
     * field for RepositoryPath
     */
    protected java.lang.String localRepositoryPath;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRepositoryPathTracker = false;

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
     * field for GroupId
     */
    protected java.lang.String localGroupId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGroupIdTracker = false;

    /**
     * field for SnapshotTimeStamp
     */
    protected long localSnapshotTimeStamp;

    /**
     * field for BaseVersion
     */
    protected java.lang.String localBaseVersion;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBaseVersionTracker = false;

    /**
     * field for Version
     */
    protected java.lang.String localVersion;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localVersionTracker = false;

    public boolean isExtensionSpecified() {
        return localExtensionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getExtension() {
        return localExtension;
    }

    /**
     * Auto generated setter method
     * @param param Extension
     */
    public void setExtension(java.lang.String param) {
        localExtensionTracker = param != null;

        this.localExtension = param;
    }

    public boolean isSha1Specified() {
        return localSha1Tracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSha1() {
        return localSha1;
    }

    /**
     * Auto generated setter method
     * @param param Sha1
     */
    public void setSha1(java.lang.String param) {
        localSha1Tracker = param != null;

        this.localSha1 = param;
    }

    public boolean isFileNameSpecified() {
        return localFileNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFileName() {
        return localFileName;
    }

    /**
     * Auto generated setter method
     * @param param FileName
     */
    public void setFileName(java.lang.String param) {
        localFileNameTracker = param != null;

        this.localFileName = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getSnapshot() {
        return localSnapshot;
    }

    /**
     * Auto generated setter method
     * @param param Snapshot
     */
    public void setSnapshot(boolean param) {
        this.localSnapshot = param;
    }

    public boolean isClassifierSpecified() {
        return localClassifierTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getClassifier() {
        return localClassifier;
    }

    /**
     * Auto generated setter method
     * @param param Classifier
     */
    public void setClassifier(java.lang.String param) {
        localClassifierTracker = param != null;

        this.localClassifier = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getSnapshotBuildNumber() {
        return localSnapshotBuildNumber;
    }

    /**
     * Auto generated setter method
     * @param param SnapshotBuildNumber
     */
    public void setSnapshotBuildNumber(long param) {
        this.localSnapshotBuildNumber = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getPresentLocally() {
        return localPresentLocally;
    }

    /**
     * Auto generated setter method
     * @param param PresentLocally
     */
    public void setPresentLocally(boolean param) {
        this.localPresentLocally = param;
    }

    public boolean isRepositoryPathSpecified() {
        return localRepositoryPathTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRepositoryPath() {
        return localRepositoryPath;
    }

    /**
     * Auto generated setter method
     * @param param RepositoryPath
     */
    public void setRepositoryPath(java.lang.String param) {
        localRepositoryPathTracker = param != null;

        this.localRepositoryPath = param;
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

    /**
     * Auto generated getter method
     * @return long
     */
    public long getSnapshotTimeStamp() {
        return localSnapshotTimeStamp;
    }

    /**
     * Auto generated setter method
     * @param param SnapshotTimeStamp
     */
    public void setSnapshotTimeStamp(long param) {
        this.localSnapshotTimeStamp = param;
    }

    public boolean isBaseVersionSpecified() {
        return localBaseVersionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBaseVersion() {
        return localBaseVersion;
    }

    /**
     * Auto generated setter method
     * @param param BaseVersion
     */
    public void setBaseVersion(java.lang.String param) {
        localBaseVersionTracker = param != null;

        this.localBaseVersion = param;
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
            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":artifact-resolve-resource", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "artifact-resolve-resource", xmlWriter);
            }
        }

        if (localExtensionTracker) {
            namespace = "";
            writeStartElement(null, namespace, "extension", xmlWriter);

            if (localExtension == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "extension cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localExtension);
            }

            xmlWriter.writeEndElement();
        }

        if (localSha1Tracker) {
            namespace = "";
            writeStartElement(null, namespace, "sha1", xmlWriter);

            if (localSha1 == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "sha1 cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSha1);
            }

            xmlWriter.writeEndElement();
        }

        if (localFileNameTracker) {
            namespace = "";
            writeStartElement(null, namespace, "fileName", xmlWriter);

            if (localFileName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "fileName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFileName);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "snapshot", xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "snapshot cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localSnapshot));
        }

        xmlWriter.writeEndElement();

        if (localClassifierTracker) {
            namespace = "";
            writeStartElement(null, namespace, "classifier", xmlWriter);

            if (localClassifier == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "classifier cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localClassifier);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "snapshotBuildNumber", xmlWriter);

        if (localSnapshotBuildNumber == java.lang.Long.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "snapshotBuildNumber cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localSnapshotBuildNumber));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "presentLocally", xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "presentLocally cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPresentLocally));
        }

        xmlWriter.writeEndElement();

        if (localRepositoryPathTracker) {
            namespace = "";
            writeStartElement(null, namespace, "repositoryPath", xmlWriter);

            if (localRepositoryPath == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "repositoryPath cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localRepositoryPath);
            }

            xmlWriter.writeEndElement();
        }

        if (localArtifactIdTracker) {
            namespace = "";
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

        if (localGroupIdTracker) {
            namespace = "";
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

        namespace = "";
        writeStartElement(null, namespace, "snapshotTimeStamp", xmlWriter);

        if (localSnapshotTimeStamp == java.lang.Long.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "snapshotTimeStamp cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localSnapshotTimeStamp));
        }

        xmlWriter.writeEndElement();

        if (localBaseVersionTracker) {
            namespace = "";
            writeStartElement(null, namespace, "baseVersion", xmlWriter);

            if (localBaseVersion == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "baseVersion cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBaseVersion);
            }

            xmlWriter.writeEndElement();
        }

        if (localVersionTracker) {
            namespace = "";
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

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("")) {
            return "";
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
        public static ArtifactResolveResource parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ArtifactResolveResource object = new ArtifactResolveResource();

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

                        if (!"artifact-resolve-resource".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ArtifactResolveResource) sk.itcloud.maven.pom.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "extension").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "extension").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "extension" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setExtension(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "sha1").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "sha1").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "sha1" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSha1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "fileName").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "fileName").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "fileName" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFileName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "snapshot").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "snapshot").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "snapshot" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSnapshot(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "classifier").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "classifier").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "classifier" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setClassifier(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "snapshotBuildNumber").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "snapshotBuildNumber").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "snapshotBuildNumber" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSnapshotBuildNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "presentLocally").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "presentLocally").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "presentLocally" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPresentLocally(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "repositoryPath").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "repositoryPath").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "repositoryPath" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRepositoryPath(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "artifactId").equals(
                            reader.getName())) ||
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

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "groupId").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "groupId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "groupId" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setGroupId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "snapshotTimeStamp").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "snapshotTimeStamp").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "snapshotTimeStamp" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSnapshotTimeStamp(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "baseVersion").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "baseVersion").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "baseVersion" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBaseVersion(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "version").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "version").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "version" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setVersion(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
