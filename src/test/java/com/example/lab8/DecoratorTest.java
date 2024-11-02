package com.example.lab8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.lab8.decorator.AbstractDecorator;
import com.example.lab8.decorator.BasketDecorator;
import com.example.lab8.decorator.PaperDecorator;
import com.example.lab8.decorator.RibbonDecorator;
import com.example.lab8.model.Flower;

class DecoratorTest {
    private Flower rose;
    private Flower tulip;
    private Flower cactus;
    @BeforeEach
    void setUp() {

        rose = new Flower();
        rose.setName("Rose");
        rose.setPrice(10.0);

        tulip = new Flower();
        tulip.setName("Tulip");
        tulip.setPrice(10.0);

        cactus = new Flower();
        cactus.setName("Cactus");
        cactus.setPrice(10.0);
    }

    @Test
    public void testPaperDecorator() {
        AbstractDecorator decoratedFlower = new PaperDecorator(rose);
        assertEquals("Rose, wrapped in paper", decoratedFlower.getDescription());
        assertEquals(13.0, decoratedFlower.price());
    }   
    
    @Test
    public void testBasketDecorator() {
        AbstractDecorator decoratedFlower = new BasketDecorator(tulip);
        assertEquals("Tulip, in a basket", decoratedFlower.getDescription());
        assertEquals(14.0, decoratedFlower.price());
    }

    @Test
    public void testRibbonDecorator() {
        AbstractDecorator decoratedFlower = new RibbonDecorator(cactus);
        assertEquals("Cactus, with a ribbon", decoratedFlower.getDescription());
        assertEquals(12.0, decoratedFlower.price());
    }

}
