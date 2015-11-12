package sk.itcloud.team;

import org.apache.directory.ldap.client.api.LdapConnectionConfig;
import org.apache.directory.ldap.client.api.LdapNetworkConnection;

public class TeamAPI
{
	LdapConnectionConfig config;

	LdapNetworkConnection connection;

	public TeamAPI()
	{
		super();
	}

	/**
	 * @return the config
	 */
	public LdapConnectionConfig getConfig()
	{
		return config;
	}

	/**
	 * @param config
	 *            the config to set
	 */
	public void setConfig(LdapConnectionConfig config)
	{
		this.config = config;
	}

	/**
	 * @return the connection
	 */
	public LdapNetworkConnection getConnection()
	{
		return connection;
	}

	/**
	 * @param connection
	 *            the connection to set
	 */
	public void setConnection(LdapNetworkConnection connection)
	{
		this.connection = connection;
	}

}