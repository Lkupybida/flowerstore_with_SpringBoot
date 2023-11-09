package ua.edu.ucu.apps.flowerstore;

abstract class Item {
    String description;

    public String getDescription() {
        return description;
    }
    public abstract double price();
}
