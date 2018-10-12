package com.mma.Quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.*")
@EnableSwagger2
@EnableCaching
@EntityScan(basePackages="com.mma.domain")
@EnableJpaRepositories(basePackages = "com.mma.dao")
public class QuizApplication  {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}
}
