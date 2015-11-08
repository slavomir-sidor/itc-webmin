package sk.itcloud;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;

import sk.itcloud.Menu;
import sk.itcloud.cmis.CMISView;
import sk.itcloud.communication.ChatPanel;
import sk.itcloud.dashboard.DashboardView;
import sk.itcloud.maven.settings.views.SettingsView;
import sk.itcloud.maven.team.TeamView;
import sk.itcloud.processes.ProcessesView;
import sk.itcloud.maven.project.ProjectView;
import sk.itcloud.maven.reports.ReportsView;
import sk.itcloud.maven.repository.RepositoryView;
import sk.itcloud.tasks.TasksView;

public class MainScreen extends HorizontalLayout
{
	private Menu menu;

	public MainScreen(ITCWebminUI ui)
	{

		setStyleName("main-screen");
		addStyleName("app-background");
		setSizeFull();

		CssLayout viewContainer = new CssLayout();
		viewContainer.addStyleName("valo-content");
		viewContainer.setSizeFull();
		viewContainer.addStyleName("view-content");

		final Navigator navigator = new Navigator(ui, viewContainer);
		navigator.setErrorView(ErrorView.class);
		navigator.addViewChangeListener(viewChangeListener);

		Menu menu = new Menu(navigator);
		menu.addView(new DashboardView(), DashboardView.VIEW_NAME, DashboardView.VIEW_NAME);
		menu.addView(new ProjectView(), ProjectView.VIEW_NAME, ProjectView.VIEW_NAME);
		menu.addView(new TasksView(), TasksView.VIEW_NAME, TasksView.VIEW_NAME);
		menu.addView(new TeamView(), TeamView.VIEW_NAME, TeamView.VIEW_NAME);
		menu.addView(new CMISView(), CMISView.VIEW_NAME, CMISView.VIEW_NAME);
		menu.addView(new ProcessesView(), ProcessesView.VIEW_NAME, ProcessesView.VIEW_NAME);
		menu.addView(new ReportsView(), ReportsView.VIEW_NAME, ReportsView.VIEW_NAME);
		menu.addView(new RepositoryView(), RepositoryView.VIEW_NAME, RepositoryView.VIEW_NAME);
		menu.addView(new SettingsView(), SettingsView.VIEW_NAME, SettingsView.VIEW_NAME);

		ChatPanel chatPanel = new ChatPanel();
		chatPanel.addStyleName("view-content");

		addComponent(menu);
		addComponent(viewContainer);
		addComponent(chatPanel);

		setExpandRatio(menu, 1);
		setExpandRatio(viewContainer, 8);
		setExpandRatio(chatPanel, 1);

	}

	// notify the view menu about view changes so that it can display which view
	// is currently active
	ViewChangeListener viewChangeListener = new ViewChangeListener()
	{

		@Override
		public boolean beforeViewChange(ViewChangeEvent event)
		{
			return true;
		}

		@Override
		public void afterViewChange(ViewChangeEvent event)
		{
			// menu.setActiveView(event.getViewName());
		}

	};
}