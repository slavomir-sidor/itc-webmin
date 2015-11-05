package sk.itcloud.maven.project;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;

public class ProjectMainView extends GridLayout implements View
{
	public static final String VIEW_NAME = "Projects";

	@Override
	public void enter(ViewChangeEvent event)
	{
	}

	public ProjectMainView()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectMainView(int columns, int rows, Component... children)
	{
		super(columns, rows, children);
		// TODO Auto-generated constructor stub
	}

	public ProjectMainView(int columns, int rows)
	{
		super(columns, rows);
		// TODO Auto-generated constructor stub
	}
}