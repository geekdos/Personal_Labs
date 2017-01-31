package com.geekdos.cours.Stategy;

/**
 * Created by theXuser on 27/11/2016.
 */
public class Bird extends Animal{

    public Bird() {
        super();
        setSound("Twit twit");
        flyingType = new ItFlay();
    }

    public String makeHouse(){
        return "Make a birdhouse";
    }

}
