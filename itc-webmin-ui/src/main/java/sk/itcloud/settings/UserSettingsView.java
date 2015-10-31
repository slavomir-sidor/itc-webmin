package sk.itcloud.settings;

import java.io.File;
import java.io.IOException;

import org.apache.maven.settings.DefaultMavenSettingsBuilder;
import org.apache.maven.settings.Settings;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TabSheet;


public class UserSettingsView extends TabSheet implements View
{

	public static final String VIEW_NAME = "Settings";

	public UserSettingsView()
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		String userSettingsFileName="/var/www/jahman/.m2/settings.xml";
		File userSettingsFile=new File(userSettingsFileName);
		
		DefaultMavenSettingsBuilder settingsBuilder=new DefaultMavenSettingsBuilder();
		try
		{
			Settings settings=settingsBuilder.buildSettings(userSettingsFile);

			settings.getProfiles();
		} catch (IOException | XmlPullParserException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}