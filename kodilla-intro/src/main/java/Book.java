public class Book {
    private String author;
    private String title;

    public Book (String author, String title) {
        this.author = author;
        this.title = title;
    }


    public static Book of (String author, String title) {
        Book book = new Book(author,title);
        System.out.println(book.title + " Written by: " + book.author);
        return book;
    }

    Book book = Book.of("Marc Elsberg", "Blackout");

}
