package org.learning.sample;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.learning.dao.StudentDao;
import org.learning.dao.SubjectDao;
import org.learning.entity.Student;
import org.learning.entity.Subject;

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

	@Path("/{studentId}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> deleteStudent(@PathParam("studentId") int studentId) {
		return studentDao.deleteStudent(studentId);
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Student> updateStudentRecord(Student student)
	{
		return studentDao.updateStudent(student);
	}
	
	@Path("/{studentId}/subjects")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Subject> getAllSubjectsForaStudent(@PathParam("studentId")int studentId)
	{
		Student student= studentDao.getStudent(studentId);
		if(student!=null)
		{
			int class_std= student.getClass_std();
			SubjectDao sdao = new SubjectDao();
			return sdao.getClassSubject(class_std);
		}
		
		return null;
	}
}
