package com.geekdos.cours.AbstractFactory;

/**
 * Created by theXuser on 03/12/2016.
 */
public class Client {
    public static void main(String[] args){

        // Création des fabriques
        AbstractFactory factoryA = new FactoryA();
        AbstractFactory factoryB = new FactoryB();

        // Création de deux "AbstractClasse" à partir de chaque fabriqu
        AbstractClass objectA = factoryA.createClass();
        AbstractClass objectB = factoryB.createClass();

        /*
        * Appel d'une méthode d'"AbstractClasse" qui affiche un message
        * Ce message permet de vérifier que chaque "AbstractClasse"
        * est en fait une classe différente
        */
        objectA.afficherClass();
        objectB.afficherClass();
    }
}
