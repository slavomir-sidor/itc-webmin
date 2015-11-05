/**
 * 
 */
package sk.itcloud;

import com.vaadin.data.Container;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Table;

/**
 * @author jahman
 *
 */
public class TableView extends Table implements View
{

	public static final String VIEW_NAME = "";

	/**
	 * 
	 */
	public TableView()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param caption
	 */
	public TableView(String caption)
	{
		super(caption);
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param caption
	 * @param dataSource
	 */
	public TableView(String caption, Container dataSource)
	{
		super(caption, dataSource);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}
