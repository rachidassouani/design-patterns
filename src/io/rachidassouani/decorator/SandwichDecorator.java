package io.rachidassouani.decorator;
public class SandwichDecorator implements Sandwich {

    private Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public double calculateCost() {
        return this.sandwich.calculateCost();
    }

    @Override
    public String getDescription() {
        return this.sandwich.getDescription();
    }
}
