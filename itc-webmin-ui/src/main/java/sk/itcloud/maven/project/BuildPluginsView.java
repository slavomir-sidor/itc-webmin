package sk.itcloud.maven.project;

import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import sk.itcloud.GridMasterVertical;

public class BuildPluginsView extends GridMasterVertical implements View
{
	public static final String VIEW_NAME = "Settings";

	public BuildPluginsView(Model model)
	{
		super();
		BeanItemContainer<Plugin> items = new BeanItemContainer<Plugin>(Plugin.class, model.getBuild().getPlugins());
		getTable().setContainerDataSource(items);
		getForms().get(0).setFormData(new sk.itcloud.maven.model.form.Plugin());
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}