package sk.itcloud.repository;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

import sk.itcloud.project.ProjectITCTabSheet;
import sk.itcloud.project.ProjectTabSheet;

public class RepositoryView extends VerticalLayout implements View
{

	public static final String VIEW_NAME = "Repositories";

	public RepositoryView()
	{

		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		RepositoryTabSheet projectTabSheet = new RepositoryTabSheet();
		RepositoryITCTabSheet projectITCTabSheet = new RepositoryITCTabSheet();

		addComponent(projectTabSheet);
		addComponent(projectITCTabSheet);

		setExpandRatio(projectTabSheet, 6);
		setExpandRatio(projectITCTabSheet, 4);

	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}