package io.rachidassouani.decorator;

public class BasicSandwich implements Sandwich {
    @Override
    public double calculateCost() {
        return 25;
    }

    @Override
    public String getDescription() {
        return "Basic Sandwich Description";
    }
}
