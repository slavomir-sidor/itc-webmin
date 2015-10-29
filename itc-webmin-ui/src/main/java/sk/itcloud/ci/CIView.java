package sk.itcloud.ci;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

public class CIView extends VerticalLayout implements View {

	public static final String VIEW_NAME = "CI";

	public CIView() {

		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");
	}


	@Override
	public void enter(ViewChangeEvent event) {
	}
}