package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Profile;
import org.apache.maven.settings.Server;
import org.apache.maven.settings.Settings;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.data.Item;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;
import eu.livotov.labs.vaadin.autoforms.AutoForm;
import sk.itcloud.maven.settings.forms.ServersForm;

public class ServerView extends FormLayout
{

	public ServerView(Server item)
	{
		super();
	}
}
