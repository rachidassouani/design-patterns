package io.rachidassouani.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void someOperations() {
        System.out.println("***************");
        strategy.someOperations();
        System.out.println("***************");
    }
}
