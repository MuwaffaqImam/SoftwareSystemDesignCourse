package com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.strategy;

import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.strategy.solution.ProShipping;
import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.strategy.solution.ShippingContext;
import com.muwaffaq.innopolis.tutorial11_Adapter_Composite_Strategy.strategy.solution.StandardShipping;

public class Main {
    // Strategy interface


    public static void main(String[] args) {
        ShippingContext context = new ShippingContext(new StandardShipping());
        System.out.println(context.calculate(20,"new york"));
        // Client decided to pay
        context.setStrategy(new ProShipping());
        System.out.println(context.calculate(20,"same"));;
    }



    }


