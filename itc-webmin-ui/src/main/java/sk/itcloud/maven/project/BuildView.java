package sk.itcloud.maven.project;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalLayout;

import eu.livotov.labs.vaadin.autoforms.AutoForm;
import sk.itcloud.maven.model.form.Dependency;

public class BuildView extends VerticalLayout implements View
{

	public static final String VIEW_NAME = "Build";

	HorizontalSplitPanel panel;
	AutoForm form;

	public BuildView()
	{
		super();
	}

	public BuildView(Component... children)
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
