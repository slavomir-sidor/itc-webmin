/**
 * 
 */
package sk.itcloud.project;

import com.vaadin.ui.TabSheet;

/**
 * @author jahman
 *
 */
public class ServerTabSheet extends TabSheet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1187104482453020034L;

	public ServerTabSheet() {
		super();
		addTab(new ServerTreeTable()).setCaption("Projects");
	}

}
