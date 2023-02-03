package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("The Penny Black", 19, 22, false));
        stamps.add(new Stamp("Hawaiian Missionaries", 19.2, 22.1, false));
        stamps.add(new Stamp("U.S. Franklin Z-Grill", 11, 14, true));
        stamps.add(new Stamp("British Guiana One Cent Black on Magenta", 29, 26, true));
        stamps.add(new Stamp("The Penny Black", 19, 22, false));
        stamps.add(new Stamp("The Inverted Jenny", 25.46, 22.1, true));
        stamps.add(new Stamp("The Three-Skilling Yellow", 15.1, 18.3, false));

        System.out.println("Set size: " + stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
