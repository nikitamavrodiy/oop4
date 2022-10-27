package oop.part4.driver;

import oop.part4.transport.Transport;

public abstract class Driver<T extends Transport> {

    private final String fullName;
    private final String category;
    private final int driveExperience;
    private final T car;

    public Driver(String fullName,
                  String category,
                  int driveExperience,
                  T car) {
        this.fullName = fullName;
        this.category = category;
        this.driveExperience = driveExperience;
        this.car = car;
    }

    public void startMovement() {
        System.out.printf("Driver %s started moving", this.fullName);
        System.out.println();
        this.car.startMovement();
    }

    public void stopMovement() {
        System.out.printf("Driver %s stopped moving", this.fullName);
        System.out.println();
        this.car.stopMovement();
    }

    public void refill() {
        System.out.printf("Drive %s refilling the %s %s", this.fullName, this.car.getBrand(), this.car.getModel());
        System.out.println();
    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getDriveExperience() {
        return driveExperience;
    }

    @Override
    public String toString() {
        return String.format(
                "водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
                this.fullName,
                this.car.getBrand(),
                this.car.getModel());

    }
}
