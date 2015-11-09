package sk.itcloud.maven.model.view;

import java.util.List;

import org.apache.maven.model.Developer;
import org.apache.maven.model.MailingList;
import org.apache.maven.model.Model;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalLayout;

import eu.livotov.labs.vaadin.autoforms.AutoForm;
import sk.itcloud.GridMasterVertical;
import sk.itcloud.maven.model.form.Dependency;

public class MailingListView extends GridMasterVertical implements View
{
	public static final String VIEW_NAME = "Mailing List";

	public MailingListView(List<MailingList> items)
	{
		super();
		getTable().setData(new BeanItemContainer<MailingList>(MailingList.class, items));
		getForms().get(0).setFormData(new sk.itcloud.maven.model.form.MailingList());
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
		// TODO Auto-generated method stub

	}
}