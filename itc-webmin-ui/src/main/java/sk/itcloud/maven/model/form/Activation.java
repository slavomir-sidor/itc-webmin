package sk.itcloud.maven.model.form;

import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;

@FormBean(rows = 5, columns = 2, cancelButtonVisible = false, commitButtonVisible = false, title = "Activation")
public class Activation
{
	@FormField(title = "Active By Default", location = "0,0", required = true, requiredFieldErrorMessage = "Please enter")
	protected Boolean activeByDefault = false;

	@FormField(title = "JDK", location = "0,1", required = true, requiredFieldErrorMessage = "Please enter")
	protected String jdk;

	protected ActivationOS os;
	protected ActivationProperty property;
	protected ActivationFile file;

	/**
	 * Gets the value of the activeByDefault property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isActiveByDefault()
	{
		return activeByDefault;
	}

	/**
	 * Sets the value of the activeByDefault property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setActiveByDefault(Boolean value)
	{
		this.activeByDefault = value;
	}

	/**
	 * Gets the value of the jdk property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getJdk()
	{
		return jdk;
	}

	/**
	 * Sets the value of the jdk property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setJdk(String value)
	{
		this.jdk = value;
	}

	/**
	 * Gets the value of the os property.
	 * 
	 * @return possible object is {@link ActivationOS }
	 * 
	 */
	public ActivationOS getOs()
	{
		return os;
	}

	/**
	 * Sets the value of the os property.
	 * 
	 * @param value
	 *            allowed object is {@link ActivationOS }
	 * 
	 */
	public void setOs(ActivationOS value)
	{
		this.os = value;
	}

	/**
	 * Gets the value of the property property.
	 * 
	 * @return possible object is {@link ActivationProperty }
	 * 
	 */
	public ActivationProperty getProperty()
	{
		return property;
	}

	/**
	 * Sets the value of the property property.
	 * 
	 * @param value
	 *            allowed object is {@link ActivationProperty }
	 * 
	 */
	public void setProperty(ActivationProperty value)
	{
		this.property = value;
	}

	/**
	 * Gets the value of the file property.
	 * 
	 * @return possible object is {@link ActivationFile }
	 * 
	 */
	public ActivationFile getFile()
	{
		return file;
	}

	/**
	 * Sets the value of the file property.
	 * 
	 * @param value
	 *            allowed object is {@link ActivationFile }
	 * 
	 */
	public void setFile(ActivationFile value)
	{
		this.file = value;
	}

}