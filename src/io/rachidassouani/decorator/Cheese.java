package io.rachidassouani.decorator;

public class Cheese extends SandwichDecorator {
    public Cheese(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese description";
    }
}
