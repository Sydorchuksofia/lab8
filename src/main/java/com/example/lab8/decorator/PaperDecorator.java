package com.example.lab8.decorator;

import com.example.lab8.model.Flower;

public class PaperDecorator extends AbstractDecorator{

    public PaperDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", wrapped in paper";
    }

    @Override
    public double price() {
        return super.price() + 3.0;
    }

}
