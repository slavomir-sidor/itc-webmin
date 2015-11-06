package sk.itcloud.maven.project;

import org.apache.maven.model.Developer;
import org.apache.maven.model.Model;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

import sk.itcloud.AutoForm;
import sk.itcloud.GridMasterVertical;
import sk.itcloud.HorizontalTabView;
import sk.itcloud.maven.model.form.Organization;

public class ProjectTeamView extends HorizontalTabView implements View
{

	public static final String VIEW_NAME = "Build";

	protected MailingListView mailingListView = new MailingListView();

	protected AutoForm organizationView = new AutoForm();

	protected GridMasterVertical developersView = new GridMasterVertical();

	public ProjectTeamView(Model model)
	{
		super();
		setSizeFull();

		addComponent(getMenu());
		addComponent(getViewContainer());

		setExpandRatio(getMenu(), 8);
		setExpandRatio(getViewContainer(), 2);

		organizationView.setFormData(new Organization());
		developersView.setSizeFull();
		developersView.getTable().setContainerDataSource(new BeanItemContainer<Developer>(Developer.class, model.getDevelopers()));

		getMenu().addView(organizationView, "Organization", "Organization");
		getMenu().addView(developersView, "Team", "Team");
		getMenu().addView(mailingListView, "Mailing List", "Mailing List");

	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}
