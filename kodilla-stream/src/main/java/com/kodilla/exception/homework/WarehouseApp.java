package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("0154M"));
        warehouse.addOrder(new Order("0155M"));
        warehouse.addOrder(new Order("0156M"));
        warehouse.addOrder(new Order("0157E"));
        warehouse.addOrder(new Order("0157D"));
        warehouse.addOrder(new Order("0157X"));

        try {
            warehouse.getOrder("xx");
            System.out.println("Order exists");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order DOESN'T exist");
        } finally {
            System.out.println("Good luck!");
        }
    }
}
