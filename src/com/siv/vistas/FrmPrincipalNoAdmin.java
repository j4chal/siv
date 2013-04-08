/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.vistas;

import com.siv.beans.Logueo;
import com.siv.beans.SessionApp;
import com.siv.services.LogueoSER;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author willex
 */
public class FrmPrincipalNoAdmin extends javax.swing.JFrame {

    private LogueoSER logueoSER;
    private SimpleDateFormat format;
    
    /**
     * Creates new form FrmPrincipalNoAdmin
     */
    public FrmPrincipalNoAdmin() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {}
        initComponents();
        format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        this.logueoSER = SessionApp.ctx.getBean("logueoSER", LogueoSER.class);
        this.jMenu5.setText(SessionApp.user.getUsuario()+",Salir");
    }
    
    private boolean checkState(Class x){
        JInternalFrame[] frames = this.jDesktopPane1.getAllFrames();
        if(frames!=null && frames.length>0){
            for(JInternalFrame jif : frames){
                if(jif.getClass() == x){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jDesktopPane1.setBackground(java.awt.Color.darkGray);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jMenu2.setText("          ");
        jMenu2.setMaximumSize(new java.awt.Dimension(285, 32767));
        jMenu2.setPreferredSize(new java.awt.Dimension(63, 10));
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/venta.png"))); // NOI18N
        jMenu3.setMnemonic('V');
        jMenu3.setText("Venta");
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setMaximumSize(new java.awt.Dimension(77, 32767));
        jMenu3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });

        jMenuItem1.setText("Generar Venta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Anular Venta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consulta.png"))); // NOI18N
        jMenu10.setMnemonic('C');
        jMenu10.setText("Consultas");
        jMenu10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem12.setMnemonic('P');
        jMenuItem12.setText("Productos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem12);

        jMenuItem13.setMnemonic('t');
        jMenuItem13.setText("Clientes");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem13);

        jMenuBar1.add(jMenu10);

        jMenu4.setMaximumSize(new java.awt.Dimension(650, 32767));
        jMenu4.setRequestFocusEnabled(false);
        jMenu4.setVerifyInputWhenFocusTarget(false);
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir.png"))); // NOI18N
        jMenu5.setMnemonic('S');
        jMenu5.setText("Salir");
        jMenu5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here
        this.dispose();
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmConsultaClientes.class)){
            FrmConsultaClientes frm = new FrmConsultaClientes();
            frm.setMaximizable(false);
            frm.setResizable(false);
            this.jDesktopPane1.add(frm);
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmConsultaProductos.class)){
            FrmConsultaProductos frm = new FrmConsultaProductos();
            frm.setMaximizable(false);
            frm.setResizable(false);
            this.jDesktopPane1.add(frm);
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        if(!this.checkState(FrmVenta.class)){
            FrmVenta frm = new FrmVenta();
            frm.setMaximizable(false);
            frm.setResizable(false);
            this.jDesktopPane1.add(frm);
            frm.show();
        }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        Logueo logeo = new Logueo();
        logeo.setId(logueoSER.getIdLogueo(SessionApp.fecha_inicio));
        logeo.setFecha_fin(format.format(new Date()));
        logueoSER.update(logeo);
    }//GEN-LAST:event_formWindowClosed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmVenta.class)){
            FrmVenta frm = new FrmVenta();
            this.jDesktopPane1.add(frm);
            frm.setMaximizable(false);
            frm.setResizable(false);
            frm.moveToFront();
            try{
                frm.setSelected(true);
            }catch(Exception e){}
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmAnularVenta.class)){
            FrmAnularVenta frm = new FrmAnularVenta();
            this.jDesktopPane1.add(frm);
            frm.setMaximizable(false);
            frm.setResizable(false);
            frm.moveToFront();
            try{
                frm.setSelected(true);
            }catch(Exception e){}
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
