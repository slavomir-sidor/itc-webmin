package sk.itcloud.maven;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.DefaultMavenSettingsBuilder;
import org.apache.maven.settings.Settings;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

public class SettingsAPI
{

	protected String fileName = "/usr/share/maven/conf/settings.xml";

	protected File file;

	protected DefaultMavenSettingsBuilder builder;

	/**
	 * @return the file
	 */
	public File getFile()
	{
		return file;
	}

	/**
	 * @param file
	 *            the file to set
	 */
	public void setFile(File file)
	{
		this.file = file;
	}

	/**
	 * @return the builder
	 */
	public DefaultMavenSettingsBuilder getBuilder()
	{
		return builder;
	}

	/**
	 * @param builder
	 *            the builder to set
	 */
	public void setBuilder(DefaultMavenSettingsBuilder builder)
	{
		this.builder = builder;
	}

	/**
	 * @return the settings
	 */
	public Settings getSettings()
	{
		return settings;
	}

	/**
	 * @param settings
	 *            the settings to set
	 */
	public void setSettings(Settings settings)
	{
		this.settings = settings;
	}

	public Settings settings;

	/**
	 * @return the fileName
	 */
	public String getFileName()
	{
		return fileName;
	}

	/**
	 * @param fileName
	 *            the fileName to set
	 */
	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	public SettingsAPI(String filename)
	{
		super();

		setFileName(filename);
		setFile(new File(getFileName()));
		setBuilder(new DefaultMavenSettingsBuilder());

		try
		{
			setSettings(getBuilder().buildSettings(getFile()));
		} catch (IOException | XmlPullParserException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}