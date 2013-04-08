/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.services;

import com.siv.beans.DetalleVenta;
import com.siv.interfaces.DetalleVentaINT;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author willex
 */
@Service
public class DetalleVentaSER {
    
    @Autowired
    private DetalleVentaINT detalleVentaINT;
    
    public int insert(DetalleVenta dv){
        return detalleVentaINT.insert(dv);
    }
    
    public List<DetalleVenta> getAll(int id){
        return detalleVentaINT.getDetalles(id);
    }
}
