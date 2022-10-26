package Animals;

import java.util.Objects;

public class Predators extends Mammals {
    private final String foodType;

    public Predators(String name, int age, String livingEnvironment, int movementSpeed, String foodType) {
        super(name, age, livingEnvironment, movementSpeed);
        this.foodType = checkCondition(foodType);
    }

    public String getFoodType() {
        return foodType;
    }

    public final void eat() {
        System.out.println("Хищник " + this.getName() + " охотится");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predators predators = (Predators) o;
        return Objects.equals(foodType, predators.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodType);
    }

    @Override
    public String toString() {
        return "Predators{" + super.toString() +
                "foodType='" + foodType + '\'' +
                '}';
    }
}
