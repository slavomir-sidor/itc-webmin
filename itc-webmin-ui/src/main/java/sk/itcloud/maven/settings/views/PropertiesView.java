package sk.itcloud.maven.settings.views;

import java.util.Enumeration;
import java.util.Properties;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Table;

public class PropertiesView extends Table implements View
{

	public static final String VIEW_NAME = "Properties";

	public PropertiesView(Properties properties)
	{
		super();
		setDescription(VIEW_NAME);
		setSizeFull();
		setEditable(true);
		addContainerProperty("Property", String.class, null);
		addContainerProperty("Value", String.class, null);
		Enumeration e = properties.propertyNames();
		int i = 0;

		while (e.hasMoreElements())
		{
			String key = (String) e.nextElement();
			addItem(new Object[] { key, properties.getProperty(key, "") }, i++);
		}
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}