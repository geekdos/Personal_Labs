package com.geekdos.cours.AbstractFactory;

/**
 * Created by theXuser on 03/12/2016.
 */
public class FactoryA implements AbstractFactory {
    @Override
    public AbstractClass createClass() {
        return new ClassA();
    }
}
