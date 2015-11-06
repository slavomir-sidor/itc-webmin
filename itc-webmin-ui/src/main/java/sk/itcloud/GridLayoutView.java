package sk.itcloud;

import java.util.List;

import org.apache.maven.settings.Server;
import org.apache.maven.settings.Settings;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.data.Item;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TabSheet.Tab;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import eu.livotov.labs.vaadin.autoforms.AutoForm;

public class GridLayoutView extends GridLayout implements View
{

	public static String VIEW_NAME = "";
	
	public GridLayoutView()
	{
		super();
	}

	public GridLayoutView(String viewName)
	{
		VIEW_NAME = viewName;
	}

	public GridLayoutView(int columns, int rows, Component... children)
	{
		super(columns, rows, children);
		// TODO Auto-generated constructor stub
	}

	public GridLayoutView(int columns, int rows)
	{
		super(columns, rows);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}

}