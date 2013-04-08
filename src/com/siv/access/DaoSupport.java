/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author willian
 */
@Repository
public class DaoSupport {
    
    @Autowired
    protected JdbcTemplate jdbcTemplate;
}
