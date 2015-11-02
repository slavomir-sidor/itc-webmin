package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Server;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.data.util.BeanItemContainer;

public class ServersViews extends GridMasterVertical implements View
{

	public static final String VIEW_NAME = "Servers";

	public ServersViews(List<Server> servers)
	{
		super();
		table.setContainerDataSource(new BeanItemContainer<Server>(Server.class, servers));
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}