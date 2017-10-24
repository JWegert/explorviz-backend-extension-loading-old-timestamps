package net.explorviz.extension.dummy.injection;

import org.glassfish.hk2.api.Factory;

import com.github.jasminb.jsonapi.ResourceConverter;
import com.github.jasminb.jsonapi.SerializationFeature;

import net.explorviz.extension.dummy.model.DummyModel;
import net.explorviz.extension.dummy.model.SubDummyModel;

public class ResourceConverterFactory implements Factory<ResourceConverter> {

	private final ResourceConverter converter;

	public ResourceConverterFactory() {
		this.converter = new ResourceConverter(DummyModel.class, SubDummyModel.class);
		this.converter.enableSerializationOption(SerializationFeature.INCLUDE_RELATIONSHIP_ATTRIBUTES);
	}

	@Override
	public ResourceConverter provide() {
		return this.converter;
	}

	@Override
	public void dispose(final ResourceConverter instance) {
		// No need to dispose anything
	}
}
