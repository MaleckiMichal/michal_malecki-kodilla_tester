package com.kodilla.abstracts.homework;

public class JobApp {
    public static void main(String[] args) {
        Job driver = new TruckDriver();
        Job mechanic = new Mechanic();
        Job firefighter = new Firefighter();

        Person anna = new Person("Anna", 48, driver);
        Person john = new Person("John", 28, firefighter);
        Person adele = new Person("Adele", 32, mechanic);

        anna.responsibility();
        john.responsibility();
        adele.responsibility();
    }
}
