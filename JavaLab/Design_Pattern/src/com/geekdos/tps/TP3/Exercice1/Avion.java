package com.geekdos.tps.TP3.Exercice1;

/**
 * Created by theXuser on 04/12/2016.
 */
public class Avion extends Thread {
    String nom;
    Aeroport a;

    public Avion(String s) {
        nom = s;
    }

    public void run() {
        synchronized (a = Aeroport.getInctance()) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
            System.out.println("Je suis avion " + nom + " sur aeroport " + a);
        }
    }
}
