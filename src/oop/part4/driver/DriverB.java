package oop.part4.driver;

import oop.part4.transport.Car;

public class DriverB extends Driver<Car> {

    public DriverB(String fullName, int driveExperience, Car car) {
        super(fullName, "B", driveExperience, car);
    }
}
