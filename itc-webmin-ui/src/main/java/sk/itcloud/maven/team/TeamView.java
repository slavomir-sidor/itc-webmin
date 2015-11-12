package sk.itcloud.maven.team;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.TabSheet;

public class TeamView extends TabSheet implements View
{
	public static final String VIEW_NAME = "Team";

	public TeamView()
	{
		super();
	}

	public TeamView(Component... components)
	{
		super(components);
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}