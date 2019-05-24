package com.tunedapps.reg.servlets;

import com.tunedapps.reg.entites.Student;
import com.tunedapps.reg.repository.Repository;
import com.tunedapps.reg.repository.RepositoryImpl;
import com.tunedapps.reg.repository.StudentsIdGenerator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/students")
public class StudentsController {

    private Repository<Long, Student> repository = new RepositoryImpl<>(new StudentsIdGenerator());

    @Path("/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
    public Response getStudent(@PathParam("id") long id) {
        Student student = repository.findById(id);
        if (student == null)
            return Response.status(Response.Status.NOT_FOUND).build();
        return Response.ok(student).build();
    }

}
