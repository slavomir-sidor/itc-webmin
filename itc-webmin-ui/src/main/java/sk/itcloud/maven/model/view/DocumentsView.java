package sk.itcloud.maven.model.view;

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

public class DocumentsView extends HorizontalTabView
{

	protected AutoForm scmView = new AutoForm();
	protected AutoForm distributionManagementView;

	public DocumentsView(Model model)
	{
		super();
		getMenu().addView(new ReportsView(model.getReporting()), "Reports", "Reports");
		getMenu().addView(new LicencesView(model.getLicenses()), "Licences", "Licences");
	}

	public DocumentsView(Component... children)
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