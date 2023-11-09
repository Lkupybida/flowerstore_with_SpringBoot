package ua.edu.ucu.apps.flowerstore.strategy.payment;

import ua.edu.ucu.apps.flowerstore.Customer;

public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int price, Customer customer) {
        customer.getMoneyFromPaypal(price);
    }
}
