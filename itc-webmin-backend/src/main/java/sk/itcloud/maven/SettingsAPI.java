package sk.itcloud.maven;

import java.io.File;
import java.io.IOException;
import org.apache.maven.settings.DefaultMavenSettingsBuilder;
import org.apache.maven.settings.Settings;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

public class SettingsAPI
{
	protected String fileName = "~/.m2/settings.xml";

	protected File file;

	protected DefaultMavenSettingsBuilder builder;

	protected Settings settings;

	/**
	 * @return the file
	 */
	public File getFile()
	{
		if (this.file == null)
		{
			this.file=new File(getFileName());
		}
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
		if (this.builder == null)
		{
			setBuilder(new DefaultMavenSettingsBuilder());
		}
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
		if (this.settings == null)
		{
			try
			{
				System.out.println(getFile().getAbsolutePath());
				setSettings(getBuilder().buildSettings(getFile()));
			} catch (IOException | XmlPullParserException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
	}

	public SettingsAPI()
	{
		super();
	}
}