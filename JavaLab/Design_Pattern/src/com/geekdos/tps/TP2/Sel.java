package com.geekdos.tps.TP2;

/**
 * Created by theXuser on 28/11/2016.
 */
public class Sel extends Met {

    public Sel() {
        setNom("Sel");
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
