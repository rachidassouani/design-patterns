package io.rachidassouani.adapter;

public class Application {
    public static void main(String[] args) {
        Vehicle car = new Car();
        useVehicle(car);

        Vehicle bike = new BicycleAdapter(new Bicycle());
        useVehicle(bike);
    }

    public static void useVehicle(Vehicle vehicle) {
        vehicle.accelerate();
        vehicle.soundHorn();
        vehicle.pushBreak();
        System.out.println();
    }
}
