/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import com.siv.beans.Logueo;
import com.siv.interfaces.LogueoINT;
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
public class LogueoACC extends DaoSupport implements LogueoINT {

    @Override
    public int insert(Logueo log) {
        String sql = "insert into logueos(id_usuario,host,ip,fecha_inicio) values(?,?,?,?);";
        return this.jdbcTemplate.update(sql, new Object[] { log.getUsuario().getId(),log.getHost(), log.getIp(), log.getFecha_inicio() });
    }

    @Override
    public List<Logueo> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int update(Logueo log) {
        String sql = "update logueos set fecha_fin = ? where id = ?";
        return this.jdbcTemplate.update(sql, new Object[] { log.getFecha_fin(), log.getId() });
    }

    @Override
    public int getIdLogueo(String fecha_inicio) {
        String sql = "select id from logueos where fecha_inicio like ?";
                return this.jdbcTemplate.queryForObject(sql,new Object[]{fecha_inicio},new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet rs, int i) throws SQLException {
                return rs.getInt(1);
            }
        });
    }
}
