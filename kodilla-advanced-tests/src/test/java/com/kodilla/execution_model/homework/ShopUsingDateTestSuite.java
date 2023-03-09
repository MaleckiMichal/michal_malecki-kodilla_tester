package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopUsingDateTestSuite {

    ShopUsingDate shop = new ShopUsingDate();

    @BeforeEach
    public void initializeShopOrders() {
        shop.addOrder(new Order(324, "2020-05-22", "john1"));
        shop.addOrder(new Order(400, "2020-05-22", "john2"));
        shop.addOrder(new Order(20, "2020-05-23", "john3"));
        shop.addOrder(new Order(525, "2020-06-22", "john4"));
        shop.addOrder(new Order(1254, "2021-04-01", "john5"));
        shop.addOrder(new Order(442, "2021-05-12", "john6"));
        shop.addOrder(new Order(999, "2022-05-13", "john7"));
        shop.addOrder(new Order(99, "2022-06-22", "john8"));
        shop.addOrder(new Order(27, "2022-06-22", "john9"));
    }

    @Test
    public void testIfOrdersFromDatesRangeReturnsProperSize() {
        assertEquals(5, shop.ordersFromDatesRange(LocalDate.of(2020, 5,22), LocalDate.of(2022, 6,22)).size());
        assertEquals(0, shop.ordersFromDatesRange(LocalDate.of(2015, 5,22), LocalDate.of(2020, 5,22)).size());
    }

    @Test
    public void testIfOrdersFromDatesRangeReturnsProperSet() {
        // given
        Shop expectedShop = new Shop();
        expectedShop.addOrder(new Order(525, "2020-06-22", "john4"));
        expectedShop.addOrder(new Order(1254, "2021-04-01", "john5"));
        expectedShop.addOrder(new Order(442, "2021-05-12", "john6"));
        expectedShop.addOrder(new Order(999, "2022-05-13", "john7"));
        expectedShop.addOrder(new Order(99, "2022-06-22", "john8"));
        expectedShop.addOrder(new Order(27, "2022-06-22", "john9"));
        // when
        // then
        assertEquals(expectedShop.getOrders(), shop.ordersFromDatesRange(LocalDate.of(2020, 6,21), LocalDate.of(2022, 6,23)));
    }
}