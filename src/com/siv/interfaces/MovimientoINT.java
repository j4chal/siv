/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.interfaces;

import com.siv.beans.Movimiento;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface MovimientoINT {
    public int insert (Movimiento mov);
    public int update (Movimiento mov);
    public int delete(Movimiento mov);
    public List<Movimiento> getAll();
    public Movimiento getMovimiento(int id);
}
