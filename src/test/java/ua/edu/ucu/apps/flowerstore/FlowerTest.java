package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import ua.edu.ucu.apps.flowerstore.spring.flower.Flower;
import ua.edu.ucu.apps.flowerstore.spring.flower.FlowerColor;
import ua.edu.ucu.apps.flowerstore.spring.flower.FlowerType;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int DEFAULT_SEPAL_LENGTH = 45;
    private static final double DEFAULT_PRICE = 0.8;
    private static final int MAX_PRICE = 100;
    private static final FlowerColor DEFAULT_COLOR = FlowerColor.RED;
    private static final FlowerType DEFAULT_FLOWER_TYPE = FlowerType.ROSE;

    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower(DEFAULT_SEPAL_LENGTH,
                DEFAULT_COLOR, DEFAULT_PRICE, DEFAULT_FLOWER_TYPE);
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }
}
