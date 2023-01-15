import java.util.Random;

public class RandomNumbers {
    private int min;
    private int max;

    public void draw() {
        Random random = new Random();
        int sum = 0;
        this.min = 30;
        this.max = 0;
        while (sum < 5000) {
            int currentNumber = random.nextInt(31);
            sum += currentNumber;

            System.out.println("num: "+currentNumber+" sum: "+sum);

            if (currentNumber <= this.min) {
                this.min = currentNumber;
            }
            if (currentNumber >= this.max) {
                this.max = currentNumber;
            }
        }
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.draw();
        System.out.println("Max: " + randomNumbers.getMax());
        System.out.println("Min: " + randomNumbers.getMin());
    }
}










/*
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

 */
