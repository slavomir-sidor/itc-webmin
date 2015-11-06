package sk.itcloud.maven.project;

import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TabSheet;

/**
 * @author jahman
 *
 */
public class ReportsView extends GridLayout implements View
{

	public static final String VIEW_NAME = "Build";

	public ReportsView(Model model)
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}