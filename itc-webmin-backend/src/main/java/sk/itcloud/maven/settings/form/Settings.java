/**
 * Settings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.settings.form;


/**
 *  Settings bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Settings implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Settings
       Namespace URI = http://maven.apache.org/SETTINGS/1.0.0
       Namespace Prefix = ns1
     */

    /**
     * field for LocalRepository
     */
    protected java.lang.String localLocalRepository;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLocalRepositoryTracker = false;

    /**
     * field for InteractiveMode
     */
    protected boolean localInteractiveMode = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "true");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localInteractiveModeTracker = false;

    /**
     * field for UsePluginRegistry
     */
    protected boolean localUsePluginRegistry = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUsePluginRegistryTracker = false;

    /**
     * field for Offline
     */
    protected boolean localOffline = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOfflineTracker = false;

    /**
     * field for Proxies
     */
    protected sk.itcloud.maven.settings.form.Proxies_type0 localProxies;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localProxiesTracker = false;

    /**
     * field for Servers
     */
    protected sk.itcloud.maven.settings.form.Servers_type0 localServers;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localServersTracker = false;

    /**
     * field for Mirrors
     */
    protected sk.itcloud.maven.settings.form.Mirrors_type0 localMirrors;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMirrorsTracker = false;

    /**
     * field for Profiles
     */
    protected sk.itcloud.maven.settings.form.Profiles_type0 localProfiles;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localProfilesTracker = false;

    /**
     * field for ActiveProfiles
     */
    protected sk.itcloud.maven.settings.form.ActiveProfiles_type0 localActiveProfiles;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localActiveProfilesTracker = false;

    /**
     * field for PluginGroups
     */
    protected sk.itcloud.maven.settings.form.PluginGroups_type0 localPluginGroups;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPluginGroupsTracker = false;

    public boolean isLocalRepositorySpecified() {
        return localLocalRepositoryTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLocalRepository() {
        return localLocalRepository;
    }

    /**
     * Auto generated setter method
     * @param param LocalRepository
     */
    public void setLocalRepository(java.lang.String param) {
        localLocalRepositoryTracker = param != null;

        this.localLocalRepository = param;
    }

    public boolean isInteractiveModeSpecified() {
        return localInteractiveModeTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getInteractiveMode() {
        return localInteractiveMode;
    }

    /**
     * Auto generated setter method
     * @param param InteractiveMode
     */
    public void setInteractiveMode(boolean param) {
        // setting primitive attribute tracker to true
        localInteractiveModeTracker = true;

        this.localInteractiveMode = param;
    }

    public boolean isUsePluginRegistrySpecified() {
        return localUsePluginRegistryTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getUsePluginRegistry() {
        return localUsePluginRegistry;
    }

    /**
     * Auto generated setter method
     * @param param UsePluginRegistry
     */
    public void setUsePluginRegistry(boolean param) {
        // setting primitive attribute tracker to true
        localUsePluginRegistryTracker = true;

        this.localUsePluginRegistry = param;
    }

    public boolean isOfflineSpecified() {
        return localOfflineTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getOffline() {
        return localOffline;
    }

    /**
     * Auto generated setter method
     * @param param Offline
     */
    public void setOffline(boolean param) {
        // setting primitive attribute tracker to true
        localOfflineTracker = true;

        this.localOffline = param;
    }

    public boolean isProxiesSpecified() {
        return localProxiesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.settings._1_0_0.Proxies_type0
     */
    public sk.itcloud.maven.settings.form.Proxies_type0 getProxies() {
        return localProxies;
    }

    /**
     * Auto generated setter method
     * @param param Proxies
     */
    public void setProxies(sk.itcloud.maven.settings.form.Proxies_type0 param) {
        localProxiesTracker = param != null;

        this.localProxies = param;
    }

    public boolean isServersSpecified() {
        return localServersTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.settings._1_0_0.Servers_type0
     */
    public sk.itcloud.maven.settings.form.Servers_type0 getServers() {
        return localServers;
    }

    /**
     * Auto generated setter method
     * @param param Servers
     */
    public void setServers(sk.itcloud.maven.settings.form.Servers_type0 param) {
        localServersTracker = param != null;

        this.localServers = param;
    }

    public boolean isMirrorsSpecified() {
        return localMirrorsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.settings._1_0_0.Mirrors_type0
     */
    public sk.itcloud.maven.settings.form.Mirrors_type0 getMirrors() {
        return localMirrors;
    }

    /**
     * Auto generated setter method
     * @param param Mirrors
     */
    public void setMirrors(sk.itcloud.maven.settings.form.Mirrors_type0 param) {
        localMirrorsTracker = param != null;

        this.localMirrors = param;
    }

    public boolean isProfilesSpecified() {
        return localProfilesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.settings._1_0_0.Profiles_type0
     */
    public sk.itcloud.maven.settings.form.Profiles_type0 getProfiles() {
        return localProfiles;
    }

    /**
     * Auto generated setter method
     * @param param Profiles
     */
    public void setProfiles(
        sk.itcloud.maven.settings.form.Profiles_type0 param) {
        localProfilesTracker = param != null;

        this.localProfiles = param;
    }

    public boolean isActiveProfilesSpecified() {
        return localActiveProfilesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.settings._1_0_0.ActiveProfiles_type0
     */
    public sk.itcloud.maven.settings.form.ActiveProfiles_type0 getActiveProfiles() {
        return localActiveProfiles;
    }

    /**
     * Auto generated setter method
     * @param param ActiveProfiles
     */
    public void setActiveProfiles(
        sk.itcloud.maven.settings.form.ActiveProfiles_type0 param) {
        localActiveProfilesTracker = param != null;

        this.localActiveProfiles = param;
    }

    public boolean isPluginGroupsSpecified() {
        return localPluginGroupsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.apache.maven.settings._1_0_0.PluginGroups_type0
     */
    public sk.itcloud.maven.settings.form.PluginGroups_type0 getPluginGroups() {
        return localPluginGroups;
    }

    /**
     * Auto generated setter method
     * @param param PluginGroups
     */
    public void setPluginGroups(
        sk.itcloud.maven.settings.form.PluginGroups_type0 param) {
        localPluginGroupsTracker = param != null;

        this.localPluginGroups = param;
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
                    namespacePrefix + ":Settings", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Settings", xmlWriter);
            }
        }

        if (localLocalRepositoryTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "localRepository", xmlWriter);

            if (localLocalRepository == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "localRepository cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localLocalRepository);
            }

            xmlWriter.writeEndElement();
        }

        if (localInteractiveModeTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "interactiveMode", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "interactiveMode cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localInteractiveMode));
            }

            xmlWriter.writeEndElement();
        }

        if (localUsePluginRegistryTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "usePluginRegistry", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "usePluginRegistry cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localUsePluginRegistry));
            }

            xmlWriter.writeEndElement();
        }

        if (localOfflineTracker) {
            namespace = "http://maven.apache.org/SETTINGS/1.0.0";
            writeStartElement(null, namespace, "offline", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "offline cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localOffline));
            }

            xmlWriter.writeEndElement();
        }

        if (localProxiesTracker) {
            if (localProxies == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "proxies cannot be null!!");
            }

            localProxies.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/SETTINGS/1.0.0", "proxies"),
                xmlWriter);
        }

        if (localServersTracker) {
            if (localServers == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "servers cannot be null!!");
            }

            localServers.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/SETTINGS/1.0.0", "servers"),
                xmlWriter);
        }

        if (localMirrorsTracker) {
            if (localMirrors == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "mirrors cannot be null!!");
            }

            localMirrors.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/SETTINGS/1.0.0", "mirrors"),
                xmlWriter);
        }

        if (localProfilesTracker) {
            if (localProfiles == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "profiles cannot be null!!");
            }

            localProfiles.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/SETTINGS/1.0.0", "profiles"),
                xmlWriter);
        }

        if (localActiveProfilesTracker) {
            if (localActiveProfiles == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "activeProfiles cannot be null!!");
            }

            localActiveProfiles.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/SETTINGS/1.0.0", "activeProfiles"),
                xmlWriter);
        }

        if (localPluginGroupsTracker) {
            if (localPluginGroups == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "pluginGroups cannot be null!!");
            }

            localPluginGroups.serialize(new javax.xml.namespace.QName(
                    "http://maven.apache.org/SETTINGS/1.0.0", "pluginGroups"),
                xmlWriter);
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
        public static Settings parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Settings object = new Settings();

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

                        if (!"Settings".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Settings) sk.itcloud.maven.settings.form.ExtensionMapper.getTypeObject(nsUri,
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
                                    "localRepository").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "localRepository").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "localRepository" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setLocalRepository(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "interactiveMode").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "interactiveMode").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "interactiveMode" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setInteractiveMode(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "usePluginRegistry").equals(
                                    reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "usePluginRegistry").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "usePluginRegistry" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setUsePluginRegistry(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "offline").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "offline").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "offline" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setOffline(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "proxies").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "proxies").equals(
                                    reader.getName())) {
                            object.setProxies(sk.itcloud.maven.settings.form.Proxies_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "servers").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "servers").equals(
                                    reader.getName())) {
                            object.setServers(sk.itcloud.maven.settings.form.Servers_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "mirrors").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "mirrors").equals(
                                    reader.getName())) {
                            object.setMirrors(sk.itcloud.maven.settings.form.Mirrors_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "profiles").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "profiles").equals(
                                    reader.getName())) {
                            object.setProfiles(sk.itcloud.maven.settings.form.Profiles_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "activeProfiles").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("",
                                    "activeProfiles").equals(reader.getName())) {
                            object.setActiveProfiles(sk.itcloud.maven.settings.form.ActiveProfiles_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if ((reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "http://maven.apache.org/SETTINGS/1.0.0",
                                    "pluginGroups").equals(reader.getName())) ||
                                new javax.xml.namespace.QName("", "pluginGroups").equals(
                                    reader.getName())) {
                            object.setPluginGroups(sk.itcloud.maven.settings.form.PluginGroups_type0.Factory.parse(
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
