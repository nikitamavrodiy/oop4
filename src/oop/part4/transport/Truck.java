package oop.part4.transport;

public class Truck extends Transport {
    protected Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMovement() {
        System.out.printf("Truck %s %s started moving",
                this.getBrand(), this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Truck %s %s stopped moving",
                this.getBrand(), this.getModel());
    }
}
