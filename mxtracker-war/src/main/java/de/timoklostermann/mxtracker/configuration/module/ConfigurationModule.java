package de.timoklostermann.mxtracker.configuration.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.googlecode.objectify.ObjectifyFilter;

public class ConfigurationModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ObjectifyFilter.class).in(Singleton.class);
	}

}
