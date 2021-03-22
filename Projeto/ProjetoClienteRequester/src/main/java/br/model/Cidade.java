/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

import br.alerario.ICidade;

/**
 *
 * @author Vicente Moraes
 */
public class Cidade implements ICidade{

    private int codigo_cidade;
    private String nome_cidade;

    public Cidade(int codigo, String nome) {
        this.codigo_cidade = codigo;
        this.nome_cidade = nome;
    }
    
    @Override
    public int getCodigo() {
       return codigo_cidade;
    }

    @Override
    public void setCodigo(int i) {
        this.codigo_cidade = i;
    }

    @Override
    public String getNome() {
        return nome_cidade;
    }

    @Override
    public void setNome(String string) {
        this.nome_cidade = string;
    }
    
}
