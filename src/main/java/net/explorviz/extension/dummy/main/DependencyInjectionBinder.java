package net.explorviz.extension.dummy.main;

import javax.inject.Singleton;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import com.github.jasminb.jsonapi.ResourceConverter;

import net.explorviz.extension.dummy.injection.ResourceConverterFactory;

public class DependencyInjectionBinder extends AbstractBinder {
	@Override
	public void configure() {

		this.bindFactory(ResourceConverterFactory.class).to(ResourceConverter.class).in(Singleton.class);

	}
}
