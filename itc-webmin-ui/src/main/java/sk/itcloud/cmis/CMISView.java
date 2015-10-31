package sk.itcloud.cmis;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Map.Entry;

import com.offbytwo.jenkins.JenkinsServer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TreeTable;
import org.apache.http.*;

public class CMISView extends TabSheet implements View
{

	public static final String VIEW_NAME = "Documents";

	public CMISView()
	{

		super();

		setSizeFull();
		setWidth("100%");
		setHeight("100%");

		/*try
		{
			URI jenkinsURI=new URI("http", "localhost", "8180");
			JenkinsServer jenkins = new JenkinsServer(jenkinsURI);

			try
			{
				Map<String, com.offbytwo.jenkins.model.View> jenkinsViews = jenkins.getViews();
				
				addTab(new Label(jenkins.toString()), "Jenkins");
				
				for (Entry<String, com.offbytwo.jenkins.model.View> entry : jenkinsViews.entrySet())
				{
					addTab(new TreeTable(), entry.getKey());
				}

			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (URISyntaxException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	@Override
	public void enter(ViewChangeEvent event)
	{
	}
}