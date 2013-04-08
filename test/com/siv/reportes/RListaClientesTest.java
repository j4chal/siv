/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.reportes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author willex
 */
public class RListaClientesTest {
    
    private ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    public RListaClientesTest() {
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
     * Test of runClienteParametro method, of class RListaClientes.
     */
    @Test
    public void testRunClienteParametro() {
        System.out.println("runClienteParametro");
        RListaClientes instance = new RListaClientes();
        instance.runClienteParametro();
    }

    /**
     * Test of next method, of class RListaClientes.
     */
    @Test
    public void testNext() throws Exception {
        System.out.println("next");
    }

    /**
     * Test of getFieldValue method, of class RListaClientes.
     */
    @Test
    public void testGetFieldValue() throws Exception {
        System.out.println("getFieldValue");
        /*JRField jrf = null;
        RListaClientes instance = new RListaClientes();
        Object expResult = null;
        Object result = instance.getFieldValue(jrf);
        assertEquals(expResult, result);*/
    }
}
