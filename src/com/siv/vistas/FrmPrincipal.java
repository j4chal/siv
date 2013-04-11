/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.vistas;

import com.siv.beans.Logueo;
import com.siv.beans.SessionApp;
import com.siv.reportes.RListaClientes;
import com.siv.reportes.RListaClientesWithEmail;
import com.siv.services.LogueoSER;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Administrador
 */
public class FrmPrincipal extends javax.swing.JFrame {
    
    private LogueoSER logueoSER;
    
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {}
        initComponents();
        logueoSER = SessionApp.ctx.getBean("logueoSER", LogueoSER.class);
        this.jMenu5.setText(SessionApp.user.getUsuario()+",Salir");
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
        jMenu9 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Separator.foreground"));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jDesktopPane1.setBackground(java.awt.Color.darkGray);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jMenu2.setText("          ");
        jMenu2.setMaximumSize(new java.awt.Dimension(85, 32767));
        jMenu2.setPreferredSize(new java.awt.Dimension(63, 10));
        jMenuBar1.add(jMenu2);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mantenimiento.png"))); // NOI18N
        jMenu9.setMnemonic('M');
        jMenu9.setText("Manteminiento");
        jMenu9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jMenu9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem1.setMnemonic('C');
        jMenuItem1.setText("Categorias");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem1);

        jMenuItem6.setMnemonic('P');
        jMenuItem6.setText("Productos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem6);

        jMenuItem26.setMnemonic('L');
        jMenuItem26.setText("Clientes");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem26);

        jMenuItem17.setMnemonic('e');
        jMenuItem17.setText("Personal");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem17);

        jMenuItem8.setMnemonic('I');
        jMenuItem8.setText("IGV");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem8);

        jMenuBar1.add(jMenu9);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/venta.png"))); // NOI18N
        jMenu3.setMnemonic('V');
        jMenu3.setText("Venta");
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem2.setMnemonic('G');
        jMenuItem2.setText("Generar Venta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem7.setMnemonic('A');
        jMenuItem7.setText("Anular Venta");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        jMenu1.setMnemonic('p');
        jMenu1.setText("Compras");
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem9.setMnemonic('I');
        jMenuItem9.setText("Ingreso de Producto");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem4.setMnemonic('A');
        jMenuItem4.setText("Actualizar Ingreso Producto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setMnemonic('n');
        jMenuItem5.setText("Anular Ingreso de Producto");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consulta.png"))); // NOI18N
        jMenu10.setMnemonic('C');
        jMenu10.setText("Consultas");
        jMenu10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem10.setMnemonic('V');
        jMenuItem10.setText("Ventas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem10);

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

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reporte.png"))); // NOI18N
        jMenu11.setMnemonic('R');
        jMenu11.setText("Reportes");
        jMenu11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenu6.setText("Ventas");

        jMenuItem14.setText("Ventas del Dia");
        jMenu6.add(jMenuItem14);

        jMenuItem15.setText("Ventas por fecha");
        jMenu6.add(jMenuItem15);

        jMenuItem16.setText("Ventas por Mes");
        jMenu6.add(jMenuItem16);

        jMenuItem18.setText("Ventas Anuladas");
        jMenu6.add(jMenuItem18);

        jMenu11.add(jMenu6);

        jMenu13.setText("Inventario");

        jMenuItem21.setText("Todos los productos");
        jMenu13.add(jMenuItem21);

        jMenuItem22.setText("Productos con mayor stock");
        jMenu13.add(jMenuItem22);

        jMenuItem23.setText("Productos por fecha de ingreso");
        jMenu13.add(jMenuItem23);

        jMenuItem3.setText("Ingresos anulados");
        jMenu13.add(jMenuItem3);

        jMenuItem20.setText("Ingresos actualizados");
        jMenu13.add(jMenuItem20);

        jMenu11.add(jMenu13);

        jMenu14.setText("Clientes");

        jMenuItem24.setText("Todos los Clientes");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem24);

        jMenuItem25.setText("Clientes con correo");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem25);

        jMenu11.add(jMenu14);

        jMenuBar1.add(jMenu11);

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if(!checkState(FrmMtoCategoria.class)){
            FrmMtoCategoria frm = new FrmMtoCategoria();
            this.jDesktopPane1.add(frm);
            frm.setMaximizable(false);
            frm.setIconifiable(true);
            frm.setResizable(false);
            frm.moveToFront();
            try{
                frm.setSelected(true);
            }catch(Exception e){}
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formPropertyChange

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmMtoProductos.class)){
            FrmMtoProductos frm = new FrmMtoProductos();
            this.jDesktopPane1.add(frm);
            frm.setMaximizable(false);
            frm.setResizable(false);
            frm.moveToFront();
            try{
                frm.setSelected(true);
            }catch(Exception e){}
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmMtoCliente.class)){
            FrmMtoCliente frm = new FrmMtoCliente();
            this.jDesktopPane1.add(frm);
            frm.setMaximizable(false);
            frm.setResizable(false);
            frm.moveToFront();
            try{
                frm.setSelected(true);
            }catch(Exception e){}
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmMtoIgv.class)){
            FrmMtoIgv frm = new FrmMtoIgv();
            this.jDesktopPane1.add(frm);
            frm.setMaximizable(false);
            frm.setResizable(false);
            frm.moveToFront();
            try{
                frm.setSelected(true);
            }catch(Exception e){}
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmConsultaClientes.class)){
            FrmConsultaClientes frm = new FrmConsultaClientes();
            this.jDesktopPane1.add(frm);
            frm.setMaximizable(false);
            frm.setResizable(false);
            frm.moveToFront();
            try{
                frm.setSelected(true);
            }catch(Exception e){}
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmConsultaProductos.class)){
            FrmConsultaProductos frm = new FrmConsultaProductos();
            this.jDesktopPane1.add(frm);
            frm.setMaximizable(false);
            frm.setResizable(false);
            frm.moveToFront();
            try{
                frm.setSelected(true);
            }catch(Exception e){}
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        Logueo logeo = new Logueo();
        logeo.setId(logueoSER.getIdLogueo(SessionApp.fecha_inicio));
        logeo.setFecha_fin(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        logueoSER.update(logeo);
    }//GEN-LAST:event_formWindowClosed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
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
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmMtoRegistroProducto.class)){
            FrmMtoRegistroProducto frm = new FrmMtoRegistroProducto();
            this.jDesktopPane1.add(frm);
            frm.setMaximizable(false);
            frm.setResizable(false);
            frm.moveToFront();
            try{
                frm.setSelected(true);
            }catch(Exception e){}
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmMtoPersonal.class)){
            FrmMtoPersonal frm = new FrmMtoPersonal();
            this.jDesktopPane1.add(frm);
            frm.setMaximizable(false);
            frm.setResizable(false);
            frm.moveToFront();
            try{
                frm.setSelected(true);
            }catch(Exception e){}
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
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
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmConsultaVentasRealizadas.class)){
            FrmConsultaVentasRealizadas frm = new FrmConsultaVentasRealizadas();
            this.jDesktopPane1.add(frm);
            frm.setMaximizable(false);
            frm.setResizable(false);frm.moveToFront();
            try{
                frm.setSelected(true);
            }catch(Exception e){}
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:
        RListaClientes rp = null;
        try {
            rp = new RListaClientes();
        } catch (Exception ex) {
            SessionApp.muestraError("Error al cargar Reporte");
        }
        rp.runClienteParametro();
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        // TODO add your handling code here:
        RListaClientesWithEmail rp = null;
        try {
            rp = new RListaClientesWithEmail();
        } catch (Exception ex) {
            SessionApp.muestraError("Error al cargar Reporte");
        }
        rp.runClienteParametro();
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmAnularIngreso.class)){
            FrmAnularIngreso frm = new FrmAnularIngreso();
            this.jDesktopPane1.add(frm);
            frm.setMaximizable(false);
            frm.setResizable(false);frm.moveToFront();
            try{
                frm.setSelected(true);
            }catch(Exception e){}
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        if(!this.checkState(FrmActIngresoProducto.class)){
            FrmActIngresoProducto frm = new FrmActIngresoProducto();
            this.jDesktopPane1.add(frm);
            frm.setMaximizable(false);
            frm.setResizable(false);frm.moveToFront();
            try{
                frm.setSelected(true);
            }catch(Exception e){}
            frm.show();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
