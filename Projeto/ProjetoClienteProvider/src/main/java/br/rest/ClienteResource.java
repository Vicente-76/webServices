/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rest;

import br.crud.CrudCliente;
import br.model.Cidade;
import br.model.Cliente;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Vicente Moraes
 */
@Path("cliente")
@RequestScoped
public class ClienteResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ClienteResource
     */
    public ClienteResource() {
    }

    /**
     * Retrieves representation of an instance of br.rest.ClienteResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Cliente> getJson() {
        return new CrudCliente().getTodos();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cliente getCliente(@PathParam("id") int cod) {
        return new CrudCliente().getCliente(cod);
    }
    
    /**
     * PUT method for updating or creating an instance of ClienteResource
     * @param content representation for the resource
     */
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{codigo}/{nome}/{cidade}")
    public void putJson(@PathParam("codigo") int codigo, @PathParam("nome") String nome, @PathParam("cidade") Cidade cidade) {
        Cliente cli = new Cliente(codigo, nome, cidade);
        new br.crud.CrudCliente().adicionar(cli);
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
        ObjectMapper om = new ObjectMapper();
        try{
            Cliente cli =  om.readValue(content, Cliente.class);
            new br.crud.CrudCliente().alterar(cli);
        }catch(Exception e){
            System.out.println("erro: " + e.getMessage());
        }
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") int cod) {
         new CrudCliente().excluir(cod);
    }
}
