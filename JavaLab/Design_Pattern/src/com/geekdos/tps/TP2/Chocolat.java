package com.geekdos.tps.TP2;

/**
 * Created by theXuser on 28/11/2016.
 */
public class Chocolat extends Met {

    public Chocolat() {
        setNom("Chocolat");
    }

    @Override
    public boolean estSucre() {
        return false;
    }

    @Override
    public boolean estSale() {
        return false;
    }

    @Override
    public int nomberDeCalories() {
        return 0;
    }
}
