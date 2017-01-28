/**
 * Created by theXuser on 11/12/2016.
 */
package com.geekdos.server;

import com.geekdos.midelwar.GestionDesNotes;

import javax.swing.*;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            GestionDesNotes gestionDesNotes = new GestionDesNotes();

            String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/GestionDesNotes";
            System.out.println("Enregistrement de l'objet avec l'url : " + url);
            Naming.rebind(url, gestionDesNotes);

            System.out.println("Serveur lancé");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
