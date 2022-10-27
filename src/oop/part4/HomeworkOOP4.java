package oop.part4;

import oop.part4.driver.DriverB;
import oop.part4.transport.Car;
import oop.part4.transport.Transport;

public class HomeworkOOP4 {
    public static void main(String[] args) {
        Car car = new Car("bmw","x5", 1.5f);
        DriverB driverB = new DriverB("Test", 5, car);
        System.out.println(driverB);


        /*car.startMovement();
        car.stopMovement();
        car.pitStop();
        System.out.println("car.getBestLapTime() = " + car.getBestLapTime());
        System.out.println("car.getMaxSpeed() = " + car.getMaxSpeed());*/
    }
}
