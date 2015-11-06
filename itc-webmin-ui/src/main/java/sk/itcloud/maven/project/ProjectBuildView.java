package sk.itcloud.maven.project;

import java.util.List;

import org.apache.maven.model.Build;
import org.apache.maven.model.Extension;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.Resource;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalLayout;

import eu.livotov.labs.vaadin.autoforms.AutoForm;
import sk.itcloud.HorizontalTabView;
import sk.itcloud.maven.model.form.Dependency;

public class ProjectBuildView extends HorizontalTabView
{

	public ProjectBuildView(Model model)
	{
		super();
		Build build = model.getBuild();

		List<Plugin> plugins = build.getPlugins();
		List<Extension> extentions = build.getExtensions();
		List<Resource> resources = build.getResources();

		getMenu().addView(new ProjectBuildSettingsView(model), "Build", "Build");
		getMenu().addView(new ProjectBuildPluginsView(model), "Plugins", "Plugins");
		getMenu().addView(new ProjectBuildExtentionsView(model), "Extentions", "Extentions");

	}

	public ProjectBuildView(Component... children)
	{
		super(children);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub
	}
}