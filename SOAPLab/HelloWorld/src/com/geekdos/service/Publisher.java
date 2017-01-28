package com.geekdos.service;

import javax.swing.*;
import javax.xml.ws.Endpoint;

/**
 * Created by theXuser on 1/3/2017.
 */
public class Publisher {

    public static void main(String[] args){
        String url = "http://localhost:8088/SeyHello";
        Endpoint endpoint = Endpoint.publish(url, new Halima());
        JOptionPane.showMessageDialog(null, "Stop the server");
        endpoint.stop();
    }

}
