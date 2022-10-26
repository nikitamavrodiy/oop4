package oop.part3.Animals;

import java.util.Objects;

public class Unflying extends Birds {
    private final String movementType;

    public Unflying(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = checkCondition(movementType);
    }

    public final void go() {
        System.out.println("Птица " + this.getMovementType() + " - " + this.getName() + " гуляет");
    }

    public final String getMovementType() {
        return movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unflying unflying = (Unflying) o;
        return Objects.equals(movementType, unflying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movementType);
    }

    @Override
    public String toString() {
        return "Unflying{" + super.toString() +
                "movementType='" + movementType + '\'' +
                '}';
    }
}
