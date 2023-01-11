public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        } else {
            System.out.println("The price is good.");
        }
    }

    public void checkWeight() {
        if (this.weight <= 800) {
            System.out.println("This notebook is light");
        } else if (this.weight >= 1600) {
            System.out.println("This notebook is heavy");
        } else {
            System.out.println("This notebook is not very heavy");
        }
    }

    public void relationPriceYear() {
        if (this.price > 1200 && this.year <= 2016) {
            System.out.println("Too much for such old scrap");
        } else if (this.price < 700 && this.year < 2015) {
            System.out.println("Old device but cheap");
        } else if (this.price <= 1000 && this.price > 500 && this.year > 2018) {
            System.out.println("Good price for quite new device");
        } else {
            System.out.println("No way that notebook produced in this year can be in such price");
        }
    }
}

