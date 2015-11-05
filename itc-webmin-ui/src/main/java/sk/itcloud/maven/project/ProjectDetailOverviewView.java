package sk.itcloud.maven.project;

import org.apache.maven.model.Model;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

public class ProjectDetailOverviewView extends HorizontalLayout
{

	public ProjectDetailOverviewView(Model model)
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		ModelFieldsetView artifactView = new ModelFieldsetView("Artifact");
		ModelFieldsetView parentView = new ModelFieldsetView("Parent");
		ModelFieldsetView propertiesView = new ModelFieldsetView("Properties");
		ModelFieldsetView modulesView = new ModelFieldsetView("Modules");
		ModelFieldsetView projectView = new ModelFieldsetView("Project");
		ModelFieldsetView organizationView = new ModelFieldsetView("Organization");
		ModelFieldsetView scmView = new ModelFieldsetView("SCM");
		ModelFieldsetView issueManagementView = new ModelFieldsetView("Issue Management");
		ModelFieldsetView continuosIntegrationView = new ModelFieldsetView("Continuos Integration");

		VerticalLayout left = new VerticalLayout();
		left.addComponent(artifactView);
		left.addComponent(parentView);
		left.addComponent(propertiesView);
		left.addComponent(modulesView);

		VerticalLayout right = new VerticalLayout();
		right.addComponent(projectView);
		right.addComponent(modulesView);
		right.addComponent(organizationView);
		right.addComponent(scmView);
		right.addComponent(issueManagementView);
		right.addComponent(continuosIntegrationView);

		addComponent(left);
		addComponent(right);

	}
}
