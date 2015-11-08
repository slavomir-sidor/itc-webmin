package sk.itcloud.maven.model.view;

import org.apache.maven.model.Model;
import org.vaadin.hezamu.canvas.Canvas;
import org.vaadin.svg.SvgComponent;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import sk.itcloud.AutoForm;
import sk.itcloud.maven.model.form.Build;

public class BuildSettingsView extends VerticalLayout implements View
{

	public static final String VIEW_NAME = "Build";

	public BuildSettingsView(Model model)
	{

		setSizeFull();

		HorizontalLayout buildPanel = new HorizontalLayout();
		buildPanel.setSizeFull();
		Canvas canvas = new Canvas();
		buildPanel.addComponent(canvas);
		canvas.fillRect(10, 10, 20, 20);

		AutoForm form = new AutoForm();
		form.setFormData(new Build());

		addComponent(buildPanel);
		addComponent(form);

		setExpandRatio(buildPanel, 5);
		setExpandRatio(form, 5);
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}