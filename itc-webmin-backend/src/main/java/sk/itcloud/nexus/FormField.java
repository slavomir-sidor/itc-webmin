/**
 * FormField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.nexus;


/**
 *  FormField bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class FormField implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = form-field
       Namespace URI =
       Namespace Prefix =
     */

    /**
     * field for RegexValidation
     */
    protected java.lang.String localRegexValidation;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRegexValidationTracker = false;

    /**
     * field for StorePath
     */
    protected java.lang.String localStorePath;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStorePathTracker = false;

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
     * field for InitialValue
     */
    protected java.lang.String localInitialValue;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localInitialValueTracker = false;

    /**
     * field for Type
     */
    protected java.lang.String localType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTypeTracker = false;

    /**
     * field for IdMapping
     */
    protected java.lang.String localIdMapping;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIdMappingTracker = false;

    /**
     * field for Required
     */
    protected boolean localRequired;

    /**
     * field for HelpText
     */
    protected java.lang.String localHelpText;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localHelpTextTracker = false;

    /**
     * field for StoreRoot
     */
    protected java.lang.String localStoreRoot;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStoreRootTracker = false;

    /**
     * field for NameMapping
     */
    protected java.lang.String localNameMapping;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNameMappingTracker = false;

    /**
     * field for Label
     */
    protected java.lang.String localLabel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLabelTracker = false;

    public boolean isRegexValidationSpecified() {
        return localRegexValidationTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRegexValidation() {
        return localRegexValidation;
    }

    /**
     * Auto generated setter method
     * @param param RegexValidation
     */
    public void setRegexValidation(java.lang.String param) {
        localRegexValidationTracker = param != null;

        this.localRegexValidation = param;
    }

    public boolean isStorePathSpecified() {
        return localStorePathTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getStorePath() {
        return localStorePath;
    }

    /**
     * Auto generated setter method
     * @param param StorePath
     */
    public void setStorePath(java.lang.String param) {
        localStorePathTracker = param != null;

        this.localStorePath = param;
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

    public boolean isInitialValueSpecified() {
        return localInitialValueTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getInitialValue() {
        return localInitialValue;
    }

    /**
     * Auto generated setter method
     * @param param InitialValue
     */
    public void setInitialValue(java.lang.String param) {
        localInitialValueTracker = param != null;

        this.localInitialValue = param;
    }

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

    public boolean isIdMappingSpecified() {
        return localIdMappingTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getIdMapping() {
        return localIdMapping;
    }

    /**
     * Auto generated setter method
     * @param param IdMapping
     */
    public void setIdMapping(java.lang.String param) {
        localIdMappingTracker = param != null;

        this.localIdMapping = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getRequired() {
        return localRequired;
    }

    /**
     * Auto generated setter method
     * @param param Required
     */
    public void setRequired(boolean param) {
        this.localRequired = param;
    }

    public boolean isHelpTextSpecified() {
        return localHelpTextTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getHelpText() {
        return localHelpText;
    }

    /**
     * Auto generated setter method
     * @param param HelpText
     */
    public void setHelpText(java.lang.String param) {
        localHelpTextTracker = param != null;

        this.localHelpText = param;
    }

    public boolean isStoreRootSpecified() {
        return localStoreRootTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getStoreRoot() {
        return localStoreRoot;
    }

    /**
     * Auto generated setter method
     * @param param StoreRoot
     */
    public void setStoreRoot(java.lang.String param) {
        localStoreRootTracker = param != null;

        this.localStoreRoot = param;
    }

    public boolean isNameMappingSpecified() {
        return localNameMappingTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNameMapping() {
        return localNameMapping;
    }

    /**
     * Auto generated setter method
     * @param param NameMapping
     */
    public void setNameMapping(java.lang.String param) {
        localNameMappingTracker = param != null;

        this.localNameMapping = param;
    }

    public boolean isLabelSpecified() {
        return localLabelTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLabel() {
        return localLabel;
    }

    /**
     * Auto generated setter method
     * @param param Label
     */
    public void setLabel(java.lang.String param) {
        localLabelTracker = param != null;

        this.localLabel = param;
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
                    namespacePrefix + ":form-field", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "form-field", xmlWriter);
            }
        }

        if (localRegexValidationTracker) {
            namespace = "";
            writeStartElement(null, namespace, "regexValidation", xmlWriter);

            if (localRegexValidation == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "regexValidation cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localRegexValidation);
            }

            xmlWriter.writeEndElement();
        }

        if (localStorePathTracker) {
            namespace = "";
            writeStartElement(null, namespace, "storePath", xmlWriter);

            if (localStorePath == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "storePath cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localStorePath);
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

        if (localInitialValueTracker) {
            namespace = "";
            writeStartElement(null, namespace, "initialValue", xmlWriter);

            if (localInitialValue == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "initialValue cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localInitialValue);
            }

            xmlWriter.writeEndElement();
        }

        if (localTypeTracker) {
            namespace = "";
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

        if (localIdMappingTracker) {
            namespace = "";
            writeStartElement(null, namespace, "idMapping", xmlWriter);

            if (localIdMapping == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "idMapping cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localIdMapping);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "required", xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "required cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localRequired));
        }

        xmlWriter.writeEndElement();

        if (localHelpTextTracker) {
            namespace = "";
            writeStartElement(null, namespace, "helpText", xmlWriter);

            if (localHelpText == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "helpText cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localHelpText);
            }

            xmlWriter.writeEndElement();
        }

        if (localStoreRootTracker) {
            namespace = "";
            writeStartElement(null, namespace, "storeRoot", xmlWriter);

            if (localStoreRoot == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "storeRoot cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localStoreRoot);
            }

            xmlWriter.writeEndElement();
        }

        if (localNameMappingTracker) {
            namespace = "";
            writeStartElement(null, namespace, "nameMapping", xmlWriter);

            if (localNameMapping == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "nameMapping cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNameMapping);
            }

            xmlWriter.writeEndElement();
        }

        if (localLabelTracker) {
            namespace = "";
            writeStartElement(null, namespace, "label", xmlWriter);

            if (localLabel == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "label cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localLabel);
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
        public static FormField parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            FormField object = new FormField();

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

                        if (!"form-field".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (FormField) sk.itcloud.maven.pom.ExtensionMapper.getTypeObject(nsUri,
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
                        new javax.xml.namespace.QName("", "regexValidation").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "regexValidation").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "regexValidation" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRegexValidation(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "storePath").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "storePath").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "storePath" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setStorePath(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                        new javax.xml.namespace.QName("", "initialValue").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "initialValue").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "initialValue" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setInitialValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "type").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "type").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "type" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "idMapping").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "idMapping").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "idMapping" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIdMapping(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "required").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "required").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "required" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRequired(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
                        new javax.xml.namespace.QName("", "helpText").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "helpText").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "helpText" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setHelpText(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "storeRoot").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "storeRoot").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "storeRoot" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setStoreRoot(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "nameMapping").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "nameMapping").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "nameMapping" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNameMapping(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "label").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "label").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "label" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
