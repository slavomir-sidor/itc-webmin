package sk.itcloud.maven.project;

import org.apache.maven.model.Model;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;


import eu.livotov.labs.vaadin.autoforms.AutoForm;

public class ModelFieldsetView extends HorizontalLayout
{
	protected String title;
	protected Label titleLabel;
	protected AutoForm form;

	public ModelFieldsetView(String title)
	{
		super();
		setTitle(title);
		setTitleLabel(new Label(title));
		setForm(new AutoForm());

		addComponent(titleLabel);
		addComponent(form);
	}

	/**
	 * @return the titleLabel
	 */
	public Label getTitleLabel()
	{
		return titleLabel;
	}

	/**
	 * @param titleLabel
	 *            the titleLabel to set
	 */
	public void setTitleLabel(Label titleLabel)
	{
		this.titleLabel = titleLabel;
	}

	/**
	 * @return the form
	 */
	public AutoForm getForm()
	{
		return form;
	}

	/**
	 * @param form
	 *            the form to set
	 */
	public void setForm(AutoForm form)
	{
		this.form = form;
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

}
