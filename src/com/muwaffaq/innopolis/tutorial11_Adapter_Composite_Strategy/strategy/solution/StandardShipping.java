package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.strategy.solution;

import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.strategy.ShippingStrategy;

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight, String destination) {
        return weight*30;
    }
}
