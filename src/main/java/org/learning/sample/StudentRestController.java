package org.learning.sample;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.learning.dao.StudentDao;
import org.learning.entity.Student;

@Path("students")
public class StudentRestController {

	public StudentDao studentDao = new StudentDao();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents() {
		return studentDao.getStudentsList();
	}

	@Path("/{studentId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(@PathParam("studentId") int studentId) {

		return studentDao.getStudent(studentId);

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> addStudent(Student student) {
		return studentDao.addStudent(student);

	}
}
