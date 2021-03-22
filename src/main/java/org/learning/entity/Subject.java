package org.learning.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Subject {
	int id;
	String name;
	String author;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
