package ua.edu.ucu.apps.flowerstore.strategy.payment;

import ua.edu.ucu.apps.flowerstore.Customer;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int price, Customer customer) {
        customer.getMoneyFromWallet(price);
    }

}
