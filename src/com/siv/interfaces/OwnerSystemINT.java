/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.interfaces;

/**
 *
 * @author willex
 */
public interface OwnerSystemINT {
    public int getEstado(String dueño);
    public int updateFechas(String fechaInicio, String fechaFin);
    public String getDiasRestantes();
}
