package sk.itcloud.maven.scm;

import java.io.File;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;

public class RepositoryView extends HorizontalLayout
{

	public RepositoryView()
	{
		super();

		// FileRepositoryBuilder builder = new org.eclipse;
		// Repository repository = builder.setGitDir(new File("/var/www/jahman/domains/itc-webmin.jahman/"))
		// .readEnvironment() // scan environment GIT_* variables
		// .findGitDir() // scan up the file system tree
		// .build();
	}

	public RepositoryView(Component... children)
	{
		super(children);
		// TODO Auto-generated constructor stub
	}

}
