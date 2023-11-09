package ua.edu.ucu.apps.flowerstore;
import ua.edu.ucu.apps.flowerstore.spring.flower.Flower;

public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
    }

    public int getPrice() {
        return (int) flower.getPrice() * quantity;
    }
}