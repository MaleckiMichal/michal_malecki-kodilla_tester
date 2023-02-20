package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

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
}