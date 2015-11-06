package sk.itcloud.maven.project;

import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalLayout;

import sk.itcloud.AutoForm;
import sk.itcloud.GridLayoutView;
import sk.itcloud.HorizontalTabView;
import sk.itcloud.maven.model.form.Dependency;
import sk.itcloud.maven.model.form.IssueManagement;
import sk.itcloud.maven.model.form.Scm;

public class TasksView extends HorizontalTabView implements View
{
	public static final String VIEW_NAME = "Tasks";

	public TasksView(Model model)
	{
		super();
		getMenu().addView(new IssueManagementView(), "Issue Management", "Issue Management");

	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}