package io.rachidassouani.factory;

public class Application {
    public static void main(String[] args) {
        Sandwich sandwich1 = SandwichFactory.createSandwich(SandwichFactory.CHEESE_BURGER);
        sandwich1.prepareSandwich();

        Sandwich sandwich2 = SandwichFactory.createSandwich(SandwichFactory.CHICKEN_BURGER);
        sandwich2.prepareSandwich();
    }
}
