package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Mirror;
import org.apache.maven.settings.Profile;

import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

import sk.itcloud.GridMasterVertical;

public class MirrorsView extends GridMasterVertical implements View
{

	public static final String VIEW_NAME = "Mirrors";

	BeanItem<Mirror> item;

	public MirrorsView(List<Mirror> beans)
	{
		super();
		getTable().setContainerDataSource(new BeanItemContainer<Mirror>(Mirror.class, beans));
		getForms().get(0).setFormData(new sk.itcloud.maven.settings.form.Mirror());
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}
