package com.prabhu.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employee")
public class EmployeeResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getEmployess() {
		return "Hello Employee!";
	}

}
