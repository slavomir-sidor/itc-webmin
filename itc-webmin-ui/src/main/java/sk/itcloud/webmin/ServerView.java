package sk.itcloud.webmin;

import com.google.gwt.user.client.ui.HorizontalPanel;
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

		HorizontalLayout serverBrowser = new HorizontalLayout();
		HorizontalLayout serverDetail = new HorizontalLayout();

		TreeTable sample = new TreeTable();
		sample.setSizeFull();
		sample.setSelectable(true);
		sample.addContainerProperty("Servers", String.class, "");

		//XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		// config.setServerURL(new URL("http://127.0.0.1:8080/xmlrpc"));
		// XmlRpcClient client = new XmlRpcClient();
		// client.setConfig(config);
		// Object[] params = new Object[] { new Integer(33), new Integer(9) };
		// Integer result = (Integer) client.execute("Calculator.add", params);

		serverBrowser.addComponent(sample);

		addComponent(serverBrowser);
		addComponent(serverDetail);

		setExpandRatio(serverBrowser, 10);
		setExpandRatio(serverDetail, 5);

	}

	@Override
	public void enter(ViewChangeEvent event) {
	}
}