/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.interfaces;

import com.siv.beans.Movimiento;

/**
 *
 * @author Administrador
 */
public interface MovimientoINT {
    public int insert (Movimiento mov);
    public int update (Movimiento mov);
    public int delete(int id);
}
