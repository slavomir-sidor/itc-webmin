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
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Table;
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
	protected TabSheet tabSheet;

	public DependencyView(Model model)
	{
		setSizeFull();

		BeanItemContainer<org.apache.maven.model.Dependency> dependencyContainer = new BeanItemContainer<org.apache.maven.model.Dependency>(
				org.apache.maven.model.Dependency.class, model.getDependencies());

		toolbar = new HorizontalLayout();
		HorizontalLayout dependencies = new HorizontalLayout();

		Table dependency = new Table("Dependency");
		dependency.setSizeFull();

		Table dependencyManagement = new Table("Dependency Management");
		dependencyManagement.setSizeFull();

		dependencies.addComponent(dependency);
		dependencies.addComponent(dependencyManagement);

		dependencies.setExpandRatio(dependency, 5);
		dependencies.setExpandRatio(dependencyManagement, 5);
		dependencies.setSizeFull();

		form = new AutoForm();
		form.setFormData(new Dependency());

		tabSheet = new TabSheet();
		tabSheet.addTab(form, "New");

		addComponent(toolbar);
		addComponent(dependencies);
		addComponent(tabSheet);

		setExpandRatio(toolbar, 1);
		setExpandRatio(dependencies, 6);
		setExpandRatio(tabSheet, 4);
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
