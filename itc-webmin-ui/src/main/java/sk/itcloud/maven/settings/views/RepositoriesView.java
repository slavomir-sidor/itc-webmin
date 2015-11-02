package sk.itcloud.maven.settings.views;

import java.util.List;

import org.apache.maven.settings.Repository;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Table;

public class RepositoriesView extends Table
{
	public RepositoriesView(List<Repository> repositories)
	{
		super("Repositories", new BeanItemContainer<Repository>(Repository.class, repositories));
	}
}