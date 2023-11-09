package ua.edu.ucu.apps.flowerstore.strategy.delivery;

import ua.edu.ucu.apps.flowerstore.FlowerBucket;

public class DHLDeliveryStrategy implements DeliveryStrategy {
    @Override
    public void deliver(FlowerBucket order, int coordX, int coordY) {
        System.out.println("Your flower bucket will be delivered to " + coordY +
                " " +coordX + "in 2 days undamaged.");
    }
}
