package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Profile;
import org.apache.maven.settings.Proxy;
import org.apache.maven.settings.RuntimeInfo;
import org.apache.maven.settings.Settings;

import com.google.gwt.thirdparty.debugging.sourcemap.FilePosition;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.data.util.PropertysetItem;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TwinColSelect;

import sk.itcloud.AutoForm;
import sk.itcloud.maven.MavenAPI;

public class MainView extends GridLayout implements View
{

	public static final String VIEW_NAME = "Main";

	public MainView(Settings settings)
	{
		super(2, 2);
		setSizeFull();
		PropertysetItem item = new PropertysetItem();
		// item.addItemProperty("file", new ObjectProperty<String>(runtimeInfo.getFile().getAbsolutePath().toString()));
		// item.addItemProperty("localRepositorySourceLevel", new ObjectProperty<String>(runtimeInfo.getLocalRepositorySourceLevel()));

		AutoForm form = new AutoForm();
		form.setFormData(new sk.itcloud.maven.settings.form.Settings());

		BeanItemContainer<Profile> profiles = new BeanItemContainer<Profile>(Profile.class, settings.getProfiles());
		TwinColSelect select = new TwinColSelect("Active Profiles");
		select.setRows(select.size());
		select.setContainerDataSource(profiles);
		select.setSizeFull();

		addComponent(form, 0, 0);
		addComponent(select, 1, 0);

		// select.setValue(new HashSet<String>(Arrays.asList("Venus", "Earth", "Mars")));
		// select.addValueChangeListener layout.addComponent(new Label("Selected: " + event.getProperty().getValue())));
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}