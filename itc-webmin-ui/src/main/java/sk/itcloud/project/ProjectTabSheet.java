/**
 * 
 */
package sk.itcloud.project;

import com.vaadin.ui.TabSheet;

/**
 * @author jahman
 *
 */
public class ProjectTabSheet extends TabSheet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1187104482453020034L;

	public ProjectTabSheet() {

		super();
		setSizeFull();

		setWidth("100%");
		setHeight("100%");

		addTab(new ProjectTreeTable()).setCaption("Projects");
		addTab(new NewProjectTabSheet()).setCaption("New");
	}

}
