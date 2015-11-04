package sk.itcloud.maven.project;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

public class ProjectView extends VerticalLayout implements View {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6876498248543507519L;
	
	public static final String VIEW_NAME = "Projects";

	public ProjectView() {

		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");
		ProjectTabSheet projectTabSheet=new ProjectTabSheet();
		ProjectITCTabSheet projectITCTabSheet=new ProjectITCTabSheet();
		
		addComponent(projectTabSheet);
		addComponent(projectITCTabSheet);
		
		setExpandRatio(projectTabSheet, 6);
		setExpandRatio(projectITCTabSheet, 4);
	}

	@Override
	public void enter(ViewChangeEvent event) {
	}
}