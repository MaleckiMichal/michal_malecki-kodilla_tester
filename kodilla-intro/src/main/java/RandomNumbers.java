import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public int[] allNumbersLength() {
        Random random = new Random();

        int[] allNumbers = new int[500];
        int i = 0;
        int sum = 0;
        while (sum < 5000) {
            int currentNumber = random.nextInt(31);
            sum += currentNumber;
            i++;

            allNumbers[i - 1] = currentNumber;

//            System.out.println(Arrays.toString(allNumbers));
//            System.out.println("    + " + currentNumber);
//            System.out.println(i + ". sum: " + sum);
        }
        return allNumbers;
    }

    public int minValue() {
        RandomNumbers randomNumbers = new RandomNumbers();
        int[] allNumbers = randomNumbers.allNumbersLength();
        int min = Arrays.stream(allNumbers).min().getAsInt();
        return min;
    }

    public int maxValue() {
        RandomNumbers randomNumbers = new RandomNumbers();
        int[] allNumbers = randomNumbers.allNumbersLength();
        int max = Arrays.stream(allNumbers).max().getAsInt();
        return max;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        int[] arr = randomNumbers.allNumbersLength();
        System.out.println("min. value: " + randomNumbers.minValue());
        System.out.println("max. value: " + randomNumbers.maxValue());
        System.out.println(Arrays.toString(arr));
    }
}
