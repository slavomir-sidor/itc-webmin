/**
 * GlobalSettingsItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.nexus;


/**
 *  GlobalSettingsItem bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class GlobalSettingsItem implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = global-settings-item
       Namespace URI =
       Namespace Prefix =
     */

    /**
     * field for SecurityAnonymousAccessEnabled
     */
    protected boolean localSecurityAnonymousAccessEnabled;

    /**
     * field for SecurityAnonymousUsername
     */
    protected java.lang.String localSecurityAnonymousUsername;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSecurityAnonymousUsernameTracker = false;

    /**
     * field for SystemNotificationSettings
     */
    protected sk.itcloud.nexus.SystemNotificationSettings localSystemNotificationSettings;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSystemNotificationSettingsTracker = false;

    /**
     * field for SecurityRealms
     */
    protected sk.itcloud.nexus.SecurityRealms_type0 localSecurityRealms;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSecurityRealmsTracker = false;

    /**
     * field for GlobalConnectionSettings
     */
    protected sk.itcloud.nexus.RemoteConnectionSettings localGlobalConnectionSettings;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGlobalConnectionSettingsTracker = false;

    /**
     * field for SmtpSettings
     */
    protected sk.itcloud.nexus.SmtpSettings localSmtpSettings;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSmtpSettingsTracker = false;

    /**
     * field for RemoteProxySettings
     */
    protected sk.itcloud.nexus.RemoteProxySettings localRemoteProxySettings;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRemoteProxySettingsTracker = false;

    /**
     * field for GlobalRestApiSettings
     */
    protected sk.itcloud.nexus.RestApiSettings localGlobalRestApiSettings;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGlobalRestApiSettingsTracker = false;

    /**
     * field for SecurityAnonymousPassword
     */
    protected java.lang.String localSecurityAnonymousPassword;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSecurityAnonymousPasswordTracker = false;

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getSecurityAnonymousAccessEnabled() {
        return localSecurityAnonymousAccessEnabled;
    }

    /**
     * Auto generated setter method
     * @param param SecurityAnonymousAccessEnabled
     */
    public void setSecurityAnonymousAccessEnabled(boolean param) {
        this.localSecurityAnonymousAccessEnabled = param;
    }

    public boolean isSecurityAnonymousUsernameSpecified() {
        return localSecurityAnonymousUsernameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSecurityAnonymousUsername() {
        return localSecurityAnonymousUsername;
    }

    /**
     * Auto generated setter method
     * @param param SecurityAnonymousUsername
     */
    public void setSecurityAnonymousUsername(java.lang.String param) {
        localSecurityAnonymousUsernameTracker = param != null;

        this.localSecurityAnonymousUsername = param;
    }

    public boolean isSystemNotificationSettingsSpecified() {
        return localSystemNotificationSettingsTracker;
    }

    /**
     * Auto generated getter method
     * @return sk.itcloud.nexus.SystemNotificationSettings
     */
    public sk.itcloud.nexus.SystemNotificationSettings getSystemNotificationSettings() {
        return localSystemNotificationSettings;
    }

    /**
     * Auto generated setter method
     * @param param SystemNotificationSettings
     */
    public void setSystemNotificationSettings(
        sk.itcloud.nexus.SystemNotificationSettings param) {
        localSystemNotificationSettingsTracker = param != null;

        this.localSystemNotificationSettings = param;
    }

    public boolean isSecurityRealmsSpecified() {
        return localSecurityRealmsTracker;
    }

    /**
     * Auto generated getter method
     * @return sk.itcloud.nexus.SecurityRealms_type0
     */
    public sk.itcloud.nexus.SecurityRealms_type0 getSecurityRealms() {
        return localSecurityRealms;
    }

    /**
     * Auto generated setter method
     * @param param SecurityRealms
     */
    public void setSecurityRealms(sk.itcloud.nexus.SecurityRealms_type0 param) {
        localSecurityRealmsTracker = param != null;

        this.localSecurityRealms = param;
    }

    public boolean isGlobalConnectionSettingsSpecified() {
        return localGlobalConnectionSettingsTracker;
    }

    /**
     * Auto generated getter method
     * @return sk.itcloud.nexus.RemoteConnectionSettings
     */
    public sk.itcloud.nexus.RemoteConnectionSettings getGlobalConnectionSettings() {
        return localGlobalConnectionSettings;
    }

    /**
     * Auto generated setter method
     * @param param GlobalConnectionSettings
     */
    public void setGlobalConnectionSettings(
        sk.itcloud.nexus.RemoteConnectionSettings param) {
        localGlobalConnectionSettingsTracker = param != null;

        this.localGlobalConnectionSettings = param;
    }

    public boolean isSmtpSettingsSpecified() {
        return localSmtpSettingsTracker;
    }

    /**
     * Auto generated getter method
     * @return sk.itcloud.nexus.SmtpSettings
     */
    public sk.itcloud.nexus.SmtpSettings getSmtpSettings() {
        return localSmtpSettings;
    }

    /**
     * Auto generated setter method
     * @param param SmtpSettings
     */
    public void setSmtpSettings(sk.itcloud.nexus.SmtpSettings param) {
        localSmtpSettingsTracker = param != null;

        this.localSmtpSettings = param;
    }

    public boolean isRemoteProxySettingsSpecified() {
        return localRemoteProxySettingsTracker;
    }

    /**
     * Auto generated getter method
     * @return sk.itcloud.nexus.RemoteProxySettings
     */
    public sk.itcloud.nexus.RemoteProxySettings getRemoteProxySettings() {
        return localRemoteProxySettings;
    }

    /**
     * Auto generated setter method
     * @param param RemoteProxySettings
     */
    public void setRemoteProxySettings(
        sk.itcloud.nexus.RemoteProxySettings param) {
        localRemoteProxySettingsTracker = param != null;

        this.localRemoteProxySettings = param;
    }

    public boolean isGlobalRestApiSettingsSpecified() {
        return localGlobalRestApiSettingsTracker;
    }

    /**
     * Auto generated getter method
     * @return sk.itcloud.nexus.RestApiSettings
     */
    public sk.itcloud.nexus.RestApiSettings getGlobalRestApiSettings() {
        return localGlobalRestApiSettings;
    }

    /**
     * Auto generated setter method
     * @param param GlobalRestApiSettings
     */
    public void setGlobalRestApiSettings(sk.itcloud.nexus.RestApiSettings param) {
        localGlobalRestApiSettingsTracker = param != null;

        this.localGlobalRestApiSettings = param;
    }

    public boolean isSecurityAnonymousPasswordSpecified() {
        return localSecurityAnonymousPasswordTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSecurityAnonymousPassword() {
        return localSecurityAnonymousPassword;
    }

    /**
     * Auto generated setter method
     * @param param SecurityAnonymousPassword
     */
    public void setSecurityAnonymousPassword(java.lang.String param) {
        localSecurityAnonymousPasswordTracker = param != null;

        this.localSecurityAnonymousPassword = param;
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
                    namespacePrefix + ":global-settings-item", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "global-settings-item", xmlWriter);
            }
        }

        namespace = "";
        writeStartElement(null, namespace, "securityAnonymousAccessEnabled",
            xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "securityAnonymousAccessEnabled cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localSecurityAnonymousAccessEnabled));
        }

        xmlWriter.writeEndElement();

        if (localSecurityAnonymousUsernameTracker) {
            namespace = "";
            writeStartElement(null, namespace, "securityAnonymousUsername",
                xmlWriter);

            if (localSecurityAnonymousUsername == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "securityAnonymousUsername cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSecurityAnonymousUsername);
            }

            xmlWriter.writeEndElement();
        }

        if (localSystemNotificationSettingsTracker) {
            if (localSystemNotificationSettings == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "systemNotificationSettings cannot be null!!");
            }

            localSystemNotificationSettings.serialize(new javax.xml.namespace.QName(
                    "", "systemNotificationSettings"), xmlWriter);
        }

        if (localSecurityRealmsTracker) {
            if (localSecurityRealms == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "securityRealms cannot be null!!");
            }

            localSecurityRealms.serialize(new javax.xml.namespace.QName("",
                    "securityRealms"), xmlWriter);
        }

        if (localGlobalConnectionSettingsTracker) {
            if (localGlobalConnectionSettings == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "globalConnectionSettings cannot be null!!");
            }

            localGlobalConnectionSettings.serialize(new javax.xml.namespace.QName(
                    "", "globalConnectionSettings"), xmlWriter);
        }

        if (localSmtpSettingsTracker) {
            if (localSmtpSettings == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "smtpSettings cannot be null!!");
            }

            localSmtpSettings.serialize(new javax.xml.namespace.QName("",
                    "smtpSettings"), xmlWriter);
        }

        if (localRemoteProxySettingsTracker) {
            if (localRemoteProxySettings == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "remoteProxySettings cannot be null!!");
            }

            localRemoteProxySettings.serialize(new javax.xml.namespace.QName(
                    "", "remoteProxySettings"), xmlWriter);
        }

        if (localGlobalRestApiSettingsTracker) {
            if (localGlobalRestApiSettings == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "globalRestApiSettings cannot be null!!");
            }

            localGlobalRestApiSettings.serialize(new javax.xml.namespace.QName(
                    "", "globalRestApiSettings"), xmlWriter);
        }

        if (localSecurityAnonymousPasswordTracker) {
            namespace = "";
            writeStartElement(null, namespace, "securityAnonymousPassword",
                xmlWriter);

            if (localSecurityAnonymousPassword == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "securityAnonymousPassword cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSecurityAnonymousPassword);
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
        public static GlobalSettingsItem parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            GlobalSettingsItem object = new GlobalSettingsItem();

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

                        if (!"global-settings-item".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (GlobalSettingsItem) sk.itcloud.maven.pom.ExtensionMapper.getTypeObject(nsUri,
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
                            "securityAnonymousAccessEnabled").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "securityAnonymousAccessEnabled").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "securityAnonymousAccessEnabled" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSecurityAnonymousAccessEnabled(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
                            "securityAnonymousUsername").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "securityAnonymousUsername").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "securityAnonymousUsername" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSecurityAnonymousUsername(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "systemNotificationSettings").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "systemNotificationSettings").equals(
                            reader.getName())) {
                    object.setSystemNotificationSettings(sk.itcloud.nexus.SystemNotificationSettings.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "securityRealms").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "securityRealms").equals(
                            reader.getName())) {
                    object.setSecurityRealms(sk.itcloud.nexus.SecurityRealms_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "globalConnectionSettings").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "globalConnectionSettings").equals(reader.getName())) {
                    object.setGlobalConnectionSettings(sk.itcloud.nexus.RemoteConnectionSettings.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "smtpSettings").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "smtpSettings").equals(
                            reader.getName())) {
                    object.setSmtpSettings(sk.itcloud.nexus.SmtpSettings.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "remoteProxySettings").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "remoteProxySettings").equals(
                            reader.getName())) {
                    object.setRemoteProxySettings(sk.itcloud.nexus.RemoteProxySettings.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "globalRestApiSettings").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "globalRestApiSettings").equals(reader.getName())) {
                    object.setGlobalRestApiSettings(sk.itcloud.nexus.RestApiSettings.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "securityAnonymousPassword").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "securityAnonymousPassword").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "securityAnonymousPassword" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSecurityAnonymousPassword(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
