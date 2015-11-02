/**
 * StatusResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0-SNAPSHOT  Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.nexus;


/**
 *  StatusResource bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class StatusResource implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = status-resource
       Namespace URI =
       Namespace Prefix =
     */

    /**
     * field for ApiVersion
     */
    protected java.lang.String localApiVersion;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localApiVersionTracker = false;

    /**
     * field for LastConfigChange
     */
    protected java.util.Calendar localLastConfigChange;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLastConfigChangeTracker = false;

    /**
     * field for ConfigurationUpgraded
     */
    protected boolean localConfigurationUpgraded;

    /**
     * field for FormattedAppName
     */
    protected java.lang.String localFormattedAppName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFormattedAppNameTracker = false;

    /**
     * field for EditionLong
     */
    protected java.lang.String localEditionLong;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEditionLongTracker = false;

    /**
     * field for InitializedAt
     */
    protected java.util.Calendar localInitializedAt;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localInitializedAtTracker = false;

    /**
     * field for TrialLicense
     */
    protected boolean localTrialLicense;

    /**
     * field for StartedAt
     */
    protected java.util.Calendar localStartedAt;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStartedAtTracker = false;

    /**
     * field for EditionShort
     */
    protected java.lang.String localEditionShort;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEditionShortTracker = false;

    /**
     * field for ErrorCause
     */
    protected java.lang.String localErrorCause;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localErrorCauseTracker = false;

    /**
     * field for AppName
     */
    protected java.lang.String localAppName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAppNameTracker = false;

    /**
     * field for LicenseExpired
     */
    protected boolean localLicenseExpired;

    /**
     * field for OperationMode
     */
    protected java.lang.String localOperationMode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOperationModeTracker = false;

    /**
     * field for FirstStart
     */
    protected boolean localFirstStart;

    /**
     * field for InstanceUpgraded
     */
    protected boolean localInstanceUpgraded;

    /**
     * field for ClientPermissions
     */
    protected sk.itcloud.nexus.NexusAuthenticationClientPermissions localClientPermissions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localClientPermissionsTracker = false;

    /**
     * field for PurchaseURL
     */
    protected java.lang.String localPurchaseURL;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPurchaseURLTracker = false;

    /**
     * field for ConfigurationValidationResponse
     */
    protected sk.itcloud.nexus.StatusConfigurationValidationResponse localConfigurationValidationResponse;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localConfigurationValidationResponseTracker = false;

    /**
     * field for AttributionsURL
     */
    protected java.lang.String localAttributionsURL;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAttributionsURLTracker = false;

    /**
     * field for LicenseInstalled
     */
    protected boolean localLicenseInstalled;

    /**
     * field for BaseUrl
     */
    protected java.lang.String localBaseUrl;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBaseUrlTracker = false;

    /**
     * field for UserLicenseURL
     */
    protected java.lang.String localUserLicenseURL;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUserLicenseURLTracker = false;

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
     * field for State
     */
    protected java.lang.String localState;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStateTracker = false;

    public boolean isApiVersionSpecified() {
        return localApiVersionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getApiVersion() {
        return localApiVersion;
    }

    /**
     * Auto generated setter method
     * @param param ApiVersion
     */
    public void setApiVersion(java.lang.String param) {
        localApiVersionTracker = param != null;

        this.localApiVersion = param;
    }

    public boolean isLastConfigChangeSpecified() {
        return localLastConfigChangeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getLastConfigChange() {
        return localLastConfigChange;
    }

    /**
     * Auto generated setter method
     * @param param LastConfigChange
     */
    public void setLastConfigChange(java.util.Calendar param) {
        localLastConfigChangeTracker = param != null;

        this.localLastConfigChange = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getConfigurationUpgraded() {
        return localConfigurationUpgraded;
    }

    /**
     * Auto generated setter method
     * @param param ConfigurationUpgraded
     */
    public void setConfigurationUpgraded(boolean param) {
        this.localConfigurationUpgraded = param;
    }

    public boolean isFormattedAppNameSpecified() {
        return localFormattedAppNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFormattedAppName() {
        return localFormattedAppName;
    }

    /**
     * Auto generated setter method
     * @param param FormattedAppName
     */
    public void setFormattedAppName(java.lang.String param) {
        localFormattedAppNameTracker = param != null;

        this.localFormattedAppName = param;
    }

    public boolean isEditionLongSpecified() {
        return localEditionLongTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEditionLong() {
        return localEditionLong;
    }

    /**
     * Auto generated setter method
     * @param param EditionLong
     */
    public void setEditionLong(java.lang.String param) {
        localEditionLongTracker = param != null;

        this.localEditionLong = param;
    }

    public boolean isInitializedAtSpecified() {
        return localInitializedAtTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getInitializedAt() {
        return localInitializedAt;
    }

    /**
     * Auto generated setter method
     * @param param InitializedAt
     */
    public void setInitializedAt(java.util.Calendar param) {
        localInitializedAtTracker = param != null;

        this.localInitializedAt = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getTrialLicense() {
        return localTrialLicense;
    }

    /**
     * Auto generated setter method
     * @param param TrialLicense
     */
    public void setTrialLicense(boolean param) {
        this.localTrialLicense = param;
    }

    public boolean isStartedAtSpecified() {
        return localStartedAtTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getStartedAt() {
        return localStartedAt;
    }

    /**
     * Auto generated setter method
     * @param param StartedAt
     */
    public void setStartedAt(java.util.Calendar param) {
        localStartedAtTracker = param != null;

        this.localStartedAt = param;
    }

    public boolean isEditionShortSpecified() {
        return localEditionShortTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEditionShort() {
        return localEditionShort;
    }

    /**
     * Auto generated setter method
     * @param param EditionShort
     */
    public void setEditionShort(java.lang.String param) {
        localEditionShortTracker = param != null;

        this.localEditionShort = param;
    }

    public boolean isErrorCauseSpecified() {
        return localErrorCauseTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getErrorCause() {
        return localErrorCause;
    }

    /**
     * Auto generated setter method
     * @param param ErrorCause
     */
    public void setErrorCause(java.lang.String param) {
        localErrorCauseTracker = param != null;

        this.localErrorCause = param;
    }

    public boolean isAppNameSpecified() {
        return localAppNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAppName() {
        return localAppName;
    }

    /**
     * Auto generated setter method
     * @param param AppName
     */
    public void setAppName(java.lang.String param) {
        localAppNameTracker = param != null;

        this.localAppName = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getLicenseExpired() {
        return localLicenseExpired;
    }

    /**
     * Auto generated setter method
     * @param param LicenseExpired
     */
    public void setLicenseExpired(boolean param) {
        this.localLicenseExpired = param;
    }

    public boolean isOperationModeSpecified() {
        return localOperationModeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOperationMode() {
        return localOperationMode;
    }

    /**
     * Auto generated setter method
     * @param param OperationMode
     */
    public void setOperationMode(java.lang.String param) {
        localOperationModeTracker = param != null;

        this.localOperationMode = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getFirstStart() {
        return localFirstStart;
    }

    /**
     * Auto generated setter method
     * @param param FirstStart
     */
    public void setFirstStart(boolean param) {
        this.localFirstStart = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getInstanceUpgraded() {
        return localInstanceUpgraded;
    }

    /**
     * Auto generated setter method
     * @param param InstanceUpgraded
     */
    public void setInstanceUpgraded(boolean param) {
        this.localInstanceUpgraded = param;
    }

    public boolean isClientPermissionsSpecified() {
        return localClientPermissionsTracker;
    }

    /**
     * Auto generated getter method
     * @return sk.itcloud.nexus.NexusAuthenticationClientPermissions
     */
    public sk.itcloud.nexus.NexusAuthenticationClientPermissions getClientPermissions() {
        return localClientPermissions;
    }

    /**
     * Auto generated setter method
     * @param param ClientPermissions
     */
    public void setClientPermissions(
        sk.itcloud.nexus.NexusAuthenticationClientPermissions param) {
        localClientPermissionsTracker = param != null;

        this.localClientPermissions = param;
    }

    public boolean isPurchaseURLSpecified() {
        return localPurchaseURLTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPurchaseURL() {
        return localPurchaseURL;
    }

    /**
     * Auto generated setter method
     * @param param PurchaseURL
     */
    public void setPurchaseURL(java.lang.String param) {
        localPurchaseURLTracker = param != null;

        this.localPurchaseURL = param;
    }

    public boolean isConfigurationValidationResponseSpecified() {
        return localConfigurationValidationResponseTracker;
    }

    /**
     * Auto generated getter method
     * @return sk.itcloud.nexus.StatusConfigurationValidationResponse
     */
    public sk.itcloud.nexus.StatusConfigurationValidationResponse getConfigurationValidationResponse() {
        return localConfigurationValidationResponse;
    }

    /**
     * Auto generated setter method
     * @param param ConfigurationValidationResponse
     */
    public void setConfigurationValidationResponse(
        sk.itcloud.nexus.StatusConfigurationValidationResponse param) {
        localConfigurationValidationResponseTracker = param != null;

        this.localConfigurationValidationResponse = param;
    }

    public boolean isAttributionsURLSpecified() {
        return localAttributionsURLTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAttributionsURL() {
        return localAttributionsURL;
    }

    /**
     * Auto generated setter method
     * @param param AttributionsURL
     */
    public void setAttributionsURL(java.lang.String param) {
        localAttributionsURLTracker = param != null;

        this.localAttributionsURL = param;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getLicenseInstalled() {
        return localLicenseInstalled;
    }

    /**
     * Auto generated setter method
     * @param param LicenseInstalled
     */
    public void setLicenseInstalled(boolean param) {
        this.localLicenseInstalled = param;
    }

    public boolean isBaseUrlSpecified() {
        return localBaseUrlTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBaseUrl() {
        return localBaseUrl;
    }

    /**
     * Auto generated setter method
     * @param param BaseUrl
     */
    public void setBaseUrl(java.lang.String param) {
        localBaseUrlTracker = param != null;

        this.localBaseUrl = param;
    }

    public boolean isUserLicenseURLSpecified() {
        return localUserLicenseURLTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUserLicenseURL() {
        return localUserLicenseURL;
    }

    /**
     * Auto generated setter method
     * @param param UserLicenseURL
     */
    public void setUserLicenseURL(java.lang.String param) {
        localUserLicenseURLTracker = param != null;

        this.localUserLicenseURL = param;
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

    public boolean isStateSpecified() {
        return localStateTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getState() {
        return localState;
    }

    /**
     * Auto generated setter method
     * @param param State
     */
    public void setState(java.lang.String param) {
        localStateTracker = param != null;

        this.localState = param;
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
                    namespacePrefix + ":status-resource", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "status-resource", xmlWriter);
            }
        }

        if (localApiVersionTracker) {
            namespace = "";
            writeStartElement(null, namespace, "apiVersion", xmlWriter);

            if (localApiVersion == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "apiVersion cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localApiVersion);
            }

            xmlWriter.writeEndElement();
        }

        if (localLastConfigChangeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "lastConfigChange", xmlWriter);

            if (localLastConfigChange == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "lastConfigChange cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localLastConfigChange));
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "configurationUpgraded", xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "configurationUpgraded cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localConfigurationUpgraded));
        }

        xmlWriter.writeEndElement();

        if (localFormattedAppNameTracker) {
            namespace = "";
            writeStartElement(null, namespace, "formattedAppName", xmlWriter);

            if (localFormattedAppName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "formattedAppName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFormattedAppName);
            }

            xmlWriter.writeEndElement();
        }

        if (localEditionLongTracker) {
            namespace = "";
            writeStartElement(null, namespace, "editionLong", xmlWriter);

            if (localEditionLong == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "editionLong cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localEditionLong);
            }

            xmlWriter.writeEndElement();
        }

        if (localInitializedAtTracker) {
            namespace = "";
            writeStartElement(null, namespace, "initializedAt", xmlWriter);

            if (localInitializedAt == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "initializedAt cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localInitializedAt));
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "trialLicense", xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "trialLicense cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localTrialLicense));
        }

        xmlWriter.writeEndElement();

        if (localStartedAtTracker) {
            namespace = "";
            writeStartElement(null, namespace, "startedAt", xmlWriter);

            if (localStartedAt == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "startedAt cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localStartedAt));
            }

            xmlWriter.writeEndElement();
        }

        if (localEditionShortTracker) {
            namespace = "";
            writeStartElement(null, namespace, "editionShort", xmlWriter);

            if (localEditionShort == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "editionShort cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localEditionShort);
            }

            xmlWriter.writeEndElement();
        }

        if (localErrorCauseTracker) {
            namespace = "";
            writeStartElement(null, namespace, "errorCause", xmlWriter);

            if (localErrorCause == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "errorCause cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localErrorCause);
            }

            xmlWriter.writeEndElement();
        }

        if (localAppNameTracker) {
            namespace = "";
            writeStartElement(null, namespace, "appName", xmlWriter);

            if (localAppName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "appName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAppName);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "licenseExpired", xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "licenseExpired cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localLicenseExpired));
        }

        xmlWriter.writeEndElement();

        if (localOperationModeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "operationMode", xmlWriter);

            if (localOperationMode == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "operationMode cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localOperationMode);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "firstStart", xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "firstStart cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localFirstStart));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "instanceUpgraded", xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "instanceUpgraded cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localInstanceUpgraded));
        }

        xmlWriter.writeEndElement();

        if (localClientPermissionsTracker) {
            if (localClientPermissions == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "clientPermissions cannot be null!!");
            }

            localClientPermissions.serialize(new javax.xml.namespace.QName("",
                    "clientPermissions"), xmlWriter);
        }

        if (localPurchaseURLTracker) {
            namespace = "";
            writeStartElement(null, namespace, "purchaseURL", xmlWriter);

            if (localPurchaseURL == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "purchaseURL cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPurchaseURL);
            }

            xmlWriter.writeEndElement();
        }

        if (localConfigurationValidationResponseTracker) {
            if (localConfigurationValidationResponse == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "configurationValidationResponse cannot be null!!");
            }

            localConfigurationValidationResponse.serialize(new javax.xml.namespace.QName(
                    "", "configurationValidationResponse"), xmlWriter);
        }

        if (localAttributionsURLTracker) {
            namespace = "";
            writeStartElement(null, namespace, "attributionsURL", xmlWriter);

            if (localAttributionsURL == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "attributionsURL cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAttributionsURL);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "licenseInstalled", xmlWriter);

        if (false) {
            throw new org.apache.axis2.databinding.ADBException(
                "licenseInstalled cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localLicenseInstalled));
        }

        xmlWriter.writeEndElement();

        if (localBaseUrlTracker) {
            namespace = "";
            writeStartElement(null, namespace, "baseUrl", xmlWriter);

            if (localBaseUrl == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "baseUrl cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBaseUrl);
            }

            xmlWriter.writeEndElement();
        }

        if (localUserLicenseURLTracker) {
            namespace = "";
            writeStartElement(null, namespace, "userLicenseURL", xmlWriter);

            if (localUserLicenseURL == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "userLicenseURL cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localUserLicenseURL);
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

        if (localStateTracker) {
            namespace = "";
            writeStartElement(null, namespace, "state", xmlWriter);

            if (localState == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "state cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localState);
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
        public static StatusResource parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            StatusResource object = new StatusResource();

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

                        if (!"status-resource".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (StatusResource) sk.itcloud.maven.pom.ExtensionMapper.getTypeObject(nsUri,
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
                        new javax.xml.namespace.QName("", "apiVersion").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "apiVersion").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "apiVersion" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setApiVersion(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "lastConfigChange").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "lastConfigChange").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "lastConfigChange" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLastConfigChange(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "configurationUpgraded").equals(reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "configurationUpgraded").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "configurationUpgraded" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setConfigurationUpgraded(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
                        new javax.xml.namespace.QName("", "formattedAppName").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "formattedAppName").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "formattedAppName" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFormattedAppName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "editionLong").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "editionLong").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "editionLong" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEditionLong(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "initializedAt").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "initializedAt").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "initializedAt" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setInitializedAt(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "trialLicense").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "trialLicense").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "trialLicense" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTrialLicense(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
                        new javax.xml.namespace.QName("", "startedAt").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "startedAt").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "startedAt" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setStartedAt(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "editionShort").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "editionShort").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "editionShort" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEditionShort(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "errorCause").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "errorCause").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "errorCause" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setErrorCause(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "appName").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "appName").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "appName" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAppName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "licenseExpired").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "licenseExpired").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "licenseExpired" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLicenseExpired(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
                        new javax.xml.namespace.QName("", "operationMode").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "operationMode").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "operationMode" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOperationMode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "firstStart").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "firstStart").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "firstStart" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFirstStart(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
                        new javax.xml.namespace.QName("", "instanceUpgraded").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "instanceUpgraded").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "instanceUpgraded" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setInstanceUpgraded(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
                        new javax.xml.namespace.QName("", "clientPermissions").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "clientPermissions").equals(
                            reader.getName())) {
                    object.setClientPermissions(sk.itcloud.nexus.NexusAuthenticationClientPermissions.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "purchaseURL").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "purchaseURL").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "purchaseURL" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPurchaseURL(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("",
                            "configurationValidationResponse").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("",
                            "configurationValidationResponse").equals(
                            reader.getName())) {
                    object.setConfigurationValidationResponse(sk.itcloud.nexus.StatusConfigurationValidationResponse.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "attributionsURL").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "attributionsURL").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "attributionsURL" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAttributionsURL(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "licenseInstalled").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "licenseInstalled").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "licenseInstalled" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLicenseInstalled(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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
                        new javax.xml.namespace.QName("", "baseUrl").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "baseUrl").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "baseUrl" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBaseUrl(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "userLicenseURL").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "userLicenseURL").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "userLicenseURL" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setUserLicenseURL(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "state").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "state").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "state" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setState(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
