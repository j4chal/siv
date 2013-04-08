/*
  To change this template, choose Tools | Templates
  and open the template in the editor.
 */
package com.siv.access;

import com.siv.beans.Venta;
import com.siv.interfaces.VentaINT;
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
public class VentaACC extends DaoSupport implements VentaINT{
    
    @Autowired
    private UsuarioACC usuarioACC;
    
    @Autowired
    private ClienteACC clienteACC;

    @Override
    @Transactional(
            propagation = Propagation.REQUIRED,
            timeout = 30)
    public int insert(Venta venta) {
        String sql="insert into ventas (id_usuario,nro_venta,fecha,id_cliente,subtotal,descuento,igv,total,estado) "
                + "values(?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{venta.getVendedor().getId(),venta.getNro_venta(),venta.getFecha(),venta.getCliente().getId(),
        venta.getSubtotal(),venta.getDescuento(),venta.getIgv(),venta.getTotal(),"generado"});
    }

    @Override
    public List<Venta> getAll() {
        String sql = "select v.id,v.fecha,v.nro_venta,v.total,v.subtotal,v.igv,v.descuento,v.id_usuario, v.id_cliente "
                + "from ventas v where v.estado = 'generado'";
        return jdbcTemplate.query(sql, new RowMapper<Venta>() {
            @Override
            public Venta mapRow(ResultSet rs, int i) throws SQLException {
                Venta v = new Venta();
                v.setId(rs.getInt(1));
                v.setFecha(rs.getString(2));
                v.setNro_venta(rs.getString(3));
                v.setTotal(rs.getDouble(4));
                v.setSubtotal(rs.getDouble(5));
                v.setIgv(rs.getDouble(6));
                v.setDescuento(rs.getDouble(7));
                v.setVendedor(usuarioACC.getUser(rs.getInt(8)));
                v.setCliente(clienteACC.getCliente(rs.getInt(9)));
                return v;
            }
        });
    }

    @Override
    public Venta getVenta(int id) {
        String sql = "select v.id,v.fecha,v.nro_venta,v.total,v.subtotal,v.igv,v.descuento,v.id_usuario, v.id_cliente "
                + "from ventas v where v.estado = 'generado' and v.id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{ id }, new RowMapper<Venta>() {
            @Override
            public Venta mapRow(ResultSet rs, int i) throws SQLException {
                Venta v = new Venta();
                v.setId(rs.getInt(1));
                v.setFecha(rs.getString(2));
                v.setNro_venta(rs.getString(3));
                v.setTotal(rs.getDouble(4));
                v.setSubtotal(rs.getDouble(5));
                v.setIgv(rs.getDouble(6));
                v.setDescuento(rs.getDouble(7));
                v.setVendedor(usuarioACC.getUser(rs.getInt(8)));
                v.setCliente(clienteACC.getCliente(rs.getInt(9)));
                return v;
            }
        });
    }

    @Override
    public int update(Venta venta) {
        return 0;
    }

    @Override
    public int delete(int id) {
        String sql = "update ventas set estado = 'anulado' where id = ?";
        return jdbcTemplate.update(sql, new Object[] { id });
    }

    @Override
    public String getLastNroVenta() {
        String sql = "select nro_venta from ventas where id = ?";
        int id = this.getLastId();
        if(id == 0){
            return "";
        }
        else{
            return jdbcTemplate.queryForObject(sql,new Object[]{ id }, new RowMapper<String>() {
                @Override
                public String mapRow(ResultSet rs, int i) throws SQLException {
                    return rs.getString(1);
                }
            });
        }
    }

    @Override
    @Transactional(
            propagation = Propagation.SUPPORTS
            )
    public Integer getLastId() {
        String sql = "select Max(id) from ventas";
        return jdbcTemplate.queryForObject(sql, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet rs, int i) throws SQLException {
                return rs.getInt(1);
            }
        });
    }

    @Override
    public List<Venta> getAll_Consulta(String estado) {
        String sql = "select v.id,v.fecha,v.nro_venta,v.total,v.subtotal,v.igv,v.descuento,v.id_usuario, v.id_cliente "
                + "from ventas v where v.estado = ?";
        return jdbcTemplate.query(sql, new Object[]{ estado } , new RowMapper<Venta>() {
            @Override
            public Venta mapRow(ResultSet rs, int i) throws SQLException {
                Venta v = new Venta();
                v.setId(rs.getInt(1));
                v.setFecha(rs.getString(2));
                v.setNro_venta(rs.getString(3));
                v.setTotal(rs.getDouble(4));
                v.setSubtotal(rs.getDouble(5));
                v.setIgv(rs.getDouble(6));
                v.setDescuento(rs.getDouble(7));
                v.setVendedor(usuarioACC.getUser(rs.getInt(8)));
                v.setCliente(clienteACC.getCliente(rs.getInt(9)));
                return v;
            }
        });
    }
}
