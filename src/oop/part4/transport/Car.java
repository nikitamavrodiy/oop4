package oop.part4.transport;

public class Car extends Transport {
    protected Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void startMovement() {
        System.out.printf("Car %s %s started moving",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Car %s %s stopped moving",
                this.getBrand(),
                this.getModel());
    }
}
