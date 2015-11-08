package sk.itcloud.maven.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.maven.model.Model;
import org.apache.maven.model.building.DefaultModelBuilder;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.model.merge.MavenModelMerger;
import org.apache.maven.project.DefaultMavenProjectBuilder;
import org.apache.maven.project.DefaultProjectBuilderConfiguration;
import org.apache.maven.project.MavenProject;
import org.apache.maven.project.ProjectBuilderConfiguration;
import org.apache.maven.project.ProjectBuildingException;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;

import sk.itcloud.maven.MavenAPI;
import sk.itcloud.maven.model.view.ArchetypeView;
import sk.itcloud.maven.model.view.BuildView;
import sk.itcloud.maven.model.view.DetailOverviewView;
import sk.itcloud.maven.model.view.DocumentsView;
import sk.itcloud.maven.model.view.ProcessesView;
import sk.itcloud.maven.model.view.RepositoriesView;
import sk.itcloud.maven.model.view.TasksView;
import sk.itcloud.maven.model.view.TeamView;

public class DetailView extends TabSheet
{

	public DetailView()
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		MavenAPI api = new MavenAPI("/var/www/jahman/domains/itc-webmin.jahman/pom.xml");
		MavenProject project = api.getProject();

		addTab(new ArchetypeView()).setCaption("Archetype");
		addTab(new DetailOverviewView(project.getModel())).setCaption("Artifact");
		addTab(new RepositoriesView(project.getModel())).setCaption("Repositories");
		addTab(new BuildView(project.getModel())).setCaption("Build");
		addTab(new TeamView(project.getModel())).setCaption("Team");
		addTab(new ProcessesView(project.getModel())).setCaption("Processes");
		addTab(new TasksView(project.getModel())).setCaption("Tasks");
		addTab(new DocumentsView(project.getModel())).setCaption("Documents");
	}
}