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

@ApplicationPath("/extension/dummy")
public class Application extends ResourceConfig {

	public Application() {

		// register the models that you wan't to parse to JSONAPI-conform JSON,
		// i.e. exchange with frontend
		final ResourceConverterFactory factory = new ResourceConverterFactory();
		factory.registerClass(DummyModel.class);
		factory.registerClass(SubDummyModel.class);

		final AbstractBinder dependencyBinder = new ExtensionDependencyInjectionBinder();
		dependencyBinder.bindFactory(factory).to(ResourceConverter.class).in(Singleton.class);

		// register DI
		register(dependencyBinder);

		// Enable CORS
		register(CORSResponseFilter.class);

		// register all providers in the given package
		register(DummyModelProvider.class);

		// register all resources in the given package
		packages("net.explorviz.extension.dummy.resources");
	}
}
