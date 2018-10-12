package com.mma.Quiz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mma.Bo.SubjectBo;
import com.mma.domain.Subject;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Api(value = "Subject", description = "Operations pertaining to adding or deleting Subjects")
@RestController
@RequestMapping("/subject")
public class QuizController {

	@Autowired
	SubjectService subjectService;

	@RequestMapping(value = "/v1/saveSub", method = RequestMethod.POST)
	public String Hello(@RequestParam(value = "name") String name, @RequestParam(value = "description") String desc)
			throws InterruptedException {
		Subject s = new Subject(name, desc);
		subjectService.save(s);
		return "ok";
	}

	@RequestMapping(value = "/v1/deleteSubject", method = RequestMethod.DELETE)
	public String deleteSub(@RequestParam(name = "subid") Integer subid) throws InterruptedException {
		subjectService.deleteSubid(subid);
		return "Deleted";
	}

	@RequestMapping(value = "/v1/getAllSubjects", method = RequestMethod.GET)
	public List<SubjectBo> findAll() throws InterruptedException {
		log.info("findAll subject method called :");
		List<Subject> subjects = subjectService.findAll();
		log.info("retreived {}", subjects);
		List<SubjectBo> sbos = new ArrayList<>();
		subjects.forEach(s -> {
			SubjectBo sb = new SubjectBo();
			sb.setDesc(s.getDesc());
			sb.setName(s.getName());
			sb.setSubid(s.getSubjectid());
			sbos.add(sb);
		});
		return sbos;
	}

}
