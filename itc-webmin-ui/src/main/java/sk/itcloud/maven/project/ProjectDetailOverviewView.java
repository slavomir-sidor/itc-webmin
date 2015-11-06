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
import sk.itcloud.HorizontalTabView;
import sk.itcloud.TableView;
import sk.itcloud.maven.model.form.Artifact;
import sk.itcloud.maven.model.form.CiManagement;
import sk.itcloud.maven.model.form.Info;
import sk.itcloud.maven.model.form.IssueManagement;
import sk.itcloud.maven.model.form.Organization;
import sk.itcloud.maven.model.form.Parent;
import sk.itcloud.maven.model.form.Scm;

public class ProjectDetailOverviewView extends HorizontalTabView
{

	public ProjectDetailOverviewView(Model model)
	{
		super();

		TableView propertiesView = new TableView();

		propertiesView.addContainerProperty("Property", String.class, null);
		propertiesView.addContainerProperty("Value", String.class, null);
		propertiesView.setSizeFull();

		AutoForm ciView = new AutoForm();
		ciView.setFormData(new CiManagement());

		getMenu().addView(new ProjectArtifactView(model), "Artifact", "Artifact");
		getMenu().addView(new ProjectModuleView(model), "Modules", "Modules");
		getMenu().addView(new ProjectDependencyView(model), "Dependency", "Dependency");
		getMenu().addView(propertiesView, "Properties", "Properties");
		getMenu().addView(ciView, "Continuous Integration", "Continuous Integration");
		getMenu().addView(new ProjectProfilesView(model), "Profiles", "Profiles");
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
