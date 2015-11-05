package sk.itcloud.maven.project;

import org.apache.maven.model.Model;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import sk.itcloud.AutoForm;
import sk.itcloud.ErrorView;
import sk.itcloud.maven.model.form.Artifact;
import sk.itcloud.maven.model.form.CiManagement;
import sk.itcloud.maven.model.form.Info;
import sk.itcloud.maven.model.form.IssueManagement;
import sk.itcloud.maven.model.form.Organization;
import sk.itcloud.maven.model.form.Parent;
import sk.itcloud.maven.model.form.Scm;

public class ProjectDetailOverviewView extends HorizontalLayout
{

	public ProjectDetailOverviewView(Model model)
	{
		super();
		setSizeFull();

		CssLayout viewContainer = new CssLayout();
		viewContainer.addStyleName("valo-content");
		viewContainer.setSizeFull();

		final Navigator navigator = new Navigator(UI.getCurrent(), viewContainer);
		navigator.setErrorView(ErrorView.class);
		navigator.addViewChangeListener(viewChangeListener);

		AutoForm artifactView = new AutoForm();
		artifactView.setFormData(new Artifact());

		AutoForm parentView = new AutoForm();
		parentView.setFormData(new Parent());

		AutoForm infoView = new AutoForm();
		infoView.setFormData(new Info());

		ProjectMainView modelView = new ProjectMainView();
		modelView.addComponent(artifactView);
		modelView.addComponent(parentView);
		modelView.addComponent(infoView);

		AutoForm propertiesView = new AutoForm();
		AutoForm modulesView = new AutoForm();

		AutoForm organizationView = new AutoForm();
		organizationView.setFormData(new Organization());

		AutoForm scmView = new AutoForm();
		scmView.setFormData(new Scm());

		AutoForm issueManagementView = new AutoForm();
		issueManagementView.setFormData(new IssueManagement());

		AutoForm ciView = new AutoForm();
		ciView.setFormData(new CiManagement());

		Menu menu = new Menu(navigator);
		menu.addView(modelView, "Main", "Main");
		menu.addView(modulesView, "Modules", "Modules");
		menu.addView(propertiesView, "Properties", "Properties");
		menu.addView(organizationView, "Organization", "Organization");
		menu.addView(scmView, "SCM", "SCM");
		menu.addView(issueManagementView, "Issue Management", "Issue Management");
		menu.addView(ciView, "CI", "CI");

		addComponent(menu);
		addComponent(viewContainer);

		setExpandRatio(viewContainer, 8);
		setExpandRatio(viewContainer, 2);
	}

	ViewChangeListener viewChangeListener = new ViewChangeListener()
	{

		@Override
		public boolean beforeViewChange(ViewChangeEvent event)
		{
			return true;
		}

		@Override
		public void afterViewChange(ViewChangeEvent event)
		{
			// menu.setActiveView(event.getViewName());
		}

	};

}
