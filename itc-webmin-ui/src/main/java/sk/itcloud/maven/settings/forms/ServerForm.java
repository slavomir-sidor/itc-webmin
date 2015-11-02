/**
 * Server.java
 *
 * This file was auto-generated from WSDL by the Apache Axis2 version: 1.7.0-SNAPSHOT Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.settings.forms;

import java.io.Serializable;

import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;

@FormBean(rows = 4, columns = 2, cancelButtonVisible = true, commitButtonVisible = true, title = "", header = "")
public class ServerForm implements Serializable
{
	/**
	 * field for Username
	 */
	@FormField(title = "Local User Name", location = "0,0,1,0", required = true, requiredFieldErrorMessage = "Please enter your local user name")
	protected java.lang.String localUsername;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	@FormField(title = "Local Username Tracker", location = "0,0,2,0", required = true, requiredFieldErrorMessage = "Please enter your Local Username Tracker")
	protected boolean localUsernameTracker = false;

	@FormField(title = "Local Password", location = "0,0,3,0", required = true, requiredFieldErrorMessage = "Please enter your Local Username Password")
	protected java.lang.String localPassword;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	@FormField(title = "Local Password Tracker", location = "0,0,4,0", required = true, requiredFieldErrorMessage = "Please enter your Local Username Password Tracker")
	protected boolean localPasswordTracker = false;

	/**
	 * field for PrivateKey
	 */
	@FormField(title = "Local Private Key", location = "0,0,1,0", required = true, requiredFieldErrorMessage = "Please enter your Local Private Key")
	protected java.lang.String localPrivateKey;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	@FormField(title = "Local Private Key Tracker", location = "0,0,1,0", required = true, requiredFieldErrorMessage = "Please enter your Local Private Key Tracker")
	protected boolean localPrivateKeyTracker = false;

	/**
	 * field for Passphrase
	 */
	@FormField(title = "Local Passphrase", location = "0,0,1,0", required = true, requiredFieldErrorMessage = "Please enter your Local Passphrase")
	protected java.lang.String localPassphrase;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	@FormField(title = "Local Passphrase Tracker", location = "0,0,1,0", required = true, requiredFieldErrorMessage = "Please enter your Local Passphrase Tracker")
	protected boolean localPassphraseTracker = false;

	/**
	 * field for FilePermissions
	 */
	@FormField(title = "Local File Permissions", location = "0,0,1,0", required = true, requiredFieldErrorMessage = "Please enter your Local File Permissions")
	protected java.lang.String localFilePermissions;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	@FormField(title = "Local File Permissions Tracker", location = "0,0,1,0", required = true, requiredFieldErrorMessage = "Please enter your Local File Permissions Tracker")
	protected boolean localFilePermissionsTracker = false;

	/**
	 * field for DirectoryPermissions
	 */
	@FormField(title = "Local File Directory Permissions", location = "0,0,1,0", required = true, requiredFieldErrorMessage = "Please enter your Local File Directory Permissions")
	protected java.lang.String localDirectoryPermissions;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	@FormField(title = "Local File Directory Permissions Tracker", location = "0,0,1,0", required = true, requiredFieldErrorMessage = "Please enter your Local File Directory Permissions Tracker")
	protected boolean localDirectoryPermissionsTracker = false;

	/**
	 * field for Configuration
	 */
	protected sk.itcloud.maven.settings.form.Configuration_type0 localConfiguration;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localConfigurationTracker = false;

	/**
	 * field for Id
	 */
	@FormField(title = "Local ID", location = "0,0,1,0", required = true, requiredFieldErrorMessage = "Please enter your Local ID")
	protected java.lang.String localId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localIdTracker = false;

	/**
	 * @return the localUsername
	 */
	public java.lang.String getLocalUsername()
	{
		return localUsername;
	}

	/**
	 * @param localUsername
	 *            the localUsername to set
	 */
	public void setLocalUsername(java.lang.String localUsername)
	{
		this.localUsername = localUsername;
	}

	/**
	 * @return the localUsernameTracker
	 */
	public boolean isLocalUsernameTracker()
	{
		return localUsernameTracker;
	}

	/**
	 * @param localUsernameTracker
	 *            the localUsernameTracker to set
	 */
	public void setLocalUsernameTracker(boolean localUsernameTracker)
	{
		this.localUsernameTracker = localUsernameTracker;
	}

	/**
	 * @return the localPassword
	 */
	public java.lang.String getLocalPassword()
	{
		return localPassword;
	}

	/**
	 * @param localPassword
	 *            the localPassword to set
	 */
	public void setLocalPassword(java.lang.String localPassword)
	{
		this.localPassword = localPassword;
	}

	/**
	 * @return the localPasswordTracker
	 */
	public boolean isLocalPasswordTracker()
	{
		return localPasswordTracker;
	}

	/**
	 * @param localPasswordTracker
	 *            the localPasswordTracker to set
	 */
	public void setLocalPasswordTracker(boolean localPasswordTracker)
	{
		this.localPasswordTracker = localPasswordTracker;
	}

	/**
	 * @return the localPrivateKey
	 */
	public java.lang.String getLocalPrivateKey()
	{
		return localPrivateKey;
	}

	/**
	 * @param localPrivateKey
	 *            the localPrivateKey to set
	 */
	public void setLocalPrivateKey(java.lang.String localPrivateKey)
	{
		this.localPrivateKey = localPrivateKey;
	}

	/**
	 * @return the localPrivateKeyTracker
	 */
	public boolean isLocalPrivateKeyTracker()
	{
		return localPrivateKeyTracker;
	}

	/**
	 * @param localPrivateKeyTracker
	 *            the localPrivateKeyTracker to set
	 */
	public void setLocalPrivateKeyTracker(boolean localPrivateKeyTracker)
	{
		this.localPrivateKeyTracker = localPrivateKeyTracker;
	}

	/**
	 * @return the localPassphrase
	 */
	public java.lang.String getLocalPassphrase()
	{
		return localPassphrase;
	}

	/**
	 * @param localPassphrase
	 *            the localPassphrase to set
	 */
	public void setLocalPassphrase(java.lang.String localPassphrase)
	{
		this.localPassphrase = localPassphrase;
	}

	/**
	 * @return the localPassphraseTracker
	 */
	public boolean isLocalPassphraseTracker()
	{
		return localPassphraseTracker;
	}

	/**
	 * @param localPassphraseTracker
	 *            the localPassphraseTracker to set
	 */
	public void setLocalPassphraseTracker(boolean localPassphraseTracker)
	{
		this.localPassphraseTracker = localPassphraseTracker;
	}

	/**
	 * @return the localFilePermissions
	 */
	public java.lang.String getLocalFilePermissions()
	{
		return localFilePermissions;
	}

	/**
	 * @param localFilePermissions
	 *            the localFilePermissions to set
	 */
	public void setLocalFilePermissions(java.lang.String localFilePermissions)
	{
		this.localFilePermissions = localFilePermissions;
	}

	/**
	 * @return the localFilePermissionsTracker
	 */
	public boolean isLocalFilePermissionsTracker()
	{
		return localFilePermissionsTracker;
	}

	/**
	 * @param localFilePermissionsTracker
	 *            the localFilePermissionsTracker to set
	 */
	public void setLocalFilePermissionsTracker(boolean localFilePermissionsTracker)
	{
		this.localFilePermissionsTracker = localFilePermissionsTracker;
	}

	/**
	 * @return the localDirectoryPermissions
	 */
	public java.lang.String getLocalDirectoryPermissions()
	{
		return localDirectoryPermissions;
	}

	/**
	 * @param localDirectoryPermissions
	 *            the localDirectoryPermissions to set
	 */
	public void setLocalDirectoryPermissions(java.lang.String localDirectoryPermissions)
	{
		this.localDirectoryPermissions = localDirectoryPermissions;
	}

	/**
	 * @return the localDirectoryPermissionsTracker
	 */
	public boolean isLocalDirectoryPermissionsTracker()
	{
		return localDirectoryPermissionsTracker;
	}

	/**
	 * @param localDirectoryPermissionsTracker
	 *            the localDirectoryPermissionsTracker to set
	 */
	public void setLocalDirectoryPermissionsTracker(boolean localDirectoryPermissionsTracker)
	{
		this.localDirectoryPermissionsTracker = localDirectoryPermissionsTracker;
	}

	/**
	 * @return the localConfiguration
	 */
	public sk.itcloud.maven.settings.form.Configuration_type0 getLocalConfiguration()
	{
		return localConfiguration;
	}

	/**
	 * @param localConfiguration
	 *            the localConfiguration to set
	 */
	public void setLocalConfiguration(sk.itcloud.maven.settings.form.Configuration_type0 localConfiguration)
	{
		this.localConfiguration = localConfiguration;
	}

	/**
	 * @return the localConfigurationTracker
	 */
	public boolean isLocalConfigurationTracker()
	{
		return localConfigurationTracker;
	}

	/**
	 * @param localConfigurationTracker
	 *            the localConfigurationTracker to set
	 */
	public void setLocalConfigurationTracker(boolean localConfigurationTracker)
	{
		this.localConfigurationTracker = localConfigurationTracker;
	}

	/**
	 * @return the localId
	 */
	public java.lang.String getLocalId()
	{
		return localId;
	}

	/**
	 * @param localId
	 *            the localId to set
	 */
	public void setLocalId(java.lang.String localId)
	{
		this.localId = localId;
	}

	/**
	 * @return the localIdTracker
	 */
	public boolean isLocalIdTracker()
	{
		return localIdTracker;
	}

	/**
	 * @param localIdTracker
	 *            the localIdTracker to set
	 */
	public void setLocalIdTracker(boolean localIdTracker)
	{
		this.localIdTracker = localIdTracker;
	}
}
