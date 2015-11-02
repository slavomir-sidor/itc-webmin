package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Profile;
import org.apache.maven.settings.Server;
import org.apache.maven.settings.Settings;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.data.Item;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;
import eu.livotov.labs.vaadin.autoforms.AutoForm;
import sk.itcloud.maven.settings.forms.ServersForm;

public class ServersViews extends HorizontalLayout
{

	BeanItemContainer<Server> items;
	Server item;
	AutoForm form = new AutoForm();
	ServersForm formTemplate = new ServersForm();

	public ServersViews(Settings settings, int index)
	{
		super();

		items = new BeanItemContainer<Server>(Server.class, settings.getServers());
		item = items.getIdByIndex(index);

		Table table = new Table("Servers", items);
		table.setSelectable(true);
		table.addItemClickListener(new ItemClickEvent.ItemClickListener()
		{
			@Override
			public void itemClick(ItemClickEvent itemClickEvent)
			{
				if (itemClickEvent.isDoubleClick())
				{
					onRowClick(itemClickEvent);
				}
			}
		});

		// form.setFormData(data);

		addComponent(form);
		addComponent(table);

		setExpandRatio(form, 5);
		setExpandRatio(table, 5);
	}

	private void onRowClick(ItemClickEvent itemClickEvent)
	{
		Item item = items.getItem(itemClickEvent.getItemId());

	}

	public ServersViews(Component... children)
	{
		super(children);
		// TODO Auto-generated constructor stub
	}

}
