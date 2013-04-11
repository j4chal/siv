/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import com.siv.beans.Movimiento;
import com.siv.beans.Producto;
import com.siv.beans.TipoDocumento;
import com.siv.interfaces.MovimientoINT;
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
 * @author Administrador
 */
@Repository
public class MovimientoACC extends DaoSupport implements MovimientoINT{
    
    @Autowired
    private TipoDocumentoACC tipodocumentoACC;
    
    @Autowired
    private ProductoACC productoACC;
    
    @Override
    @Transactional(
            propagation = Propagation.MANDATORY
            )
    public int insert(Movimiento mov) {
        String sql="insert into movimientos (fecha,id_tipodocumento,nro_documento,id_articulo,cantidad,"
             +"precio_base,precio_gral,utilidad,marca,estado) values(?,?,?,?,?,?,?,?,?,'activo')";
        return jdbcTemplate.update(sql, new Object[]{mov.getFecha(),mov.getId_tipodocumento().getId(),mov.getNro_documento(),
        mov.getId_producto().getId(),mov.getCantidad(),mov.getPrecio_base(),mov.getPrecio_gral(),mov.getUtilidad(),mov.getMarca()});
    }

    @Override
    @Transactional(
            propagation = Propagation.MANDATORY
            )
    public int update(Movimiento mov) {
        String sql="update movimientos set fecha=?,id_tipodocumento=?,nro_documento=?,id_articulo=?,cantidad=?,"
             +"precio_base=?,precio_gral=?,utilidad=?,marca=?,estado='activo' where id=?";
        return this.jdbcTemplate.update(sql, new Object[] { mov.getFecha(),mov.getId_tipodocumento().getId(), mov.getNro_documento(), 
            mov.getId_producto().getId(),mov.getCantidad(),mov.getPrecio_base(), mov.getPrecio_gral(),
            mov.getUtilidad(),mov.getMarca(),mov.getId()});
    }
    
    @Override
    @Transactional(
            propagation = Propagation.MANDATORY
            )
    public int delete(Movimiento mov) {
        String sql="update movimientos set fecha=?,id_tipodocumento=?,nro_documento=?,id_articulo=?,cantidad=?,"
             +"precio_base=?,precio_gral=?,utilidad=?,marca=?,estado='no-activo' where id=?";
        return this.jdbcTemplate.update(sql, new Object[] { mov.getFecha(),mov.getId_tipodocumento().getId(), mov.getNro_documento(), 
            mov.getId_producto().getId(),mov.getCantidad(),mov.getPrecio_base(), mov.getPrecio_gral(),
            mov.getUtilidad(),mov.getMarca(),mov.getId()});
    }

    @Override
    public List<Movimiento> getAll() {
        String sql = "select id, fecha, id_tipodocumento, nro_documento, id_articulo, cantidad, precio_base, precio_gral, utilidad,"
                + "marca from movimientos where estado='activo'";
        return jdbcTemplate.query(sql, new RowMapper(){
            @Override
            public Movimiento mapRow(ResultSet rs, int rowNum) throws SQLException {
                Movimiento mov = new Movimiento();
                mov.setId(rs.getInt(1));
                mov.setFecha(rs.getString(2));
                TipoDocumento doc=tipodocumentoACC.getTipoDocumento(rs.getInt(3));
                mov.setId_tipodocumento(doc);
                mov.setNro_documento(rs.getString(4));
                Producto pro=productoACC.getProducto(rs.getInt(5));
                mov.setId_producto(pro);
                mov.setCantidad(rs.getDouble(6));
                mov.setPrecio_base(rs.getDouble(7));
                mov.setPrecio_gral(rs.getDouble(8));
                mov.setUtilidad(rs.getDouble(9));
                mov.setMarca(rs.getString(10));
                return mov;
            }
            
        });
    }

    @Override
    public Movimiento getMovimiento(int id) {
        String sql = "select id, fecha, id_tipodocumento, nro_documento, id_articulo, cantidad, precio_base, precio_gral, utilidad,"
                + "marca from movimientos where id = ? ";
        return jdbcTemplate.queryForObject(sql, new Object[] { id }  ,new RowMapper<Movimiento>(){
            @Override
            public Movimiento mapRow(ResultSet rs, int rowNum) throws SQLException {
                Movimiento mov = new Movimiento();
                mov.setId(rs.getInt(1));
                mov.setFecha(rs.getString(2));
                TipoDocumento doc=tipodocumentoACC.getTipoDocumento(rs.getInt(3));
                mov.setId_tipodocumento(doc);
                mov.setNro_documento(rs.getString(4));
                Producto pro=productoACC.getProducto(rs.getInt(5));
                mov.setId_producto(pro);
                mov.setCantidad(rs.getDouble(6));
                mov.setPrecio_base(rs.getDouble(7));
                mov.setPrecio_gral(rs.getDouble(8));
                mov.setUtilidad(rs.getDouble(9));
                mov.setMarca(rs.getString(10));
                return mov;
            }
            
        });
    }
    
}
