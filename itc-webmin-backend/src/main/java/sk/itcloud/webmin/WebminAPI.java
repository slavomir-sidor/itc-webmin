package sk.itcloud.webmin;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class WebminAPI {

	protected XmlRpcClientConfigImpl config;
	protected XmlRpcClient client;

	/**
	 * @return the client
	 */
	protected XmlRpcClient getClient() {
		if (null == client) {
			XmlRpcClient client = new XmlRpcClient();
			client.setConfig(config);
		}
		return client;
	}

	/**
	 * @param client
	 *            the client to set
	 */
	protected void setClient(XmlRpcClient client) {
		this.client = client;
	}

	/**
	 * @return the config
	 * @throws MalformedURLException
	 */
	protected XmlRpcClientConfigImpl getConfig() {
		if (null == config) {
			XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
			URL url;
			try {
				url = new URL("http", "127.0.0.1", 10000, "/xmlrpc.cgi");
				config.setServerURL(url);
				config.setBasicUserName("root");
				config.setBasicPassword("jahman");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return config;
	}

	/**
	 * @param config
	 *            the config to set
	 */
	protected void setConfig(XmlRpcClientConfigImpl config) {
		this.config = config;
	}

	public WebminAPI() {

	}

	/**
	 * 
	 * @return
	 * @throws XmlRpcException
	 */
	public double getVersion() {
		Object[] params = new Object[] {};
		double version = 0;
		try {
			version = (double) getClient().execute("webmin::get_webmin_version", params);
		} catch (XmlRpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return version;
	}

	public Object[] getThemes() {
		Object[] results = null;

		try {

			Object[] params = new Object[] {};
			results = (Object[]) getClient().execute("webmin::list_themes", params);

		} catch (XmlRpcException e) {
			e.printStackTrace();
		}

		return results;
	}

}