package FactoryMethod;

import abstractFactory.AbstractClass;
import abstractFactory.ClassA;
import abstractFactory.ClassB;

/**
 * Created by theXuser on 1/29/2017.
 */
public class FactoryMethod {
    AbstractClass abstractClass;
    public AbstractClass createClass(String className) {
        if (className.equals("A")){
            abstractClass = new ClassA();
        }else if (className.equals("B")){
            abstractClass = new ClassB();
        }

        return abstractClass;
    }
}
