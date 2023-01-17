import java.util.Arrays;
import java.util.Random;

public class RandomNumsArray {
    int sum;
    int[] a;
    int[] b;
    int[] allNumbers;
    int sizeA;
    int sizeB;
    int min;
    int max;

    public int[] draw() {
        Random random = new Random();
        this.sum = 0;
        this.a = new int[1];
        this.b = new int[2];
        this.allNumbers = new int[0];
        this.sizeA = 0;
        this.sizeB = 1;
        while (sum < 200) {
            int currentNumber = random.nextInt(31);
            sum += currentNumber;

            if (sizeA > sizeB) {
                a = new int[sizeA];
                for (int i = 0; i < sizeB; i++) {
                    a[i] = b[i];
                }
                a[sizeA - 1] = currentNumber;
                sizeB += 2;
                allNumbers = a;
            } else {
                b = new int[sizeB];
                for (int i = 0; i < sizeA; i++) {
                    b[i] = a[i];
                }
                b[sizeB - 1] = currentNumber;
                sizeA += 2;
                allNumbers = b;
            }

            System.out.println("drawn num: " + currentNumber + " sum: " + sum);
//            System.out.println(Arrays.toString(a));
//            System.out.println(Arrays.toString(b));
//            System.out.println("All drawn numbers: " + "\n" +Arrays.toString(allNumbers));
        }
        return this.allNumbers;
    }

    public int minValue() {
        this.min = Arrays.stream(allNumbers).min().getAsInt();
        return min;
    }

    public int maxValue() {
        this.max = Arrays.stream(allNumbers).max().getAsInt();
        return max;
    }


    public static void main(String[] args) {
        RandomNumsArray randomNumsArray = new RandomNumsArray();
        randomNumsArray.draw();
        System.out.println("\n" + "All drawn numbers: " + "\n" + Arrays.toString(randomNumsArray.draw()));
        System.out.println("Max: " + randomNumsArray.maxValue());
        System.out.println("Min: " + randomNumsArray.minValue());
    }
}

