/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.interfaces;

import com.siv.beans.Usuario;
import java.util.List;

/**
 *
 * @author willex
 */
public interface UsuarioINT {
    public Usuario getUser(String nombre, String password,String id);
    public Usuario getUser(int id);
    public int save(Usuario user);
    public int update(Usuario user);
    public int delete(int id);
    public List<Usuario> getAll();
}
