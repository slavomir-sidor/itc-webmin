package sk.itcloud.maven.project;

import org.apache.maven.model.Model;

import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class ModelFieldsetView extends HorizontalLayout
{
	protected Label titleLabel;

	protected FormLayout form = new FormLayout();

	public ModelFieldsetView(String title)
	{
		super();
		Label titleLabel = new Label(title);
		addComponent(titleLabel);
		addComponent(form);
	}

}
