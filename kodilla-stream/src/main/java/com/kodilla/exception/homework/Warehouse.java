package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    public static List<Order> orderList = new ArrayList<>();


    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orderList
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .findAny()
                .orElseThrow(OrderDoesntExistException::new);
    }
}
