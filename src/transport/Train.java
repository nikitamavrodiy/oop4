package transport;

public class Train extends Transport {
    private int tripPrice;
    private int journeyTime;
    private String departureStation;
    private String finalStation;
    private int wagonsNumber;

    public Train(Train ob) {
        super(ob);
        this.tripPrice = ob.tripPrice;
        this.journeyTime = ob.journeyTime;
        this.departureStation = ob.departureStation;
        this.finalStation = ob.finalStation;
        this.wagonsNumber = ob.wagonsNumber;
    }

    public Train(String brand, String model, int manufactureYear, String manufactureCountry, String bodyColor, int maximumSpeed, int tripPrice, int journeyTime, String departureStation, String finalStation, int wagonsNumber) {
        super(brand, model, manufactureYear, manufactureCountry, bodyColor, maximumSpeed);
        this.tripPrice = checkCondition(tripPrice, 9999);
        this.journeyTime = checkCondition(journeyTime, 99);
        this.departureStation = checkCondition(departureStation);
        this.finalStation = checkCondition(finalStation);
        this.wagonsNumber = checkCondition(wagonsNumber, 99);
    }

    public Train() {
        this.tripPrice = 9999;
        this.journeyTime = 99;
        this.departureStation = "default";
        this.finalStation = "default";
        this.wagonsNumber = 99;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }

    public int getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(int journeyTime) {
        this.journeyTime = journeyTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        this.finalStation = finalStation;
    }

    public int getWagonsNumber() {
        return wagonsNumber;
    }

    public void setWagonsNumber(int wagonsNumber) {
        this.wagonsNumber = wagonsNumber;
    }

    private static String checkCondition(String check) {
        return check = check != null && !check.isBlank() ? check : "default";
    }

    private int checkCondition(int check, int def) {
        if (check < 0) {
            return Math.abs(check);
        } else if (check == 0) {
            return def;
        } else {
            return check;
        }
    }

    public String toString() {
        return "Train{" + super.toString() +
                "tripPrice=" + tripPrice +
                ", journeyTime=" + journeyTime +
                ", departureStation='" + departureStation + '\'' +
                ", finalStation='" + finalStation + '\'' +
                ", wagonsNumber=" + wagonsNumber +
                '}';
    }

    public void refill() {
        System.out.println("Объект класса train " + super.getBrand() + " " + super.getModel() + " заправлен двигателем");
    }
}
