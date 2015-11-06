package sk.itcloud.maven.project;

import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

import sk.itcloud.AutoForm;
import sk.itcloud.maven.model.form.Build;
import sk.itcloud.maven.model.form.Dependency;

public class ProjectBuildSettingsView extends VerticalLayout implements View
{

	public static final String VIEW_NAME = "Settings";

	public ProjectBuildSettingsView(Model model)
	{
		super();

		HorizontalLayout buildPanel = new HorizontalLayout();
		buildPanel.setSizeFull();

		AutoForm form = new AutoForm();
		form.setFormData(new Build());

		addComponent(buildPanel);
		addComponent(form);

		setExpandRatio(buildPanel, 5);
		setExpandRatio(form, 5);
	}

	public ProjectBuildSettingsView(Component... children)
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