package sk.itcloud.maven.settings.views;

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
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TabSheet.Tab;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import eu.livotov.labs.vaadin.autoforms.AutoForm;

public class GridMasterVertical extends VerticalLayout
{
	protected Table table = new Table();
	protected TabSheet tabs = new TabSheet();
	protected FormLayout forms = new FormLayout();
	protected FieldGroup binder = new FieldGroup();

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

		tabs.addTab(forms, "New");
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
}