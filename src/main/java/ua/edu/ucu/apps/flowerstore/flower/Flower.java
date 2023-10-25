package ua.edu.ucu.apps.flowerstore.flower;

import lombok.*;

@Getter
@Setter
@ToString
public class Flower {
    private double sepalLength;
    private double price;
    private FlowerColor flowerColor;
    private FlowerType flowerType;

    public Flower(double sepalLength, FlowerColor flowerColor, double price, FlowerType flowerType) {
        this.sepalLength = sepalLength;
        this.flowerColor = flowerColor;
        this.price = price;
        this.flowerType = flowerType;
    }

    public void setColor(FlowerColor color) {
        this.flowerColor = color;
    }

    public String getColor() {
        return flowerColor.toString();
    }

    public String getHeaders() {
        return "sepalLength" + ","
                + "color" + ","
                + "price" + ","
                + "flowerType";
    }
}
