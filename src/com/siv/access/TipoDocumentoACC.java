/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;


import com.siv.beans.TipoDocumento;
import com.siv.interfaces.TipoDocumentoINT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrador
 */
@Repository
public class TipoDocumentoACC extends DaoSupport implements TipoDocumentoINT{

    @Override
    public List<TipoDocumento> getAll() {
        String sql="select id,descripcion from tipodocumentos";
        return jdbcTemplate.query(sql, new RowMapper(){
        @Override
        public TipoDocumento mapRow(ResultSet rs, int rowNum) throws SQLException{
            TipoDocumento tipdoc=new TipoDocumento();
            tipdoc.setId(rs.getInt(1));
            tipdoc.setDescripcion(rs.getString(2));
            return tipdoc;
        }
    });
    }
    
    @Override
    public TipoDocumento getTipoDocumento(int id) {
       String sql = "select id,descripcion from tipodocumentos where id=?";
       return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<TipoDocumento>(){
           @Override
           public TipoDocumento mapRow(ResultSet rs, int rowNum) throws SQLException {
                TipoDocumento tpd = new TipoDocumento();
                tpd.setId(rs.getInt(1));
                tpd.setDescripcion(rs.getString(2));
                return tpd;
            } 
        });
    }
    
}
