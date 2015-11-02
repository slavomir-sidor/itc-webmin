package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Mirror;
import org.apache.maven.settings.Profile;
import org.apache.maven.settings.Repository;
import org.apache.maven.settings.Server;
import org.apache.maven.settings.Settings;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;

public class PluginRepositoriesView extends Table
{

	BeanItemContainer<Repository> container;

	public PluginRepositoriesView(List<Repository> repositories)
	{
		super("Plugin Repositories", new BeanItemContainer<Repository>(Repository.class, repositories));
	}
}