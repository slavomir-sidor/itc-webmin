package sk.itcloud.maven.settings.form;

import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;

@FormBean(rows = 2, columns = 1, cancelButtonVisible = false, commitButtonVisible = false, title = "Activation File")
public class ActivationFile
{

	@FormField(title = "Missing", location = "0,0", required = true, requiredFieldErrorMessage = "Please enter")
	protected String missing;

	@FormField(title = "Exists", location = "0,1", required = true, requiredFieldErrorMessage = "Please enter")
	protected String exists;

	/**
	 * Gets the value of the missing property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMissing()
	{
		return missing;
	}

	/**
	 * Sets the value of the missing property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMissing(String value)
	{
		this.missing = value;
	}

	/**
	 * Gets the value of the exists property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExists()
	{
		return exists;
	}

	/**
	 * Sets the value of the exists property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExists(String value)
	{
		this.exists = value;
	}

}
