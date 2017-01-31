package com.geekdos.tps.TP3.Exercice1;

/**
 * Created by theXuser on 04/12/2016.
 */
public class Testaeroport {
    public static void main(String[] args) {
        Avion v1 = new Avion("Avion 1");
        Avion v2 = new Avion("Avion 2");
        Avion v3 = new Avion("Avion 3");
        Avion v4 = new Avion("Avion 4");
        v1.start();
        v2.start();
        v3.start();
        v4.start();
    }
}
/*
1 -- La méthode start lorsqu'elle est appelée sur les avions elle lance le thread associer
     a cette avion c a dir elle lance la method run()
2 -- Pour empêcher la possibilité à un Avion de créer un Aeroport s'il en existe déjà un par
     l'implimentation du designe patern Singlton
3 -- je vois que ma solution n'est pas efficace dans ces condition
 */
