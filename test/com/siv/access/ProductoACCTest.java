/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import com.siv.beans.Producto;
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
public class ProductoACCTest {
    
    private ApplicationContext ctx;
    
    public ProductoACCTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    
    @After
    public void tearDown() {
        ctx = null;
    }

    /**
     * Test of insert method, of class ProductoACC.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
    }

    /**
     * Test of getAll method, of class ProductoACC.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
    }

    /**
     * Test of update method, of class ProductoACC.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
    }

    /**
     * Test of delete method, of class ProductoACC.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
    }

    /**
     * Test of getProducto method, of class ProductoACC.
     */
    @Test
    public void testGetProducto_int() {
        System.out.println("getProducto");
        int id = 1;
        ProductoACC instance = ctx.getBean("productoACC",ProductoACC.class);
        Producto result = instance.getProducto(id);
        assertNotNull(result);
        System.out.println(result.getId()+"\tCategoria => "+result.getCategoria().getId()+"-"+result.getCategoria().getDescripcion());
    }

    /**
     * Test of getProducto method, of class ProductoACC.
     */
    @Test
    public void testGetProducto_String() {
        System.out.println("getProducto");
    }
}
