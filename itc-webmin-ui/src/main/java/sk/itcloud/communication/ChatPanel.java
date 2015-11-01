package sk.itcloud.communication;

import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class ChatPanel extends VerticalLayout 
{

	public ChatPanel()
	{
		super();
		setSizeFull();
		setWidth("100%");
		setHeight("100%");
		
		addComponent(new TextField());
	}
}