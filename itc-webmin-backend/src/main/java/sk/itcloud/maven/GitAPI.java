package sk.itcloud.maven;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

public class GitAPI
{
	public GitAPI(String pathname)
	{
		super();
		FileRepositoryBuilder builder = new FileRepositoryBuilder();
		try
		{
			Repository repository = builder.setGitDir(new File(pathname)).readEnvironment().findGitDir().build();

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}