package com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Flyweight.Solution;

import com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Flyweight.Car;
import com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Flyweight.Sedan;
import com.muwaffaq.innopolis.tutorial14_Visitor_Mediator_Flyweight.Flyweight.Suv;

import java.util.HashMap;
import java.util.Map;

public class CarFlyweightFactory {
    Map<String, Car> carMap = new HashMap<>();


    public Car getCar(String type) {
        Car car;
        if (carMap.containsKey(type))
            return carMap.get(type);
        else {
            if (type.equalsIgnoreCase("sedan"))
                car = new Sedan();
            else
                car = new Suv();
            carMap.put(type, car);
            return car;
        }

    }
}
