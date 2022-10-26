package oop.part3.Animals;

import java.util.Objects;

public class Flying extends Birds {
    private final String movementType;

    public Flying(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = checkCondition(movementType);
    }

    public final void go() {
        System.out.println("Птица(" + this.getClass().getName() + ") " + this.getName() + " летает");
    }

    public final String getMovementType() {
        return movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movementType);
    }

    @Override
    public String toString() {
        return "Flying{" + super.toString() +
                "movementType='" + movementType + '\'' +
                '}';
    }
}
