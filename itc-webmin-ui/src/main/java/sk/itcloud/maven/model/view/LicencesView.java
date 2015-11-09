package sk.itcloud.maven.model.view;

import java.util.List;

import org.apache.maven.model.License;
import org.apache.maven.model.MailingList;
import org.apache.maven.model.Model;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalLayout;

import eu.livotov.labs.vaadin.autoforms.AutoForm;
import sk.itcloud.GridMasterHorizontal;
import sk.itcloud.maven.model.form.Dependency;

public class LicencesView extends GridMasterHorizontal implements View
{

	public static final String VIEW_NAME = "Licences";

	public LicencesView(List<License> items)
	{
		super();
		getTable().setContainerDataSource(new BeanItemContainer<License>(License.class, items));
		getForms().get(0).setFormData(new sk.itcloud.maven.model.form.License());
	}
}