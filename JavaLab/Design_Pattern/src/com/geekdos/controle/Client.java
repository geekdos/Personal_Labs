package com.geekdos.controle;

import com.geekdos.controle.common.IntegerSet;
import com.geekdos.controle.factory.Factory;
import com.geekdos.controle.observer.Observateur;
import com.geekdos.controle.observer.showAllContent;
import com.geekdos.controle.observer.showAvg;

import java.util.Observer;

/**
 * Created by theXuser on 1/1/2017.
 */
public class Client {
    public static void main(String[] args){
        System.out.println("Hello from the other side");

        Factory factory = new Factory();
        IntegerSet paire = factory.getIntegerSet("paire");
        IntegerSet impaire = factory.getIntegerSet("impaire");
        IntegerSet premier = factory.getIntegerSet("premier");

        Observateur observer1, observer2;
        observer1 = new showAllContent();
        observer2 = new showAvg();

        paire.ajouterObs(observer1);
        paire.ajouterObs(observer2);

        observer1.setIntegerSet(paire);
        observer2.setIntegerSet(paire);

        paire.addElement(8);
        paire.addElement(2);
        paire.addElement(4);
    }
}
