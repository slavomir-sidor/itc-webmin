package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Mirror;
import org.apache.maven.settings.Profile;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

public class MirrorsView extends GridMasterVertical implements View
{

	public static final String VIEW_NAME = "Mirrors";

	public MirrorsView(List<Mirror> beans)
	{
		super();
		table.setContainerDataSource(new BeanItemContainer<Mirror>(Mirror.class, beans));
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}
