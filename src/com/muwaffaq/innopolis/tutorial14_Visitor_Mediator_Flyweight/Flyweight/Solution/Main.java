package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Flyweight.Solution;

import com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Flyweight.Car;

public class Main {


    public static void main(String[] args) {
        CarFlyweightFactory factory = new CarFlyweightFactory();
        Car car;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                car =factory.getCar("sedan");
            else
               car = factory.getCar("Suv");

            car.start();

        }
    }
}
