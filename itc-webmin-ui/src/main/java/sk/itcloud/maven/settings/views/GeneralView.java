package sk.itcloud.maven.settings.views;

import org.apache.maven.settings.Settings;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

import sk.itcloud.ErrorView;
import sk.itcloud.HorizontalTabView;
import sk.itcloud.Menu;

public class GeneralView extends HorizontalTabView
{

	public GeneralView(Settings settings)
	{
		super();
		getMenu().addView(new MainView(settings), MainView.VIEW_NAME, MainView.VIEW_NAME);
		getMenu().addView(new ProfilesView(settings.getProfiles()), ProfilesView.VIEW_NAME, ProfilesView.VIEW_NAME);
		getMenu().addView(new ServersViews(settings.getServers()), ServersViews.VIEW_NAME, ServersViews.VIEW_NAME);
		getMenu().addView(new MirrorsView(settings.getMirrors()), MirrorsView.VIEW_NAME, MirrorsView.VIEW_NAME);
		getMenu().addView(new PluginGroupsView(settings.getPluginGroups()), PluginGroupsView.VIEW_NAME, PluginGroupsView.VIEW_NAME);
		getMenu().addView(new ProxiesView(settings.getProxies()), ProxiesView.VIEW_NAME, ProxiesView.VIEW_NAME);
	}

	ViewChangeListener viewChangeListener = new ViewChangeListener()
	{

		@Override
		public boolean beforeViewChange(ViewChangeEvent event)
		{
			return true;
		}

		@Override
		public void afterViewChange(ViewChangeEvent event)
		{
			// menu.setActiveView(event.getViewName());
		}

	};
}