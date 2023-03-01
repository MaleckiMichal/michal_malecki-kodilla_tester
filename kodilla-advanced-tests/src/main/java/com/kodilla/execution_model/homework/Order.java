package com.kodilla.execution_model.homework;

import java.util.Objects;

public class Order {

    private int price;
    private String date;
    private String login;

    public Order(int price, String date, String login) {
        this.price = price;
        this.date = date;
        this.login = login;
    }

    public int getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return price == order.price && Objects.equals(date, order.date) && Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, date, login);
    }
}
