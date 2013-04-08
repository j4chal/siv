/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.services;

import com.siv.beans.Logueo;
import com.siv.beans.Usuario;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author willex
 */
public class LogueoSERTest {
    
    private ApplicationContext ctx = null;
    private String fi = "2013-03-15 04:00:00";
    private int id;
    
    public LogueoSERTest() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of insert method, of class LogueoSER.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Logueo log = new Logueo();
        Usuario us = new Usuario();
        us.setId(2);
        log.setUsuario(us);
        log.setFecha_inicio(fi);
        System.out.println("Fecha INICIO INS => "+fi);
        LogueoSER instance = this.ctx.getBean("logueoSER", LogueoSER.class);
        assertEquals(1,instance.insert(log));
    }
    
    /**
     * Test of getIdLogueo method, of class LogueoSER.
     */
    @Test
    public void testGetIdLogueo() {
        System.out.println("getIdLogueo");
        LogueoSER instance = this.ctx.getBean("logueoSER", LogueoSER.class);
        System.out.println("Fecha INICIO GETID => "+this.fi);
        int result = instance.getIdLogueo(this.fi);
        if(result<=0){
            fail("Fallo GetIDLogueo");
        }else{
            id = result;
            System.out.println("ID Devuelto => "+id);
        }
    }

    /**
     * Test of update method, of class LogueoSER.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        LogueoSER instance = this.ctx.getBean("logueoSER", LogueoSER.class);
        Logueo log = new Logueo();
        log.setId(instance.getIdLogueo(fi));
        log.setFecha_fin(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        if(instance.update(log)<=0){
            fail("Tfallo desde Update");
        }
    }
}
