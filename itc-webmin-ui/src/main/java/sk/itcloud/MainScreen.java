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
import sk.itcloud.processes.ProcessesView;
import sk.itcloud.project.ProjectView;
import sk.itcloud.reports.ReportsView;
import sk.itcloud.repository.RepositoryView;
import sk.itcloud.tasks.TasksView;

public class MainScreen extends HorizontalLayout
{

	private Menu menu;

	public MainScreen(ITCWebminUI ui)
	{

		setStyleName("main-screen");

		CssLayout viewContainer = new CssLayout();
		viewContainer.addStyleName("valo-content");
		viewContainer.setSizeFull();

		final Navigator navigator = new Navigator(ui, viewContainer);
		navigator.setErrorView(ErrorView.class);
		navigator.addViewChangeListener(viewChangeListener);

		Menu menu = new Menu(navigator);
		menu.addView(new DashboardView(), DashboardView.VIEW_NAME, DashboardView.VIEW_NAME, FontAwesome.DASHBOARD);
		menu.addView(new ProjectView(), ProjectView.VIEW_NAME, ProjectView.VIEW_NAME, FontAwesome.ARCHIVE);
		menu.addView(new TasksView(), TasksView.VIEW_NAME, TasksView.VIEW_NAME, FontAwesome.ARCHIVE);
		menu.addView(new CMISView(), CMISView.VIEW_NAME, CMISView.VIEW_NAME, FontAwesome.ARCHIVE);
		menu.addView(new ProcessesView(), ProcessesView.VIEW_NAME, ProcessesView.VIEW_NAME, FontAwesome.ARCHIVE);
		menu.addView(new ReportsView(), ReportsView.VIEW_NAME, ReportsView.VIEW_NAME, FontAwesome.ARCHIVE);
		menu.addView(new RepositoryView(), RepositoryView.VIEW_NAME, RepositoryView.VIEW_NAME, FontAwesome.ARCHIVE);
		menu.addView(new SettingsView(), SettingsView.VIEW_NAME, SettingsView.VIEW_NAME, FontAwesome.ARCHIVE);

		ChatPanel chatPanel = new ChatPanel();

		HorizontalLayout southPanel = new HorizontalLayout();

		addComponent(menu);
		addComponent(viewContainer);
		addComponent(chatPanel);
		addComponent(southPanel);

		setExpandRatio(viewContainer, 8);
		setExpandRatio(chatPanel, 1);
		setExpandRatio(southPanel, 1);
		setSizeFull();

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