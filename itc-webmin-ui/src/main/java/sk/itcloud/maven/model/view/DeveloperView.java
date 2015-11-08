package sk.itcloud.maven.model.view;

import org.apache.maven.model.Developer;
import org.apache.maven.model.Model;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

import sk.itcloud.AutoForm;
import sk.itcloud.GridLayoutView;
import sk.itcloud.GridMasterVertical;
import sk.itcloud.HorizontalTabView;
import sk.itcloud.maven.model.form.Organization;

public class DeveloperView extends GridMasterVertical implements View
{

	public static final String VIEW_NAME = "Developers";

	public DeveloperView(Model model)
	{
		super();
		setSizeFull();
		getTable().setContainerDataSource(new BeanItemContainer<Developer>(Developer.class, model.getDevelopers()));
		getForms().get(0).setFormData(new sk.itcloud.maven.model.form.Developer());
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}
