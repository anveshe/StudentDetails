package com.epamTraining.studentDetails;

public class Student {
private String name,email,course;
private long fee;
private String contactno;

public Student(String name, String email, String course, long fee, String contactno) {
	super();
	this.name = name;
	this.email = email;
	this.course = course;
	this.fee = fee;
	this.contactno = contactno;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public long getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}

}
