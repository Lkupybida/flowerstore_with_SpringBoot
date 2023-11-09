package ua.edu.ucu.apps.flowerstore.spring.flower;

public enum FlowerType {

    CHAMOMILE("chamomile"),

    ROSE("rose"),

    TULIP("tulip");

    private final String stringRepresentation;

    FlowerType(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}