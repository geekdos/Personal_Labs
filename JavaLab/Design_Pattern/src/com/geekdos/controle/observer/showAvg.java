package com.geekdos.controle.observer;


import com.geekdos.controle.common.IntegerSet;

/**
 * Created by theXuser on 1/1/2017.
 */
public class showAvg implements Observateur {

    private IntegerSet integerSet;

    public void setIntegerSet(IntegerSet integerSet) {
        this.integerSet = integerSet;
    }

    @Override
    public void update() {
        double som = 0;
        for (Object o: integerSet.integersList) {
            som += Integer.parseInt(o.toString());
        }
        System.out.println("La AVG est : "+ som / integerSet.integersList.size());
    }
}
