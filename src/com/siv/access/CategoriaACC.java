/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import com.siv.beans.Categoria;
import com.siv.interfaces.CategoriaINT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author willian
 */
@Repository
public class CategoriaACC extends DaoSupport implements CategoriaINT {

    @Override
    public int insert(Categoria categoria) {
        String sql="insert into categorias (descripcion) values (?);";
        return jdbcTemplate.update(sql,new Object[]{categoria.getDescripcion().toUpperCase()});
    }

    @Override
    public List<Categoria> getAll() {
        String sql = "select id,descripcion from categorias";
        return jdbcTemplate.query(sql, new RowMapper(){
            @Override
            public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
                Categoria cat = new Categoria();
                cat.setId(rs.getInt(1));
                cat.setDescripcion(rs.getString(2));
                return cat;
            }
            
        });
    }

    @Override
    public Categoria getCategoria(int id) {
       String sql = "select id,descripcion from categorias where id=?";
       return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Categoria>(){
           @Override
           public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
                Categoria cat = new Categoria();
                cat.setId(rs.getInt(1));
                cat.setDescripcion(rs.getString(2));
                return cat;
            } 
        });
    }
    
    @Override
    public int getCategoria(String desc) {
       String sql = "select count(*) from categorias where LCASE(descripcion)=?";
       return jdbcTemplate.queryForObject(sql, new Object[]{desc.toString()}, new RowMapper<Integer>(){
           @Override
           public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getInt(1);
            } 
        });
    }

    @Override
    public int update(Categoria categoria) {
        String sql="update categorias set descripcion=UCASE(?) where id=?";
        return jdbcTemplate.update(sql,new Object[]{categoria.getDescripcion(),categoria.getId()});
    }

    @Override
    public int delete(int id) {
        String sql="delete from categorias where id=?";
        return jdbcTemplate.update(sql,new Object[]{id});
    }
}
