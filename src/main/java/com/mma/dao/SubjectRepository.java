package com.mma.dao;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mma.domain.Subject;


@Configuration
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
	
	List<Subject> findBySubjectid(Integer id);


}
