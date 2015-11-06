package sk.itcloud;

import java.util.ArrayList;
import java.util.List;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.data.Item;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TabSheet.Tab;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

public class GridMasterVertical extends VerticalLayout implements View
{

	public static final String VIEW_NAME = "Properties";

	protected Table table = new Table();
	protected TabSheet tabs = new TabSheet();
	protected List<AutoForm> forms = new ArrayList<AutoForm>();

	public GridMasterVertical()
	{
		setSizeFull();

		addComponent(table);
		addComponent(tabs);

		setExpandRatio(table, 4);
		setExpandRatio(tabs, 6);

		table.setSelectable(true);
		table.setSizeFull();
		table.addItemClickListener(new ItemClickEvent.ItemClickListener()
		{
			@Override
			public void itemClick(ItemClickEvent itemClickEvent)
			{
				onRowClick(itemClickEvent);
			}
		});

		AutoForm autoForm = new AutoForm();
		forms.add(autoForm);
		for (int i = 0; i < forms.size(); i++)
		{
			tabs.addTab(forms.get(i), "New");
		}
	}

	private void onRowClick(ItemClickEvent itemClickEvent)
	{
		Item item = table.getContainerDataSource().getItem(itemClickEvent.getItemId());

		FormLayout detail = new FormLayout();
		Tab tab = tabs.getTab(detail);

		if (tab == null)
		{
			// String title = beans.getItem(itemClickEvent.getItemId()).getBean().getId();
			tabs.addTab(detail, "ass");
			tab = tabs.getTab(detail);
			tab.setClosable(true);
		}
		tabs.setSelectedTab(tab);
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}

	/**
	 * @return the table
	 */
	public Table getTable()
	{
		return table;
	}

	/**
	 * @param table
	 *            the table to set
	 */
	public void setTable(Table table)
	{
		this.table = table;
	}

	/**
	 * @return the tabs
	 */
	public TabSheet getTabs()
	{
		return tabs;
	}

	/**
	 * @param tabs
	 *            the tabs to set
	 */
	public void setTabs(TabSheet tabs)
	{
		this.tabs = tabs;
	}

	/**
	 * @return the viewName
	 */
	public static String getViewName()
	{
		return VIEW_NAME;
	}

	/**
	 * @return the forms
	 */
	public List<AutoForm> getForms()
	{
		return forms;
	}

	/**
	 * @param forms the forms to set
	 */
	public void setForms(List<AutoForm> forms)
	{
		this.forms = forms;
	}
}