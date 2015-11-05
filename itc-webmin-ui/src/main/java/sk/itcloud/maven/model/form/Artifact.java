package sk.itcloud.maven.model.form;

import java.io.Serializable;
import eu.livotov.labs.vaadin.autoforms.ann.FormBean;
import eu.livotov.labs.vaadin.autoforms.ann.FormField;

@FormBean(rows = 4, columns = 1, cancelButtonVisible = false, commitButtonVisible = false, title = "Artifact")
public class Artifact 
{
	@FormField(title = "Group Id", location = "0,0", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String groupId;

	@FormField(title = "Artifact Id", location = "0,1", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String artifactId;

	@FormField(title = "Version", location = "0,2", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String version;

	@FormField(title = "Packaging", location = "0,3", required = true, requiredFieldErrorMessage = "Please enter connection")
	protected String packaging = "jar";

	/**
	 * @return the groupId
	 */
	public String getGroupId()
	{
		return groupId;
	}

	/**
	 * @param groupId
	 *            the groupId to set
	 */
	public void setGroupId(String groupId)
	{
		this.groupId = groupId;
	}

	/**
	 * @return the artifactId
	 */
	public String getArtifactId()
	{
		return artifactId;
	}

	/**
	 * @param artifactId
	 *            the artifactId to set
	 */
	public void setArtifactId(String artifactId)
	{
		this.artifactId = artifactId;
	}

	/**
	 * @return the version
	 */
	public String getVersion()
	{
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(String version)
	{
		this.version = version;
	}

	/**
	 * @return the packaging
	 */
	public String getPackaging()
	{
		return packaging;
	}

	/**
	 * @param packaging
	 *            the packaging to set
	 */
	public void setPackaging(String packaging)
	{
		this.packaging = packaging;
	}
}
