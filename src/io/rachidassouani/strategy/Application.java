package io.rachidassouani.strategy;

public class Application {
    public static void main(String[] args) {
        Context context = new Context(new Strategy1());
        context.someOperations();
    }
}
