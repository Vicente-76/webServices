/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.model.Cidade;
import br.model.Cliente;
import br.rs.CidadeRest;
import br.rs.ClienteRest;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Vicente Moraes
 */
@Named(value = "jsfCliente")
@RequestScoped
public class jsfCliente {

    /**
     * Creates a new instance of jsfCliente
     */
    public jsfCliente() {
    }
    
    private int codigo;
    private String nome;
    private Cidade cidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    public ArrayList<Cliente> getAll(){
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        ClienteRest cliR = new ClienteRest();
        listaCliente = cliR.getJson(ArrayList.class);
        cliR.close();
        return listaCliente;
    }
    
    public void adiciona(){
        Cliente cli = new Cliente(codigo, nome, cidade);
        ClienteRest cliR = new ClienteRest();
        cliR.putJson(cli);
        cliR.close();
    }
    
    public ArrayList<Cidade> getAllCidade(){
        ArrayList<Cidade> listaCidade = new ArrayList<>();
        CidadeRest cidR = new CidadeRest();
        listaCidade = cidR.get(ArrayList.class);
        cidR.close();
        return listaCidade;
    }
    
}
