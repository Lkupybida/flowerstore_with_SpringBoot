package ua.edu.ucu.apps.flowerstore.strategy.payment;

import ua.edu.ucu.apps.flowerstore.Customer;

public interface PaymentStrategy {
    void pay(int price, Customer customer);
}
