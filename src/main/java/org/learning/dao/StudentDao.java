package org.learning.dao;

import java.util.ArrayList;
import java.util.List;

import org.learning.entity.Student;

public class StudentDao {
	List<Student> list;

	public StudentDao() {
		super();
		list = new ArrayList<Student>();
		list.add(new Student(1, "kusum", 26, "Female", "Ghazipur"));
		list.add(new Student(2, "Prabhu", 12, "Male", "Ghazipur"));
		list.add(new Student(3, "Sushma", 23, "Female", "Hyderabad"));
		list.add(new Student(4, "Sashi", 25, "Male", "Rachi"));
	}

	public List<Student> getStudentsList() {
		return list;
	}

	public Student getStudent(int id) {
		for (Student s : list) {
			if (s.getStudentId() == id) {
				return s;
			}
		}
		return null;
	}

	public List<Student> addStudent(Student s) {
		list.add(s);
		return list;
	}

}
