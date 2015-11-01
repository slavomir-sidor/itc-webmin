package sk.itcloud.maven;

import java.io.File;
import java.io.FileReader;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
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
	
	

	/**
	 * @return the globalSettingsFileName
	 */
	protected String getGlobalSettingsFileName()
	{
		return globalSettingsFileName;
	}

	/**
	 * @param globalSettingsFileName
	 *            the globalSettingsFileName to set
	 */
	protected void setGlobalSettingsFileName(String globalSettingsFileName)
	{
		this.globalSettingsFileName = globalSettingsFileName;
	}

	/**
	 * @return the userSettingsFileName
	 */
	protected String getUserSettingsFileName()
	{
		return userSettingsFileName;
	}

	/**
	 * @param userSettingsFileName
	 *            the userSettingsFileName to set
	 */
	protected void setUserSettingsFileName(String userSettingsFileName)
	{
		this.userSettingsFileName = userSettingsFileName;
	}

	/**
	 * @return the userSettingsFile
	 */
	protected File getUserSettingsFile()
	{
		return userSettingsFile;
	}

	/**
	 * @param userSettingsFile
	 *            the userSettingsFile to set
	 */
	protected void setUserSettingsFile(File userSettingsFile)
	{
		this.userSettingsFile = userSettingsFile;
	}

	/**
	 * @return the settingsBuilder
	 */
	protected DefaultMavenSettingsBuilder getSettingsBuilder()
	{
		return settingsBuilder;
	}

	/**
	 * @param settingsBuilder
	 *            the settingsBuilder to set
	 */
	protected void setSettingsBuilder(DefaultMavenSettingsBuilder settingsBuilder)
	{
		this.settingsBuilder = settingsBuilder;
	}

	/**
	 * @return the reader
	 */
	protected FileReader getReader()
	{
		return reader;
	}

	/**
	 * @param reader
	 *            the reader to set
	 */
	protected void setReader(FileReader reader)
	{
		this.reader = reader;
	}

	/**
	 * @return the mavenreader
	 */
	protected MavenXpp3Reader getMavenreader()
	{
		return mavenreader;
	}

	/**
	 * @param mavenreader
	 *            the mavenreader to set
	 */
	protected void setMavenreader(MavenXpp3Reader mavenreader)
	{
		this.mavenreader = mavenreader;
	}

	/**
	 * @return the model
	 */
	protected Model getModel()
	{

		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	protected void setModel(Model model)
	{
		this.model = model;
	}

	/**
	 * @return the project
	 */
	protected MavenProject getProject()
	{
		return project;
	}

	/**
	 * @param project
	 *            the project to set
	 */
	protected void setProject(MavenProject project)
	{
		this.project = project;
	}

	/**
	 * @return the pomfile
	 */
	protected String getPomfile()
	{
		return pomfile;
	}

	/**
	 * @param pomfile
	 *            the pomfile to set
	 */
	protected void setPomfile(String pomfile)
	{
		this.pomfile = pomfile;
	}
}