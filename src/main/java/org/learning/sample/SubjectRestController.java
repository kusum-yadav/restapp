package org.learning.sample;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.learning.dao.SubjectDao;
import org.learning.entity.Subject;

@Path("subjects")
public class SubjectRestController {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Subject> getAllSubjects()
	{
		SubjectDao sdao = new SubjectDao();
		return sdao.allSubjectList();
		
	}

}
