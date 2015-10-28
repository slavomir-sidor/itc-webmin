package sk.itcloud.webmin;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TreeTable;
import com.vaadin.ui.VerticalLayout;

public class ServerView extends VerticalLayout implements View {

	public static final String VIEW_NAME = "Servers";

	public ServerView() {

		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		TreeTable serverBrowserTree = new TreeTable();
		serverBrowserTree.setSizeFull();
		serverBrowserTree.setSelectable(true);
		serverBrowserTree.addContainerProperty("Servers", String.class, "");

		HorizontalLayout serverBrowser = new HorizontalLayout();
		serverBrowser.addComponent(serverBrowserTree);

		HorizontalLayout serverDetail = new HorizontalLayout();

		/*WebminAPI api = new WebminAPI();
		Object[] results = api.getThemes();

		for (int i = 0; 0 < results.length; i++) {
			serverDetail.addComponent(new Label());
		}
*/
		addComponent(serverBrowser);
		addComponent(serverDetail);

		setExpandRatio(serverBrowser, 10);
		setExpandRatio(serverDetail, 5);

	}

	@Override
	public void enter(ViewChangeEvent event) {
	}
}