package sk.itcloud.maven.project;

import org.apache.maven.model.Model;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalLayout;

import eu.livotov.labs.vaadin.autoforms.AutoForm;
import sk.itcloud.GridMasterVertical;
import sk.itcloud.HorizontalTabView;
import sk.itcloud.maven.model.form.Build;
import sk.itcloud.maven.model.form.Dependency;
import sk.itcloud.maven.model.form.Extension;

public class BuildExtentionsView extends GridMasterVertical implements View
{

	public static final String VIEW_NAME = "Settings";

	public BuildExtentionsView(Model model)
	{
		super();
		getTable().setData(model.getBuild().getExtensions());
		getForms().get(0).setFormData(new Extension());
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}