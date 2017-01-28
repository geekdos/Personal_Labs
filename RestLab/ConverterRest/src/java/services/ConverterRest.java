/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author theXuser
 */
@Path("ConverterRest")
public class ConverterRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ConverterRest
     */
    public ConverterRest() {
    }

    /**
     * Retrieves representation of an instance of services.ConverterRest
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    
    @GET
    @Path("toeuros")
    @Produces(MediaType.APPLICATION_XML)
    public double toEuro(@QueryParam("dh") double montant, @QueryParam("taux") double taux){
        return montant / taux;
    }

    
    @GET
    @Path("todh")
    @Produces(MediaType.TEXT_PLAIN)
    public double toDirhm(@QueryParam("ero") double montant, @QueryParam("taux") double taux){
        return montant * taux;
    }

    /**
     * PUT method for updating or creating an instance of ConverterRest
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
