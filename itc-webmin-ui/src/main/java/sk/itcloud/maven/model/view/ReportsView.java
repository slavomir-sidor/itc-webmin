package sk.itcloud.maven.model.view;

import org.apache.maven.model.Model;
import org.apache.maven.model.Reporting;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

import sk.itcloud.HorizontalTabView;

/**
 * @author jahman
 *
 */
public class ReportsView extends HorizontalTabView implements View
{

	public static final String VIEW_NAME = "Build";

	public ReportsView(Reporting reporting)
	{
		super();
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}