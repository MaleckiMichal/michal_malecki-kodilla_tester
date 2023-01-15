import java.util.Scanner;

public class Colors {
    public static String getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        String firstLetter = scanner.nextLine().trim().toUpperCase();
        return firstLetter;
    }

    public String showColor() {
        while (true) {
            System.out.println("Enter first letter of color (choose between B,C,G,V,Y): ");
            String letter = Colors.getFirstLetter();
            switch (letter) {
                case "B":
                    return "Black";
                case "C":
                    return "Cyan";
                case "G":
                    return "Green";
                case "V":
                    return "Violet";
                case "Y":
                    return "Yellow";
                default:
                    System.out.println("Wrong characteristic, try again:");
            }
        }
    }

    public String showColor2() {
        Colors colors = new Colors();
        String letters = colors.showColor();
        String color = "";
        switch (letters) {
            case "Black":
                color = "Black";
                break;
            case "Cyan":
                color = "Cyan";
                break;
            case "Green":
                color = "Green";
                break;
            case "Violet":
                color = "Violet";
                break;
            case "Yellow":
                color = "Yellow";
                break;
        }
        return color;
    }


    public static void main(String[] args) {
        Colors color = new Colors();
        String userColor = color.showColor2();
        System.out.println(userColor);
    }
}
