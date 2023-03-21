package io.rachidassouani.factory;

public class SandwichFactory {

    public final static int CHEESE_BURGER = 1;
    public final static int CHICKEN_BURGER = 2;

    public static Sandwich createSandwich(int sandwichId) {
        switch (sandwichId) {
            case CHEESE_BURGER:
                return new Cheeseburger();

            case CHICKEN_BURGER:
                return new ChickenBurger();

            default:
                return null;
        }
    }
}
