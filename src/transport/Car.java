package transport;

import java.time.LocalDate;
import java.util.Calendar;

public class Car extends Transport {
    private final String bodyType;
    private final int seatsNumber;
    private double engineVolume;
    private String transmission;
    private String registrationNumber;
    private String tyresType;
    public final Key key;
    public final Insurance insurance;
    private final boolean isElectroCar; //по умолчанию false.

    public Car(String brand, String model, int manufactureYear, String manufactureCountry, String bodyColor, int maximumSpeed,
               double engineVolume, String transmission, String registrationNumber, String bodyType, String tyresType,
               int seatsNumber, Key key, Insurance insurance, boolean isElectroCar) {
        super(brand, model, manufactureYear, manufactureCountry, bodyColor, maximumSpeed);
        this.bodyType = checkCondition(bodyType);
        this.tyresType = checkCondition(tyresType);
        this.key = key;
        this.insurance = insurance;
        this.isElectroCar = isElectroCar;
        if (seatsNumber == 0) {
            this.seatsNumber = 40;
        } else {
            this.seatsNumber = seatsNumber < 0 ? Math.abs(seatsNumber) : seatsNumber;
        }
        setRegistrationNumber(registrationNumber);
        setTyresType(tyresType);
        setTransmission(transmission);
        setEngineVolume(engineVolume);
    }

    public Car(double engineVolume, String transmission, String registrationNumber, String bodyType, String tyresType,
               int seatsNumber, Key key, Insurance insurance, boolean isElectroCar) {
        super();
        this.bodyType = checkCondition(bodyType);
        this.tyresType = checkCondition(tyresType);
        this.key = key;
        this.insurance = insurance;
        this.isElectroCar = isElectroCar;
        if (seatsNumber == 0) {
            this.seatsNumber = 40;
        } else {
            this.seatsNumber = seatsNumber < 0 ? Math.abs(seatsNumber) : seatsNumber;
        }
        setRegistrationNumber(registrationNumber);
        setTyresType(tyresType);
        setTransmission(transmission);
        setEngineVolume(engineVolume);
    }


    public boolean isRegNumberValid() {
        if (this.registrationNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.registrationNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);
    }

    public void changeTires() {
        if (Calendar.getInstance().get(Calendar.MONTH) > 1 && Calendar.getInstance().get(Calendar.MONTH) < 11) {
            setTyresType("Летняя");
        } else {
            setTyresType("Зимняя");
        }
    }

    public void setTyresType(String tyresType) {
        this.tyresType = checkCondition(tyresType);
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = checkCondition(registrationNumber);

    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0) {
            this.engineVolume = Math.abs(engineVolume);
        } else {
            this.engineVolume = engineVolume > 0 ? engineVolume : 1.5;
        }
    }

    public void setTransmission(String transmission) {
        this.transmission = checkCondition(transmission);
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getTyresType() {
        return tyresType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    private static String checkCondition(String check) {
        return check = check != null && !check.isEmpty() && !check.isBlank() ? check : "default";
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keyLessAcces;

        public Key(boolean remoteEngineStart, boolean keyLessAcces) {
            this.remoteEngineStart = remoteEngineStart;
            this.keyLessAcces = keyLessAcces;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeyLessAcces() {
            return keyLessAcces;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", keyLessAcces=" + keyLessAcces +
                    '}';
        }
    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final float cost;
        private final String number;

        public Insurance(LocalDate validUntil, float cost, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.cost = Math.max(cost, 1f);
            this.number = checkCondition(number);
        }

        public void isNumberValid() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

        public void isInsuranceValid() {
            if (!LocalDate.now().isBefore(this.validUntil)) {
                System.out.println("Страховка просрочена - нужно срочно оформлять новую");
            }
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "validUntil=" + validUntil +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }
    }

    public String toString() {
        return "Car{" + super.toString() +
                "bodyType='" + bodyType + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", tyresType='" + tyresType + '\'' +
                ", key=" + key.toString() +
                ", insurance=" + insurance.toString() +
                '}';
    }

    public void refill() {
        if (!isElectroCar) {
            System.out.println("Готово! Машина заправлена бензином(дизелем) на заправке");
        } else if (isElectroCar) {
            System.out.println("Готово! Электрокар заряжен на специальной электродо-парковке");
        }
    }
}
