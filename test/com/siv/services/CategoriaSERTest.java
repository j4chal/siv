/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.services;

import com.siv.beans.Categoria;
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
public class CategoriaSERTest {
    
    private ApplicationContext ctx = null;
    
    public CategoriaSERTest() {
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
     * Test of insert method, of class CategoriaSER.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Categoria cat = new Categoria();
        cat.setDescripcion("categoria 06");
        CategoriaSER instance = null;
        try
        {
            instance = ctx.getBean("categoriaSER",CategoriaSER.class);
        }catch(Exception ex){
            fail("Excepcion => "+ex.getMessage());
        }
        int expResult = 1;
        int result = 0;
        try{
            result = instance.insert(cat);
        }catch(Exception ex){
            fail("Excepcion 2 => "+ex.getMessage());
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class CategoriaSER.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        CategoriaSER instance = null;
        try
        {
            instance = ctx.getBean("categoriaSER",CategoriaSER.class);
        }catch(Exception ex){
            fail("Excepcion => "+ex.getMessage());
        }
        List<Categoria> result = null;
        try
        {
            result = instance.getAll();
        }catch(Exception ex){
            fail("Excepcion 2 => "+ex.getMessage());
        }
        assertNotNull(result);
        for(Categoria cat : result){
            System.out.println(cat.getDescripcion());
        }
    }
}
