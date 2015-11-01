package sk.itcloud.settings;

import java.util.List;

import org.apache.maven.settings.Mirror;
import org.apache.maven.settings.Server;
import org.apache.maven.settings.Settings;

import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;

public class Mirrors extends HorizontalLayout
{

	List<Mirror> items;
	
	public Mirrors(Settings settings)
	{
		super();
		items=settings.getMirrors();
		Table table = new Table("Maven Settings Mirrors");
		for (int i = 0; i < items.size(); i++)
		{
			table.addItem(items.get(i));
		}
		addComponent(table);
	}

	public Mirrors(Component... children)
	{
		super(children);
		// TODO Auto-generated constructor stub
	}

}
