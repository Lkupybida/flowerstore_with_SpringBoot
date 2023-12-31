package ua.edu.ucu.apps.flowerstore.store;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.strategy.delivery.DeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.strategy.payment.PaymentStrategy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private List<Item> items;
    private LocalDateTime orderNumber;

    public Order(LocalDateTime orderNumber) {
        this.orderNumber = LocalDateTime.now();
        this.items = new ArrayList<>();
    }
    public void addFlowers(Item item) {
        items.add(item);
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {

    }
    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {

    }
    public void processOrder() {

    }
    public void addItem(Item item) {

    }
    public void removeItem(Item item) {

    }

    public double getOrderPrice() {
        double orderPrice = 0.0;
        for (Item item : items) {
            orderPrice += item.getItemPrice();
        }
        return orderPrice;
    }

}
