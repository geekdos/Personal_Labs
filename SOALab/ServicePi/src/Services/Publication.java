package Services;

import javax.swing.*;
import javax.xml.ws.Endpoint;

/**
 * Created by theXuser on 29/11/2016.
 */
public class Publication {
    public static void main(String [] args){

        Endpoint end = Endpoint.publish("http://localhost:8088/caculpi", new CalculeAproxPi());
        JOptionPane.showMessageDialog(null, "Eteindre le serveur");
        end.stop();
    }
}
