/**
 * RepositoryMetaResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.nexus;


/**
 *  RepositoryMetaResource bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class RepositoryMetaResource implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = repository-meta-resource
       Namespace URI =
       Namespace Prefix =
     */

    /**
     * field for RemoteStorageErrorsCount
     */
    protected int localRemoteStorageErrorsCount;

    /**
     * field for RepoType
     */
    protected java.lang.String localRepoType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRepoTypeTracker = false;

    /**
     * field for FileCountInRepository
     */
    protected long localFileCountInRepository;

    /**
     * field for SizeOnDisk
     */
    protected long localSizeOnDisk;

    /**
     * field for FreeSpaceOnDisk
     */
    protected long localFreeSpaceOnDisk;

    /**
     * field for LocalStorageErrorsCount
     */
    protected int localLocalStorageErrorsCount;

    /**
     * field for NotFoundCacheSize
     */
    protected long localNotFoundCacheSize;

    /**
     * field for NotFoundCacheHits
     */
    protected long localNotFoundCacheHits;

    /**
     * field for Format
     */
    protected java.lang.String localFormat;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFormatTracker = false;

    /**
     * field for Id
     */
    protected java.lang.String localId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIdTracker = false;

    /**
     * field for Groups
     */
    protected sk.itcloud.nexus.Groups_type0 localGroups;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGroupsTracker = false;

    /**
     * field for NotFoundCacheMisses
     */
    protected long localNotFoundCacheMisses;

    /**
     * Auto generated getter method
     * @return int
     */
    public int getRemoteStorageErrorsCount() {
        return localRemoteStorageErrorsCount;
    }

    /**
     * Auto generated setter method
     * @param param RemoteStorageErrorsCount
     */
    public void setRemoteStorageErrorsCount(int param) {
        this.localRemoteStorageErrorsCount = param;
    }

    public boolean isRepoTypeSpecified() {
        return localRepoTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRepoType() {
        return localRepoType;
    }

    /**
     * Auto generated setter method
     * @param param RepoType
     */
    public void setRepoType(java.lang.String param) {
        localRepoTypeTracker = param != null;

        this.localRepoType = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getFileCountInRepository() {
        return localFileCountInRepository;
    }

    /**
     * Auto generated setter method
     * @param param FileCountInRepository
     */
    public void setFileCountInRepository(long param) {
        this.localFileCountInRepository = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getSizeOnDisk() {
        return localSizeOnDisk;
    }

    /**
     * Auto generated setter method
     * @param param SizeOnDisk
     */
    public void setSizeOnDisk(long param) {
        this.localSizeOnDisk = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getFreeSpaceOnDisk() {
        return localFreeSpaceOnDisk;
    }

    /**
     * Auto generated setter method
     * @param param FreeSpaceOnDisk
     */
    public void setFreeSpaceOnDisk(long param) {
        this.localFreeSpaceOnDisk = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getLocalStorageErrorsCount() {
        return localLocalStorageErrorsCount;
    }

    /**
     * Auto generated setter method
     * @param param LocalStorageErrorsCount
     */
    public void setLocalStorageErrorsCount(int param) {
        this.localLocalStorageErrorsCount = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getNotFoundCacheSize() {
        return localNotFoundCacheSize;
    }

    /**
     * Auto generated setter method
     * @param param NotFoundCacheSize
     */
    public void setNotFoundCacheSize(long param) {
        this.localNotFoundCacheSize = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getNotFoundCacheHits() {
        return localNotFoundCacheHits;
    }

    /**
     * Auto generated setter method
     * @param param NotFoundCacheHits
     */
    public void setNotFoundCacheHits(long param) {
        this.localNotFoundCacheHits = param;
    }

    public boolean isFormatSpecified() {
        return localFormatTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFormat() {
        return localFormat;
    }

    /**
     * Auto generated setter method
     * @param param Format
     */
    public void setFormat(java.lang.String param) {
        localFormatTracker = param != null;

        this.localFormat = param;
    }

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

    public boolean isGroupsSpecified() {
        return localGroupsTracker;
    }

    /**
     * Auto generated getter method
     * @return sk.itcloud.nexus.Groups_type0
     */
    public sk.itcloud.nexus.Groups_type0 getGroups() {
        return localGroups;
    }

    /**
     * Auto generated setter method
     * @param param Groups
     */
    public void setGroups(sk.itcloud.nexus.Groups_type0 param) {
        localGroupsTracker = param != null;

        this.localGroups = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getNotFoundCacheMisses() {
        return localNotFoundCacheMisses;
    }

    /**
     * Auto generated setter method
     * @param param NotFoundCacheMisses
     */
    public void setNotFoundCacheMisses(long param) {
        this.localNotFoundCacheMisses = param;
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
                    namespacePrefix + ":repository-meta-resource", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "repository-meta-resource", xmlWriter);
            }
        }

        namespace = "";
        writeStartElement(null, namespace, "remoteStorageErrorsCount", xmlWriter);

        if (localRemoteStorageErrorsCount == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "remoteStorageErrorsCount cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localRemoteStorageErrorsCount));
        }

        xmlWriter.writeEndElement();

        if (localRepoTypeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "repoType", xmlWriter);

            if (localRepoType == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "repoType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localRepoType);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "fileCountInRepository", xmlWriter);

        if (localFileCountInRepository == java.lang.Long.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "fileCountInRepository cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localFileCountInRepository));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "sizeOnDisk", xmlWriter);

        if (localSizeOnDisk == java.lang.Long.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "sizeOnDisk cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localSizeOnDisk));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "freeSpaceOnDisk", xmlWriter);

        if (localFreeSpaceOnDisk == java.lang.Long.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "freeSpaceOnDisk cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localFreeSpaceOnDisk));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "localStorageErrorsCount", xmlWriter);

        if (localLocalStorageErrorsCount == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "localStorageErrorsCount cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localLocalStorageErrorsCount));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "notFoundCacheSize", xmlWriter);

        if (localNotFoundCacheSize == java.lang.Long.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "notFoundCacheSize cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localNotFoundCacheSize));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "notFoundCacheHits", xmlWriter);

        if (localNotFoundCacheHits == java.lang.Long.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "notFoundCacheHits cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localNotFoundCacheHits));
        }

        xmlWriter.writeEndElement();

        if (localFormatTracker) {
            namespace = "";
            writeStartElement(null, namespace, "format", xmlWriter);

            if (localFormat == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "format cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFormat);
            }

            xmlWriter.writeEndElement();
        }

        if (localIdTracker) {
            namespace = "";
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

        if (localGroupsTracker) {
            if (localGroups == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "groups cannot be null!!");
            }

            localGroups.serialize(new javax.xml.namespace.QName("", "groups"),
                xmlWriter);
        }

        namespace = "";
        writeStartElement(null, namespace, "notFoundCacheMisses", xmlWriter);

        if (localNotFoundCacheMisses == java.lang.Long.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "notFoundCacheMisses cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localNotFoundCacheMisses));
        }

        xmlWriter.writeEndElement();

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
        public static RepositoryMetaResource parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RepositoryMetaResource object = new RepositoryMetaResource();

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

                        if (!"repository-meta-resource".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (RepositoryMetaResource) sk.itcloud.maven.pom.ExtensionMapper.getTypeObject(nsUri,
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
                        new javax.xml.namespace.QName("",
                            "remoteStorageErrorsCount").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "remoteStorageErrorsCount").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "remoteStorageErrorsCount" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRemoteStorageErrorsCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                        new javax.xml.namespace.QName("", "repoType").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "repoType").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "repoType" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRepoType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "fileCountInRepository").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "fileCountInRepository").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "fileCountInRepository" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFileCountInRepository(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
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
                        new javax.xml.namespace.QName("", "sizeOnDisk").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "sizeOnDisk").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "sizeOnDisk" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSizeOnDisk(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
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
                        new javax.xml.namespace.QName("", "freeSpaceOnDisk").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "freeSpaceOnDisk").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "freeSpaceOnDisk" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFreeSpaceOnDisk(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
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
                        new javax.xml.namespace.QName("",
                            "localStorageErrorsCount").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "localStorageErrorsCount").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "localStorageErrorsCount" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLocalStorageErrorsCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                        new javax.xml.namespace.QName("", "notFoundCacheSize").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "notFoundCacheSize").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "notFoundCacheSize" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNotFoundCacheSize(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
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
                        new javax.xml.namespace.QName("", "notFoundCacheHits").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "notFoundCacheHits").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "notFoundCacheHits" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNotFoundCacheHits(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
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
                        new javax.xml.namespace.QName("", "format").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "format").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "format" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFormat(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "id").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "id").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "id" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "groups").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "groups").equals(
                            reader.getName())) {
                    object.setGroups(sk.itcloud.nexus.Groups_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "notFoundCacheMisses").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "notFoundCacheMisses").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "notFoundCacheMisses" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNotFoundCacheMisses(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
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
