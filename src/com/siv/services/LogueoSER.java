/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.services;

import com.siv.beans.Logueo;
import com.siv.interfaces.LogueoINT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author willex
 */
@Service
public class LogueoSER {
    
    @Autowired
    private LogueoINT logueoINT;
    
    public int insert(Logueo log){
        return this.logueoINT.insert(log);
    }
    
    public int update(Logueo log){
        return this.logueoINT.update(log);
    }
    
    public int getIdLogueo(String fecha_inicio){
        return this.logueoINT.getIdLogueo(fecha_inicio);
    }
}
