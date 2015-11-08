package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Mirror;
import org.apache.maven.settings.Profile;
import org.apache.maven.settings.Repository;
import org.apache.maven.settings.Server;
import org.apache.maven.settings.Settings;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;

import sk.itcloud.GridMasterVertical;

public class PluginRepositoriesView extends GridMasterVertical implements View
{

	public static final String VIEW_NAME = "Plugin Repositories";

	public PluginRepositoriesView(List<Repository> pluginGroups)
	{
		super();

		getTable().setContainerDataSource(new BeanItemContainer<Repository>(Repository.class, pluginGroups));
		getForms().get(0).setFormData(new sk.itcloud.maven.model.form.Repository());
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}