package sk.itcloud.maven.project;

import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

import sk.itcloud.AutoForm;
import sk.itcloud.GridLayoutView;
import sk.itcloud.HorizontalTabView;
import sk.itcloud.maven.model.form.Dependency;
import sk.itcloud.maven.model.form.IssueManagement;
import sk.itcloud.maven.model.form.Scm;

public class IssueManagementView extends HorizontalLayout implements View
{
	public static final String VIEW_NAME = "Issue Management";

	public IssueManagementView(Model model)
	{
		super();

		Panel issueManagementPanel = new Panel();

		AutoForm issueManagementView = new AutoForm();
		issueManagementView.setFormData(new IssueManagement());

		addComponent(issueManagementPanel);
		addComponent(issueManagementView);

		setExpandRatio(issueManagementPanel, 8);
		setExpandRatio(issueManagementView, 2);
	}

	public IssueManagementView(Component... children)
	{
		super(children);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}