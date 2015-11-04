package sk.itcloud.maven.repository;

import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;

/**
 * @author jahman
 *
 */
public class RepositoryITCTabSheet extends TabSheet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1187104482453020034L;

	public RepositoryITCTabSheet()
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		addTab(new Label("Overview")).setCaption("Projects");
		addTab(new Label("Overview")).setCaption("Tasks");
		addTab(new Label("Overview")).setCaption("Documents");
		addTab(new Label("Overview")).setCaption("Processes");
		addTab(new Label("Overview")).setCaption("Reports");
	}
}
