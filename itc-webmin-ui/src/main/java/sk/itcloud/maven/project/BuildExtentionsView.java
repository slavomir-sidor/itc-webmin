package sk.itcloud.maven.project;

import org.apache.maven.model.Extension;
import org.apache.maven.model.Model;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import sk.itcloud.GridMasterVertical;

public class BuildExtentionsView extends GridMasterVertical implements View
{
	public static final String VIEW_NAME = "Settings";
	protected BeanItemContainer<Extension> items;

	public BuildExtentionsView(Model model)
	{
		super();

		items = new BeanItemContainer<Extension>(Extension.class, model.getBuild().getExtensions());
		getTable().setContainerDataSource(items);
		getForms().get(0).setFormData(new sk.itcloud.maven.model.form.Extension());
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}