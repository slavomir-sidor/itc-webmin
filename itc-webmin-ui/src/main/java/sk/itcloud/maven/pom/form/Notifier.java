/**
 * Notifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.pom.form;


/**
 *  Notifier bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Notifier implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Notifier
       Namespace URI = http://maven.apache.org/POM/4.0.0
       Namespace Prefix = ns1
     */

    /**
     * field for Type
     */
    protected java.lang.String localType = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "mail");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTypeTracker = false;

    /**
     * field for SendOnError
     */
    protected boolean localSendOnError = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "true");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSendOnErrorTracker = false;

    /**
     * field for SendOnFailure
     */
    protected boolean localSendOnFailure = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "true");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSendOnFailureTracker = false;

    /**
     * field for SendOnSuccess
     */
    protected boolean localSendOnSuccess = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "true");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSendOnSuccessTracker = false;

    /**
     * field for SendOnWarning
     */
    protected boolean localSendOnWarning = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "true");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSendOnWarningTracker = false;

    /**
     * field for Address
     */
    protected java.lang.String localAddress;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAddressTracker = false;

    /**
     * field for Configuration
     */
    protected sk.itcloud.maven.pom.form.Configuration_type0 localConfiguration;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localConfigurationTracker = false;

    public boolean isTypeSpecified() {
        return localTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getType() {
        return localType;
    }

    /**
     * Auto generated setter method
     * @param param Type
     */
    public void setType(java.lang.String param) {
        localTypeTracker = param != null;

        this.localType = param;
    }

    public boolean isSendOnErrorSpecified() {
        return localSendOnErrorTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getSendOnError() {
        return localSendOnError;
    }

    /**
     * Auto generated setter method
     * @param param SendOnError
     */
    public void setSendOnError(boolean param) {
        // setting primitive attribute tracker to true
        localSendOnErrorTracker = true;

        this.localSendOnError = param;
    }

    public boolean isSendOnFailureSpecified() {
        return localSendOnFailureTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getSendOnFailure() {
        return localSendOnFailure;
    }

    /**
     * Auto generated setter method
     * @param param SendOnFailure
     */
    public void setSendOnFailure(boolean param) {
        // setting primitive attribute tracker to true
        localSendOnFailureTracker = true;

        this.localSendOnFailure = param;
    }

    public boolean isSendOnSuccessSpecified() {
        return localSendOnSuccessTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getSendOnSuccess() {
        return localSendOnSuccess;
    }

    /**
     * Auto generated setter method
     * @param param SendOnSuccess
     */
    public void setSendOnSuccess(boolean param) {
        // setting primitive attribute tracker to true
        localSendOnSuccessTracker = true;

        this.localSendOnSuccess = param;
    }

    public boolean isSendOnWarningSpecified() {
        return localSendOnWarningTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getSendOnWarning() {
        return localSendOnWarning;
    }

    /**
     * Auto generated setter method
     * @param param SendOnWarning
     */
    public void setSendOnWarning(boolean param) {
        // setting primitive attribute tracker to true
        localSendOnWarningTracker = true;

        this.localSendOnWarning = param;
    }

    public boolean isAddressSpecified() {
        return localAddressTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAddress() {
        return localAddress;
    }

    /**
     * Auto generated setter method
     * @param param Address
     */
    public void setAddress(java.lang.String param) {
        localAddressTracker = param != null;

        this.localAddress = param;
    }

    public boolean isConfigurationSpecified() {
        return localConfigurationTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.pom._4_0_0.Configuration_type0
     */
    public sk.itcloud.maven.pom.form.Configuration_type0 getConfiguration() {
        return localConfiguration;
    }

    /**
     * Auto generated setter method
     * @param param Configuration
     */
    public void setConfiguration(
        sk.itcloud.maven.pom.form.Configuration_type0 param) {
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
                    namespacePrefix + ":Notifier", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Notifier", xmlWriter);
            }
        }

        if (localTypeTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "type", xmlWriter);

            if (localType == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "type cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localType);
            }

            xmlWriter.writeEndElement();
        }

        if (localSendOnErrorTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "sendOnError", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "sendOnError cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSendOnError));
            }

            xmlWriter.writeEndElement();
        }

        if (localSendOnFailureTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "sendOnFailure", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "sendOnFailure cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSendOnFailure));
            }

            xmlWriter.writeEndElement();
        }

        if (localSendOnSuccessTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "sendOnSuccess", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "sendOnSuccess cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSendOnSuccess));
            }

            xmlWriter.writeEndElement();
        }

        if (localSendOnWarningTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "sendOnWarning", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "sendOnWarning cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSendOnWarning));
            }

            xmlWriter.writeEndElement();
        }

        if (localAddressTracker) {
            namespace = "http://maven.apache.org/POM/4.0.0";
            writeStartElement(null, namespace, "address", xmlWriter);

            if (localAddress == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "address cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAddress);
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
        public static Notifier parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Notifier object = new Notifier();

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

                        if (!"Notifier".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Notifier) sk.itcloud.maven.pom.form.ExtensionMapper.getTypeObject(nsUri,
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
                                    "http://maven.apache.org/POM/4.0.0", "type").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("", "type").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "type" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "sendOnError").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "sendOnError").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "sendOnError" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSendOnError(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "sendOnFailure").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "sendOnFailure").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "sendOnFailure" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSendOnFailure(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "sendOnSuccess").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "sendOnSuccess").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "sendOnSuccess" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSendOnSuccess(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "sendOnWarning").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "sendOnWarning").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "sendOnWarning" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSendOnWarning(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/POM/4.0.0",
                                    "address").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "address").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "address" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setAddress(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                            object.setConfiguration(sk.itcloud.maven.pom.form.Configuration_type0.Factory.parse(
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
