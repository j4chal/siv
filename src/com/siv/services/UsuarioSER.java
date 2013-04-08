/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.services;

import com.siv.beans.Usuario;
import com.siv.interfaces.UsuarioINT;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author willex
 */
@Service
public class UsuarioSER {
    
    @Autowired
    private UsuarioINT usuarioINT;
    
    public Usuario getUser(String user, String pass,String id_sistema){
        return usuarioINT.getUser(user, pass,id_sistema);
    }
    
    public Usuario getUser(int id){
        return usuarioINT.getUser(id);
    }
    
    public List<Usuario> getAll(){
        return usuarioINT.getAll();
    }
    
    public int delete(int id){
        return usuarioINT.delete(id);
    }
    
    public int insert(Usuario user){
        return usuarioINT.save(user);
    }
    
    public int update(Usuario user){
        return usuarioINT.update(user);
    }
}
