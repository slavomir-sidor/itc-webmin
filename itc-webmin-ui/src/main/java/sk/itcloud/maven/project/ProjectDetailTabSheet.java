package sk.itcloud.maven.project;

import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;

public class ProjectDetailTabSheet extends TabSheet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7086525457285046232L;

	public ProjectDetailTabSheet()
	{

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