package io.rachidassouani.adapter;

public class BicycleAdapter implements Vehicle {

    private Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        this.bicycle.pedal();
    }

    @Override
    public void pushBreak() {
        this.bicycle.stop();
    }

    @Override
    public void soundHorn() {
        this.bicycle.ringBell();
    }
}
