package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Mirror;
import org.apache.maven.settings.Profile;
import org.apache.maven.settings.Proxy;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;

public class ProfilesView extends GridMasterVertical implements View
{

	public static final String VIEW_NAME = "Profiles";

	public ProfilesView(List<Profile> beans)
	{
		super();
		table.setContainerDataSource(new BeanItemContainer<Profile>(Profile.class, beans));
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}
