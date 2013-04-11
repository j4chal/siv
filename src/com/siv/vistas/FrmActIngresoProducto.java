/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.vistas;

import com.siv.beans.Movimiento;
import com.siv.beans.Producto;
import com.siv.beans.SessionApp;
import com.siv.beans.TipoDocumento;
import com.siv.services.MovimientoSER;
import com.siv.services.TipoDocumentoSER;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARTIN
 */
public class FrmActIngresoProducto extends javax.swing.JInternalFrame {
    private MovimientoSER movimientoSER;
    public Producto producto_deBusqueda;
    private TipoDocumentoSER tipoDocumentoSER;
    
    private DecimalFormatSymbols simbolos=new DecimalFormatSymbols();
    private DecimalFormat formateador;

    /**
     * Creates new form FrmActIngresoProducto
     */
    public FrmActIngresoProducto() {
        initComponents();
        movimientoSER=SessionApp.ctx.getBean("movimientoSER",MovimientoSER.class);
        tipoDocumentoSER=SessionApp.ctx.getBean("tipoDocumentoSER",TipoDocumentoSER.class);
        this.carga_combo();
        this.carga_Tabla();
        this.desactiva_botones();
        simbolos.setDecimalSeparator('.');
        formateador = new DecimalFormat("####.##",simbolos);
    }
    
    private void carga_Tabla(){
        String cols[] = {"ID","NOMBRE"};
        List<Movimiento> lta = null;
        try{
            lta = movimientoSER.getAll();
        }catch(Exception e){
            SessionApp.muestraError("No se pudo cargar los datos");
            return ;
        }
        Object[][] rows = new Object[lta.size()][cols.length];
        for(int i=0;i<lta.size();i++){
            rows[i][0] = lta.get(i).getId();
            rows[i][1] = lta.get(i).getId_producto().getNombre();
        }
        DefaultTableModel tb = new DefaultTableModel(rows,cols){
            @Override
            public boolean isCellEditable(int row,int col){
                return false;
            }
        };
        jTable2.setModel(tb);
        jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
    }
    
    private void carga_combo()
    {
        List<TipoDocumento> lta=tipoDocumentoSER.getAll();
        for(TipoDocumento td:lta){
            this.jComboBox2.addItem(td);
        }
    }
    
    private void buscar_en_Filas(String buscado){
        carga_Tabla();
        if(!"".equals(buscado)){
            DefaultTableModel tb_ant = (DefaultTableModel) this.jTable2.getModel();
            int j=0;
            int LIM = jTable2.getRowCount();
            while(0<LIM){
                if(!tb_ant.getValueAt(j,1).toString().toLowerCase().startsWith(buscado.toLowerCase())){
                    tb_ant.removeRow(j);
                }
                else{
                    j++;
                }
                LIM--;
            }
            this.jTable2.setModel(tb_ant);
        }
    }
    
    private void selecciona_en_combo_tipodocumento(TipoDocumento tid){
        for(int i=0;i<this.jComboBox2.getItemCount();i++){
            TipoDocumento td = null;
            try
            {
                td = (TipoDocumento)this.jComboBox2.getItemAt(i);
            }catch(Exception e){
                continue;
            }
            if(td.getDescripcion().toLowerCase().equals(tid.getDescripcion().toLowerCase())){
                this.jComboBox2.setSelectedIndex(i);
                break;
            }
        }
    }
    
    private void activa_btns(){
        this.jbtnGuardar.setEnabled(true);
        this.jbtnCancelar.setEnabled(true);
    }
    
    private void desactiva_botones(){
        this.jbtnSalir.setEnabled(true);
        this.jbtnCancelar.setEnabled(false);
        this.jbtnGuardar.setEnabled(false);
    }
    
    private void activa_cajas(boolean valor){
        this.jTNum_Doc1.setEditable(valor);
        this.jtPrecioCompNue.setEditable(valor);
        this.jtPrecioVentaNue.setEditable(valor);
        this.jtStockActual.setEditable(valor);
        this.jTUtilidadNueva.setEditable(valor);
        this.jTextField2.setEditable(valor);
    }
    
    private void limpiar(){
        this.jTNum_Doc1.setText("");
        this.jtCodigo1.setText("");
        this.jtFecha1.setText("");
        this.jTextField2.setText("");
        this.jtNombreProducto1.setText("");
        this.jTStock1.setText("");
        this.jtPrecioCompraAc1.setText("");
        this.jtPrecioVentaAC1.setText("");
        this.jTUtilidadActual1.setText("");
        this.jComboBox2.setSelectedIndex(0);
        this.jTUtilidadNueva.setText("");
        this.jtPrecioVentaNue.setText("");
        this.jtStockActual.setText("");
        this.jtPrecioCompNue.setText("");
        this.producto_deBusqueda=null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtFecha1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jtPrecioCompraAc1 = new javax.swing.JTextField();
        jtPrecioVentaAC1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTUtilidadActual1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTStock1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtNombreProducto1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtCodigo1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTNum_Doc1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jbtnGuardar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtPrecioCompNue = new javax.swing.JTextField();
        jtPrecioVentaNue = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTUtilidadNueva = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtStockActual = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 255));

        jPanel3.setBackground(new java.awt.Color(64, 64, 64));

        jPanel7.setBackground(new java.awt.Color(137, 172, 219));

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel5.setText("BUSCAR PRODUCTO INGRESADO ");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Producto:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(29, 29, 29))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(137, 172, 219));

        jLabel12.setText("TIPO DE DOCUMENTO :");

        jLabel8.setText("FECHA :");

        jtFecha1.setEditable(false);
        jtFecha1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtFecha1.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));

        jPanel10.setBackground(new java.awt.Color(137, 172, 219));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Características Actuales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel17.setText("Precio Venta:");

        jLabel22.setText("Precio Compra :");
        jLabel22.setToolTipText("");

        jtPrecioCompraAc1.setEditable(false);
        jtPrecioCompraAc1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtPrecioVentaAC1.setEditable(false);
        jtPrecioVentaAC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtPrecioVentaAC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioVentaAC1KeyReleased(evt);
            }
        });

        jLabel13.setText("Utilidad (%) :");

        jTUtilidadActual1.setEditable(false);
        jTUtilidadActual1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setText("Cantidad Actual:");

        jTStock1.setEditable(false);
        jTStock1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Producto:");

        jtNombreProducto1.setEditable(false);
        jtNombreProducto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel19.setText("Codigo :");

        jtCodigo1.setEditable(false);
        jtCodigo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel20.setText("Nro_Doc. :");

        jTNum_Doc1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel23.setText("Marca:");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtPrecioCompraAc1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTUtilidadActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNombreProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTNum_Doc1))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel23)
                                .addComponent(jLabel17))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtPrecioVentaAC1)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jTNum_Doc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtNombreProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTStock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPrecioCompraAc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel17)
                    .addComponent(jtPrecioVentaAC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTUtilidadActual1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel23)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.getAccessibleContext().setAccessibleDescription("");

        jbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        jbtnGuardar.setMnemonic('G');
        jbtnGuardar.setText("GUARDAR");
        jbtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        jbtnCancelar.setMnemonic('C');
        jbtnCancelar.setText("CANCELAR");
        jbtnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jbtnSalir.setMnemonic('S');
        jbtnSalir.setText("SALIR");
        jbtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(137, 172, 219));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Características Nuevas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel16.setText("Precio Venta Nuevo:");

        jLabel21.setText("Precio Compra Nuevo :");
        jLabel21.setToolTipText("");

        jtPrecioCompNue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtPrecioCompNue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioCompNueKeyTyped(evt);
            }
        });

        jtPrecioVentaNue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtPrecioVentaNue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioVentaNueKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioVentaNueKeyTyped(evt);
            }
        });

        jLabel9.setText("Utilidad (%) :");

        jTUtilidadNueva.setEditable(false);
        jTUtilidadNueva.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cantidad :");

        jtStockActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtStockActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtStockActualKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtStockActualKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtPrecioCompNue, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTUtilidadNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPrecioVentaNue))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtStockActual, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jtPrecioCompNue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jtPrecioVentaNue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtStockActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTUtilidadNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jbtnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int fila_selected = this.jTable2.getSelectedRow();
        int id = Integer.parseInt(this.jTable2.getValueAt(fila_selected, 0).toString());
        Movimiento m = null;
        try{
            m = movimientoSER.getMovimiento(id);
        }catch(Exception e){
            SessionApp.muestraError("Error #100-40\nContácte al Administrador del Sistema");
            return ;
        }
        DecimalFormat format = new DecimalFormat("#.##");
        this.jtCodigo1.setText(m.getId().toString());
        this.jtFecha1.setText(m.getFecha());
        this.jTNum_Doc1.setText(m.getNro_documento());
        this.jTStock1.setText(format.format(m.getCantidad()));
        this.jtPrecioCompraAc1.setText(""+m.getPrecio_base());
        this.jtPrecioVentaAC1.setText(""+m.getPrecio_gral());
        this.jTUtilidadActual1.setText(""+m.getUtilidad());
        this.selecciona_en_combo_tipodocumento(m.getId_tipodocumento());
        this.jTextField2.setText(m.getMarca());
        this.jtNombreProducto1.setText(m.getId_producto().getNombre());
        producto_deBusqueda=m.getId_producto();
        this.activa_cajas(true);
        this.activa_btns();
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        buscar_en_Filas(this.jTextField3.getText());
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        if(!"".equals(this.jtNombreProducto1.getText().trim()) && this.jComboBox2.getSelectedIndex()!=-1 && !"".equals(this.jTextField2.getText()) 
           && !"".equals(this.jtPrecioCompNue.getText()) && !"".equals(this.jtStockActual.getText()) && !"".equals(this.jtFecha1.getText())
           && !"".equals(this.jTUtilidadNueva.getText()) && !"".equals(this.jtPrecioVentaNue.getText()) && !"".equals(this.jTNum_Doc1.getText()) ){
            Movimiento m = new Movimiento();
            m.setFecha(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
            m.setId_tipodocumento((TipoDocumento)this.jComboBox2.getSelectedItem());
            m.setNro_documento(jTNum_Doc1.getText());
            m.setId_producto(producto_deBusqueda);
            m.setCantidad(Double.parseDouble(this.jtStockActual.getText()));
            m.setPrecio_base(Double.parseDouble(this.jtPrecioCompNue.getText()));
            m.setPrecio_gral(Double.parseDouble(this.jtPrecioVentaNue.getText()));
            m.setUtilidad(Double.parseDouble(this.jTUtilidadNueva.getText()));
            m.setMarca(this.jTextField2.getText());
            m.setId(Integer.parseInt(this.jtCodigo1.getText()));
            int rpta = 0;
            try{
                if(this.jbtnGuardar.isEnabled()){
                    
                    rpta = movimientoSER.update(m);
                }
            }catch(Exception e){
                SessionApp.muestraError("Error #100-40\nContácte al Administrador del Sistema");
                return ;
            }
            if(rpta == 0){
                SessionApp.muestraAdvertencia("Error al realizar la operación");
            }
            else{
                this.jbtnCancelar.doClick();
            }
        }
        else{
            SessionApp.muestraAdvertencia("Por Favor...\nComplete todos los Datos");
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        // TODO add your handling code here:
        this.limpiar();
        this.desactiva_botones();
        this.activa_cajas(false);
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jtPrecioVentaAC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioVentaAC1KeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtPrecioVentaAC1KeyReleased

    private void jtStockActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtStockActualKeyTyped
        // TODO add your handling code here:
        if (String.valueOf(evt.getKeyChar()).matches("[a-zA-Z]|\\s")) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtStockActualKeyTyped

    private void jtStockActualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtStockActualKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtStockActualKeyReleased

    private void jtPrecioVentaNueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioVentaNueKeyTyped
        // TODO add your handling code here:
        if (String.valueOf(evt.getKeyChar()).matches("[a-zA-Z]|\\s")) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtPrecioVentaNueKeyTyped

    private void jtPrecioVentaNueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioVentaNueKeyReleased
        // TODO add your handling code here:
        if (String.valueOf(evt.getKeyChar()).matches("[a-zA-Z]|\\s")) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }else{
            try{
                double precioGral = 0.0, precioBase = 0.0, Utilidad = 0.0;
                precioGral = Double.parseDouble(jtPrecioVentaNue.getText());
                precioBase = Double.parseDouble(jtPrecioCompNue.getText());
                Utilidad = (precioGral * 100) / precioBase;
                Utilidad -= 100;
                jTUtilidadNueva.setText(formateador.format(Utilidad).toString());
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_jtPrecioVentaNueKeyReleased

    private void jtPrecioCompNueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioCompNueKeyTyped
        // TODO add your handling code here:
        if (String.valueOf(evt.getKeyChar()).matches("[a-zA-Z]|\\s")) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtPrecioCompNueKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTNum_Doc1;
    public javax.swing.JTextField jTStock1;
    public javax.swing.JTextField jTUtilidadActual1;
    private javax.swing.JTextField jTUtilidadNueva;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JTextField jtCodigo1;
    private javax.swing.JTextField jtFecha1;
    public javax.swing.JTextField jtNombreProducto1;
    private javax.swing.JTextField jtPrecioCompNue;
    public javax.swing.JTextField jtPrecioCompraAc1;
    public javax.swing.JTextField jtPrecioVentaAC1;
    private javax.swing.JTextField jtPrecioVentaNue;
    private javax.swing.JTextField jtStockActual;
    // End of variables declaration//GEN-END:variables
}
