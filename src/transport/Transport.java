package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int manufactureYear;
    private final String manufactureCountry;
    private String bodyColor;
    private int maximumSpeed;

    public Transport(Transport ob) {
        this.brand = ob.brand;
        this.model = ob.model;
        this.manufactureYear = ob.manufactureYear;
        this.manufactureCountry = ob.manufactureCountry;
        setBodyColor(ob.bodyColor);
        setMaximumSpeed(ob.maximumSpeed);
    }

    public Transport(String brand, String model, int manufactureYear, String manufactureCountry, String bodyColor, int maximumSpeed) {
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.manufactureCountry = manufactureCountry;
        setBodyColor(bodyColor);
        setMaximumSpeed(maximumSpeed);
    }

    public Transport() {
        this.brand = "default";
        this.model = "default";
        this.manufactureYear = 2000;
        this.manufactureCountry = "default";
        setBodyColor("White");
        setMaximumSpeed(140);
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor != null && !bodyColor.isBlank() ? bodyColor : "White";
    }

    public int getMaximumMovementSpeed() {
        return maximumSpeed;

    }

    public void setMaximumSpeed(int maximumMovementSpeed) {
        if (maximumMovementSpeed < 0) {
            this.maximumSpeed = Math.abs(maximumMovementSpeed);
        } else if (maximumMovementSpeed == 0) {
            this.maximumSpeed = 140;
        } else {
            this.maximumSpeed = maximumMovementSpeed;
        }
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