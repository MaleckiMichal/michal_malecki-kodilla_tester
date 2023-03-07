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
                .filter(order -> ((Integer.parseInt(order.getDate().split("/")[0]) >= Integer.parseInt(dateFromSplit[0])
                        && Integer.parseInt(order.getDate().split("/")[1]) >= Integer.parseInt(dateFromSplit[1])
                        && Integer.parseInt(order.getDate().split("/")[2]) >= Integer.parseInt(dateFromSplit[2]))
                        || ((Integer.parseInt(order.getDate().split("/")[1]) > Integer.parseInt(dateFromSplit[1]))
                        && Integer.parseInt(order.getDate().split("/")[2]) >= Integer.parseInt(dateFromSplit[2]))
                        || Integer.parseInt(order.getDate().split("/")[2]) > Integer.parseInt(dateFromSplit[2])))
                .filter(order -> ((Integer.parseInt(order.getDate().split("/")[0]) <= Integer.parseInt(dateToSplit[0])
                        && Integer.parseInt(order.getDate().split("/")[1]) <= Integer.parseInt(dateToSplit[1])
                        && Integer.parseInt(order.getDate().split("/")[2]) <= Integer.parseInt(dateToSplit[2]))
                        || (Integer.parseInt(order.getDate().split("/")[1]) < Integer.parseInt(dateToSplit[1])
                        && Integer.parseInt(order.getDate().split("/")[2]) <= Integer.parseInt(dateToSplit[2]))
                        || Integer.parseInt(order.getDate().split("/")[2]) < Integer.parseInt(dateToSplit[2])))
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

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addOrder(new Order(324, "22/05/2020", "john1"));
        shop.addOrder(new Order(400, "22/05/2020", "john2"));
        shop.addOrder(new Order(20, "23/05/2020", "john3"));
        shop.addOrder(new Order(525, "22/06/2020", "john4"));
        shop.addOrder(new Order(1254, "04/01/2021", "john5"));
        shop.addOrder(new Order(442, "12/05/2021", "john6"));
        shop.addOrder(new Order(999, "13/05/2022", "john7"));
        shop.addOrder(new Order(99, "22/06/2022", "john8"));
        shop.addOrder(new Order(27, "22/06/2022", "john9"));
        System.out.println(shop.ordersFromDatesRange("23/05/2020", "13/05/2022"));
    }
}
