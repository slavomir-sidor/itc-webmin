package sk.itcloud.maven.repository;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;

public class LocalRepositoryView extends VerticalLayout implements View
{

	public static final String VIEW_NAME = "Repositories";

	public LocalRepositoryView()
	{
		super();
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}
