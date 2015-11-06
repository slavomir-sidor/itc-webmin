package sk.itcloud.maven.project;

import org.apache.maven.model.Build;
import org.apache.maven.model.Model;

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
		Build build=model.getBuild();
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