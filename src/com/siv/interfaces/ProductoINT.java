/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.interfaces;

import com.siv.beans.Producto;
import java.util.List;


/**
 *
 * @author willian
 * Terminacion INT por interface.
 * Metodos para la capa de acceso a Datos.
 */

public interface ProductoINT {
    
    public int insert(Producto articulo);
    public List<Producto> getAll();
    public Producto getProducto(int id);
    public int getProducto(String nombre);
    public Producto getProductobyNombre(String nombre);
    public int update(Producto articulo);
    public int delete(int id);
    
    public int insertIGV(int igv);
    public int getIGV();
    public int updateIGV(int igv);
}
