/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.interfaces;

import com.siv.beans.Categoria;
import java.util.List;


/**
 *
 * @author Administrador
 * terminacion INT por interface
 * Metodos para la capa de acceso a datos
 */

public interface CategoriaINT {
    
    public int insert(Categoria categoria);
    public List<Categoria> getAll();
    public Categoria getCategoria(int id);
    public int getCategoria(String desc);
    public int update (Categoria categoria);
    public int delete (int id);
}
