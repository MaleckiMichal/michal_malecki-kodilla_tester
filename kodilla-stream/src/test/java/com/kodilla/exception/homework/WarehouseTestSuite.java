package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder_withException() {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("0154M"));
        warehouse.addOrder(new Order("0155M"));
        warehouse.addOrder(new Order("0156M"));
        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("0157M"));
    }

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("0154M"));
        warehouse.addOrder(new Order("0155M"));
        warehouse.addOrder(new Order("0156M"));
        Order expected = new Order("0155M");
        // when
        // then
        assertEquals(expected, warehouse.getOrder("0155M"));
    }
}