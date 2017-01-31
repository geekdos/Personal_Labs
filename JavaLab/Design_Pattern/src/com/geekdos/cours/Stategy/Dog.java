package com.geekdos.cours.Stategy;

/**
 * Created by theXuser on 27/11/2016.
 */
public class Dog extends Animal {

    public Dog() {
        super();
        setSound("Bark");
        flyingType = new CantFly();
    }

    public String digHole(){
        return "Dug a Hole";
    }


}
