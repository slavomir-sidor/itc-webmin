package sk.itcloud.repository;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.sonatype.nexus.client.rest.BaseUrl;
import org.sonatype.nexus.client.rest.UsernamePasswordAuthenticationInfo;
import org.sonatype.nexus.client.rest.jersey.NexusClientFactoryImpl;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

public class RepositoryAPI
{

	private static String user = "admin";
	private static String password = "admin123";
	private static String url = "http://localhost:8280/";

	private URI getBaseURI()
	{
		return UriBuilder.fromUri(url).build();
	}

	public RepositoryAPI()
	{
		super();
		/*NexusClientFactoryImpl nexusClient = new NexusClientFactoryImpl(subsystemProviders);
		UsernamePasswordAuthenticationInfo auth=new UsernamePasswordAuthenticationInfo(user, password);
		nexusClient.createFor(auth);*/
	}

}
