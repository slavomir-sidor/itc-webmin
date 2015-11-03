package sk.itcloud.maven.settings.views;

import org.apache.maven.settings.Activation;
import org.apache.maven.settings.Profile;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.FormLayout;

public class ActivationView extends FormLayout implements View
{

	public static final String VIEW_NAME = "Activation";

	public ActivationView(Activation activation)
	{
		
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}