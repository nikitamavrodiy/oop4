package oop.part3.Animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    private final String livingEnvironment;
    private final int movementSpeed;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        this.livingEnvironment = checkCondition(livingEnvironment);
        this.movementSpeed = checkCondition(movementSpeed, 60);
    }

    public abstract void eat();

    public final void go() {
        System.out.println("Млекопитающее "+this.getName()+" гуляет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;
        return movementSpeed == mammals.movementSpeed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment, movementSpeed);
    }

    @Override
    public String toString() {
        return "Mammals{" + super.toString() +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", movementSpeed=" + movementSpeed +
                '}';
    }
}

