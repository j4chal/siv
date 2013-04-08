/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.services;

import com.siv.beans.Cliente;
import com.siv.interfaces.ClienteINT;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author willex
 */
@Service
public class ClienteSER {
    
    @Autowired
    private ClienteINT clienteINT;
    
    public int insert(Cliente c){
        return clienteINT.insert(c);
    }
    
    public int delete(int id){
        return clienteINT.delete(id);
    }
    
    public int update(Cliente c){
        return clienteINT.update(c);
    }
    
    public List<Cliente> getAll(){
        return clienteINT.getAll();
    }
    
    public Cliente getCliente(int id){
        return clienteINT.getCliente(id);
    }
    
    public Cliente getClienteByDni(int dni){
        return clienteINT.getClienteByDni(dni);
    }
    
    public Cliente getCliente(String dni, String nomb, String ape){
        return clienteINT.getCliente(dni,nomb,ape);
    }
    
    //Para Reportes
    public List<Cliente> getAllWithEmail(){
        return clienteINT.getAllwithEmail();
    }
}
