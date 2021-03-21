package org.learning.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	int studentId;
	String name;
	int age;
	String gender;
	String address;

	public Student() {

	}

	public Student(int studentId, String name, int age, String gender, String address) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;

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
