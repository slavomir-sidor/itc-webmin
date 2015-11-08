package sk.itcloud.maven.settings.form;

import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;

@FormBean(rows = 4, columns = 2, cancelButtonVisible = false, commitButtonVisible = false, title = "Proxy")
public class Proxy
{
	@FormField(title = "Id", location = "0,0", required = true, requiredFieldErrorMessage = "Please enter")
	protected String id;

	@FormField(title = "Active", location = "0,1", required = false, requiredFieldErrorMessage = "Please enter")
	protected Boolean active = false;

	@FormField(title = "Username", location = "0,2", required = true, requiredFieldErrorMessage = "Please enter")
	protected String username;

	@FormField(title = "Password", location = "0,3", required = true, requiredFieldErrorMessage = "Please enter")
	protected String password;

	@FormField(title = "Port", location = "1,0", required = true, requiredFieldErrorMessage = "Please enter")
	protected Integer port = 8080;

	@FormField(title = "Protocol", location = "1,1", required = true, requiredFieldErrorMessage = "Please enter")
	protected String protocol;

	@FormField(title = "Host", location = "1,2", required = true, requiredFieldErrorMessage = "Please enter")
	protected String host;

	@FormField(title = "Non Proxy Hosts", location = "1,3", required = true, requiredFieldErrorMessage = "Please enter")
	protected String nonProxyHosts;

	/**
	 * Gets the value of the active property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isActive()
	{
		return active;
	}

	/**
	 * Sets the value of the active property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setActive(Boolean value)
	{
		this.active = value;
	}

	/**
	 * Gets the value of the protocol property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProtocol()
	{
		return protocol;
	}

	/**
	 * Sets the value of the protocol property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProtocol(String value)
	{
		this.protocol = value;
	}

	/**
	 * Gets the value of the username property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * Sets the value of the username property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUsername(String value)
	{
		this.username = value;
	}

	/**
	 * Gets the value of the password property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Sets the value of the password property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPassword(String value)
	{
		this.password = value;
	}

	/**
	 * Gets the value of the port property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPort()
	{
		return port;
	}

	/**
	 * Sets the value of the port property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPort(Integer value)
	{
		this.port = value;
	}

	/**
	 * Gets the value of the host property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHost()
	{
		return host;
	}

	/**
	 * Sets the value of the host property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHost(String value)
	{
		this.host = value;
	}

	/**
	 * Gets the value of the nonProxyHosts property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNonProxyHosts()
	{
		return nonProxyHosts;
	}

	/**
	 * Sets the value of the nonProxyHosts property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNonProxyHosts(String value)
	{
		this.nonProxyHosts = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value)
	{
		this.id = value;
	}

}
