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
import sk.itcloud.Menu;

public class GeneralView extends HorizontalLayout
{

	public GeneralView(Settings settings)
	{
		setSizeFull();
		CssLayout viewContainer = new CssLayout();
		viewContainer.addStyleName("valo-content");
		viewContainer.setSizeFull();

		final Navigator navigator = new Navigator(UI.getCurrent(), viewContainer);
		navigator.setErrorView(ErrorView.class);
		navigator.addViewChangeListener(viewChangeListener);

		SettingsMenu menu = new SettingsMenu(navigator);
		menu.addView(new MainView(settings), MainView.VIEW_NAME, MainView.VIEW_NAME);
		menu.addView(new ProfilesView(settings.getProfiles()), ProfilesView.VIEW_NAME, ProfilesView.VIEW_NAME);
		menu.addView(new ServersViews(settings.getServers()), ServersViews.VIEW_NAME, ServersViews.VIEW_NAME);
		menu.addView(new MirrorsView(settings.getMirrors()), MirrorsView.VIEW_NAME, MirrorsView.VIEW_NAME);
		menu.addView(new PluginGroupsView(settings.getPluginGroups()), PluginGroupsView.VIEW_NAME,
				PluginGroupsView.VIEW_NAME);
		menu.addView(new ProxiesView(settings.getProxies()), ProxiesView.VIEW_NAME, ProxiesView.VIEW_NAME);

		addComponent(menu);
		addComponent(viewContainer);
		setExpandRatio(viewContainer, 9);

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