package sk.itcloud.maven.project;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TabSheet;

public class ProjectView extends TabSheet implements View
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6876498248543507519L;

	public static final String VIEW_NAME = "Projects";
	protected ProjectsView treeTable;
	protected DetailView newProject;

	public ProjectView()
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		treeTable = new ProjectsView();
		newProject = new DetailView();

		addTab(treeTable).setCaption("Projects");
		addTab(newProject).setCaption("New");
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}