package sk.itcloud.processes;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TabSheet;

public class ProcessesView extends TabSheet implements View
{

	public static final String VIEW_NAME = "Processes";

	public ProcessesView()
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