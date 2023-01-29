package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Honda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Honda> hondas = new ArrayList<>();
        hondas.add(new Honda(10));
        hondas.add(new Honda(20));
        hondas.add(new Honda(30));
        hondas.add(new Honda(40));

        hondas.remove(1);

        Honda honda30 = new Honda(30);
        hondas.remove(honda30);

        System.out.println(hondas.size());
        for (Honda honda : hondas) {
            CarUtils.describeCar(honda);
        }
    }
}
