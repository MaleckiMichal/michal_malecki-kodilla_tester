public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }

        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        int[] someNumbers = new int[]{2, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < someNumbers.length; i++) {
            sum = sum + someNumbers[i];
            System.out.println(sum);
        }


        System.out.println(sumNumbers(new int[] {2,4,5}));

        int[] myNum = {10, 20, 30, 40};
        System.out.println("sum result: " + sumNumbers(myNum));
    }

    public static int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }


}

