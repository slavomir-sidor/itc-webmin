package sk.itcloud.maven.model.view;

import org.apache.maven.model.DistributionManagement;
import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.GridLayout;

import sk.itcloud.AutoForm;
import sk.itcloud.maven.model.form.Repository;
import sk.itcloud.maven.model.form.Site;

/**
 * @author jahman
 *
 */
public class DistributionManagementView extends GridLayout implements View
{

	public static final String VIEW_NAME = "Distribution Management";

	protected AutoForm repository;
	protected AutoForm snapshotRepository;
	protected AutoForm site;

	public DistributionManagementView(Model model)
	{
		super(2, 2);

		DistributionManagement distributionManagement = model.getDistributionManagement();

		repository = new AutoForm();
		repository.setFormData(new Repository());

		snapshotRepository = new AutoForm();
		snapshotRepository.setFormData(new Repository());

		site = new AutoForm();
		site.setFormData(new Site());

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		addComponent(repository);
		addComponent(snapshotRepository);
		addComponent(site);
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}