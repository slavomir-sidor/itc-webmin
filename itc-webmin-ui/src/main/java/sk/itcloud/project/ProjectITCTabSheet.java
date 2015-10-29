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


		addTab(new Label("Overview")).setCaption("Overview");
		addTab(new Label("Overview")).setCaption("CI");
		addTab(new Label("Overview")).setCaption("Issue Management");
		addTab(new Label("Overview")).setCaption("Source Repository");
		addTab(new Label("Overview")).setCaption("Artifacts");
		addTab(new Label("Overview")).setCaption("Reports");
	}

}
