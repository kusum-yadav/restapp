package org.learning.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	int studentId;
	String name;
	int age;
	String gender;
	String address;
	int class_std;
	public int getClass_std() {
		return class_std;
	}

	public void setClass_std(int class_std) {
		this.class_std = class_std;
	}

	List<Subject> subjects;

	public Student(int studentId, String name, int age, String gender, String address, int class_std, List<Subject>  subjects) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.class_std=class_std;
		this.subjects = subjects;
	}

	public List<Subject>  getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject>  subjects) {
		this.subjects = subjects;
	}

	public Student() {

	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
