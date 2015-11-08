package sk.itcloud.maven.model.view;

import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import sk.itcloud.AutoForm;
import sk.itcloud.HorizontalTabView;
import sk.itcloud.maven.model.form.Scm;

public class RepositoriesView extends HorizontalTabView implements View
{

	public static final String VIEW_NAME = "Repositories";

	public RepositoriesView(Model model)
	{
		super();
		getMenu().addView(new ScmView(model), "Source Control Management", "Source Control");
		getMenu().addView(new DistributionManagementView(model), "Distribution", "Distribution");
	}

	public RepositoriesView(Component... children)
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