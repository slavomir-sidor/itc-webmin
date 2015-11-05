package sk.itcloud.maven.project;

import java.util.List;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

import eu.livotov.labs.vaadin.autoforms.AutoForm;
import sk.itcloud.maven.model.form.Dependency;

public class ProjectModuleView extends VerticalLayout implements View
{

	public static final String VIEW_NAME = "Modules";

	Table table;
	GridLayout grid;

	public ProjectModuleView(List<String> list)
	{
		super();
		setSizeFull();

		table = new Table();
		table.addContainerProperty("Module", String.class, null);
		table.setData(list);

		grid = new GridLayout();

		addComponent(table);
		addComponent(grid);

		setExpandRatio(table, 8);
		setExpandRatio(grid, 2);
	}

	public ProjectModuleView(Component... children)
	{
		super(children);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}

}
