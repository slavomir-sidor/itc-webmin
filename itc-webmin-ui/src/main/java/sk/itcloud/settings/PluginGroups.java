package sk.itcloud.settings;

import java.util.List;

import org.apache.maven.settings.Mirror;
import org.apache.maven.settings.Server;
import org.apache.maven.settings.Settings;

import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;

public class PluginGroups extends HorizontalLayout
{

	List<String> items;
	public PluginGroups(Settings settings)
	{
		super();
		items=settings.getPluginGroups();
		Table table = new Table("Maven Settings Plugin Groups");

		for (int i = 0; i < items.size(); i++)
		{
			table.addItem(items.get(i));
		}
		addComponent(table);
	}

	public PluginGroups(Component... children)
	{
		super(children);
		// TODO Auto-generated constructor stub
	}

}
