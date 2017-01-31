package com.geekdos.cours.Stategy;

/**
 * Created by theXuser on 27/11/2016.
 */
public class CantFly implements Flys {
    @Override
    public String fly() {
        return "This animal Can't Fly";
    }
}
