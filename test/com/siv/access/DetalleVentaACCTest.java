/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import com.siv.beans.DetalleVenta;
import java.util.List;
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
public class DetalleVentaACCTest {
    
    private ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    public DetalleVentaACCTest() {
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
     * Test of insert method, of class DetalleVentaACC.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
    }

    /**
     * Test of getDetalleVenta method, of class DetalleVentaACC.
     */
    @Test
    public void testGetDetalleVenta() {
        System.out.println("getDetalleVenta");
    }

    /**
     * Test of getDetalles method, of class DetalleVentaACC.
     */
    @Test
    public void testGetDetalles() {
        System.out.println("getDetalles");
        int id = 1;
        DetalleVentaACC instance = ctx.getBean("detalleVentaACC", DetalleVentaACC.class);
        List<DetalleVenta> result = instance.getDetalles(id);
        assertNotNull(result);
        if(!result.isEmpty()){
            for(DetalleVenta dv : result){
                System.out.println(dv.getProducto().getNombre()+" =>  "+dv.getCantidad()+" "+dv.getTotal());
            }
        }else{
            fail("VACIO");
        }
    }
}
