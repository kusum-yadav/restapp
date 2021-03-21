package org.learning.sample;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.learning.dao.StudentDao;
import org.learning.entity.Student;

@Path("students")
public class StudentResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents() {
		StudentDao studentDao = new StudentDao();
		return studentDao.getStudentsList();
	}

}
