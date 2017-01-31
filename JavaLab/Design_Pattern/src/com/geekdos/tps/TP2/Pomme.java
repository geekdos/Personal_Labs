package com.geekdos.tps.TP2;

/**
 * Created by theXuser on 28/11/2016.
 */
public class Pomme extends Met {

    public Pomme() {
        setNom("Pomme");
    }

    @Override
    public boolean estSucre() {
        return true;
    }

    @Override
    public boolean estSale() {
        return false;
    }

    @Override
    public int nomberDeCalories() {
        return 52;
    }
}
