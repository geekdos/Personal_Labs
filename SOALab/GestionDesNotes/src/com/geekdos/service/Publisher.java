package com.geekdos.service;

import javax.swing.*;
import javax.xml.ws.Endpoint;

/**
 * Created by theXuser on 02/12/2016.
 */
public class Publisher {
    public static void main(String[] args){
        Endpoint endpoint = Endpoint.publish("http://localhost:8088/gestionDesNotes", new GestionDesNotes());
        JOptionPane.showMessageDialog(null, "Stop the server");
        endpoint.stop();
    }
}
