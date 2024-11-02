package com.example.lab8.decorator;

import com.example.lab8.model.Flower;

public class BasketDecorator extends AbstractDecorator{

    public BasketDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", in a basket";
    }

    @Override
    public double price() {
        return super.price() + 4.0;
    }

}
