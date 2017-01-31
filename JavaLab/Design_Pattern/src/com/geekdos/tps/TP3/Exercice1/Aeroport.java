package com.geekdos.tps.TP3.Exercice1;

/**
 * Created by theXuser on 04/12/2016.
 */
public class Aeroport {

    private boolean piste_libre;
    private static Aeroport aeroport = null;

    private Aeroport() {
        this.piste_libre = true;
    }

    public static Aeroport getInctance() {
        if (aeroport == null)
            aeroport = new Aeroport();
        return aeroport;
    }
}
