package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args) {
        Windows windows = new Windows(1985);
        windows.turnOn();
        System.out.println("   System released:     " + windows.getReleaseYear());
        windows.turnOff();

        Android android = new Android(2008);
        android.turnOn();
        System.out.println("   System released:     " + android.getReleaseYear());
        android.turnOff();
    }
}
