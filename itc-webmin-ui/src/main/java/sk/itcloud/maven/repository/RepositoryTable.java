package sk.itcloud.maven.repository;

import com.vaadin.data.Container;
import com.vaadin.ui.Component;
import com.vaadin.ui.Table;

public class RepositoryTable extends Table implements Component
{

	public RepositoryTable()
	{
		super();
		
	}

	public RepositoryTable(String caption, Container dataSource)
	{
		super(caption, dataSource);
		// TODO Auto-generated constructor stub
	}

	public RepositoryTable(String caption)
	{
		super(caption);
		// TODO Auto-generated constructor stub
	}

}
