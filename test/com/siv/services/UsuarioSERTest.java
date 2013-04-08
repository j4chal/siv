/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.services;

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
public class UsuarioSERTest {
    
    private ApplicationContext ctx;
    
    public UsuarioSERTest() {
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
     * Test of getUser method, of class UsuarioSER.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String user = "admin";
        String pass = "admin";
        String id = "SIV-2013-WMA0001";
        UsuarioSER instance = ctx.getBean("usuarioSER", UsuarioSER.class);
        Usuario result = null;
        try{
        result = instance.getUser(user, pass,id);
        }catch(Exception ex){
            fail("Excepcion => "+ex.getMessage());
        }
        if(result == null){
            fail("Objeto null");
        }
        assertNotNull(result.getNombre());
        assertNotNull(result.getApellidos());
        System.out.println("Result => "+result.getNombre()+"\t"+result.getApellidos());
    }
    
    @Test
    public void testGetAll(){
        System.out.println("getAll");
        List<Usuario> lta = null;
        UsuarioSER instance = null;
        try{
            instance = ctx.getBean("usuarioSER",UsuarioSER.class);
        }catch(Exception ex){
            fail("Excepcion 1 => "+ex.getMessage());
        }
        try{
            lta = instance.getAll();
        }catch(Exception ex){
            fail("Excepcion 2 => "+ex.getMessage());
        }
        if(lta!=null && !lta.isEmpty()){
            System.out.println("Mostrando Users");
            for(Usuario us : lta){
                System.out.println(us.getUsuario());
            }
        }
        else{
            fail("Lista Nula :/");
        }
    }
}
