package sk.itcloud.maven.project;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Tree;
import com.vaadin.ui.VerticalLayout;

import eu.livotov.labs.vaadin.autoforms.AutoForm;
import sk.itcloud.maven.model.form.Dependency;

public class DependencyView extends VerticalLayout implements View
{

	public static final String VIEW_NAME = "Dependency";

	HorizontalSplitPanel panel;
	AutoForm form;

	public DependencyView()
	{
		super();
		panel = new HorizontalSplitPanel();
		panel.setSizeFull();
		panel.addComponent(new Tree("Dependency"));
		panel.addComponent(new Tree("Dependency Management"));

		form = new AutoForm();
		form.setFormData(new Dependency());

		addComponent(panel);
		addComponent(form);

		setExpandRatio(panel, 6);
		setExpandRatio(form, 4);
	}

	public DependencyView(Component... children)
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
