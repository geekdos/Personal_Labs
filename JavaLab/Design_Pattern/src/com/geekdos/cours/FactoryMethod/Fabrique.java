package com.geekdos.cours.FactoryMethod;

/**
 * Created by theXuser on 04/12/2016.
 */
public abstract class Fabrique {

    protected boolean isClassA = false;

    public abstract AbstractClass createClass(boolean isClassA);

    public void opperation(){
        isClassA = !isClassA;
        AbstractClass abstractClass = createClass(isClassA);
        abstractClass.afficherClass();
    }
}
