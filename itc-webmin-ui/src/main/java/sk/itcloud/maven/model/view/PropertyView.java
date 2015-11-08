package sk.itcloud.maven.model.view;

import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalLayout;

import eu.livotov.labs.vaadin.autoforms.AutoForm;
import sk.itcloud.GridMasterVertical;
import sk.itcloud.maven.model.form.CiManagement;
import sk.itcloud.maven.model.form.Dependency;

public class PropertyView extends GridMasterVertical implements View
{
	public static final String VIEW_NAME = "Properties";

	public PropertyView(Model model)
	{
		super();
		setSizeFull();

		getTable().addContainerProperty("Property", String.class, null);
		getTable().addContainerProperty("Value", String.class, null);

	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}