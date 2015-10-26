package sk.itcloud;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import sk.itcloud.Menu;
import sk.itcloud.WorkbenchView;
import sk.itcloud.project.ProjectView;
import sk.itcloud.webmin.ServerView;

public class MainScreen extends HorizontalLayout {

	private Menu menu;

	public MainScreen(ITCWebminUI ui) {

		setStyleName("main-screen");

		CssLayout viewContainer = new CssLayout();
		viewContainer.addStyleName("valo-content");
		viewContainer.setSizeFull();

		final Navigator navigator = new Navigator(ui, viewContainer);
		navigator.setErrorView(ErrorView.class);
		navigator.addViewChangeListener(viewChangeListener);

		Menu menu = new Menu(navigator);
		menu.addView(new WorkbenchView(), WorkbenchView.VIEW_NAME, WorkbenchView.VIEW_NAME, FontAwesome.DASHBOARD);
		menu.addView(new ProjectView(), ProjectView.VIEW_NAME, ProjectView.VIEW_NAME, FontAwesome.ARCHIVE);
		//menu.addView(new ServerView(), ServerView.VIEW_NAME, ServerView.VIEW_NAME, FontAwesome.BUILDING);

		addComponent(menu);
		addComponent(viewContainer);

		setExpandRatio(viewContainer, 1);
		setSizeFull();

	}

	// notify the view menu about view changes so that it can display which view
	// is currently active
	ViewChangeListener viewChangeListener = new ViewChangeListener() {

		@Override
		public boolean beforeViewChange(ViewChangeEvent event) {
			return true;
		}

		@Override
		public void afterViewChange(ViewChangeEvent event) {
			//menu.setActiveView(event.getViewName());
		}

	};
}