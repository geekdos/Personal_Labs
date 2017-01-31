package com.geekdos.controle.observer;

import com.geekdos.controle.common.IntegerSet;

/**
 * Created by theXuser on 1/1/2017.
 */
public class showAllContent implements Observateur {

    private IntegerSet integerSet;

    public void setIntegerSet(IntegerSet integerSet) {
        this.integerSet = integerSet;
    }

    @Override
    public void update() {
        integerSet.showAll();
    }
}
