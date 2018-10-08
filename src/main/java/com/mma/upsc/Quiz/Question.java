package com.mma.upsc.Quiz;

import java.io.Serializable;

public class Question implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOp1() {
		return op1;
	}

	public void setOp1(String op1) {
		this.op1 = op1;
	}

	public String getOp2() {
		return op2;
	}

	public void setOp2(String op2) {
		this.op2 = op2;
	}

	public String getOp3() {
		return op3;
	}

	public void setOp3(String op3) {
		this.op3 = op3;
	}

	Integer sid;
	String question;
	String op1;
	String op2;
	String op3;

	public Question(Integer sid,String ques) {
		this.sid=sid;
		this.question=ques;
	}

	public Question() {
	}

	@Override
	public String toString() {
		return "Question [sid=" + sid + "]";
	}

}
