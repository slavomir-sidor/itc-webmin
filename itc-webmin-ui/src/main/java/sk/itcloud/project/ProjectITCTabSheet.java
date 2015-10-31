/**
 * 
 */
package sk.itcloud.project;

import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;

/**
 * @author jahman
 *
 */
public class ProjectITCTabSheet extends TabSheet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1187104482453020034L;

	public ProjectITCTabSheet() {

		super();
		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		addTab(new ProjectTreeTable()).setCaption("Overview");
		addTab(new Label("Overview")).setCaption("Tasks");
		addTab(new Label("Overview")).setCaption("Documents");
		addTab(new Label("Overview")).setCaption("Repositories");
		addTab(new Label("Overview")).setCaption("Processes");
		addTab(new Label("Overview")).setCaption("Reports");
	}

}
