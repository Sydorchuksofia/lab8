package com.example.lab8.decorator;

import com.example.lab8.model.Flower;

public abstract class AbstractDecorator {
    private Flower flower;
    
    public AbstractDecorator(Flower flower) {
        this.flower = flower;
    }

    public String getDescription() {
        return flower.getName();
    }

    public double price() {
        return flower.getPrice();
    }
}
