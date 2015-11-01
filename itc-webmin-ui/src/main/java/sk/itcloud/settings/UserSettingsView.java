package sk.itcloud.settings;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.maven.settings.DefaultMavenSettingsBuilder;
import org.apache.maven.settings.Profile;
import org.apache.maven.settings.RuntimeInfo;
import org.apache.maven.settings.Settings;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TabSheet;

public class UserSettingsView extends TabSheet implements View
{

	public static final String VIEW_NAME = "Settings";
	String userSettingsFileName = "/var/www/jahman/.m2/settings.xml";
	
	public UserSettingsView()
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");
		
		File userSettingsFile = new File(userSettingsFileName);
		DefaultMavenSettingsBuilder settingsBuilder = new DefaultMavenSettingsBuilder();
		try
		{
			Settings settings = settingsBuilder.buildSettings(userSettingsFile);

			RuntimeInfo runtimeInfo = settings.getRuntimeInfo();
			
			
			List<Profile> profiles = settings.getProfiles();
			
			for (int i = 0; i < profiles.size(); i++)
			{
				Profile profile=profiles.get(i);
				FormLayout profileLayout=new FormLayout();
				profileLayout.addComponent(new CheckBox());
				addTab(profileLayout).setCaption(profile.getId());
			}

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