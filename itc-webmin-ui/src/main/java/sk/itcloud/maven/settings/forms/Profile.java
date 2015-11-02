/**
 * Profile.java
 *
 * This file was auto-generated from WSDL by the Apache Axis2 version: 1.7.0-SNAPSHOT Built on : Oct 24, 2015 (12:47:53 CEST)
 */
package sk.itcloud.maven.settings.forms;

import java.io.Serializable;

public class Profile implements Serializable
{

	/**
	 * field for Activation
	 */
	protected sk.itcloud.maven.settings.form.Activation localActivation;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */

	protected boolean localActivationTracker = false;

	/**
	 * field for Properties
	 */
	protected sk.itcloud.maven.settings.form.Properties_type0 localProperties;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localPropertiesTracker = false;

	/**
	 * field for Repositories
	 */
	protected sk.itcloud.maven.settings.form.Repositories_type0 localRepositories;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localRepositoriesTracker = false;

	/**
	 * field for PluginRepositories
	 */
	protected sk.itcloud.maven.settings.form.PluginRepositories_type0 localPluginRepositories;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localPluginRepositoriesTracker = false;

	/**
	 * field for Id
	 */
	protected java.lang.String localId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localIdTracker = false;
}
