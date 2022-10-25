package Animals;

import java.util.Objects;

public abstract class Birds extends Animals{
    private final String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = checkCondition(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public final void eat() {
        System.out.println("Птица("+this.getClass().getName()+")"+this.getName()+" охотится");
    }

    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }

    @Override
    public String toString() {
        return "Birds{" + super.toString() +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}

