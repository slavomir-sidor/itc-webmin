package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Mirror;
import org.apache.maven.settings.Profile;
import org.apache.maven.settings.Server;
import org.apache.maven.settings.Settings;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;

public class MirrorsView extends HorizontalLayout
{

	BeanItemContainer<Mirror> items;

	public MirrorsView(org.apache.maven.settings.Settings settings, int index)
	{
		super();
		items = new BeanItemContainer<Mirror>(Mirror.class, settings.getMirrors());
		Table table = new Table("Mirrors", items);
		addComponent(table);
	}

	public MirrorsView(Component... children)
	{
		super(children);
		// TODO Auto-generated constructor stub
	}

}
