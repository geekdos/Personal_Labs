package com.geekdos.tps.TP2;

/**
 * Created by theXuser on 04/12/2016.
 */
public class DecoratorAlleges extends Met {

    protected Met met;

    public DecoratorAlleges(Met met){
        this.setNom(met.getNom()+"-Allégés");
        this.met = met;
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
        return 150;
    }
}
