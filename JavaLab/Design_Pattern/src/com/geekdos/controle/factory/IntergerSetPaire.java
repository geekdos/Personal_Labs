package com.geekdos.controle.factory;

import com.geekdos.controle.common.IntegerSet;

/**
 * Created by theXuser on 1/1/2017.
 */
public class IntergerSetPaire extends IntegerSet {
    @Override
    public void addElement(int element) {
        if (element % 2 == 0){
            this.integersList.add(element);
            notifier();
        }
    }
}
