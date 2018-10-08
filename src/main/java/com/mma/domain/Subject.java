package com.mma.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "SUBJECT")
public class Subject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SUBJECT_ID")
	private Integer subjectid;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DESC")
	private String desc;

	public Subject() {
	}

	public Subject(String name, String desc, Integer id) {
		this.subjectid = id;
		this.name = name;
		this.desc = desc;
	}

}
