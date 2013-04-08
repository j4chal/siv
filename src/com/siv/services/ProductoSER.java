/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.services;

import com.siv.beans.Producto;
import com.siv.interfaces.ProductoINT;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author willian
 */
@Service
public class ProductoSER {
    
    @Autowired
    private ProductoINT productoINT;
    
    public int insert(Producto art){
        return productoINT.insert(art);
    }
    
    public int update(Producto p){
        return productoINT.update(p);
    }
    
    public int delete(int id){
        return productoINT.delete(id);
    }
    
    public List<Producto> getAll(){
        return productoINT.getAll();
    }
    
    public Producto getProductoByNombre(String nomb){
        return productoINT.getProductobyNombre(nomb);
    }
    
    public int getProducto(String nomb){
        return productoINT.getProducto(nomb);
    }
    
    public Producto getProducto(int id){
        return productoINT.getProducto(id);
    }
    
    public int insertIGV(int igv){
        return productoINT.insertIGV(igv);
    }
    
    public int updateIGV(int igv){
        return productoINT.updateIGV(igv);
    }
    
    public int getIGV(){
        return productoINT.getIGV();
    }
}
