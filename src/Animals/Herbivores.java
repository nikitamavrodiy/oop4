package Animals;

import java.util.Objects;

public class Herbivores extends Mammals {
    private final String foodType;

    public Herbivores(String name, int age, String livingEnvironment, int movementSpeed, String foodType) {
        super(name, age, livingEnvironment, movementSpeed);
        this.foodType = checkCondition(foodType);


    }

    public String getFoodType() {
        return foodType;
    }

    public final void eat() {
        System.out.println("Травоядное " + this.getName() + " пасётся");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(foodType, that.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodType);
    }

    @Override
    public String toString() {
        return "Herbivores{" + super.toString() +
                "foodType='" + foodType + '\'' +
                '}';
    }
}
