package sk.itcloud.maven.project;

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

public class ProjectTeamView extends HorizontalTabView implements View
{

	public static final String VIEW_NAME = "Build";

	protected GridLayoutView team;

	protected ProjectMailingListView mailingListView = new ProjectMailingListView();

	protected AutoForm organizationView = new AutoForm();

	protected GridMasterVertical developersView = new GridMasterVertical();

	public ProjectTeamView(Model model)
	{
		super();

		team = new GridLayoutView(2, 2);
		organizationView.setFormData(new Organization());
		developersView.setSizeFull();
		developersView.getTable().setContainerDataSource(new BeanItemContainer<Developer>(Developer.class, model.getDevelopers()));

		team.addComponent(organizationView, 0, 0);
		team.addComponent(mailingListView, 0, 1);

		getMenu().addView(team, "Teams & Organization", "Teams & Organization");
		getMenu().addView(developersView, "Peoples", "Team");

	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}
