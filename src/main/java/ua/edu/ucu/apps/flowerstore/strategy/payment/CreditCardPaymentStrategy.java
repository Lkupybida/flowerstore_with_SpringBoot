package ua.edu.ucu.apps.flowerstore.strategy.payment;

import ua.edu.ucu.apps.flowerstore.Customer;
import ua.edu.ucu.apps.flowerstore.FlowerBucket;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int price, Customer customer) {
        customer.getMoneyFromWallet(price);
    }

}
