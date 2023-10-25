package ua.edu.ucu.apps.flowerstore.strategy.payment;

import ua.edu.ucu.apps.flowerstore.Customer;
import ua.edu.ucu.apps.flowerstore.FlowerBucket;

public interface PaymentStrategy {
    void pay(int price, Customer customer);
}
