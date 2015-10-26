/**
 * 
 */
package sk.itcloud.project;

import com.vaadin.data.Container;
import com.vaadin.ui.TreeTable;

/**
 * @author jahman
 *
 */
public class ServerTreeTable extends TreeTable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6478027660729026458L;

	public ServerTreeTable() {
		super();
		setSizeFull();
		setSelectable(true);
		addContainerProperty("Name", String.class, "");
	}

	public ServerTreeTable(String caption, Container dataSource) {
		super(caption, dataSource);
		// TODO Auto-generated constructor stub
	}

	public ServerTreeTable(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}

}
