package com.geekdos.tps.TP2;

/**
 * Created by theXuser on 04/12/2016.
 */
public class Client {
    public static void main(String[] args){
        System.out.println(new DecoratorAlleges(new Boeuf()).getNom());
    }
}
