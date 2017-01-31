package com.geekdos.controle.factory;

import com.geekdos.controle.common.IntegerSet;

/**
 * Created by theXuser on 1/1/2017.
 */
public class IntergerSetPremier extends IntegerSet {

    @Override
    public void addElement(int element) {
        if (estPremier(element)){
            this.integersList.add(element);
            notifier();
        }
    }

    private boolean estPremier(int n) {
        int cpt = 0;
        if (n < 2) { return false; }
        for (int i = n - 1; i > 2; i--) {
            if (n % i == 0) {
                cpt++;
            }
        }
        return cpt > 0 ? false : true;
    }
}
