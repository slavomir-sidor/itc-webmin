package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Server;
import org.apache.maven.settings.Settings;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.data.Item;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;
import eu.livotov.labs.vaadin.autoforms.AutoForm;

public class ServersViews extends Table
{
	BeanItemContainer<Server> items;

	public ServersViews(List<Server> items)
	{
		super("Servers", new BeanItemContainer<Server>(Server.class, items));
	}

	private void onRowClick(ItemClickEvent itemClickEvent)
	{
		Item item = items.getItem(itemClickEvent.getItemId());
	}
}