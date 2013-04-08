/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.interfaces;

import com.siv.beans.Logueo;
import java.util.List;

/**
 *
 * @author willex
 */
public interface LogueoINT {
    public int insert(Logueo log);
    public List<Logueo> getAll();
    public int update(Logueo log);
    public int getIdLogueo(String fecha_inicio);
}
