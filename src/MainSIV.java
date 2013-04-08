
import com.siv.beans.OwnerSystem;
import com.siv.beans.SessionApp;
import com.siv.vistas.FrmSplash;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JFrame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willex
 */
public class MainSIV {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ipInternet = MainSIV.getIp();
        if(ipInternet.equalsIgnoreCase("<No es posible resolver la direccion IP>")){
            SessionApp.muestraError("No existe conexión a Internet\nLa Conexión fue rechazada");
        }else{
            ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
            SessionApp.ctx = ctx;
            SessionApp.ip = ipInternet;
            SessionApp.os = ctx.getBean("propietario", OwnerSystem.class);
            FrmSplash frm = new FrmSplash();
            frm.setLocationRelativeTo(null);
            frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frm.setVisible(true);
        }
    }
    
    public static String getIp(){
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
                    publicIP = publicIP.substring(begin+1, end).trim();
                    break;
                }
            }
        }catch (Exception ex) {
            publicIP = "<No es posible resolver la direccion IP>";  
         }
        //DESCOMENTAR ESTA LINEA CUANDO NO HAY INTERNET
        publicIP = "127.0.0.1";
        return publicIP;
    }
}
