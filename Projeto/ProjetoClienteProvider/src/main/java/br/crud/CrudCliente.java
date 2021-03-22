
package br.crud;

import br.model.Cliente;
import java.util.ArrayList;

/**
 * @author Vicente Moraes
 * @since 16 de mar de 2021
 */
public class CrudCliente {
    private static ArrayList<Cliente> listaCli = new ArrayList();
    
    public void adicionar(Cliente cliente){
        listaCli.add(cliente);
    }
    
    public Cliente getCliente(int cod){
        boolean achou=false;
        for (Cliente cliente : listaCli) {
            if(cliente.getCodigo()== cod){
                achou=true;
                return cliente;
            }
        }
        if(!achou){
            return null;
        }
        return null;
    }
    
    public ArrayList<Cliente> getTodos(){
        return listaCli;
    }
    
    public void excluir(int cod){
        Cliente cliente = getCliente(cod);
        if(cliente!=null){
            listaCli.remove(cliente);
        }
    } 
    
    public void alterar(Cliente cliente){
        Cliente cli = getCliente(cliente.getCodigo());
        cli.setNome(cliente.getNome());
    }
}
