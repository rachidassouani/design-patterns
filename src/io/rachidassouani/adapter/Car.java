package io.rachidassouani.adapter;

public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Car accelerate..");
    }

    @Override
    public void pushBreak() {
        System.out.println("Car is going to stop");
    }

    @Override
    public void soundHorn() {
        System.out.println("Car Beep beep");
    }
}
