/**
 * Server.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.settings.form;


/**
 *  Server bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Server implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Server
       Namespace URI = http://maven.apache.org/SETTINGS/1.0.0
       Namespace Prefix = ns1
     */

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
     * field for PrivateKey
     */
    protected java.lang.String localPrivateKey;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPrivateKeyTracker = false;

    /**
     * field for Passphrase
     */
    protected java.lang.String localPassphrase;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPassphraseTracker = false;

    /**
     * field for FilePermissions
     */
    protected java.lang.String localFilePermissions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFilePermissionsTracker = false;

    /**
     * field for DirectoryPermissions
     */
    protected java.lang.String localDirectoryPermissions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDirectoryPermissionsTracker = false;

    /**
     * field for Configuration
     */
    protected sk.itcloud.maven.settings.form.Configuration_type0 localConfiguration;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localConfigurationTracker = false;

    /**
     * field for Id
     */
    protected java.lang.String localId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIdTracker = false;

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

    public boolean isPrivateKeySpecified() {
        return localPrivateKeyTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPrivateKey() {
        return localPrivateKey;
    }

    /**
     * Auto generated setter method
     * @param param PrivateKey
     */
    public void setPrivateKey(java.lang.String param) {
        localPrivateKeyTracker = param != null;

        this.localPrivateKey = param;
    }

    public boolean isPassphraseSpecified() {
        return localPassphraseTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPassphrase() {
        return localPassphrase;
    }

    /**
     * Auto generated setter method
     * @param param Passphrase
     */
    public void setPassphrase(java.lang.String param) {
        localPassphraseTracker = param != null;

        this.localPassphrase = param;
    }

    public boolean isFilePermissionsSpecified() {
        return localFilePermissionsTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFilePermissions() {
        return localFilePermissions;
    }

    /**
     * Auto generated setter method
     * @param param FilePermissions
     */
    public void setFilePermissions(java.lang.String param) {
        localFilePermissionsTracker = param != null;

        this.localFilePermissions = param;
    }

    public boolean isDirectoryPermissionsSpecified() {
        return localDirectoryPermissionsTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDirectoryPermissions() {
        return localDirectoryPermissions;
    }

    /**
     * Auto generated setter method
     * @param param DirectoryPermissions
     */
    public void setDirectoryPermissions(java.lang.String param) {
        localDirectoryPermissionsTracker = param != null;

        this.localDirectoryPermissions = param;
    }

    public boolean isConfigurationSpecified() {
        return localConfigurationTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.settings._1_0_0.Configuration_type0
     */
    public sk.itcloud.maven.settings.form.Configuration_type0 getConfiguration() {
        return localConfiguration;
    }

    /**
     * Auto generated setter method
     * @param param Configuration
     */
    public void setConfiguration(
        sk.itcloud.maven.settings.form.Configuration_type0 param) {
        localConfigurationTracker = param != null;

        this.localConfiguration = param;
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
                    namespacePrefix + ":Server", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Server", xmlWriter);
            }
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

        if (localPrivateKeyTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "privateKey", xmlWriter);

            if (localPrivateKey == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "privateKey cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPrivateKey);
            }

            xmlWriter.writeEndElement();
        }

        if (localPassphraseTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "passphrase", xmlWriter);

            if (localPassphrase == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "passphrase cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPassphrase);
            }

            xmlWriter.writeEndElement();
        }

        if (localFilePermissionsTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "filePermissions", xmlWriter);

            if (localFilePermissions == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "filePermissions cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFilePermissions);
            }

            xmlWriter.writeEndElement();
        }

        if (localDirectoryPermissionsTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "directoryPermissions", xmlWriter);

            if (localDirectoryPermissions == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "directoryPermissions cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDirectoryPermissions);
            }

            xmlWriter.writeEndElement();
        }

        if (localConfigurationTracker) {
            if (localConfiguration == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "configuration cannot be null!!");
            }

            localConfiguration.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/SETTINGS/1.0.0", "configuration"),
                xmlWriter);
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
        public static Server parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Server object = new Server();

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

                        if (!"Server".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Server) sk.itcloud.maven.settings.form.ExtensionMapper.getTypeObject(nsUri,
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
                                    "privateKey").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "privateKey").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "privateKey" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPrivateKey(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "passphrase").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "passphrase").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "passphrase" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPassphrase(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "filePermissions").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "filePermissions").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "filePermissions" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setFilePermissions(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "directoryPermissions").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "directoryPermissions").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "directoryPermissions" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDirectoryPermissions(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "configuration").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "configuration").equals(reader.getName())) {
                            object.setConfiguration(sk.itcloud.maven.settings.form.Configuration_type0.Factory.parse(
                                    reader));

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
