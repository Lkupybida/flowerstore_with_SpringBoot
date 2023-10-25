package ua.edu.ucu.apps.flowerstore;

abstract class Item {
    String description;

    public String getDescription() {
        return description;
    }
    abstract double price();
}
