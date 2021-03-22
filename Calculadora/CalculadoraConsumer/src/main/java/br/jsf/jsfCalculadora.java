/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.ClienteRest;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Vicente Moraes
 */
@Named(value = "jsfCalculadora")
@RequestScoped
public class jsfCalculadora {

    /**
     * Creates a new instance of jsfCalculadora
     */
    public jsfCalculadora() {
    }
 
    private int valor1, valor2, soma;

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
  
    public void Somar(){
        
        
        ClienteRest cr = new ClienteRest();
        this.soma = cr.getJson(valor1, valor2);
        cr.close();
        //return soma;
    }
        
}
