/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import com.siv.beans.DetalleVenta;
import com.siv.interfaces.DetalleVentaINT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author willex
 */
@Repository
public class DetalleVentaACC extends DaoSupport implements DetalleVentaINT {
    
    @Autowired
    private ProductoACC productoACC;
    
    @Override
    @Transactional(
            propagation = Propagation.MANDATORY
            )
    public int insert(DetalleVenta dv) {
        String sql = "insert into vdetalles(id_articulo,cantidad,total,id_venta) values(?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{ dv.getProducto().getId(),dv.getCantidad(),dv.getTotal(),dv.getVenta().getId() });
    }

    @Override
    public DetalleVenta getDetalleVenta(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<DetalleVenta> getDetalles(int id) {
        String sql = "select v.id_articulo,v.cantidad,v.total from vdetalles v where v.id_venta = ?";
        return jdbcTemplate.query(sql, new Object[] { id }, new RowMapper<DetalleVenta>() {
            @Override
            public DetalleVenta mapRow(ResultSet rs, int i) throws SQLException {
                DetalleVenta dv = new DetalleVenta();
                dv.setProducto(productoACC.getProducto(rs.getInt(1)));
                dv.setCantidad(rs.getDouble(2));
                dv.setTotal(rs.getDouble(3));
                return dv;
            }
        } );
    }
    
}
