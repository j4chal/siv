/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.services;

import com.siv.beans.DetalleVenta;
import com.siv.beans.Venta;
import com.siv.interfaces.VentaINT;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author willex
 */
@Service
public class VentaSER {
    
    @Autowired
    private VentaINT ventaINT;
    
    @Autowired
    private DetalleVentaSER detalleVentaSER;
    
    public int insert(Venta v){
        return ventaINT.insert(v);
    }
    
    public int delete(int id){
        return ventaINT.delete(id);
    }
    
    public Venta getVenta(int id){
        return ventaINT.getVenta(id);
    }
    
    public String getLastNroVenta(){
        return ventaINT.getLastNroVenta();
    }
    
    public List<Venta> getAll(){
        return ventaINT.getAll();
    }
    
    public List<Venta> getAll_Consulta(String estado){
        return ventaINT.getAll_Consulta(estado);
    }
    
    public Integer getLastID(){
        return ventaINT.getLastId();
    }
    
    @Transactional
    public Integer insert(Venta v,List<DetalleVenta> lta){
        int result = 0;
        int rpta = ventaINT.insert(v);
        if(rpta==1){
            int lastID = ventaINT.getLastId();
            v.setId(lastID);
            int rpta_temp=0;
            for(DetalleVenta dv : lta){
                dv.setVenta(v);
                rpta_temp = detalleVentaSER.insert(dv);
                if(rpta_temp==0){
                    break;
                }
                result = 1;
            }
        }
        return result;
    }
}
