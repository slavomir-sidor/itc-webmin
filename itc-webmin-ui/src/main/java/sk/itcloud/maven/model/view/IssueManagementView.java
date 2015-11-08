package sk.itcloud.maven.model.view;

import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.HorizontalLayout;
import sk.itcloud.AutoForm;
import sk.itcloud.maven.model.form.IssueManagement;

public class IssueManagementView extends HorizontalLayout implements View
{
	public static final String VIEW_NAME = "Issue Management";

	public IssueManagementView(Model model)
	{
		super();

		HorizontalLayout issueManagementPanel = new HorizontalLayout();
		AutoForm issueManagementView = new AutoForm();
		issueManagementView.setFormData(new IssueManagement());

		addComponent(issueManagementPanel);
		addComponent(issueManagementView);

		setExpandRatio(issueManagementPanel, 8);
		setExpandRatio(issueManagementView, 2);
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}