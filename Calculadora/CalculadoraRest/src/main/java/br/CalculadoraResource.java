/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Vicente Moraes
 */
@Path("calculadora")
@RequestScoped
public class CalculadoraResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CalculadoraResource
     */
    public CalculadoraResource() {
    }

    /**
     * Retrieves representation of an instance of br.CalculadoraResource
     * @param v1
     * @param v2
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/{v1}/{v2}")
    @Produces(MediaType.APPLICATION_JSON)
    public int getJson(@PathParam("v1")int v1,@PathParam("v2")int v2) {
        return v1+v2;
    }

    /**
     * PUT method for updating or creating an instance of CalculadoraResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
}
