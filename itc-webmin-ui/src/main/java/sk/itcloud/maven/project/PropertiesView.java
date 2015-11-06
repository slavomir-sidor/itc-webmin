package sk.itcloud.maven.project;

import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalLayout;

import eu.livotov.labs.vaadin.autoforms.AutoForm;
import sk.itcloud.maven.model.form.CiManagement;
import sk.itcloud.maven.model.form.Dependency;

public class PropertiesView extends VerticalLayout implements View
{

	public static final String VIEW_NAME = "Properties";

	public PropertiesView(Model model)
	{
		super();
		setSizeFull();

		HorizontalLayout table = new HorizontalLayout();

		AutoForm ciView = new AutoForm();
		ciView.setFormData(new CiManagement());

	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}