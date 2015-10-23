package sk.itcloud.webmin;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TreeTable;
import com.vaadin.ui.VerticalLayout;

public class ServerView extends VerticalLayout implements View
{
	public static final String VIEW_NAME = "Servers";

	public ServerView()
	{

		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		URL url;

		try
		{
			url = new URL("http", "127.0.0.1", 10000, "/xmlrpc.cgi");
			config.setServerURL(url);
			config.setBasicUserName("root");
			config.setBasicPassword("jahman");

			XmlRpcClient client = new XmlRpcClient();
			client.setConfig(config);

			Object[] params = new Object[] {};

			try
			{
				Object[] results = (Object[]) client.execute("cron::list_cron_jobs", params);
			} catch (XmlRpcException e)
			{
				e.printStackTrace();
			}

		} catch (MalformedURLException e1)
		{
			e1.printStackTrace();
		}

		TreeTable serverBrowserTree = new TreeTable();
		serverBrowserTree.setSizeFull();
		serverBrowserTree.setSelectable(true);
		serverBrowserTree.addContainerProperty("Servers", String.class, "");

		HorizontalLayout serverBrowser = new HorizontalLayout();
		serverBrowser.addComponent(serverBrowserTree);

		HorizontalLayout serverDetail = new HorizontalLayout();

		addComponent(serverBrowser);
		addComponent(serverDetail);

		setExpandRatio(serverBrowser, 10);
		setExpandRatio(serverDetail, 5);

	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}