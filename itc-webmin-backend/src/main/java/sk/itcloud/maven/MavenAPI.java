package sk.itcloud.maven;

import java.io.FileReader;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.project.MavenProject;

public class MavenAPI {

	protected Model model = null;

	protected MavenProject project = null;

	protected FileReader reader = null;

	protected MavenXpp3Reader mavenreader;
	
	protected String pomfile = "/var/www/jahman/domains/itc-webmin.jahman/pom.xml";

	/**
	 * @return the reader
	 */
	protected FileReader getReader() {
		return reader;
	}

	/**
	 * @param reader
	 *            the reader to set
	 */
	protected void setReader(FileReader reader) {
		this.reader = reader;
	}

	/**
	 * @return the mavenreader
	 */
	protected MavenXpp3Reader getMavenreader() {
		return mavenreader;
	}

	/**
	 * @param mavenreader
	 *            the mavenreader to set
	 */
	protected void setMavenreader(MavenXpp3Reader mavenreader) {
		this.mavenreader = mavenreader;
	}

	/**
	 * @return the model
	 */
	protected Model getModel() {
		
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	protected void setModel(Model model) {
		this.model = model;
	}

	/**
	 * @return the project
	 */
	protected MavenProject getProject() {
		return project;
	}

	/**
	 * @param project
	 *            the project to set
	 */
	protected void setProject(MavenProject project) {
		this.project = project;
	}

	/**
	 * @return the pomfile
	 */
	protected String getPomfile() {
		return pomfile;
	}

	/**
	 * @param pomfile
	 *            the pomfile to set
	 */
	protected void setPomfile(String pomfile) {
		this.pomfile = pomfile;
	}
}