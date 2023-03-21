package io.rachidassouani.decorator;

public class Application {
    public static void main(String[] args) {
        Sandwich sandwich = new Beef(new Cheese(new BasicSandwich()));
        System.out.println("Cost :" + sandwich.calculateCost());
        System.out.println("Desc :" + sandwich.getDescription());
    }
}
