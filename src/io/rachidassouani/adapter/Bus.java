package io.rachidassouani.adapter;

public class Bus implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bus accelerate..");
    }

    @Override
    public void pushBreak() {
        System.out.println("Bus is going to stop");
    }

    @Override
    public void soundHorn() {
        System.out.println("Bus: Beep beep");
    }
}
