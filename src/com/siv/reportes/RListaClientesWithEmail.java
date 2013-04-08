/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siv.reportes;

import com.siv.beans.Cliente;
import com.siv.beans.SessionApp;
import com.siv.services.ClienteSER;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author willex
 */
public class RListaClientesWithEmail{
    
    public RListaClientesWithEmail(){ }
    
    public void runClienteParametro() {
        try {
            String master = System.getProperty("user.dir") + "/src/com/siv/reportes/RClientesCorreo.jasper";
            if (master == null) {
                SessionApp.muestraError("no encuentro el archivo de reporte maestro");
                System.exit(2);
            }
            JasperReport masterReport = null;
            try {
                masterReport = (JasperReport) JRLoader.loadObject(master);
            } catch (JRException e) {
                SessionApp.muestraError("No se cargo el Reporte Maestro");
                System.exit(3);
            }
            //Map parametro = new HashMap();
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport, null, new UsarReporte());
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle("REPORTE LISTA CLIENTES");
            jviewer.setVisible(true);
        } catch (Exception j) {
            SessionApp.muestraError("Error Interno con el reporte");
        }
    }

    private class UsarReporte implements JRDataSource{
        
        private ClienteSER clienteSER;
        private List<Cliente> lta;
        private int indice = -1;
        
        public UsarReporte(){
            clienteSER = SessionApp.ctx.getBean("clienteSER", ClienteSER.class);
            lta = clienteSER.getAllWithEmail();
        }
        
        @Override
        public boolean next() throws JRException {
            return ++this.indice < lta.size();
        }

        @Override
        public Object getFieldValue(JRField jrf) throws JRException {
            Object valor = null;
            if("DNI".equalsIgnoreCase(jrf.getName())) { valor = lta.get(indice).getDni() ;}
            else if("Nombres".equalsIgnoreCase(jrf.getName())){
                valor = lta.get(indice).getNombres()+" "+lta.get(indice).getApellidos();
            }
            else if("Telefono".equalsIgnoreCase(jrf.getName())){
                valor = (lta.get(indice).getTelefono().equals("") ? "-":lta.get(indice).getTelefono()) +" / " +
                        lta.get(indice).getCelular();
            }
            else if("Correo".equalsIgnoreCase(jrf.getName())){ valor = lta.get(indice).getCorreo();
            }
            else if("Direccion".equalsIgnoreCase(jrf.getName())){ valor = lta.get(indice).getDireccion();}
            return valor;
        }   
    }
}
