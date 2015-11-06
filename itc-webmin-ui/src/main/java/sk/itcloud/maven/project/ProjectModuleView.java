package sk.itcloud.maven.project;

import java.util.List;
import org.apache.maven.model.Model;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;

public class ProjectModuleView extends HorizontalLayout implements View
{

	public static final String VIEW_NAME = "Modules";

	protected Table table;
	protected GridLayout grid;
	protected List<String> list;

	public ProjectModuleView(Model model)
	{
		super();

		list = model.getModules();
		setSizeFull();

		table = new Table();
		table.addContainerProperty("Module", String.class, null);
		table.setSizeFull();
		table.setData(list);

		grid = new GridLayout();
		grid.setSizeFull();

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
