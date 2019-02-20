/*package com.mma.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "MODULE")
public class Module implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MODULE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer moduleid;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DESCRIPTION")
	private String desc;

	@OneToOne
	private Subject subjectid;
	
	public Module() {
	}

	public Integer getModuleid() {
		return moduleid;
	}

	public void setModuleid(Integer moduleid) {
		this.moduleid = moduleid;
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

	public Subject getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(Subject subjectid) {
		this.subjectid = subjectid;
	}

}*/
