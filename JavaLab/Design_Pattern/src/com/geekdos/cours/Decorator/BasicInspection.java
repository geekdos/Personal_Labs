package com.geekdos.cours.Decorator;

/**
 * Created by theXuser on 04/12/2016.
 */
public class BasicInspection implements CarService {
    @Override
    public int getCost() {
        return 25;
    }
}
