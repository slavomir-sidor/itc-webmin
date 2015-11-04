package sk.itcloud.maven.repository;

import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;

import sk.itcloud.maven.SettingsAPI;

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

		SettingsAPI settingsAPI = new SettingsAPI();
		addTab(new RepositoryTable()).setCaption("Repositories");

	}

}
