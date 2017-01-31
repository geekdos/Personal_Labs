package com.geekdos.cours.FactoryMethod;

/**
 * Created by theXuser on 04/12/2016.
 */
public class FabriqueB extends Fabrique {
    @Override
    public AbstractClass createClass(boolean isClassA) {
        return new ClassB();
    }
}
