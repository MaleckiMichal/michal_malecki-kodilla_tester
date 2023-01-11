public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2019);
        System.out.println("notebook.weight: " + notebook.weight
                + "   notebook.price: " + notebook.price + "   notebook.year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.relationPriceYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2016);
        System.out.println("\n" + "heavyNotebook.weight: " + heavyNotebook.weight + "   heavyNotebook.price: "
                + heavyNotebook.price + "   heavyNotebook.year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.relationPriceYear();

        Notebook oldNotebook = new Notebook(1200, 500, 2012);
        System.out.println("\n" + "oldNotebook.weight: " + oldNotebook.weight + "   oldNotebook.price: "
                + oldNotebook.price + "   oldNotebook.year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.relationPriceYear();

    }
}

