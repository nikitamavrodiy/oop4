package oop.part3.transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int manufactureYear, String manufactureCountry, String bodyColor, int maximumSpeed) {
        super(brand, model, manufactureYear, manufactureCountry, bodyColor, maximumSpeed);
    }

    public String toString() {
        return "Bus{"+super.toString()+"}";
    }

    public void refill() {
        System.out.println("Объект класса bus " + super.getBrand() + " " + super.getModel() + " " + super.getBodyColor() + " заправлен  бензином или дизелем на заправке");
    }
}
