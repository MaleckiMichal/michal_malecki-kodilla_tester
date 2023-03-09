package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ShopUsingDate {

    private Set<Order> orders = new HashSet<>();

    public Set<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Set<Order> ordersFromDatesRange(LocalDate dateFrom, LocalDate dateTo) {
        return orders
                .stream()
                .filter(order -> LocalDate.parse(order.getDate()).isAfter(dateFrom))
                .filter(order -> LocalDate.parse(order.getDate()).isBefore(dateTo))
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        ShopUsingDate shop = new ShopUsingDate();
        shop.addOrder(new Order(324, "2020-05-22", "john1"));
        shop.addOrder(new Order(400, "2020-05-22", "john2"));
        shop.addOrder(new Order(20, "2020-05-23", "john3"));
        shop.addOrder(new Order(525, "2020-06-22", "john4"));
        shop.addOrder(new Order(1254, "2021-04-01", "john5"));
        shop.addOrder(new Order(442, "2021-05-12", "john6"));
        shop.addOrder(new Order(999, "2022-05-13", "john7"));
        shop.addOrder(new Order(99, "2022-06-22", "john8"));
        shop.addOrder(new Order(27, "2022-06-22", "john9"));
        System.out.println(shop.ordersFromDatesRange(LocalDate.of(2020,05,22), LocalDate.of(2022,06,22)).size());
    }
}
