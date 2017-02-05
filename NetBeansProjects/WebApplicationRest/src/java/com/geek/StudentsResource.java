/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geek;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author theXuser
 */
@Path("students")
public class StudentsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of StudentsResource
     */
    public StudentsResource() {
    }

    /**
     * Retrieves representation of an instance of com.geek.StudentsResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String getStudents() {
         return "La liste des etudiant";
    }

}
