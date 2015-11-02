/**
 * Proxy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.settings.form;


/**
 *  Proxy bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Proxy implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Proxy
       Namespace URI = http://maven.apache.org/SETTINGS/1.0.0
       Namespace Prefix = ns1
     */

    /**
     * field for Active
     */
    protected boolean localActive = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localActiveTracker = false;

    /**
     * field for Protocol
     */
    protected java.lang.String localProtocol = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "http");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localProtocolTracker = false;

    /**
     * field for Username
     */
    protected java.lang.String localUsername;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUsernameTracker = false;

    /**
     * field for Password
     */
    protected java.lang.String localPassword;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPasswordTracker = false;

    /**
     * field for Port
     */
    protected int localPort = org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
            "8080");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPortTracker = false;

    /**
     * field for Host
     */
    protected java.lang.String localHost;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localHostTracker = false;

    /**
     * field for NonProxyHosts
     */
    protected java.lang.String localNonProxyHosts;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNonProxyHostsTracker = false;

    /**
     * field for Id
     */
    protected java.lang.String localId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIdTracker = false;

    public boolean isActiveSpecified() {
        return localActiveTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getActive() {
        return localActive;
    }

    /**
     * Auto generated setter method
     * @param param Active
     */
    public void setActive(boolean param) {
        // setting primitive attribute tracker to true
        localActiveTracker = true;

        this.localActive = param;
    }

    public boolean isProtocolSpecified() {
        return localProtocolTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getProtocol() {
        return localProtocol;
    }

    /**
     * Auto generated setter method
     * @param param Protocol
     */
    public void setProtocol(java.lang.String param) {
        localProtocolTracker = param != null;

        this.localProtocol = param;
    }

    public boolean isUsernameSpecified() {
        return localUsernameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUsername() {
        return localUsername;
    }

    /**
     * Auto generated setter method
     * @param param Username
     */
    public void setUsername(java.lang.String param) {
        localUsernameTracker = param != null;

        this.localUsername = param;
    }

    public boolean isPasswordSpecified() {
        return localPasswordTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPassword() {
        return localPassword;
    }

    /**
     * Auto generated setter method
     * @param param Password
     */
    public void setPassword(java.lang.String param) {
        localPasswordTracker = param != null;

        this.localPassword = param;
    }

    public boolean isPortSpecified() {
        return localPortTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getPort() {
        return localPort;
    }

    /**
     * Auto generated setter method
     * @param param Port
     */
    public void setPort(int param) {
        // setting primitive attribute tracker to true
        localPortTracker = param != java.lang.Integer.MIN_VALUE;

        this.localPort = param;
    }

    public boolean isHostSpecified() {
        return localHostTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getHost() {
        return localHost;
    }

    /**
     * Auto generated setter method
     * @param param Host
     */
    public void setHost(java.lang.String param) {
        localHostTracker = param != null;

        this.localHost = param;
    }

    public boolean isNonProxyHostsSpecified() {
        return localNonProxyHostsTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNonProxyHosts() {
        return localNonProxyHosts;
    }

    /**
     * Auto generated setter method
     * @param param NonProxyHosts
     */
    public void setNonProxyHosts(java.lang.String param) {
        localNonProxyHostsTracker = param != null;

        this.localNonProxyHosts = param;
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
                    "http://maven.apache.org/SETTINGS/1.0.0");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":Proxy", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Proxy", xmlWriter);
            }
        }

        if (localActiveTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "active", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "active cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localActive));
            }

            xmlWriter.writeEndElement();
        }

        if (localProtocolTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "protocol", xmlWriter);

            if (localProtocol == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "protocol cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localProtocol);
            }

            xmlWriter.writeEndElement();
        }

        if (localUsernameTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "username", xmlWriter);

            if (localUsername == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "username cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localUsername);
            }

            xmlWriter.writeEndElement();
        }

        if (localPasswordTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "password", xmlWriter);

            if (localPassword == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "password cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPassword);
            }

            xmlWriter.writeEndElement();
        }

        if (localPortTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "port", xmlWriter);

            if (localPort == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "port cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPort));
            }

            xmlWriter.writeEndElement();
        }

        if (localHostTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "host", xmlWriter);

            if (localHost == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "host cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localHost);
            }

            xmlWriter.writeEndElement();
        }

        if (localNonProxyHostsTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "nonProxyHosts", xmlWriter);

            if (localNonProxyHosts == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "nonProxyHosts cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNonProxyHosts);
            }

            xmlWriter.writeEndElement();
        }

        if (localIdTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
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

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://maven.apache.org/SETTINGS/1.0.0")) {
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
        public static Proxy parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Proxy object = new Proxy();

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

                        if (!"Proxy".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Proxy) sk.itcloud.maven.settings.form.ExtensionMapper.getTypeObject(nsUri,
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
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "active").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "active").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "active" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setActive(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "protocol").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "protocol").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "protocol" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setProtocol(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "username").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "username").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "username" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setUsername(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "password").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "password").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "password" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPassword(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "port").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "port").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "port" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPort(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "host").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "host").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "host" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setHost(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "nonProxyHosts").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "nonProxyHosts").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "nonProxyHosts" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setNonProxyHosts(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "id").equals(reader.getName())) ||
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
