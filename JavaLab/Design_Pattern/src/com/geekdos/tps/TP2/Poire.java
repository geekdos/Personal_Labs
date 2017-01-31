package com.geekdos.tps.TP2;

/**
 * Created by theXuser on 28/11/2016.
 */
public class Poire extends Met {

    public Poire() {
        setNom("Poire");
    }

    @Override
    public boolean estSucre() {
        return false;
    }

    @Override
    public boolean estSale() {
        return true;
    }

    @Override
    public int nomberDeCalories() {
        return 200;
    }
}
