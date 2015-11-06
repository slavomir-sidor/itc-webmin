package sk.itcloud;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class AutoForm extends eu.livotov.labs.vaadin.autoforms.AutoForm implements View
{
	public static final String VIEW_NAME = "";

	public AutoForm()
	{
		super();
		setSizeFull();
		setWidth("100%");
		setHeight("100%");
		setSpacing(true);
		setMargin(true);
	}

	public AutoForm(Object arg0)
	{
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}
