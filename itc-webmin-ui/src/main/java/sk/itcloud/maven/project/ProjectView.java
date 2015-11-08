package sk.itcloud.maven.project;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TabSheet;

import sk.itcloud.maven.model.view.DetailView;

public class ProjectView extends TabSheet implements View
{
	private static final long serialVersionUID = -6876498248543507519L;

	public static final String VIEW_NAME = "Projects";

	public ProjectView()
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		addTab(new ProjectsView()).setCaption("Projects");
		addTab(new DetailView()).setCaption("New");
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}