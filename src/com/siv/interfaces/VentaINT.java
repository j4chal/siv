/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.interfaces;

import com.siv.beans.Venta;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface VentaINT {
    
    public int insert (Venta venta);
    public List <Venta> getAll();
    public List<Venta> getAll_Consulta(String estado);
    public Venta getVenta(int id);
    public int update(Venta venta);
    public int delete (int id);
    public String getLastNroVenta();    
    public Integer getLastId();
}
