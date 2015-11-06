/**
 * 
 */
package sk.itcloud.maven.project;

import org.apache.maven.model.Model;

import com.vaadin.ui.Component;

import sk.itcloud.AutoForm;
import sk.itcloud.GridLayoutView;
import sk.itcloud.maven.model.form.Artifact;
import sk.itcloud.maven.model.form.Info;
import sk.itcloud.maven.model.form.Parent;

/**
 * @author jahman
 *
 */
public class ProjectArtifactView extends GridLayoutView
{

	public ProjectArtifactView(Model model)
	{
		super(2, 2);

		AutoForm artifactView = new AutoForm();
		artifactView.setFormData(new Artifact());

		AutoForm parentView = new AutoForm();
		parentView.setFormData(new Parent());

		AutoForm infoView = new AutoForm();
		infoView.setFormData(new Info());

		addComponent(artifactView, 0, 0);
		addComponent(infoView, 1, 0);
		addComponent(parentView, 0, 1);

		setSizeFull();
	}

	public ProjectArtifactView(int columns, int rows, Component... children)
	{
		super(columns, rows, children);
		// TODO Auto-generated constructor stub
	}

	public ProjectArtifactView(int columns, int rows)
	{
		super(columns, rows);
		// TODO Auto-generated constructor stub
	}
}
