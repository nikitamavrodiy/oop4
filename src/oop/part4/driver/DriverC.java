package oop.part4.driver;

import oop.part4.transport.Truck;

public class DriverC extends Driver<Truck> {
    public DriverC(String fullName, int driveExperience, Truck car) {
        super(fullName, "C", driveExperience, car);
    }
}
