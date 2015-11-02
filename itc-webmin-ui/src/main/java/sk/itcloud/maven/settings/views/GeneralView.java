package sk.itcloud.maven.settings.views;

import org.apache.maven.settings.Settings;
import com.vaadin.ui.VerticalLayout;

public class GeneralView extends VerticalLayout
{

	public GeneralView(Settings settings)
	{
		
		addComponent(new ServersViews(settings.getServers()));
		addComponent(new MirrorsView(settings.getMirrors()));
		addComponent(new ProfilesView(settings.getProfiles()));
		addComponent(new PluginGroupsView(settings.getPluginGroups()));
		addComponent(new ProxiesView(settings.getProxies()));

	}

}
