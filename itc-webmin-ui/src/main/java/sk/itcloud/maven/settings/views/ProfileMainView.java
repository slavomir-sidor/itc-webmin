package sk.itcloud.maven.settings.views;

import org.apache.maven.settings.Profile;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.FormLayout;

public class ProfileMainView extends FormLayout implements View
{

	public static final String VIEW_NAME = "Main";

	public ProfileMainView(Profile profile)
	{
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}