package com.geekdos.cours.Decorator;

/**
 * Created by theXuser on 04/12/2016.
 */
public class DecoratorOilChange implements CarService {
    protected CarService carService;

    public DecoratorOilChange(CarService carService){
        this.carService = carService;
    }

    @Override
    public int getCost() {
        return 19 + this.carService.getCost();
    }
}
