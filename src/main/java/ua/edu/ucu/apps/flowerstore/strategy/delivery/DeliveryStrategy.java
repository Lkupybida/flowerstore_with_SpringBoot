package ua.edu.ucu.apps.flowerstore.strategy.delivery;

import ua.edu.ucu.apps.flowerstore.FlowerBucket;

public interface DeliveryStrategy {
    void deliver(FlowerBucket order, int coordX, int coordY);
}
