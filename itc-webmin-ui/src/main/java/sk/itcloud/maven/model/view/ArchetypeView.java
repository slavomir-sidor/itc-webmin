package sk.itcloud.maven.model.view;

import org.atmosphere.interceptor.PaddingAtmosphereInterceptor;

import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;

import sk.itcloud.AutoForm;
import sk.itcloud.maven.AetherAPI;

/**
 * @author jahman
 *
 */
public class ArchetypeView extends VerticalLayout
{
	protected AutoForm form;
	protected GridLayout grid;

	public ArchetypeView()
	{
		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");
		AetherAPI aetherAPI=new AetherAPI();
		
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
	 * @return the grid
	 */
	public GridLayout getGrid()
	{
		return grid;
	}

	/**
	 * @param grid
	 *            the grid to set
	 */
	public void setGrid(GridLayout grid)
	{
		this.grid = grid;
	}
}