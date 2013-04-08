/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.services;

import com.siv.beans.TipoDocumento;
import com.siv.interfaces.TipoDocumentoINT;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrador
 */
@Service
public class TipoDocumentoSER {
    
    @Autowired
    private TipoDocumentoINT tipdocINT;
    
    public List<TipoDocumento> getAll(){
        return this.tipdocINT.getAll();   
    }
}
