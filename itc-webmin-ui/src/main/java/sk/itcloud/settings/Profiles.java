package sk.itcloud.settings;

import java.util.List;
import org.apache.maven.settings.Profile;
import org.apache.maven.settings.Settings;

import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;

public class Profiles extends HorizontalLayout
{

	List<Profile> items;
	
	public Profiles(Settings settings)
	{
		super();
		items=settings.getProfiles();
		
		FormLayout form = new FormLayout();
		addComponent(form);

		Table table = new Table("Maven Settings Profiles");
		table.addContainerProperty("Id", String.class, "");
		table.addContainerProperty("Description", String.class, "");

		for (int i = 0; i < items.size(); i++)
		{
			table.addItem((Object) items.get(i));
		}
		addComponent(table);
		setExpandRatio(form, 5);
		setExpandRatio(table, 5);
	}

	public Profiles(Component... children)
	{
		super(children);
		// TODO Auto-generated constructor stub
	}

}
