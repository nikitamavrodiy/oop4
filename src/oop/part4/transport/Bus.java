package oop.part4.transport;

public class Bus extends Transport {
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMovement() {
        System.out.printf("Bus %s %s started moving",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Bus %s %s stopped moving",
                this.getBrand(),
                this.getModel());
    }
}
