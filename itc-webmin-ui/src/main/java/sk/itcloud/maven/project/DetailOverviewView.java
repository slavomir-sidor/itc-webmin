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

public class DetailOverviewView extends HorizontalTabView
{

	public DetailOverviewView(Model model)
	{
		super();

		getMenu().addView(new ArtifactView(model), "Artifact", "Artifact");
		getMenu().addView(new ModuleView(model), "Modules", "Modules");
		getMenu().addView(new DependencyView(model), "Dependency", "Dependency");
		getMenu().addView(new PropertiesView(model), "Properties", "Properties");
		getMenu().addView(new ProfilesView(model), "Profiles", "Profiles");
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
