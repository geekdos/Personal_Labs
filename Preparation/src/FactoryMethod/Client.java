package FactoryMethod;

import abstractFactory.AbstractClass;

/**
 * Created by theXuser on 1/29/2017.
 */
public class Client {
    public static void main(String[] args){
        FactoryMethod factoryMethod = new FactoryMethod();
        AbstractClass classA = factoryMethod.createClass("A");
        AbstractClass classB = factoryMethod.createClass("B");

        classA.affcher();
        classB.affcher();
    }
}
