/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.services;

import com.siv.beans.Categoria;
import com.siv.interfaces.CategoriaINT;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrador
 */
@Service
public class CategoriaSER {
    
    @Autowired
    private CategoriaINT categoriaINT;
    
    public int insert(Categoria cat){
        return categoriaINT.insert(cat);
    }
    
    public List<Categoria> getAll(){
        return this.categoriaINT.getAll();
    }
    
    public int delete(int id){
        return categoriaINT.delete(id);
    }
    
    public int update(Categoria cat){
        return categoriaINT.update(cat);
    }
    
    public Categoria getCategoria(int id){
        return categoriaINT.getCategoria(id);
    }
    
    public Integer getCategoria(String desc){
        return categoriaINT.getCategoria(desc);
    }
}
