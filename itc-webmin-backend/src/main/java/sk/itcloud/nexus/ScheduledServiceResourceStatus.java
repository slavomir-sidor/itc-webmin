/**
 * ScheduledServiceResourceStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.nexus;


/**
 *  ScheduledServiceResourceStatus bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ScheduledServiceResourceStatus implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = scheduled-service-resource-status
       Namespace URI =
       Namespace Prefix =
     */

    /**
     * field for ReadableStatus
     */
    protected java.lang.String localReadableStatus;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReadableStatusTracker = false;

    /**
     * field for NextRunTime
     */
    protected java.lang.String localNextRunTime;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNextRunTimeTracker = false;

    /**
     * field for Created
     */
    protected java.lang.String localCreated;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCreatedTracker = false;

    /**
     * field for NextRunTimeInMillis
     */
    protected long localNextRunTimeInMillis;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNextRunTimeInMillisTracker = false;

    /**
     * field for Status
     */
    protected java.lang.String localStatus;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStatusTracker = false;

    /**
     * field for LastRunTimeInMillis
     */
    protected long localLastRunTimeInMillis;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLastRunTimeInMillisTracker = false;

    /**
     * field for CreatedInMillis
     */
    protected long localCreatedInMillis;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCreatedInMillisTracker = false;

    /**
     * field for LastRunResult
     */
    protected java.lang.String localLastRunResult;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLastRunResultTracker = false;

    /**
     * field for Resource
     */
    protected sk.itcloud.nexus.ScheduledServiceBaseResource localResource;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResourceTracker = false;

    /**
     * field for ResourceURI
     */
    protected java.lang.String localResourceURI;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResourceURITracker = false;

    /**
     * field for LastRunTime
     */
    protected java.lang.String localLastRunTime;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLastRunTimeTracker = false;

    public boolean isReadableStatusSpecified() {
        return localReadableStatusTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getReadableStatus() {
        return localReadableStatus;
    }

    /**
     * Auto generated setter method
     * @param param ReadableStatus
     */
    public void setReadableStatus(java.lang.String param) {
        localReadableStatusTracker = param != null;

        this.localReadableStatus = param;
    }

    public boolean isNextRunTimeSpecified() {
        return localNextRunTimeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNextRunTime() {
        return localNextRunTime;
    }

    /**
     * Auto generated setter method
     * @param param NextRunTime
     */
    public void setNextRunTime(java.lang.String param) {
        localNextRunTimeTracker = param != null;

        this.localNextRunTime = param;
    }

    public boolean isCreatedSpecified() {
        return localCreatedTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCreated() {
        return localCreated;
    }

    /**
     * Auto generated setter method
     * @param param Created
     */
    public void setCreated(java.lang.String param) {
        localCreatedTracker = param != null;

        this.localCreated = param;
    }

    public boolean isNextRunTimeInMillisSpecified() {
        return localNextRunTimeInMillisTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getNextRunTimeInMillis() {
        return localNextRunTimeInMillis;
    }

    /**
     * Auto generated setter method
     * @param param NextRunTimeInMillis
     */
    public void setNextRunTimeInMillis(long param) {
        // setting primitive attribute tracker to true
        localNextRunTimeInMillisTracker = param != java.lang.Long.MIN_VALUE;

        this.localNextRunTimeInMillis = param;
    }

    public boolean isStatusSpecified() {
        return localStatusTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getStatus() {
        return localStatus;
    }

    /**
     * Auto generated setter method
     * @param param Status
     */
    public void setStatus(java.lang.String param) {
        localStatusTracker = param != null;

        this.localStatus = param;
    }

    public boolean isLastRunTimeInMillisSpecified() {
        return localLastRunTimeInMillisTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getLastRunTimeInMillis() {
        return localLastRunTimeInMillis;
    }

    /**
     * Auto generated setter method
     * @param param LastRunTimeInMillis
     */
    public void setLastRunTimeInMillis(long param) {
        // setting primitive attribute tracker to true
        localLastRunTimeInMillisTracker = param != java.lang.Long.MIN_VALUE;

        this.localLastRunTimeInMillis = param;
    }

    public boolean isCreatedInMillisSpecified() {
        return localCreatedInMillisTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getCreatedInMillis() {
        return localCreatedInMillis;
    }

    /**
     * Auto generated setter method
     * @param param CreatedInMillis
     */
    public void setCreatedInMillis(long param) {
        // setting primitive attribute tracker to true
        localCreatedInMillisTracker = param != java.lang.Long.MIN_VALUE;

        this.localCreatedInMillis = param;
    }

    public boolean isLastRunResultSpecified() {
        return localLastRunResultTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLastRunResult() {
        return localLastRunResult;
    }

    /**
     * Auto generated setter method
     * @param param LastRunResult
     */
    public void setLastRunResult(java.lang.String param) {
        localLastRunResultTracker = param != null;

        this.localLastRunResult = param;
    }

    public boolean isResourceSpecified() {
        return localResourceTracker;
    }

    /**
     * Auto generated getter method
     * @return sk.itcloud.nexus.ScheduledServiceBaseResource
     */
    public sk.itcloud.nexus.ScheduledServiceBaseResource getResource() {
        return localResource;
    }

    /**
     * Auto generated setter method
     * @param param Resource
     */
    public void setResource(sk.itcloud.nexus.ScheduledServiceBaseResource param) {
        localResourceTracker = param != null;

        this.localResource = param;
    }

    public boolean isResourceURISpecified() {
        return localResourceURITracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getResourceURI() {
        return localResourceURI;
    }

    /**
     * Auto generated setter method
     * @param param ResourceURI
     */
    public void setResourceURI(java.lang.String param) {
        localResourceURITracker = param != null;

        this.localResourceURI = param;
    }

    public boolean isLastRunTimeSpecified() {
        return localLastRunTimeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLastRunTime() {
        return localLastRunTime;
    }

    /**
     * Auto generated setter method
     * @param param LastRunTime
     */
    public void setLastRunTime(java.lang.String param) {
        localLastRunTimeTracker = param != null;

        this.localLastRunTime = param;
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
                    namespacePrefix + ":scheduled-service-resource-status",
                    xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "scheduled-service-resource-status", xmlWriter);
            }
        }

        if (localReadableStatusTracker) {
            namespace = "";
            writeStartElement(null, namespace, "readableStatus", xmlWriter);

            if (localReadableStatus == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "readableStatus cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localReadableStatus);
            }

            xmlWriter.writeEndElement();
        }

        if (localNextRunTimeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "nextRunTime", xmlWriter);

            if (localNextRunTime == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "nextRunTime cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNextRunTime);
            }

            xmlWriter.writeEndElement();
        }

        if (localCreatedTracker) {
            namespace = "";
            writeStartElement(null, namespace, "created", xmlWriter);

            if (localCreated == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "created cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCreated);
            }

            xmlWriter.writeEndElement();
        }

        if (localNextRunTimeInMillisTracker) {
            namespace = "";
            writeStartElement(null, namespace, "nextRunTimeInMillis", xmlWriter);

            if (localNextRunTimeInMillis == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "nextRunTimeInMillis cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNextRunTimeInMillis));
            }

            xmlWriter.writeEndElement();
        }

        if (localStatusTracker) {
            namespace = "";
            writeStartElement(null, namespace, "status", xmlWriter);

            if (localStatus == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "status cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localStatus);
            }

            xmlWriter.writeEndElement();
        }

        if (localLastRunTimeInMillisTracker) {
            namespace = "";
            writeStartElement(null, namespace, "lastRunTimeInMillis", xmlWriter);

            if (localLastRunTimeInMillis == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "lastRunTimeInMillis cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localLastRunTimeInMillis));
            }

            xmlWriter.writeEndElement();
        }

        if (localCreatedInMillisTracker) {
            namespace = "";
            writeStartElement(null, namespace, "createdInMillis", xmlWriter);

            if (localCreatedInMillis == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "createdInMillis cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localCreatedInMillis));
            }

            xmlWriter.writeEndElement();
        }

        if (localLastRunResultTracker) {
            namespace = "";
            writeStartElement(null, namespace, "lastRunResult", xmlWriter);

            if (localLastRunResult == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "lastRunResult cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localLastRunResult);
            }

            xmlWriter.writeEndElement();
        }

        if (localResourceTracker) {
            if (localResource == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "resource cannot be null!!");
            }

            localResource.serialize(new javax.xml.namespace.QName("", "resource"),
                xmlWriter);
        }

        if (localResourceURITracker) {
            namespace = "";
            writeStartElement(null, namespace, "resourceURI", xmlWriter);

            if (localResourceURI == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "resourceURI cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localResourceURI);
            }

            xmlWriter.writeEndElement();
        }

        if (localLastRunTimeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "lastRunTime", xmlWriter);

            if (localLastRunTime == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "lastRunTime cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localLastRunTime);
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
        public static ScheduledServiceResourceStatus parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ScheduledServiceResourceStatus object = new ScheduledServiceResourceStatus();

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

                        if (!"scheduled-service-resource-status".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ScheduledServiceResourceStatus) sk.itcloud.maven.pom.ExtensionMapper.getTypeObject(nsUri,
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
                        new javax.xml.namespace.QName("", "readableStatus").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "readableStatus").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "readableStatus" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setReadableStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "nextRunTime").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "nextRunTime").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "nextRunTime" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNextRunTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "created").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "created").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "created" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCreated(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "nextRunTimeInMillis").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "nextRunTimeInMillis").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "nextRunTimeInMillis" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNextRunTimeInMillis(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setNextRunTimeInMillis(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "status").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "status").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "status" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "lastRunTimeInMillis").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "lastRunTimeInMillis").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "lastRunTimeInMillis" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLastRunTimeInMillis(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setLastRunTimeInMillis(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "createdInMillis").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "createdInMillis").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "createdInMillis" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCreatedInMillis(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setCreatedInMillis(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "lastRunResult").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "lastRunResult").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "lastRunResult" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLastRunResult(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "resource").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "resource").equals(
                            reader.getName())) {
                    object.setResource(sk.itcloud.nexus.ScheduledServiceBaseResource.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "resourceURI").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "resourceURI").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "resourceURI" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setResourceURI(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "lastRunTime").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "lastRunTime").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "lastRunTime" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLastRunTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
