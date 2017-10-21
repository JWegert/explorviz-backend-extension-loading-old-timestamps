package net.explorviz.extension.dummy.main;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SetupListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {

		System.out.println("Hello from dummy extension setup listener.");

		/*
		 * Register your model classes as shown below. The ResourceConverter is used for
		 * (de)serializing all registered and annotated (!) classes to JSON-API-conform
		 * JSON text.
		 */

		// ResourceConverterFactory.classes.add(MyModelClass.class);

		/*
		 * Start necessary logic of your extension here. Be aware of the
		 * nondeterministic execution order of the @Weblistener annotation.
		 */

	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
	}

}
