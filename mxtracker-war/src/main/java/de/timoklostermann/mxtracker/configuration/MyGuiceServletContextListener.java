package de.timoklostermann.mxtracker.configuration;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

import de.timoklostermann.mxtracker.configuration.module.BaseModule;
import de.timoklostermann.mxtracker.configuration.module.ConfigurationModule;
import de.timoklostermann.mxtracker.configuration.module.MyGuiceSystemServiceServletModule;
import de.timoklostermann.mxtracker.configuration.module.StatusModule;

public class MyGuiceServletContextListener extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new MyGuiceSystemServiceServletModule(), new BaseModule(), new ConfigurationModule(), new StatusModule());
	}

}
