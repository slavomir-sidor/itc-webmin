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
import sk.itcloud.HorizontalTabView;
import sk.itcloud.Menu;

public class ProfileView extends HorizontalTabView
{

	public ProfileView(Profile profile)
	{
		super();
		setWidth("100%");
		setHeight("100%");
		setSizeFull();
		setDescription("Profile");
		setSizeFull();

		getMenu().addView(new ActivationView(profile.getActivation()), ActivationView.VIEW_NAME, ActivationView.VIEW_NAME);
		getMenu().addView(new PropertiesView(profile.getProperties()), PropertiesView.VIEW_NAME, PropertiesView.VIEW_NAME);
		getMenu().addView(new PluginRepositoriesView(profile.getPluginRepositories()), PluginRepositoriesView.VIEW_NAME,PluginRepositoriesView.VIEW_NAME);
		getMenu().addView(new RepositoriesView(profile.getRepositories()), RepositoriesView.VIEW_NAME, RepositoriesView.VIEW_NAME);
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
