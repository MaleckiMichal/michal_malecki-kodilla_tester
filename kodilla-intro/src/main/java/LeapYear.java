public class LeapYear {
    public static void main(String[] args) {
        int givenYear = 2020;

        System.out.println(givenYear);

        if (givenYear % 4 == 0 && givenYear % 100 != 0 || givenYear % 400 == 0) {
            System.out.println("Rok przestepny");
        } else {
            System.out.println("Nie jest to rok przestepny");
        }
    }
}