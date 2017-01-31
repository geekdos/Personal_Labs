package com.geekdos.cours.FactoryMethod;

/**
 * Created by theXuser on 04/12/2016.
 */
public class Client {
    public static void main(String[] args){
        Fabrique fabricA = new FabriqueA();
        Fabrique fabricB = new FabriqueB();

        System.out.println("Avec la Fabrique du A");
        fabricA.opperation();
        fabricA.opperation();
        fabricA.opperation();

        System.out.println("Avec la Fabrique du B");
        fabricB.opperation();
        fabricB.opperation();
        fabricB.opperation();
    }
}
