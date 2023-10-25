package ua.edu.ucu.apps.flowerstore.store;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.flower.Flower;

@Getter
public class Item {
    private Flower flower;
    private int quantity;

    public Item(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
    public double getItemPrice() {
        return flower.getPrice() * quantity;
    }
}
