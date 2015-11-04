package sk.itcloud.maven.project;

import com.vaadin.data.Container;
import com.vaadin.ui.TreeTable;

/**
 * @author jahman
 *
 */
public class ProjectTreeTable extends TreeTable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6478027660729026458L;

	public ProjectTreeTable()
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