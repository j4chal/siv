/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.interfaces;

import com.siv.beans.TipoDocumento;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface TipoDocumentoINT {
    public List<TipoDocumento> getAll();
    public TipoDocumento getTipoDocumento(int id);
}




