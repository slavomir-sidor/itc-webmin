
package sk.itcloud.team.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.TabSheet;

import sk.itcloud.maven.SettingsAPI;
import sk.itcloud.team.TeamAPI;

public class MainView extends TabSheet implements View
{

	public static final String VIEW_NAME = "Maven Settings";

	public MainView()
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		TeamAPI api = new TeamAPI();

		addTab(new GroupsView(), "Groups");
		addTab(new PeoplesView(), "Peoples");

	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}