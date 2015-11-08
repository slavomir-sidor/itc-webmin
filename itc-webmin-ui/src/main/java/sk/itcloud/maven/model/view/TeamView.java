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

public class TeamView extends HorizontalTabView implements View
{

	public static final String VIEW_NAME = "Build";

	protected GridLayoutView team;

	protected MailingListView mailingListView;

	protected AutoForm organizationView;

	protected GridMasterVertical developersView = new GridMasterVertical();

	public TeamView(Model model)
	{
		super();
		setSizeFull();

		mailingListView = new MailingListView(model);

		organizationView = new AutoForm();
		organizationView.setFormData(new Organization());

		team = new GridLayoutView(2, 1);
		team.setSizeFull();
		team.addComponent(organizationView);
		team.addComponent(mailingListView);

		developersView.setSizeFull();
		developersView.getTable().setContainerDataSource(new BeanItemContainer<Developer>(Developer.class, model.getDevelopers()));

		getMenu().addView(team, "Teams & Organization", "Teams & Organization");
		getMenu().addView(developersView, "Peoples", "Peoples");

	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}
