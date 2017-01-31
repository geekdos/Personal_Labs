package com.geekdos.cours.FactoryMethod;

/**
 * Created by theXuser on 04/12/2016.
 */
public class FabriqueA extends Fabrique {
    @Override
    public AbstractClass createClass(boolean isClassA) {
        if (isClassA)
            return new ClassA();
        else
            return new ClassB();
    }
}
