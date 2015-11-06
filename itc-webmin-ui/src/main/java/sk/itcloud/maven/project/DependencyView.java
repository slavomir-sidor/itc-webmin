package sk.itcloud.maven.project;

import org.apache.maven.model.Developer;
import org.apache.maven.model.Model;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Tree;
import com.vaadin.ui.VerticalLayout;
import sk.itcloud.AutoForm;
import sk.itcloud.maven.model.form.Dependency;

public class DependencyView extends VerticalLayout implements View
{

	public static final String VIEW_NAME = "Dependency";

	protected HorizontalLayout toolbar;
	protected HorizontalSplitPanel splitPanel;
	protected AutoForm form;
	protected Tree dependency;
	protected Tree dependencyManagement;

	public DependencyView(Model model)
	{
		setSizeFull();

		BeanItemContainer<org.apache.maven.model.Dependency> dependencyContainer = new BeanItemContainer<org.apache.maven.model.Dependency>(
				org.apache.maven.model.Dependency.class, model.getDependencies());

		dependency = new Tree("Dependency");
		dependency.setSizeFull();
		dependency.addItem("dsdsd");
		dependency.addItem("dsdsd");
		dependency.addItem("dsdsd");
		dependency.addItem("dsdsd");
		// dependency.setContainerDataSource(dependencyContainer);
		// dependency.setData(model.getDependencies());

		dependencyManagement = new Tree("Dependency Management");
		dependencyManagement.setSizeFull();

		toolbar = new HorizontalLayout();

		splitPanel = new HorizontalSplitPanel();
		splitPanel.setSizeFull();
		splitPanel.setHeight("100%");

		splitPanel.setFirstComponent(dependency);
		splitPanel.setSecondComponent(dependencyManagement);

		form = new AutoForm();
		form.setFormData(new Dependency());

		addComponent(toolbar);
		addComponent(splitPanel);
		addComponent(form);

		setExpandRatio(toolbar, 1);
		setExpandRatio(splitPanel, 5);
		setExpandRatio(form, 4);
	}

	public DependencyView(Component... children)
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
