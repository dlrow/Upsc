package com.mma.Quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mma.domain.Subject;

import io.swagger.annotations.Api;

@Api(value = "Quiz", description = "Operations pertaining to Subj")
@RestController
@RequestMapping("/product")
public class QuizController {

	@Autowired
	QuizService qs;
	
	@RequestMapping(value = "/v1/ssaveSub", method = RequestMethod.POST)
	public String Hello(Integer i) throws InterruptedException {
		Subject s=new Subject("name", "de", i);
		qs.save(s);
		return "ok";
	}
	
	@RequestMapping(value = "/v1/find", method = RequestMethod.GET)
	public List<Subject> findAll() throws InterruptedException {
		return qs.findAll();
	}
	
	

}
