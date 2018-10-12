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

@Api(value = "Quiz", description = "Operations pertaining to Subj")
@RestController
@RequestMapping("/subject")
public class QuizController {

	/*@Inject
	Logger log;*/

	@Autowired
	QuizService qs;

	@RequestMapping(value = "/v1/saveSub", method = RequestMethod.POST)
	public String Hello(@RequestParam(value = "name") String name, @RequestParam(value = "desc") String desc)
			throws InterruptedException {
		Subject s = new Subject(name, desc);
		qs.save(s);
		return "ok";
	}

	
	@RequestMapping(value = "/v1/getAllSubjects", method = RequestMethod.DELETE)
	public String deleteSub(@RequestParam(name="subid" ) Integer subid) throws InterruptedException {
		// log.info("findAll subject method called :");
		qs.deleteSubid(subid);
		// log.info("populated {}",sbos);
		return "Deleted";
	}
	@RequestMapping(value = "/v1/getAllSubjects", method = RequestMethod.GET)
	public List<SubjectBo> findAll() throws InterruptedException {
		// log.info("findAll subject method called :");
		List<Subject> subjects = qs.findAll();
		// log.info("retreived {}",subjects);
		List<SubjectBo> sbos = new ArrayList<>();
		subjects.forEach(s -> {
			SubjectBo sb = new SubjectBo();
			sb.setDesc(s.getDesc());
			sb.setName(s.getName());
			sb.setSubid(s.getSubjectid());
			sbos.add(sb);
		});
		// log.info("populated {}",sbos);
		return sbos;
	}

}
