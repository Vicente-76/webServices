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

    private int codigo;
    private String nome;
    
    @Override
    public int getCodigo() {
       return codigo;
    }

    @Override
    public void setCodigo(int i) {
        this.codigo = i;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String string) {
        this.nome = string;
    }
    
}
