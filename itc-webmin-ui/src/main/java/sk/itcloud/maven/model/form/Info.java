package sk.itcloud.maven.model.form;

import java.io.Serializable;
import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;
import eu.livotov.labs.vaadin.autoforms.api.FormFieldType;


@FormBean(rows = 4, columns = 1, cancelButtonVisible = false, commitButtonVisible = false, title = "Information")
public class Info implements Serializable
{

	@FormField(title = "Name", location = "0,0", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String name;

	@FormField(title = "Description", location = "0,1", required = true, requiredFieldErrorMessage = "Please enter connection",type=FormFieldType.Text)
	protected String description;

	@FormField(title = "Url", location = "0,2", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String url;

	@FormField(title = "Inception Year",width="100", location = "0,3", required = true, requiredFieldErrorMessage = "Please enter connection", type=FormFieldType.Integer)
	protected String inceptionYear;

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * @return the url
	 */
	public String getUrl()
	{
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url)
	{
		this.url = url;
	}

	/**
	 * @return the inceptionYear
	 */
	public String getInceptionYear()
	{
		return inceptionYear;
	}

	/**
	 * @param inceptionYear
	 *            the inceptionYear to set
	 */
	public void setInceptionYear(String inceptionYear)
	{
		this.inceptionYear = inceptionYear;
	}
}
