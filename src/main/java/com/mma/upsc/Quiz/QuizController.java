package com.mma.upsc.Quiz;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(value = "Membership", description = "Operations pertaining to Membership")
@ComponentScan({ "com.*" })
@RestController
@RequestMapping("/product")
public class QuizController {
	
	@RequestMapping(value = "/v1/membership", method = RequestMethod.GET)
	@Cacheable("jk")
	public String Hello() throws InterruptedException {
		Thread.sleep(5000);
		return "HEllo";
	}

}
