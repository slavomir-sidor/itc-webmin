package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Mirror;
import org.apache.maven.settings.Profile;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Table;

public class ProfilesView extends Table
{
	public ProfilesView(List<Profile> beans)
	{
		super("Profiles", new BeanItemContainer<Profile>(Profile.class, beans));
	}
}
