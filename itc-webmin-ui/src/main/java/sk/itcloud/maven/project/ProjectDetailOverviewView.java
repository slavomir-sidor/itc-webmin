package sk.itcloud.maven.project;

import org.apache.maven.model.Developer;
import org.apache.maven.model.DistributionManagement;
import org.apache.maven.model.Model;
import org.apache.maven.settings.Mirror;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import sk.itcloud.AutoForm;
import sk.itcloud.ErrorView;
import sk.itcloud.GridLayoutView;
import sk.itcloud.GridMasterVertical;
import sk.itcloud.TableView;
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

		AutoForm modelView = new AutoForm();
		modelView.setFormData(new sk.itcloud.maven.model.form.Model());

		AutoForm artifactView = new AutoForm();
		artifactView.setFormData(new Artifact());

		AutoForm parentView = new AutoForm();
		parentView.setFormData(new Parent());

		AutoForm infoView = new AutoForm();
		infoView.setFormData(new Info());

		TableView propertiesView = new TableView();

		propertiesView.addContainerProperty("Property", String.class, null);
		propertiesView.addContainerProperty("Value", String.class, null);
		propertiesView.setSizeFull();

		ProjectModuleView modulesView = new ProjectModuleView(model.getModules());
		modulesView.setSizeFull();

		GridMasterVertical developersView = new GridMasterVertical();
		developersView.setSizeFull();
		developersView.getTable().setContainerDataSource(new BeanItemContainer<Developer>(Developer.class, model.getDevelopers()));

		AutoForm organizationView = new AutoForm();
		organizationView.setFormData(new Organization());

		AutoForm scmView = new AutoForm();
		scmView.setFormData(new Scm());

		GridLayoutView scmGridView = new GridLayoutView("");
		scmGridView.addComponent(scmView);

		AutoForm issueManagementView = new AutoForm();
		issueManagementView.setFormData(new IssueManagement());

		AutoForm ciView = new AutoForm();
		ciView.setFormData(new CiManagement());

		AutoForm distributionManagementView = new AutoForm();
		// distributionManagementView.setFormData(new DistributionManagement());

		DependencyView dependencyView = new DependencyView();
		ProfilesView profilesView = new ProfilesView();
		BuildView buildView = new BuildView();
		LicencesView licencesView = new LicencesView();
		RepositoriesView repositoriesView = new RepositoriesView();
		MailingListView mailingListView = new MailingListView();

		GridLayoutView mainView = new GridLayoutView(2, 2);
		mainView.addComponent(artifactView, 0, 0);
		mainView.addComponent(infoView, 1, 0);
		mainView.addComponent(parentView, 0, 1);
		mainView.addComponent(organizationView);
		mainView.setSizeFull();
		mainView.setMargin(true);
		mainView.setSpacing(true);

		Menu menu = new Menu(navigator);
		menu.addView(mainView, "Artifact", "Artifact");
		menu.addView(modulesView, "Modules", "Modules");
		menu.addView(dependencyView, "Dependency", "Dependency");
		menu.addView(developersView, "Team", "Team");
		menu.addView(propertiesView, "Properties", "Properties");
		
		menu.addView(scmGridView, "Source Control Management", "Source Control");
		menu.addView(issueManagementView, "Issue Management", "Issue Management");
		menu.addView(distributionManagementView, "Distribution", "Distribution");
		menu.addView(ciView, "Continuous Integration", "Continuous Integration");
		menu.addView(repositoriesView, "Repositories", "Repositories");
		menu.addView(licencesView, "Licences", "Licences");
		menu.addView(profilesView, "Profiles", "Profiles");
		menu.addView(buildView, "Build", "Build");
		

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
