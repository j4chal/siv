/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import com.siv.beans.Movimiento;
import com.siv.interfaces.MovimientoINT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrador
 */
@Repository
public class MovimientoACC extends DaoSupport implements MovimientoINT{
    
    @Override
    public int insert(Movimiento mov) {
        String sql="insert into movimientos (fecha,id_tipodocumento,nro_documento,id_articulo,cantidad,"
             +"precio_base,precio_gral,utilidad,marca,id_categoria) values(?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{mov.getFecha(),mov.getId_tipodocumento().getId(),mov.getNro_documento(),
        mov.getId_producto().getId(),mov.getCantidad(),mov.getPrecio_base(),mov.getPrecio_gral(),mov.getUtilidad(),mov.getMarca(),
        mov.getId_categoria().getId()});
    }

    @Override
    public int update(Movimiento mov) {
        //aki falta me kede aki!!
        String sql="update movimientos set id_tipodocumento=?,nro_documento=?,id_articulo=?,cantidad=?,"
             +"precio_base=?,precio_gral=?,utilidad=?,marca=? where id=?";
        return this.jdbcTemplate.update(sql, new Object[] { mov.getId_tipodocumento().getId(), mov.getNro_documento(), 
            mov.getId_producto().getId(),mov.getCantidad(),mov.getPrecio_base(), mov.getPrecio_gral(),
            mov.getUtilidad(),mov.getMarca(),mov.getId()});
    }

    @Override
    public int delete(int id) {
        String sql="delete from movimientos where id=?";
        return this.jdbcTemplate.update(sql,new Object[] {id});
    }
    
}
