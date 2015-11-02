package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Mirror;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Table;

public class MirrorsView extends Table
{
	public MirrorsView(List<Mirror> beans)
	{
		super("Mirrors", new BeanItemContainer<Mirror>(Mirror.class, beans));
	}
}
