package ua.edu.ucu.apps.flowerstore;

import lombok.Getter;

@Getter
public class Customer {
    private double moneyInWallet;
    private double moneyOnPaypal;

    public Customer(double moneyInWallet, double moneyOnPaypal) {
        this.moneyInWallet = moneyInWallet;
        this.moneyOnPaypal = moneyOnPaypal;
    }

    public double getMoneyInWallet() {
        return moneyInWallet;
    }

    public void setMoneyInWallet(double moneyInWallet) {
        this.moneyInWallet = moneyInWallet;
    }

    public double getMoneyOnPaypal() {
        return moneyOnPaypal;
    }

    public void setMoneyOnPaypal(double moneyOnPaypal) {
        this.moneyOnPaypal = moneyOnPaypal;
    }


    public void getMoneyFromWallet(double loss) {
        double money = getMoneyInWallet();
        money = money - loss;
        setMoneyInWallet(money);
    }

    public double getMoneyFromPaypal(double loss) {
        double money = getMoneyOnPaypal();
        money = money - loss;
        setMoneyOnPaypal(money);
        return loss;
    }
}
