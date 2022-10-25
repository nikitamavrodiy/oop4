package Animals;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private final int age;

    public Animals(String name, int age) {
        this.name = checkCondition(name);
        this.age = checkCondition(age, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = checkCondition(name);
    }

    public int getAge() {
        return age;
    }

    public final void sleep() {
        System.out.println(this.name + " спит");
    }

    public abstract void eat();

    public abstract void go();

    public String checkCondition(String check) {
        return check != null && !check.isBlank() ? check : "default";
    }

    public int checkCondition(int check, int def) {
        if (check < 0) {
            return Math.abs(check);
        } else if (check == 0) {
            return def;
        } else {
            return check;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
