package sk.itcloud;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.Responsive;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 */
@Theme("mytheme")
@Widgetset("sk.itcloud.ITCWebminWidgetset")
public class ITCWebminUI extends UI {

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		Responsive.makeResponsive(this);
		setLocale(vaadinRequest.getLocale());
		getPage().setTitle("ITCloud Webmin");
		addStyleName(ValoTheme.UI_WITH_MENU);
		setContent(new MainScreen(ITCWebminUI.this));
		getNavigator().navigateTo(getNavigator().getState());
	}

	@WebServlet(urlPatterns = "/*", name = "ITCWebminUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = ITCWebminUI.class, productionMode = false)
	public static class ITCWebminUIServlet extends VaadinServlet {
	}
}
