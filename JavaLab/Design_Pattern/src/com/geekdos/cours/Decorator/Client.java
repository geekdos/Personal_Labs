package com.geekdos.cours.Decorator;

/**
 * Created by theXuser on 04/12/2016.
 */
public class Client {
    public static void main(String[] args){
        System.out.println(new BasicInspection().getCost());
        System.out.println(new DecoratorOilChange(new BasicInspection()).getCost());
        System.out.println(new DecoratorTireRotation(new DecoratorOilChange(new BasicInspection())).getCost());
    }
}
