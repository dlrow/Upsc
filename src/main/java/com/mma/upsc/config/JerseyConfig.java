/*package com.mma.upsc.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mma.upsc.Quiz.QuizController;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;

@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		configureSwagger();
		registerEndpoints();
	}

	private void configureSwagger() {
		register(ApiListingResource.class);
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setVersion("1.0.2");
		beanConfig.setSchemes(new String[] { "http" });
		beanConfig.setHost("localhost:8090");
		beanConfig.setBasePath("/");
		beanConfig.setResourcePackage("com.*");
		beanConfig.setPrettyPrint(true);
		beanConfig.setScan(true);
	}

	private void registerEndpoints() {
		register(QuizController.class);
	}
}
*/