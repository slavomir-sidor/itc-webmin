package sk.itcloud.maven.model.form;

import java.io.Serializable;
import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;

@FormBean(rows = 4, columns = 2, cancelButtonVisible = false, commitButtonVisible = false, title = "SCM")
public class Info implements Serializable
{

	@FormField(title = "Name", location = "1,0", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String name;

	@FormField(title = "Description", location = "1,1", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String description;

	@FormField(title = "Url", location = "1,2", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String url;

	@FormField(title = "Inception Year", location = "1,3", required = true, requiredFieldErrorMessage = "Please enter connection")
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
