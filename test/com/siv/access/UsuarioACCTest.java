/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.access;

import com.siv.beans.Usuario;
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
public class UsuarioACCTest {
    
    private ApplicationContext ctx;
    
    public UsuarioACCTest() {
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
     * Test of getUser method, of class UsuarioACC.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser P");
        String nombre = "admin";
        String password = "admin";
        String id =  "SIV-2013-WMA0001";
        UsuarioACC instance = ctx.getBean("usuarioACC",UsuarioACC.class);
        Usuario result = null;
        try{
            result = instance.getUser(nombre, password,id);
        }catch(Exception ex){
            fail("Excepcion getUser P=> "+ex.getMessage());
        }
        if(result==null){
            fail("Error al iniciar session");
        }
        System.out.println("Nombre => "+result.getNombre()+"\tApellido => "+result.getApellidos());
        assertNotNull(result.getNombre());
        assertNotNull(result.getApellidos());
    }

    /**
     * Test of save method, of class UsuarioACC.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UsuarioACC.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class UsuarioACC.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class UsuarioACC.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Usuario> lta = null;
        UsuarioACC instance = null;
        try{
            instance = ctx.getBean("usuarioACC",UsuarioACC.class);
        }catch(Exception ex){
            fail("Excepcion en Context => "+ex.getMessage());
        }
        try{
            lta = instance.getAll();
        }catch(Exception ex2){
            fail("Excepcion en method getAll =>"+ex2.getMessage());
        }
        if(lta == null || lta.isEmpty()){
            fail("Lista nula");
        }
        for(Usuario u : lta){
            System.out.println(u.getUsuario()+" => "+u.getNombre()+" "+u.getApellidos());
        }
    }

    /**
     * Test of getUser method, of class UsuarioACC.
     */
    @Test
    public void testGetUser_String_String() {
        System.out.println("getUser");
    }

    /**
     * Test of getUser method, of class UsuarioACC.
     */
    @Test
    public void testGetUser_int() {
        System.out.println("getUser By Id");
    }
}
