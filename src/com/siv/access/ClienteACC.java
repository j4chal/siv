/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import com.siv.beans.Cliente;
import com.siv.interfaces.ClienteINT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author willex
 */
@Repository
public class ClienteACC extends DaoSupport implements ClienteINT {

    @Override
    public int insert(Cliente c) {
        String sql = "insert into clientes (dni,nombres,apellidos,telefono,celular,correo,direccion,sexo,estado) values(?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{c.getDni(),c.getNombres().toUpperCase(),c.getApellidos().toUpperCase(),c.getTelefono(),c.getCelular(),
        c.getCorreo(),c.getDireccion(),c.getSexo(),"activo"});
    }

    @Override
    public int delete(int id) {
        String sql = "update clientes set estado = ? where id = ?";
        return jdbcTemplate.update(sql, new Object[]{ "inactivo",id });
    }

    @Override
    public int update(Cliente c) {
        String sql = "update clientes set dni = ?, nombres = ?, apellidos = ?, telefono = ?, celular = ?, correo = ?, direccion = ?,"
                + " sexo = ? where id = ?";
        return jdbcTemplate.update(sql, new Object[]{c.getDni(),c.getNombres(),c.getApellidos(),c.getTelefono(),c.getCelular(),
        c.getCorreo(),c.getDireccion(),c.getSexo(),c.getId()});
    }

    @Override
    public Cliente getCliente(int id) {
        String sql ="select id,dni,nombres,apellidos,telefono,celular,correo,direccion,sexo from clientes where id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Cliente>() {
            @Override
            public Cliente mapRow(ResultSet rs, int i) throws SQLException {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setTelefono(rs.getString(5));
                c.setCelular(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setDireccion(rs.getString(8));
                c.setSexo(rs.getString(9));
                return c;
            }
        });
    }

    @Override
    public Cliente getCliente(String dni, String nombres, String apellidos) {
        String sql ="select id,dni,nombres,apellidos,telefono,celular,correo,direccion,sexo from clientes where dni = ?,nombre = ?,apellidos = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{dni,nombres,apellidos}, new RowMapper<Cliente>() {
            @Override
            public Cliente mapRow(ResultSet rs, int i) throws SQLException {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setTelefono(rs.getString(5));
                c.setCelular(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setDireccion(rs.getString(8));
                c.setSexo(rs.getString(9));
                return c;
            }
        });
    }

    @Override
    public List<Cliente> getAll() {
        String sql ="select id,dni,nombres,apellidos,telefono,celular,correo,direccion,sexo from clientes where estado <> 'inactivo'";
        return jdbcTemplate.query(sql,new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int i) throws SQLException {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setTelefono(rs.getString(5));
                c.setCelular(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setDireccion(rs.getString(8));
                c.setSexo(rs.getString(9));
                return c;
            }
        });
    }

    @Override
    public Cliente getClienteByDni(int dni) {
        String sql ="select id,dni,nombres,apellidos,telefono,celular,correo,direccion,sexo from clientes where dni = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{dni}, new RowMapper<Cliente>() {
            @Override
            public Cliente mapRow(ResultSet rs, int i) throws SQLException {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setTelefono(rs.getString(5));
                c.setCelular(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setDireccion(rs.getString(8));
                c.setSexo(rs.getString(9));
                return c;
            }
        });
    }

    @Override
    public List<Cliente> getAllwithEmail() {
        String sql ="select dni,nombres,apellidos,telefono,celular,correo,direccion from clientes where estado <> 'inactivo' and correo <> ''";
        return jdbcTemplate.query(sql,new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int i) throws SQLException {
                Cliente c = new Cliente();
                c.setDni(rs.getString(1));
                c.setNombres(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setTelefono(rs.getString(4));
                c.setCelular(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setDireccion(rs.getString(7));
                return c;
            }
        });
    }
}
