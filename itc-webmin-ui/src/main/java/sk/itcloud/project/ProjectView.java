package sk.itcloud.project;


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

		addComponent(new ServerTabSheet());
	}

	@Override
	public void enter(ViewChangeEvent event) {
	}
}