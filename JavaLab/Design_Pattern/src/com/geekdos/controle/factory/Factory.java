package com.geekdos.controle.factory;

import com.geekdos.controle.common.IntegerSet;

/**
 * Created by theXuser on 1/1/2017.
 */
public class Factory {
    IntegerSet integerSet;

    public IntegerSet getIntegerSet(String name){
        if (name.equals("paire")){
            this.integerSet = new IntergerSetPaire();
        }else if (name.equals("impaire")){
            this.integerSet = new IntergerSetImpaire();
        }else if (name.equals("premier")){
            this.integerSet = new IntergerSetPremier();
        }else {
            System.out.println("This class is not defined");
        }

        return this.integerSet;
    }
}
