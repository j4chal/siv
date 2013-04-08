/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.beans;

import javax.swing.JOptionPane;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author willex
 */
public class SessionApp {
    
    public static ApplicationContext ctx = null;
    public static OwnerSystem os = null;
    public static Usuario user = null;
    public static String ip = "";
    public static String fecha_inicio = "";
    
    public static void muestraError(String msj){
        JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void muestraAdvertencia(String msj){
        JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.WARNING_MESSAGE);
    }
}
