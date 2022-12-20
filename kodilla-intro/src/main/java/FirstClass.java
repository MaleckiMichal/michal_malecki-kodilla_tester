public class FirstClass {                           // [1]
    public static void main(String[] args) {       // [2]
        String welcomeWord = "Hello from FirstClass!";
        System.out.println(welcomeWord); // [3]
        String example = sayHello();
        System.out.println(example);
    }
    private static String sayHello() {
        String text = "Hello from FirstClass!";

        return text;
    }

}

