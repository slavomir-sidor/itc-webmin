package sk.itcloud.maven.settings.views;

import org.apache.maven.settings.Profile;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;

public class ProfileView extends FormLayout
{

	protected Profile profile;

	protected BeanFieldGroup<Profile> beanFieldGroup;

	PropertiesView properties;

	RepositoriesView repositories;

	PluginRepositoriesView pluginRepositories;

	Label sourceLevel;

	Label id;

	public ProfileView(Profile profile)
	{
		super();

		setWidth("100%");
		setHeight("100%");
		setSizeFull();

		// properties = new PropertiesView(profile.getProperties());
		// repositories = new RepositoriesView(profile.getRepositories());
		// pluginRepositories = new PluginRepositoriesView(profile.getPluginRepositories());
		// sourceLevel = new Label(profile.getSourceLevel());

		setDescription("Profile");
		setCaption(profile.getId());
		setImmediate(true);

		beanFieldGroup = new BeanFieldGroup<Profile>(Profile.class);
		beanFieldGroup.bindMemberFields(this);

		// addComponent(sourceLevel);
		// addComponent(properties);
		// addComponent(repositories);
		// addComponent(pluginRepositories);
		// addComponent(pluginGroups);
	}
}
