package com.codilla.collections.adv.immutable;

public class ImmutableExample {

    public static void main(String[] args) {
        Book book = new Book("John Stewart", "The last chance");
        BookHacked bookHacked = new BookHacked("John Stewart", "The last chance");
        bookHacked.modifyTitle("Chance");
        System.out.println(book.title);

        BookRecord bookRecord = new BookRecord("test", "testowa pozycja", 2022);
        System.out.println(bookRecord.title());
    }
}
