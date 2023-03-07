package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop = new Shop();

    @Test
    public void shouldAddOrdersToShop() {
        assertEquals(13, shop.getOrders().size());
    }

    @Test
    public void testIfOrdersFromDatesRangeReturnsProperSize() {
        assertEquals(7, shop.ordersFromDatesRange("25/06/2014", "07/04/2016").size());
        assertEquals(0, shop.ordersFromDatesRange("02/03/2002", "05/11/2012").size());
    }

    @Test
    public void testIfOrdersFromDatesRangeReturnsProperSet() {
        // given
        Shop expectedShop = new Shop();
        expectedShop.addOrder(new Order(525, "25/06/2014", "john4"));
        expectedShop.addOrder(new Order(1254, "25/06/2014", "john5"));
        expectedShop.addOrder(new Order(1254, "26/06/2014", "john6"));
        expectedShop.addOrder(new Order(442, "02/07/2014", "john8"));
        expectedShop.addOrder(new Order(999, "01/01/2015", "john8"));
        expectedShop.addOrder(new Order(99, "07/04/2016", "john9"));
        expectedShop.addOrder(new Order(27, "07/04/2016", "john10"));
        // when
        // then
        assertEquals(expectedShop.getOrders(), shop.ordersFromDatesRange("25/06/2014", "07/04/2016"));
    }

    @Test
    public void testIfGetOrdersFilteredByPriceReturnsProperSize() {
        assertEquals(5, shop.getOrdersFilteredByPrice(324, 999).size());
        assertEquals(0, shop.getOrdersFilteredByPrice(5, 10).size());
    }

    @Test
    public void testIfGetOrdersFilteredByPriceReturnsProperSet() {
        // given
        Shop expectedShop = new Shop();
        expectedShop.addOrder(new Order(324, "24/05/2013", "john1"));
        expectedShop.addOrder(new Order(400, "24/05/2014", "john2"));
        expectedShop.addOrder(new Order(525, "25/06/2014", "john4"));
        expectedShop.addOrder(new Order(442, "02/07/2014", "john8"));
        expectedShop.addOrder(new Order(999, "01/01/2015", "john8"));
        // when
        // then
        assertEquals(expectedShop.getOrders(), shop.getOrdersFilteredByPrice(324, 999));
    }

    @Test
    public void getNumberOfOrdersShouldReturnProperSize() {
        assertEquals(13, shop.getNumberOfOrders());
    }

    @Test
    public void getTotalOfAllOrdersShouldReturnProperResult() {
        assertEquals(5425, shop.getTotalOfAllOrders());
    }

    @BeforeEach
    public void initializeShopOrders() {
        shop.addOrder(new Order(324, "24/05/2013", "john1"));
        shop.addOrder(new Order(400, "24/05/2014", "john2"));
        shop.addOrder(new Order(20, "24/06/2014", "john3"));
        shop.addOrder(new Order(525, "25/06/2014", "john4"));
        shop.addOrder(new Order(1254, "25/06/2014", "john5"));
        shop.addOrder(new Order(1254, "26/06/2014", "john6"));
        shop.addOrder(new Order(442, "02/07/2014", "john8"));
        shop.addOrder(new Order(999, "01/01/2015", "john8"));
        shop.addOrder(new Order(99, "07/04/2016", "john9"));
        shop.addOrder(new Order(27, "07/04/2016", "john10"));
        shop.addOrder(new Order(27, "08/05/2016", "john11"));
        shop.addOrder(new Order(27, "08/03/2017", "john12"));
        shop.addOrder(new Order(27, "05/05/2017", "john13"));
    }
}