package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();

    @Test
    public void sizeOfListShouldGrowWithAddingItems() {
        assertEquals(3, invoice.getSize());
    }

    @Test
    public void nameAndPriceShouldCorrespondToExactPosition() {
        assertEquals("chairs", invoice.getItem(1).getName());
        assertEquals(2000, invoice.getItem(1).getPrice());
        assertEquals(1900, invoice.getItem(2).getPrice());
    }

    @Test
    public void negativeAndIndexOutOfRangeShouldReturnNull() {
        assertNull(invoice.getItem(-1));
        assertNull(invoice.getItem(3));
    }

    @Test
    public void clearShouldReturnZero() {
        invoice.clear();
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(new Item("table",2500));
        invoice.addItem(new Item("chairs",2000));
        invoice.addItem(new Item("bed",1900));
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}