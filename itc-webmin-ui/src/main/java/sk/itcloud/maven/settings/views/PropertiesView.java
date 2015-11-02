package sk.itcloud.maven.settings.views;

import java.util.Properties;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;

public class PropertiesView extends HorizontalLayout
{

	public PropertiesView(Properties properttes)
	{
		super();

		Table table = new Table("Properties");
		addComponent(table);
	}
}