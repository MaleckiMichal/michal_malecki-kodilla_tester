public class SimpleArray {
    public static void main(String[] args) {
        String[] bikeTripCountries = new String[] {"Czech Republic", "Austria", "Slovenia",
                "Italy", "Croatia", "Bosnia and Herzegovina", "Montenegro", "Albania", "Greece"};

        String bikeTripCountry = bikeTripCountries[3];
        System.out.println(bikeTripCountry);

        int numberOfElementsTrip = bikeTripCountries.length;
        System.out.println("Countries array has "+numberOfElementsTrip+" elements");

        String[] books = new String[6];
        books[0] = "Harry Potter and the Half-Blood prince";
        books[1] = "Blackout";
        books[2] = "Helisa";
        books[3] = "Polscy Himalaisci";
        books[4] = "Robinson Crusoe";
        books[5] = "Tajemnicza wyspa";

        String book = books[3];
        System.out.println(book);

        int numberOfElementsBooks = books.length;
        System.out.println("Books array has "+numberOfElementsBooks+" elements");
    }
}