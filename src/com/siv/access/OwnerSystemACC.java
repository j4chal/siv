/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import com.siv.interfaces.OwnerSystemINT;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author willex
 */
@Repository
public class OwnerSystemACC extends DaoSupport implements OwnerSystemINT {

    @Override
    public int getEstado(String dueño) {
        String sql = "select count(*) from sistemas where nombres_dueño = ? and estado = 0";
        return this.jdbcTemplate.queryForObject(sql,new Object[]{dueño},new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet rs, int i) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    @Override
    public int updateFechas(String fechaInicio, String fechaFin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getDiasRestantes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
