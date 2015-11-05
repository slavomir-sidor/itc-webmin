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

public class ProjectDetailView extends TabSheet
{

	public ProjectDetailView()
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		MavenAPI api = new MavenAPI();

		File file = new File("/var/www/jahman/domains/itc-webmin.jahman/pom.xml");
		DefaultModelBuilder modelBuilder = new DefaultModelBuilder();
		ProjectBuilderConfiguration config = new DefaultProjectBuilderConfiguration();
		DefaultMavenProjectBuilder builder = api.getDefaultMavenProjectBuilder();
		MavenXpp3Reader mavenreader = new MavenXpp3Reader();
		FileReader reader;

		try
		{
			reader = new FileReader(file);

			try
			{

				Model model = mavenreader.read(reader);
				addTab(new ProjectDetailOverviewView(model)).setCaption("Overview");
				addTab(new Label("Overview")).setCaption("CI");
				addTab(new Label("Overview")).setCaption("Issue Management");
				addTab(new Label("Overview")).setCaption("Source Repository");
				addTab(new Label("Overview")).setCaption("Artifacts");
				addTab(new Label("Overview")).setCaption("Reports");

			} catch (IOException | XmlPullParserException e)
			{
				e.printStackTrace();
			}

		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}