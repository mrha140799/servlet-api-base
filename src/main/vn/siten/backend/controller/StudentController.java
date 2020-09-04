package main.vn.siten.backend.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.vn.siten.backend.entity.Student;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StudentController {
    @GET
    @Path("/student")
    public Response getStudent() throws JsonProcessingException {
        Student student = new Student("1", "Trong Ha", "18");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(student);
        return Response.status(200).entity(json).build();
    }
}
