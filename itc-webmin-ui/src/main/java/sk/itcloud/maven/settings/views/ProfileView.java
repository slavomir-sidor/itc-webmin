package sk.itcloud.maven.settings.views;

import org.apache.maven.settings.Profile;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

public class ProfileView extends GridLayout
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
		super(2, 2);

		setWidth("100%");
		setHeight("100%");
		setSizeFull();

		setBean(bean);
		setDescription("Profile");
		setCaption(bean.getId());
		setImmediate(true);

		// beanFieldGroup = new BeanFieldGroup<Profile>(Profile.class);
		// beanFieldGroup.bindMemberFields(this);
		// beanFieldGroup.setItemDataSource(beam);

		repositories = new RepositoriesView(bean.getRepositories());
		pluginRepositories = new PluginRepositoriesView(bean.getPluginRepositories());

		addComponent(repositories);
		addComponent(pluginRepositories);
		// addComponent(properties);

		// addComponent(pluginRepositories);
		// addComponent(pluginGroups);
	}
}
