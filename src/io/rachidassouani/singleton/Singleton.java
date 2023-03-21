package io.rachidassouani.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Singleton {

    private List<Integer> numbers = Arrays.asList(1, 5, 6, 9, 6, 4);
    private static Singleton instance;

    private Singleton() {
        System.out.println("Object created");
        Collections.shuffle(numbers);
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void printData() {
        numbers.stream().forEach(System.out::print);
        System.out.println();
    }
}
