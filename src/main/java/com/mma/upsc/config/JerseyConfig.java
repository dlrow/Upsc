/*package com.mma.upsc.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mma.upsc.Quiz.QuizController;

@Component
public class JerseyConfig extends ResourceConfig {
	 public JerseyConfig() {
	        registerEndpoints();
	    }
	    private void configureSwagger() {
	        register(ApiListingResource.class);
	        BeanConfig beanConfig = new BeanConfig();
	        beanConfig.setVersion("1.0.2");
	        beanConfig.setSchemes(new String[]{"http"});
	        beanConfig.setHost("localhost:8080");
	        beanConfig.setBasePath("/");
	        beanConfig.setResourcePackage("your.resource.package.here,your.other.package.here");
	        beanConfig.setPrettyPrint(true);
	        beanConfig.setScan(true);
	    }
	    private void registerEndpoints() {
	        register(QuizController.class);
	    }
	}

*/