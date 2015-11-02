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

public class ProfileView extends VerticalLayout
{

	protected Profile bean;

	/**
	 * @return the bean
	 */
	public Profile getBean()
	{
		return bean;
	}

	/**
	 * @param bean
	 *            the bean to set
	 */
	public void setBean(Profile bean)
	{
		this.bean = bean;
	}

	protected BeanFieldGroup<Profile> beanFieldGroup;

	protected PropertiesView properties;

	protected RepositoriesView repositories;

	protected PluginRepositoriesView pluginRepositories;

	public ProfileView(Profile bean)
	{
		setWidth("100%");
		setHeight("100%");
		setSizeFull();

		setBean(bean);
		setDescription("Profile");
		setSizeFull();
		CssLayout viewContainer = new CssLayout();
		viewContainer.addStyleName("valo-content");
		viewContainer.setSizeFull();

		final Navigator navigator = new Navigator(UI.getCurrent(), viewContainer);
		navigator.setErrorView(ErrorView.class);
		navigator.addViewChangeListener(viewChangeListener);

		SettingsMenu menu = new SettingsMenu(navigator);

		menu.addView(new PropertiesView(bean.getProperties()), PropertiesView.VIEW_NAME, PropertiesView.VIEW_NAME);
		menu.addView(new PluginRepositoriesView(bean.getPluginRepositories()), PluginRepositoriesView.VIEW_NAME,
				PluginRepositoriesView.VIEW_NAME);
		menu.addView(new RepositoriesView(bean.getRepositories()), RepositoriesView.VIEW_NAME,
				RepositoriesView.VIEW_NAME);

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
