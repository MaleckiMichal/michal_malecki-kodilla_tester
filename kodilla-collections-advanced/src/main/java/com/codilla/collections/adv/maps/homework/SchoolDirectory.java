package com.codilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        Principal warsawPrincipal = new Principal("Waldemar Principal", "Warsaw High-school");
        Principal poznanPrincipal = new Principal("Piotr Principal", "Poznan High-school");
        Principal cracowPrincipal = new Principal("Cezary Principal", "Cracow High-school");
        Principal wroclawPrincipal = new Principal("Wojciech Principal", "Wroclaw High-school");

        School warsaw = new School(Arrays.asList("Ania", "Dorota", "Martyna", "Katarzyna", "Dzony", "Brajanek"));
        School poznan = new School(Arrays.asList("Marek", "Jarek", "Darek", "Jurek", "Bozydar"));
        School cracow = new School(Arrays.asList("Asia", "Basia", "Kasia", "Eliza"));
        School wroclaw = new School(Arrays.asList("Julia", "Andrzej", "Romek"));

        schools.put(warsawPrincipal, warsaw);
        schools.put(poznanPrincipal, poznan);
        schools.put(cracowPrincipal, cracow);
        schools.put(wroclawPrincipal, wroclaw);


        for (Map.Entry<Principal, School> schoolEntry : schools.entrySet()) {
            System.out.println(schoolEntry.getKey().getDirectorsName() + " of " + schoolEntry.getKey().getSchoolName()
                    + '\n' + "Number of students: " + schoolEntry.getValue().getStudents().size());
        }

        System.out.println();

        // for-each below just to check if toString is working properly

        for (Map.Entry<Principal, School> schoolEntry : schools.entrySet()) {
            System.out.println(schoolEntry.getKey().toString() + '\n'
                    + "Number of students: " + schoolEntry.getValue().getStudents().size());
        }
    }
}
