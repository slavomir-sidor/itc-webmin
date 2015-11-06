package sk.itcloud.maven.project;

import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import sk.itcloud.AutoForm;
import sk.itcloud.HorizontalTabView;
import sk.itcloud.maven.model.form.Scm;

public class ProjectRepositoriesView extends HorizontalTabView implements View
{

	public static final String VIEW_NAME = "Repositories";
	protected AutoForm scmView = new AutoForm();
	protected ProjectDistributionManagementView distributionManagementView;

	public ProjectRepositoriesView(Model model)
	{
		super();

		scmView.setFormData(new Scm());
		distributionManagementView = new ProjectDistributionManagementView(model);

		getMenu().addView(scmView, "Source Control Management", "Source Control");
		getMenu().addView(distributionManagementView, "Distribution", "Distribution");
	}

	public ProjectRepositoriesView(Component... children)
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