/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

/**
 * @author Vicente Moraes
 * @since 16/03/2021
 */
public class Cliente {

    private int codigo;
    private String nome;
    private Cidade cidade;

    public Cliente() {
    }

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Cliente(int codigo, String nome, Cidade cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int i) {
        this.codigo = i;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String string) {
        this.nome = string;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
}
