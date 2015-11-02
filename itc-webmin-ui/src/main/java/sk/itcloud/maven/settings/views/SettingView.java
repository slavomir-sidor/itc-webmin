
package sk.itcloud.maven.settings.views;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.maven.settings.DefaultMavenSettingsBuilder;
import org.apache.maven.settings.Profile;
import org.apache.maven.settings.Settings;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import com.vaadin.ui.TabSheet;

import sk.itcloud.maven.SettingsAPI;

public class SettingView extends TabSheet
{
	protected String fileName;
	protected SettingsAPI api;

	public SettingView(String fileName)
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		api = new SettingsAPI(fileName);
		List<Profile> items = api.getSettings().getProfiles();

		for (int i = 0; i < items.size(); i++)
		{
			addTab(new ProfileView(items.get(i)), items.get(i).getId());
		}
	}
}