package ua.edu.ucu.apps.flowerstore.strategy.delivery;

import ua.edu.ucu.apps.flowerstore.FlowerBucket;

public class PostDeliveryStrategy implements DeliveryStrategy {
    @Override
    public void deliver(FlowerBucket order, int coord_X, int coord_Y) {
        System.out.println("Your flower bucket will be delivered to " + coord_Y + " " +coord_X + "in 200 days once the flowers have died.");
    }
}
