package com.geekdos.cours.Decorator;

/**
 * Created by theXuser on 04/12/2016.
 */
public class DecoratorTireRotation implements CarService {
    protected CarService carService;

    public DecoratorTireRotation(CarService carService){
        this.carService = carService;
    }

    @Override
    public int getCost() {
        return 10 + this.carService.getCost();
    }
}
