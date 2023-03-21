package io.rachidassouani.decorator;

public class Beef extends SandwichDecorator {
    public Beef(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Beef description";
    }
}
