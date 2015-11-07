package sk.itcloud.maven.project;

import com.vaadin.ui.Table;

/**
 * @author jahman
 *
 */
public class ProjectsView extends Table
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6478027660729026458L;

	public ProjectsView()
	{
		super();

		setSizeFull();
		setSelectable(true);
		setWidth("100%");
		setHeight("100%");

		addContainerProperty("Name", String.class, "");
		addContainerProperty("Description", String.class, "");
		addContainerProperty("Maven GroupId", String.class, "");
		addContainerProperty("Maven ArtifactId", String.class, "");
		addContainerProperty("Maven Version", String.class, "");

	}
}