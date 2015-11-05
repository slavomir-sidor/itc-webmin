package sk.itcloud.maven.project;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;

public class ProjectMainView extends VerticalLayout implements View
{
	public static final String VIEW_NAME = "Projects";

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}