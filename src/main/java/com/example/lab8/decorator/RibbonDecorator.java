package com.example.lab8.decorator;

import com.example.lab8.model.Flower;

public class RibbonDecorator extends AbstractDecorator{

    public RibbonDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with a ribbon";
    }

    @Override
    public double price() {
        return super.price() + 2.0;
    }

}
