package com.mma.upsc.Quiz;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mma"))
                .paths(regex("/product.*"))
                .build()
                .apiInfo(metaData());
    }
    
    private ApiInfo metaData() {
        return null;
    	/*ApiInfo apiInfo = new ApiInfo("", "", "", "", "", "", ""); 
        return apiInfo;*/
    }
}