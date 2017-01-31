package com.geekdos.tps.TP2;

/**
 * Created by theXuser on 28/11/2016.
 */
public class Haricot_vert extends Met {

    public Haricot_vert() {
        setNom("Haricot vert");
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
