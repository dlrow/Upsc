package com.mma.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SUBJECT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subjectid;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DESCRIPTION")
	private String desc;

	public Subject() {
	}

	public Subject(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public Integer getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(Integer subjectid) {
		this.subjectid = subjectid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
