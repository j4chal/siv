/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.vistas;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author willex
 */
public class FrmLoginTest {
    
    public FrmLoginTest() {
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
     * Test of getIp method, of class FrmLogin.
     */
    @Test
    public void testGetIp() {
        String publicIP = "";
        try {
            URL tempURL = new URL("http://www.cualesmiip.com/");
            HttpURLConnection tempConn = (HttpURLConnection)tempURL.openConnection();
            InputStream tempInStream = tempConn.getInputStream();
            InputStreamReader tempIsr = new InputStreamReader(tempInStream);
            BufferedReader tempBr = new BufferedReader(tempIsr);
            while(tempBr.ready()){
                publicIP = tempBr.readLine();
                if(publicIP.toLowerCase().contains("cual es mi ip tu ip real es")){
                    int begin = publicIP.indexOf("(");
                    int end = publicIP.indexOf(")");
                    String nuevo = publicIP.substring(begin+1, end).trim();
                    break;
                }
            }
        }catch (Exception ex) {
            System.out.println("2 =>"+ex.getMessage());   
            publicIP = "<No es posible resolver la direccion IP>";  
         }
    }
}
