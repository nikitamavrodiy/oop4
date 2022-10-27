package oop.part4.transport;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMovement() {
        System.out.printf("Bus %s %s started moving",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void stopMovement() {
        System.out.printf("Bus %s %s stopped moving",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void pitStop() {
        System.out.printf("Bus %s %s performed pit-stop",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 400);
    }
}
