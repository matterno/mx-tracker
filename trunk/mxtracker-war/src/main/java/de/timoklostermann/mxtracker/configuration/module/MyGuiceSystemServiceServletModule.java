package de.timoklostermann.mxtracker.configuration.module;

import java.util.HashSet;
import java.util.Set;

import com.google.api.server.spi.guice.GuiceSystemServiceServletModule;

import de.timoklostermann.mxtracker.endpoints.StatusEndpoint;

public class MyGuiceSystemServiceServletModule extends GuiceSystemServiceServletModule {
	
	@Override
	protected void configureServlets() {
		super.configureServlets();
		
		Set<Class<?>> serviceClasses = new HashSet<Class<?>>();
		serviceClasses.add(StatusEndpoint.class);
		this.serveGuiceSystemServiceServlet("/_ah/spi/*", serviceClasses);
	}
}
