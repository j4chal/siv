/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author willex
 */
public class VentaACCTest {
    
    private ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml") ;
    
    public VentaACCTest() {
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
     * Test of insert method, of class VentaACC.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");        
    }

    /**
     * Test of getAll method, of class VentaACC.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
    }

    /**
     * Test of getVenta method, of class VentaACC.
     */
    @Test
    public void testGetVenta() {
        System.out.println("getVenta");
    }

    /**
     * Test of update method, of class VentaACC.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
    }

    /**
     * Test of delete method, of class VentaACC.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
    }

    /**
     * Test of getLastNroVenta method, of class VentaACC.
     */
    @Test
    public void testGetLastNroVenta() {
        System.out.println("getLastNroVenta");
        VentaACC instance = ctx.getBean("ventaACC",VentaACC.class);
        String lastNroVenta = instance.getLastNroVenta();
        assertNotNull(lastNroVenta);
        System.out.println("Last NRo Venta => "+lastNroVenta);
    }

    /**
     * Test of getLastId method, of class VentaACC.
     */
    @Test
    public void testGetLastId() {
        System.out.println("getLastId");
        VentaACC instance = ctx.getBean("ventaACC",VentaACC.class);
        int lastID = instance.getLastId();
        assertNotNull(lastID);
        System.out.println("ID => "+lastID);
    }
}
