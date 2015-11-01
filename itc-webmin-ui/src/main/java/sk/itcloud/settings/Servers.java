package sk.itcloud.settings;

import java.util.List;

import org.apache.maven.settings.Server;
import org.apache.maven.settings.Settings;

import com.vaadin.data.Item;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;

import eu.livotov.labs.vaadin.autoforms.AutoForm;
import sk.itcloud.settings.forms.ServersForm;

public class Servers extends HorizontalLayout
{
	List<Server> items;

	public Servers(Settings settings)
	{
		super();

		items = settings.getServers();

		Table table = new Table("Maven Settings Servers");
		table.setWidth("100%");
		table.setHeight("100%");
		IndexedContainer container = new IndexedContainer();

		container.addContainerProperty("Id", String.class, "noname");

		for (int i = 0; i < items.size(); i++)
		{
			Server item = items.get(i);

			Item newItem = container.getItem(container.addItem());
			newItem.getItemProperty("Id").setValue(item.getId());
		}
		table.setContainerDataSource(container);

		ServersForm data = new ServersForm();
		AutoForm form = new AutoForm();
		// form.setFormData(data);

		addComponent(form);
		addComponent(table);

		setExpandRatio(form, 5);
		setExpandRatio(table, 5);
	}

	public Servers(Component... children)
	{
		super(children);
		// TODO Auto-generated constructor stub
	}

}
