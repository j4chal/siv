/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.interfaces;

import com.siv.beans.DetalleVenta;
import java.util.List;

/**
 *
 * @author willex
 */
public interface DetalleVentaINT {
    
    public int insert(DetalleVenta dv);
    public DetalleVenta getDetalleVenta(int id);
    public List<DetalleVenta> getDetalles(int id);
}
