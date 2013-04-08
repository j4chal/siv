/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import com.siv.beans.Producto;
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
public class ArticuloACCTest {
    
    private ApplicationContext context;
    
    public ArticuloACCTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    
    @After
    public void tearDown() {
        context = null;
    }

    /**
     * Test of insert method, of class ProductoACC.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Producto articulo = null;
        ProductoACC instance = new ProductoACC();
        int expResult = 0;
        int result = instance.insert(articulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class ProductoACC.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        ProductoACC instance = new ProductoACC();
        List expResult = null;
        List result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getArticulo method, of class ProductoACC.
     */
    @Test
    public void testGetArticulo() {
        System.out.println("getArticulo");
        int id = 0;
        ProductoACC instance = new ProductoACC();
        List expResult = null;
        Producto result = instance.getProducto(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Th test case is a prototype.");
    }

    /**
     * Test of update method, of class ProductoACC.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Producto articulo = null;
        ProductoACC instance = new ProductoACC();
        int expResult = 0;
        int result = instance.update(articulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ProductoACC.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        ProductoACC instance = new ProductoACC();
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
