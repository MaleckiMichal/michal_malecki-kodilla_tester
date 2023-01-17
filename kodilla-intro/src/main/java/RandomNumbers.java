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