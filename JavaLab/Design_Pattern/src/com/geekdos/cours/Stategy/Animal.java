package com.geekdos.cours.Stategy;

/**
 * Created by theXuser on 27/11/2016.
 */
public class Animal {

    private String name;
    private int wight;
    private String sound;

    public Flys flyingType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        if (wight > 0)
            this.wight = wight;
        else
            System.out.println("The wight must be greater than 0");
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingAbility(Flys flyingtype){
        this.flyingType = flyingtype;
    }
}
