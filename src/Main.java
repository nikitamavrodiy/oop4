import Animals.*;
import transport.Bus;
import transport.Car;
import transport.Train;


public class Main {
    public static void main(String[] args) {
        //homework 1
        System.out.println("\nhomework 2\n");

        Car.Key key = new Car.Key(true, true);
        Car.Insurance insurance = new Car.Insurance(null, 250.50f, "3423343039");

        transport.Car carDefault = new transport.Car(0, "automat", "У343ХА053", " ", "Winter", 4, key, insurance, true);

        System.out.println(carDefault+"\n");

        Train lastochka = new Train("lastochka", "B-901", 2011, "Russia", null, 301, 3500, 0,
                "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("leningrad", "D-125", 2019, "Russia", null, 270, 1700, 0,
                "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        System.out.println(lastochka);
        System.out.println(leningrad);
        System.out.println();

        Bus bus = new Bus();
        Bus busCopy = new Bus(bus);
        busCopy.setBodyColor("PinkFloid"); //чтоб отличить
        Bus realBus = new Bus("SchoolShkoda", "superSchoolBus", 2022, "Russia", "Yellow", 270);

        System.out.println(bus);
        System.out.println(busCopy);
        System.out.println(realBus);

        //homework 2
        System.out.println("\nhomework 2\n");

        carDefault.refill();
        lastochka.refill();
        leningrad.refill();
        bus.refill();
        busCopy.refill();
        realBus.refill();

        //homework 3 Animals
        System.out.println("\nhomework 3 - Animals\n");

        Herbivores gazelle = new Herbivores("Газель", 0, "Саванна", 50, "Трава");
        Herbivores giraffe = new Herbivores("Жираф", 4, "Саванна", 55, "Листья");
        Herbivores horse = new Herbivores("Лошадь", 2, "Степи", 60, "Сено");

        Predators hyena = new Predators("Гиена", -1, "", 0, "   ");
        Predators tiger = new Predators("Тигр", 5, "Тайга", 70, "Мяско");
        Predators bear = new Predators("Медведь", 6, "", 0, "рыбка");

        Amphibians frog = new Amphibians("Лягушка", 0, null);
        Amphibians freshwater = new Amphibians("Уж пресноводный", 1, "пресная вода");

        Unflying peacock = new Unflying("Павлин", 2, "Джунгли", "Не летающая");
        Unflying penguin = new Unflying("Пингвин", 3, "Антарктида", "Не летающая");
        Unflying dodoBird = new Unflying("Птица додо", 4, "Мадагаскар", "Не летающая");

        Flying seagull = new Flying("Чайка", 3, "", "Летает");
        Flying albatross = new Flying("Альбатрос", -2, " ", "Летает");
        Flying falcon = new Flying("Сокол", 1, null, "Летает");

        Animals[] animals = {gazelle, giraffe, horse, hyena, tiger, bear, frog,
                freshwater, peacock, penguin, dodoBird, seagull, albatross, falcon};

        int count = 0;
        for (Animals animal : animals) {
            count++;
            System.out.println(count+ " " + animal);
            animal.sleep();
            animal.eat();
            animal.go();
            System.out.println();
        }

        System.out.println("gazelle.equals(giraffe) = " + gazelle.equals(giraffe));
        System.out.println("gazelle.equals(horse) = " + gazelle.equals(horse));
    }
}