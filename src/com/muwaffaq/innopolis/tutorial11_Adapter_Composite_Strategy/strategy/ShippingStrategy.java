package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.strategy;

public interface ShippingStrategy {
    double calculateShippingCost(double weight, String destination);

}
