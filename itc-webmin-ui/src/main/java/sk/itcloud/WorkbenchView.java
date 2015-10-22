package sk.itcloud;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class WorkbenchView extends VerticalLayout implements View
{
	public static final String VIEW_NAME = "Workbench";


	public WorkbenchView()
	{
		super();

		setSizeFull();

		setWidth("100%");
		setHeight("100%");
		addComponent(new Label("Ahoj"));
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}