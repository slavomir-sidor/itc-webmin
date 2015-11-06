package sk.itcloud;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

import sk.itcloud.maven.project.Menu;

public class HorizontalTabView extends HorizontalLayout implements View
{
	protected Menu menu;
	protected CssLayout viewContainer;
	protected Navigator navigator;

	public HorizontalTabView()
	{
		super();
		setSizeFull();

		addComponent(getMenu());
		addComponent(getViewContainer());

		setExpandRatio(getMenu(), 2);
		setExpandRatio(getViewContainer(), 8);
	}

	public HorizontalTabView(Component... children)
	{
		super(children);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}

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

	/**
	 * @return the menu
	 */
	public Menu getMenu()
	{
		if (this.menu == null)
		{
			this.menu = new Menu(getNavigator());
			this.menu.setSizeFull();
		}
		return menu;
	}

	/**
	 * @param menu
	 *            the menu to set
	 */
	public void setMenu(Menu menu)
	{
		this.menu = menu;
	}

	/**
	 * @return the viewContainer
	 */
	public CssLayout getViewContainer()
	{
		if (this.viewContainer == null)
		{
			viewContainer = new CssLayout();
			viewContainer.addStyleName("valo-content");
			viewContainer.setSizeFull();
			setViewContainer(viewContainer);
		}
		return this.viewContainer;
	}

	/**
	 * @param viewContainer
	 *            the viewContainer to set
	 */
	public void setViewContainer(CssLayout viewContainer)
	{
		this.viewContainer = viewContainer;
	}

	/**
	 * @return the viewChangeListener
	 */
	public ViewChangeListener getViewChangeListener()
	{
		return viewChangeListener;
	}

	/**
	 * @param viewChangeListener
	 *            the viewChangeListener to set
	 */
	public void setViewChangeListener(ViewChangeListener viewChangeListener)
	{
		this.viewChangeListener = viewChangeListener;
	}

	/**
	 * @return the navigator
	 */
	public Navigator getNavigator()
	{
		if (this.navigator == null)
		{
			this.navigator = new Navigator(UI.getCurrent(), getViewContainer());
			this.navigator.setErrorView(ErrorView.class);
			this.navigator.addViewChangeListener(viewChangeListener);
		}
		return navigator;
	}

}
