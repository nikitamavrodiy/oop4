package oop.part3.transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int manufactureYear;
    private final String manufactureCountry;
    private String bodyColor;
    private int maximumSpeed;

    public Transport(String brand, String model, int manufactureYear, String manufactureCountry, String bodyColor, int maximumSpeed) {
        this.brand = checkCondition(brand);
        this.model = checkCondition(model);
        this.manufactureYear = checkCondition(manufactureYear, 2000);
        this.manufactureCountry = checkCondition(manufactureCountry);
        setBodyColor(bodyColor);
        setMaximumSpeed(maximumSpeed);
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = checkCondition(bodyColor, "White");
    }

    public int getMaximumMovementSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = checkCondition(maximumSpeed, 160);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getManufactureCountry() {
        return manufactureCountry;
    }

    public static final String checkCondition(String check) {
        return check != null && !check.isBlank() ? check : "default";
    }

    public final String checkCondition(String check, String def) {
        return check != null && !check.isBlank() ? check : def;
    }

    public final int checkCondition(int check, int def) {
        if (check < 0) {
            return Math.abs(check);
        } else if (check == 0) {
            return def;
        } else {
            return check;
        }
    }

    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", manufactureCountry='" + manufactureCountry + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maximumSpeed=" + maximumSpeed +
                '}';
    }

    public abstract void refill();
}