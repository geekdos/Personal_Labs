/**
 * Created by theXuser on 28/11/2016.
 */

package com.geekdos.tps.TP2;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Met {

    private List<Met> mets = new ArrayList();

    public Composite() {
        this.mets = mets;
    }

    @Override
    public boolean estSucre() {
        for(int i = 0; i< this.mets.size() ; i++){
            if(mets.get(i).estSucre()) return true;
        }
        return false;
    }

    @Override
    public boolean estSale() {
        for(int i = 0; i< this.mets.size() ; i++){
            if(mets.get(i).estSale()) return true;
        }
        return false;
    }

    @Override
    public int nomberDeCalories() {
        int totaleDesClories = 0;
        for(int i = 0; i< this.mets.size() ; i++){
            totaleDesClories += mets.get(i).nomberDeCalories();
        }
        return totaleDesClories;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
