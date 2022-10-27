package oop.part4.driver;

import oop.part4.transport.Bus;

public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, int driveExperience, Bus car) {
        super(fullName, "D", driveExperience, car);
    }
}
