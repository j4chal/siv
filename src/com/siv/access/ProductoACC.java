/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import com.siv.beans.Categoria;
import com.siv.beans.Producto;
import com.siv.interfaces.ProductoINT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author willian
 */
@Repository
public class ProductoACC extends DaoSupport implements ProductoINT {
    
    @Autowired
    private CategoriaACC categoriaACC;

    @Override
    public int insert(Producto articulo) {
        String sql = "insert into articulos (nombre,precio_base,ganancia,unidad_medida,estado,"
                + "stock,precio_gral,marca,id_categoria) values(?,?,?,?,?,?,?,?,?);";
        return jdbcTemplate.update(sql, new Object[]{articulo.getNombre().toUpperCase(),articulo.getPrecio_base(),
        articulo.getGanancia(),articulo.getUnidad_medida(),articulo.getEstado(),articulo.getStock(),
        articulo.getPrecio_gral(),articulo.getMarca().toUpperCase(),articulo.getCategoria().getId()});
    }

    @Override
    public List<Producto> getAll() {
        String sql = "select id, nombre, precio_base, ganancia, unidad_medida, estado, stock, precio_gral, marca,"
                + "id_categoria from articulos";
        return jdbcTemplate.query(sql, new RowMapper(){
            @Override
            public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
                Producto art = new Producto();
                art.setId(rs.getInt(1));
                art.setNombre(rs.getString(2));
                art.setPrecio_base(rs.getFloat(3));
                art.setGanancia(rs.getFloat(4));
                art.setUnidad_medida(rs.getString(5));
                art.setEstado(rs.getString(6));
                art.setStock(rs.getInt(7));
                art.setPrecio_gral(rs.getFloat(8));
                art.setMarca(rs.getString(9));
                Categoria cat = categoriaACC.getCategoria(rs.getInt(10));
                art.setCategoria(cat);
                return art;
            }
            
        });
    }

    @Override
    public int update(Producto articulo) {
        String sql = "update articulos set nombre = ?, precio_base = ?, ganancia = ?, unidad_medida = ?, estado = ?, stock = ?,";
        sql += " precio_gral = ?, marca = ?, id_categoria = ? where id = ?";
        return this.jdbcTemplate.update(sql, new Object[] { articulo.getNombre(), articulo.getPrecio_base(), articulo.getGanancia(),
         articulo.getUnidad_medida(), articulo.getEstado(), articulo.getStock(), articulo.getPrecio_gral(),articulo.getMarca(),
         articulo.getCategoria().getId(),articulo.getId()});
    }

    @Override
    public int delete(int id) {
        String sql = "delete from articulos where id = ?";
        return this.jdbcTemplate.update(sql, new Object[] { id });
    }

    @Override
    public Producto getProducto(int id) {
        String sql = "select id, nombre, precio_base, ganancia, unidad_medida, estado, stock, precio_gral, marca,"
                + "id_categoria from articulos where id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] { id }  ,new RowMapper<Producto>(){
            @Override
            public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
                Producto art = new Producto();
                art.setId(rs.getInt(1));
                art.setNombre(rs.getString(2));
                art.setPrecio_base(rs.getFloat(3));
                art.setGanancia(rs.getFloat(4));
                art.setUnidad_medida(rs.getString(5));
                art.setEstado(rs.getString(6));
                art.setStock(rs.getInt(7));
                art.setPrecio_gral(rs.getFloat(8));
                art.setMarca(rs.getString(9));
                Categoria cat = categoriaACC.getCategoria(rs.getInt(10));
                art.setCategoria(cat);
                return art;
            }
            
        });
    }
    
    @Override
    public Producto getProductobyNombre(String nomb) {
        String sql = "select id, nombre, precio_base, ganancia, unidad_medida, estado, stock, precio_gral, marca,"
                + "id_categoria from articulos where nombre = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] { nomb.toUpperCase() }  ,new RowMapper<Producto>(){
            @Override
            public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
                Producto art = new Producto();
                art.setId(rs.getInt(1));
                art.setNombre(rs.getString(2));
                art.setPrecio_base(rs.getFloat(3));
                art.setGanancia(rs.getFloat(4));
                art.setUnidad_medida(rs.getString(5));
                art.setEstado(rs.getString(6));
                art.setStock(rs.getInt(7));
                art.setPrecio_gral(rs.getFloat(8));
                art.setMarca(rs.getString(9));
                Categoria cat = categoriaACC.getCategoria(rs.getInt(10));
                art.setCategoria(cat);
                return art;
            }
            
        });
    }

    @Override
    public int getProducto(String nombre) {
        String sql = "select count(*) from articulos where nombre = ?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{ nombre }, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet rs, int i) throws SQLException {
                return rs.getInt(1);
            }
        });
    }

    @Override
    public int insertIGV(int igv) {
        String sql = "insert into igv (igv) values(?)";
        return jdbcTemplate.update(sql, new Object[]{igv});
    }

    @Override
    public int getIGV() {
        String sql = "select igv from igv";
        return jdbcTemplate.queryForObject(sql, new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet rs, int i) throws SQLException {
                return rs.getInt(1);
            }
        });
    }

    @Override
    public int updateIGV(int igv) {
        String sql = "update igv set igv = ?";
        return jdbcTemplate.update(sql, new Object[]{igv});
    }
}
