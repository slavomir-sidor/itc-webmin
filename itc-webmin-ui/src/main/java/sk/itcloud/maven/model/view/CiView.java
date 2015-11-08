package sk.itcloud.maven.model.view;

import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import sk.itcloud.AutoForm;
import sk.itcloud.maven.model.form.CiManagement;

public class CiView extends VerticalLayout implements View
{

	public static final String VIEW_NAME = "Continuos Integration";

	public CiView(Model model)
	{
		super();
		setSizeFull();

		HorizontalLayout ciJenkins = new HorizontalLayout();

		AutoForm ciView = new AutoForm();
		ciView.setFormData(new CiManagement());

		addComponent(ciJenkins);
		addComponent(ciView);

		setExpandRatio(ciJenkins, 8);
		setExpandRatio(ciView, 2);

	}

	public CiView(Component... children)
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