package sk.itcloud.dashboard;


import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class DashboardView extends VerticalLayout implements View
{
	public static final String VIEW_NAME = "Dahsboard";

	public DashboardView()
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}