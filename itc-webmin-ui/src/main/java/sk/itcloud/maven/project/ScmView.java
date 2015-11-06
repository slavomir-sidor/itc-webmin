package sk.itcloud.maven.project;

import org.apache.maven.model.DistributionManagement;
import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

import sk.itcloud.AutoForm;
import sk.itcloud.maven.model.form.Repository;
import sk.itcloud.maven.model.form.Scm;
import sk.itcloud.maven.model.form.Site;

/**
 * @author jahman
 *
 */
public class ScmView extends VerticalLayout implements View
{

	public static final String VIEW_NAME = "Source Control";

	public ScmView(Model model)
	{
		setSizeFull();

		setWidth("100%");
		setHeight("100%");

		HorizontalLayout repository = new HorizontalLayout();
		AutoForm form = new AutoForm();
		form.setFormData(new Scm());

		addComponent(repository);
		addComponent(form);

		setExpandRatio(repository, 7);
		setExpandRatio(form, 3);

	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}