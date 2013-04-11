/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.services;

import com.siv.beans.Movimiento;
import com.siv.interfaces.MovimientoINT;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrador
 */
@Service
public class MovimientoSER {
    
    @Autowired
    private  MovimientoINT movINT;
            
    public int insert(Movimiento mov){
        return this.movINT.insert(mov);
    }
    
    public int update(Movimiento mov){
        return this.movINT.update(mov);
    }
    
    public int delete(Movimiento mov){
        return this.movINT.delete(mov);
    }
    
    public List<Movimiento> getAll(){
        return movINT.getAll();
    }
    
    public Movimiento getMovimiento(int id){
        return movINT.getMovimiento(id);
    }
}
