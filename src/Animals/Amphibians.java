package Animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private final String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = checkCondition(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public final void eat() {
        System.out.println("Хищник " + this.getName() + " охотится");
    }


    @Override
    public final void go() {
        System.out.println("Земноводное "+this.getName()+ " гуляет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }

    @Override
    public String toString() {
        return "Amphibians{" + super.toString() +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}
