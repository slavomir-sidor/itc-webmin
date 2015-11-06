package sk.itcloud.maven.project;

import java.util.List;
import org.apache.maven.model.Model;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;

import sk.itcloud.GridMasterVertical;

public class ModuleView extends GridMasterVertical implements View
{

	public static final String VIEW_NAME = "Modules";

	protected Table table;
	protected GridLayout grid;
	protected List<String> list;

	public ModuleView(Model model)
	{
		super();
		getTable().addContainerProperty("Module", String.class, null);
		getTable().setData(model.getModules());
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}

}
