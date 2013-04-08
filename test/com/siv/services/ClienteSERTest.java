/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.services;

import com.siv.beans.Cliente;
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
public class ClienteSERTest {
    
    private ApplicationContext ctx;
    
    public ClienteSERTest() {
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
     * Test of insert method, of class ClienteSER.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int expresult = 1;
        ClienteSER instance = ctx.getBean("clienteSER", ClienteSER.class);
        Cliente c = new Cliente();
        c.setNombres("Stefany");
        c.setDni("746534");
        c.setApellidos("Aquino Cordova");
        c.setCorreo("mail@mail.com");
        c.setSexo("F");
        c.setCelular("");
        c.setDireccion("");
        c.setTelefono("");
        int result = instance.insert(c);
        assertEquals(expresult,result);
        
    }

    /**
     * Test of delete method, of class ClienteSER.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int expresult = 1;
        ClienteSER instance = ctx.getBean("clienteSER", ClienteSER.class);
        int result = instance.delete(2);
        assertEquals(expresult,result);
    }

    /**
     * Test of update method, of class ClienteSER.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        
    }

    /**
     * Test of getAll method, of class ClienteSER.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        ClienteSER instance = ctx.getBean(ClienteSER.class);
        List<Cliente> result = instance.getAll();
        assertNotNull(result);
        for(Cliente c: result){
            System.out.println(c.getDni()+" => "+c.getNombres()+" "+c.getApellidos());
        }
    }

    /**
     * Test of getCliente method, of class ClienteSER.
     */
    @Test
    public void testGetCliente_int() {
        System.out.println("getCliente");
        
    }

    /**
     * Test of getCliente method, of class ClienteSER.
     */
    @Test
    public void testGetCliente_3args() {
        System.out.println("getCliente");
    }
}
