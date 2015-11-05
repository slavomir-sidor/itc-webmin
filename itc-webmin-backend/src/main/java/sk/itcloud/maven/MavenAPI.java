package sk.itcloud.maven;

import java.io.File;
import java.io.FileReader;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.project.DefaultMavenProjectBuilder;
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.DefaultMavenSettingsBuilder;

public class MavenAPI
{

	protected Model model = null;

	protected MavenProject project = null;

	protected FileReader reader = null;

	protected MavenXpp3Reader mavenreader;

	protected String pomfile = "/var/www/jahman/domains/itc-webmin.jahman/pom.xml";

	protected String globalSettingsFileName = "/usr/share/maven/conf/settings.xml";

	protected String userSettingsFileName = "~/.m2/settings.xml";

	protected File userSettingsFile;

	protected DefaultMavenSettingsBuilder settingsBuilder;

	protected DefaultMavenProjectBuilder defaultMavenProjectBuilder;

	/**
	 * @return the globalSettingsFileName
	 */
	public String getGlobalSettingsFileName()
	{
		return globalSettingsFileName;
	}

	/**
	 * @param globalSettingsFileName
	 *            the globalSettingsFileName to set
	 */
	public void setGlobalSettingsFileName(String globalSettingsFileName)
	{
		this.globalSettingsFileName = globalSettingsFileName;
	}

	/**
	 * @return the userSettingsFileName
	 */
	public String getUserSettingsFileName()
	{
		return userSettingsFileName;
	}

	/**
	 * @param userSettingsFileName
	 *            the userSettingsFileName to set
	 */
	public void setUserSettingsFileName(String userSettingsFileName)
	{
		this.userSettingsFileName = userSettingsFileName;
	}

	/**
	 * @return the userSettingsFile
	 */
	public File getUserSettingsFile()
	{
		return userSettingsFile;
	}

	/**
	 * @param userSettingsFile
	 *            the userSettingsFile to set
	 */
	public void setUserSettingsFile(File userSettingsFile)
	{
		this.userSettingsFile = userSettingsFile;
	}

	/**
	 * @return the settingsBuilder
	 */
	public DefaultMavenSettingsBuilder getSettingsBuilder()
	{
		return settingsBuilder;
	}

	/**
	 * @param settingsBuilder
	 *            the settingsBuilder to set
	 */
	public void setSettingsBuilder(DefaultMavenSettingsBuilder settingsBuilder)
	{
		this.settingsBuilder = settingsBuilder;
	}

	/**
	 * @return the reader
	 */
	public FileReader getReader()
	{
		return reader;
	}

	/**
	 * @param reader
	 *            the reader to set
	 */
	public void setReader(FileReader reader)
	{
		this.reader = reader;
	}

	/**
	 * @return the mavenreader
	 */
	public MavenXpp3Reader getMavenreader()
	{
		return mavenreader;
	}

	/**
	 * @param mavenreader
	 *            the mavenreader to set
	 */
	public void setMavenreader(MavenXpp3Reader mavenreader)
	{
		this.mavenreader = mavenreader;
	}

	/**
	 * @return the model
	 */
	public Model getModel()
	{

		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(Model model)
	{
		this.model = model;
	}

	/**
	 * @return the project
	 */
	public MavenProject getProject()
	{
		return project;
	}

	/**
	 * @param project
	 *            the project to set
	 */
	public void setProject(MavenProject project)
	{
		this.project = project;
	}

	/**
	 * @return the pomfile
	 */
	public String getPomfile()
	{
		return pomfile;
	}

	/**
	 * @param pomfile
	 *            the pomfile to set
	 */
	public void setPomfile(String pomfile)
	{
		this.pomfile = pomfile;
	}

	/**
	 * @return the defaultMavenProjectBuilder
	 */
	public DefaultMavenProjectBuilder getDefaultMavenProjectBuilder()
	{
		if (defaultMavenProjectBuilder == null)
		{
			setDefaultMavenProjectBuilder( new DefaultMavenProjectBuilder());
		}
		return defaultMavenProjectBuilder;
	}

	/**
	 * @param defaultProjectBuilder
	 *            the defaultProjectBuilder to set
	 */
	public void setDefaultMavenProjectBuilder(DefaultMavenProjectBuilder defaultMavenProjectBuilder)
	{
		this.defaultMavenProjectBuilder = defaultMavenProjectBuilder;
	}
}