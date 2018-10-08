package com.mma.upsc.Quiz;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(value = "Membership", description = "Operations pertaining to Membership")
@RestController
@RequestMapping("/product")
public class QuizController {

	@Inject
	QuizService qs;
	
	@RequestMapping(value = "/v1/membership", method = RequestMethod.GET)
	public Question Hello(Question q) throws InterruptedException {
		Question rem =  qs.Helloqs(q);
		System.out.println(rem.getOp1());
		return rem;
	}

}
