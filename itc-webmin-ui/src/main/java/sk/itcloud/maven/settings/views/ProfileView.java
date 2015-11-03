package sk.itcloud.maven.settings.views;

import org.apache.maven.settings.Profile;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

import sk.itcloud.ErrorView;

public class ProfileView extends HorizontalLayout
{

	public ProfileView(Profile profile)
	{
		setWidth("100%");
		setHeight("100%");
		setSizeFull();
		setDescription("Profile");
		setSizeFull();

		CssLayout viewContainer = new CssLayout();
		viewContainer.addStyleName("valo-content");
		viewContainer.setSizeFull();

		final Navigator navigator = new Navigator(UI.getCurrent(), viewContainer);
		navigator.setErrorView(ErrorView.class);
		navigator.addViewChangeListener(viewChangeListener);

		SettingsMenu menu = new SettingsMenu(navigator);

		menu.addView(new ProfileMainView(profile), ProfileMainView.VIEW_NAME, ProfileMainView.VIEW_NAME);
		menu.addView(new ActivationView(profile.getActivation()), ActivationView.VIEW_NAME, ActivationView.VIEW_NAME);
		menu.addView(new PropertiesView(profile.getProperties()), PropertiesView.VIEW_NAME, PropertiesView.VIEW_NAME);
		menu.addView(new PluginRepositoriesView(profile.getPluginRepositories()), PluginRepositoriesView.VIEW_NAME, PluginRepositoriesView.VIEW_NAME);
		menu.addView(new RepositoriesView(profile.getRepositories()), RepositoriesView.VIEW_NAME, RepositoriesView.VIEW_NAME);

		addComponent(menu);
		addComponent(viewContainer);

		setExpandRatio(viewContainer, 8);
		setExpandRatio(viewContainer, 2);
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
