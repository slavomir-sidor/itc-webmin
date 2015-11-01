
package sk.itcloud.settings;

import java.io.File;
import java.io.IOException;
import org.apache.maven.settings.DefaultMavenSettingsBuilder;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import com.vaadin.ui.TabSheet;

public class Settings extends TabSheet
{
	protected String settingsFileName;

	public Settings(String settingsFileName)
	{
		super();

		setSizeFull();

		setWidth("100%");
		setHeight("100%");

		try
		{
			File userSettingsFile = new File(settingsFileName);
			DefaultMavenSettingsBuilder settingsBuilder = new DefaultMavenSettingsBuilder();
			org.apache.maven.settings.Settings settings = settingsBuilder.buildSettings(userSettingsFile);

			addTab(new Properties(settings), "Properties");
			addTab(new Servers(settings), "Servers");
			addTab(new Mirrors(settings), "Mirrros");
			addTab(new PluginGroups(settings), "Plugin Groups");
			addTab(new Profiles(settings), "Profiles");

		} catch (IOException | XmlPullParserException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}