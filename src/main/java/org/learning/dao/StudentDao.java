package org.learning.dao;

import java.util.ArrayList;
import java.util.List;

import org.learning.entity.Student;

public class StudentDao {
	List<Student> list;

	public StudentDao() {
		super();
		SubjectDao sdao = new SubjectDao();
		list = new ArrayList<Student>();
		list.add(new Student(1, "kusum", 26, "Female", "Ghazipur", 1, sdao.getClassSubject(1)));
		list.add(new Student(2, "Prabhu", 12, "Male", "Ghazipur", 2, sdao.getClassSubject(2)));
		list.add(new Student(3, "Sushma", 23, "Female", "Hyderabad", 3, sdao.getClassSubject(3)));
		list.add(new Student(4, "Sashi", 25, "Male", "Rachi", 1, sdao.getClassSubject(1)));
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
	public List<Student> deleteStudent(int id)
	{
		for (Student s : list) {
			if (s.getStudentId() == id) {
				list.remove(s);
				return list;
			}
		}
		return null;
	}
	
	
	public List<Student> updateStudent(Student student)
	{
		for(Student s:list)
		{
			if(s.getStudentId()==student.getStudentId())
			{
				list.remove(s);
				list.add(student);
				return list;
			}
		}
		return null;
		
		
	}

}
