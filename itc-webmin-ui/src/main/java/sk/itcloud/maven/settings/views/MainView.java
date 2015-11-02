package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Settings;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.FormLayout;

public class  MainView extends FormLayout implements View
{

	public static final String VIEW_NAME = "Main";

	public MainView(Settings settings)
	{

	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}