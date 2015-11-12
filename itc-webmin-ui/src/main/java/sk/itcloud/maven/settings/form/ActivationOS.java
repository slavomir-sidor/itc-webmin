//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.11.08 at 11:05:04 AM CET
//

package sk.itcloud.maven.settings.form;

import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;

@FormBean(rows = 4, columns = 1, cancelButtonVisible = false, commitButtonVisible = false, title = "Activation OS")
public class ActivationOS
{

	@FormField(title = "Name", location = "0,0", required = true, requiredFieldErrorMessage = "Please enter ")
	protected String name;

	@FormField(title = "Family", location = "0,1", required = true, requiredFieldErrorMessage = "Please enter ")
	protected String family;

	@FormField(title = "Arch", location = "0,2", required = true, requiredFieldErrorMessage = "Please enter ")
	protected String arch;

	@FormField(title = "Version", location = "0,3", required = true, requiredFieldErrorMessage = "Please enter ")
	protected String version;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value)
	{
		this.name = value;
	}

	/**
	 * Gets the value of the family property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFamily()
	{
		return family;
	}

	/**
	 * Sets the value of the family property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFamily(String value)
	{
		this.family = value;
	}

	/**
	 * Gets the value of the arch property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArch()
	{
		return arch;
	}

	/**
	 * Sets the value of the arch property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArch(String value)
	{
		this.arch = value;
	}

	/**
	 * Gets the value of the version property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersion()
	{
		return version;
	}

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersion(String value)
	{
		this.version = value;
	}

}