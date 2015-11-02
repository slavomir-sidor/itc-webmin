package sk.itcloud.maven.settings.views;

import java.util.Properties;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

public class PropertiesView extends Table implements View
{

	public static final String VIEW_NAME = "Properties";

	public PropertiesView(Properties properttes)
	{
		super();
		
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}