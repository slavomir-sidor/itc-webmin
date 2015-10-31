package sk.itcloud.repository;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TabSheet;

public class RepositoryView extends TabSheet implements View
{

	public static final String VIEW_NAME = "Repository";

	public RepositoryView()
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