/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.interfaces;

import com.siv.beans.Cliente;
import java.util.List;

/**
 *
 * @author willex
 */
public interface ClienteINT {
    public int insert(Cliente c);
    public int delete(int id);
    public int update(Cliente c);
    public Cliente getCliente(int id);
    public Cliente getClienteByDni(int dni);
    public Cliente getCliente(String dni,String nombres,String apellidos);
    public List<Cliente> getAll();
    
    //Para reportes
    public List<Cliente> getAllwithEmail();
}
