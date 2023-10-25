package ua.edu.ucu.apps.flowerstore;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class Customer {
    double money_in_wallet = 696969;
    double money_on_paypal = 420;
    public void setMoney_in_wallet(double money_in_wallet) {
        this.money_in_wallet = money_in_wallet;
    }

    public void getMoneyFromWallet(double loss) {
        double money = getMoney_in_wallet();
        money = money - loss;
        setMoney_in_wallet(money);
    }

    public void setMoney_on_paypal(double money_in_wallet) {
        this.money_in_wallet = money_in_wallet;
    }

    public double getMoneyFromPaypal(double loss) {
        double money = getMoney_in_wallet();
        money = money - loss;
        setMoney_in_wallet(money);
        return loss;
    }
    public Customer() {
        Customer customer = new Customer(6969, 420);
    }
}
