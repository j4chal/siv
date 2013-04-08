/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import com.siv.beans.OwnerSystem;
import com.siv.beans.Usuario;
import com.siv.interfaces.UsuarioINT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author willex
 */
@Repository
public class UsuarioACC extends DaoSupport implements UsuarioINT {
    
    @Autowired
    @Qualifier("propietario")
    private OwnerSystem x;

    @Override
    public Usuario getUser(String nombre,String password,String id) {
        String sql = "select u.id,u.usuario,u.clave,u.tipo,u.dni,u.nombre,u.apellidos,u.sexo from usuarios u, sistemas s "
                + "where usuario = ? and clave = ? and s.id = u.id_sistema and s.codigo_sistema = ?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{ nombre, password, id }, 
                new RowMapper<Usuario>() {
                @Override
                public Usuario mapRow(ResultSet rs, int i) throws SQLException {
                    Usuario user = new Usuario();
                    user.setId(rs.getInt(1));
                    user.setUsuario(rs.getString(2));
                    user.setPassword(rs.getString(3));
                    user.setTipo(rs.getString(4));
                    user.setDni(rs.getString(5));
                    user.setNombre(rs.getString(6));
                    user.setApellidos(rs.getString(7));
                    user.setSexo(rs.getString(8));
                    return user;
                  }
                });
    }

    @Override
    public int save(Usuario c) {
        String sql = "insert into usuarios (dni,nombre,apellidos,sexo,usuario,clave,tipo,id_sistema,estado) values(?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{c.getDni(),c.getNombre().toUpperCase(),c.getApellidos().toUpperCase(),c.getSexo(),c.getUsuario().toLowerCase(),
        c.getPassword(),c.getTipo(),this.getIdSistemma(),"activo"});
    }

    @Override
    public int update(Usuario c) {
        String sql = "update usuarios set dni = ?, nombre = ?, apellidos = ?, sexo = ?, usuario = ?, clave = ? where id = ?;";
        return jdbcTemplate.update(sql, new Object[]{c.getDni(),c.getNombre().toUpperCase(),c.getApellidos().toUpperCase(),c.getSexo(),c.getUsuario().toLowerCase(),
        c.getPassword(),c.getId() });
    }

    @Override
    public int delete(int id) {
        String sql = "delete from usuarios where id = ?";
        return jdbcTemplate.update(sql, new Object[]{ id });
    }

    @Override
    public List<Usuario> getAll() {
        String sql = "select u.id,u.usuario,u.tipo,u.dni,u.nombre,u.apellidos,u.sexo from usuarios u, sistemas s"
                + " where estado = 'activo' and u.id_sistema = s.id and s.codigo_sistema = ? and u.tipo <> 'administrador'";
        return this.jdbcTemplate.query(sql, new Object[]{x.getId()} ,new RowMapper() {
            @Override
            public Usuario mapRow(ResultSet rs, int i) throws SQLException {
                Usuario user = new Usuario();
                user.setId(rs.getInt(1));
                user.setUsuario(rs.getString(2));
                user.setTipo(rs.getString(3));
                user.setDni(rs.getString(4));
                user.setNombre(rs.getString(5));
                user.setApellidos(rs.getString(6));
                user.setSexo(rs.getString(7));
                return user;
            }
        });
    }

    @Override
    public Usuario getUser(int id) {
        String sql = "select id,usuario,clave,tipo,dni,nombre,apellidos,sexo from usuarios where id = ?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{ id }, 
                new RowMapper<Usuario>() {
                @Override
                public Usuario mapRow(ResultSet rs, int i) throws SQLException {
                    Usuario user = new Usuario();
                    user.setId(rs.getInt(1));
                    user.setUsuario(rs.getString(2));
                    user.setPassword(rs.getString(3));
                    user.setTipo(rs.getString(4));
                    user.setDni(rs.getString(5));
                    user.setNombre(rs.getString(6));
                    user.setApellidos(rs.getString(7));
                    user.setSexo(rs.getString(8));
                    return user;
                  }
                });
    }
    
    private Integer getIdSistemma(){
        String sql = "select id from sistemas where codigo_sistema = ?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{ x.getId() }, 
                new RowMapper<Integer>() {
                @Override
                public Integer mapRow(ResultSet rs, int i) throws SQLException {
                    return rs.getInt(1);
                  }
                });
    }
}
