package net.explorviz.extension.dummy.main;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.github.jasminb.jsonapi.ResourceConverter;

import net.explorviz.extension.dummy.model.DummyModel;
import net.explorviz.extension.dummy.model.SubDummyModel;
import net.explorviz.extension.dummy.providers.DummyModelProvider;
import net.explorviz.injection.ResourceConverterFactory;
import net.explorviz.server.main.DependencyInjectionBinder;

@ApplicationPath("/extension/dummy")
public class Application extends ResourceConfig {

	public Application() {

		final AbstractBinder dependencyBinder = new DependencyInjectionBinder();

		final ResourceConverterFactory factory = new ResourceConverterFactory();
		factory.registerClass(DummyModel.class);
		factory.registerClass(SubDummyModel.class);

		dependencyBinder.bindFactory(factory).to(ResourceConverter.class).in(Singleton.class);

		// bind your possible injections here
		// dependencyBinder.bind(X.class).to(Y.class).in(Singleton.class);

		// register DI
		register(dependencyBinder);

		// register all providers in the given package
		register(DummyModelProvider.class);

		// register all resources in the given package
		packages("net.explorviz.extension.dummy.resources");
	}
}
