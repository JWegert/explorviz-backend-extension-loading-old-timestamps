package net.explorviz.extension.dummy.main;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SetupListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {

		System.out.println("Hello from dummy extension setup listener.");

		// Start necessary logic of your extension here. Be aware of the undefined
		// execution order of the @Weblistener annotation.

	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
	}

}
