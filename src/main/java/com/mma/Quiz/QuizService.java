package com.mma.Quiz;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mma.dao.SubjectRepository;
import com.mma.domain.Subject;

@Service
public class QuizService {

	@Autowired
    DataSource dataSource;
	
	@Autowired
	SubjectRepository subr;
	
//	@Cacheable(cacheNames = "redisCacheManager", key = "#q.toString()")
	public void save(Subject s) {
		subr.save(s);
	}
	
	List<Subject> findAll(){
		return subr.findAll();
	}

	public void deleteSubid(Integer subid) {
		subr.deleteById(subid);
		
	}
}
