package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.strategy.solution;

import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.strategy.ShippingStrategy;

public class ShippingContext {
    ShippingStrategy strategy;

    public ShippingContext(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(int weight, String destination){
        return strategy.calculateShippingCost(weight,destination);
    }
}
