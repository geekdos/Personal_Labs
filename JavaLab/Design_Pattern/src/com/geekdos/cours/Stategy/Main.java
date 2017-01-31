package com.geekdos.cours.Stategy;

/**
 * Created by theXuser on 27/11/2016.
 */
public class Main {

    public static void main(String[] args){
        Animal doggy = new Dog();
        doggy.setName("Rox");

        Animal twitty = new Bird();
        twitty.setName("Twitty");

        System.out.println("The Animal "+doggy.getName()+" is a "+doggy.getClass()+" and "+doggy.tryToFly());
        System.out.println("The Animal "+twitty.getName()+" is a "+twitty.getClass()+" and "+twitty.tryToFly());
    }
}
