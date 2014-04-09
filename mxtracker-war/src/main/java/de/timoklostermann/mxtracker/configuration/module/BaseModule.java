package de.timoklostermann.mxtracker.configuration.module;

import com.google.inject.servlet.ServletModule;
import com.googlecode.objectify.ObjectifyFilter;

public class BaseModule extends ServletModule {

	@Override
	protected void configureServlets() {
		filter("*/").through(ObjectifyFilter.class);
	}
}
