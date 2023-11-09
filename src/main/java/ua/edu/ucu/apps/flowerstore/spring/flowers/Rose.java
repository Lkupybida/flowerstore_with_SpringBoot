package ua.edu.ucu.apps.flowerstore.spring.flowers;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.spring.flower.Flower;
import ua.edu.ucu.apps.flowerstore.spring.flower.FlowerColor;
import ua.edu.ucu.apps.flowerstore.spring.flower.FlowerType;

@Getter
@Setter
public class Rose extends Flower {
    private double numberOfThorns;

    Rose(double sepalLength, FlowerColor color,
         double price, FlowerType flowerType, double numberOfThorns) {
        super(45, FlowerColor.RED, 0.8, FlowerType.ROSE);
        this.numberOfThorns = numberOfThorns;
    }

    public Rose() {
        super(45, FlowerColor.RED, 0.8, FlowerType.ROSE);
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
