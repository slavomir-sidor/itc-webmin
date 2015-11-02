package sk.itcloud.maven.settings.views;

import java.util.List;
import org.apache.maven.settings.Proxy;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Table;

public class ProxiesView extends Table
{
	public ProxiesView(List<Proxy> beans)
	{
		super("Proxies", new BeanItemContainer<Proxy>(Proxy.class, beans));
	}
}
