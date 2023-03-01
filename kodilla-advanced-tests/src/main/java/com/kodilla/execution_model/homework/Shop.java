package com.kodilla.execution_model.homework;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public Set<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Set<Order> ordersFromDatesRange(String dateFrom, String dateTo) {
        String[] dateFromSplit = dateFrom.split("/");
        String[] dateToSplit = dateTo.split("/");
        return orders
                .stream()
                .filter(order -> Integer.parseInt(order.getDate().split("/")[2]) >= Integer.parseInt(dateFromSplit[2]))
                .filter(order -> Integer.parseInt(order.getDate().split("/")[1]) >= Integer.parseInt(dateFromSplit[1]))
                .filter(order -> Integer.parseInt(order.getDate().split("/")[0]) >= Integer.parseInt(dateFromSplit[0]))
                .filter(order -> Integer.parseInt(order.getDate().split("/")[2]) <= Integer.parseInt(dateToSplit[2]))
                .filter(order -> Integer.parseInt(order.getDate().split("/")[1]) <= Integer.parseInt(dateToSplit[1]))
                .filter(order -> Integer.parseInt(order.getDate().split("/")[0]) <= Integer.parseInt(dateToSplit[0]))
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrdersFilteredByPrice(int min, int max) {
        return orders
                .stream()
                .filter(order -> order.getPrice() >= min && order.getPrice() <= max)
                .collect(Collectors.toSet());
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public int getTotalOfAllOrders() {
        int total = 0;
        for (Order order : orders) {
            total += order.getPrice();
        }
        return total;
    }
}
