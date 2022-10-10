package com.yash.exceptions_1;

public class Student {

	private int rollno;
	private String sname;
	private String saddress;
	private StudentResult srobj;
	
public StudentResult getSrobj() {
		return srobj;
	}
	public void setSrobj(StudentResult srobj) {
		this.srobj = srobj;
	}
public Student() {
	// TODO Auto-generated constructor stub
}	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	
	
	
}
