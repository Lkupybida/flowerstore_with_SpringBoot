package ua.edu.ucu.apps.flowerstore.spring.flowers;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.spring.flower.Flower;
import ua.edu.ucu.apps.flowerstore.spring.flower.FlowerColor;
import ua.edu.ucu.apps.flowerstore.spring.flower.FlowerType;

@Getter
@Setter
public class Rose extends Flower {
    private static final double DEFAULT_SEPAL_LENGTH = 45.0;
    private static final FlowerColor DEFAULT_COLOR = FlowerColor.RED;
    private static final double DEFAULT_PRICE = 0.8;
    private static final FlowerType DEFAULT_FLOWER_TYPE = FlowerType.ROSE;

    private double numberOfThorns;

    Rose(double sepalLength, FlowerColor color,
         double price, FlowerType flowerType, double numberOfThorns) {
        super(sepalLength, color, price, flowerType);
        this.numberOfThorns = numberOfThorns;
    }

    public Rose() {
        super(DEFAULT_SEPAL_LENGTH, DEFAULT_COLOR, DEFAULT_PRICE, DEFAULT_FLOWER_TYPE);
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ","
                + "sepalLength" + ","
                + "color" + ","
                + "price" + ","
                + "flowerType" + ","
                + "numberOfThorns";
    }
}

