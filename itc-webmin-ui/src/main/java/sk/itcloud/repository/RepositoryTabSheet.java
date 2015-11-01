/**
 * 
 */
package sk.itcloud.repository;

import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;

/**
 * @author jahman
 *
 */
public class RepositoryTabSheet extends TabSheet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1187104482453020034L;

	public RepositoryTabSheet()
	{
		super();
		setSizeFull();

		setWidth("100%");
		setHeight("100%");

		addTab(new RepositoryTable()).setCaption("Repositories");
		addTab(new NewRepository()).setCaption("New");
	}

}
