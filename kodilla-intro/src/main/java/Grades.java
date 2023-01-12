import java.util.Arrays;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int showLastGrade() {
        int lastGrade = this.grades[this.size-1];
        return lastGrade;
    }

    public double calcAverage() {
        double sum = 0;
        for (int i=0; i<= this.size-1; i++) {
            sum += this.grades[i];
        }
        double average = sum/this.size;
        return average;
    }


    public static void main(String[] args) {
        Grades mineGrades = new Grades();
        mineGrades.add(6);
        mineGrades.add(5);
        mineGrades.add(4);
        System.out.println(Arrays.toString(mineGrades.grades));
//        mineGrades.showLastGrade();
        System.out.println("rozmiar: "+mineGrades.size);
        System.out.println("ostatnio dodana: "+mineGrades.showLastGrade());
        System.out.println("średnia: " + mineGrades.calcAverage());
        mineGrades.add(2);
        mineGrades.add(5);
        mineGrades.add(3);
        System.out.println("\n"+Arrays.toString(mineGrades.grades));
        System.out.println("rozmiar: "+mineGrades.size);
        System.out.println("ostatnio dodana: "+mineGrades.showLastGrade());
        System.out.println("średnia: " + mineGrades.calcAverage());

        System.out.println(mineGrades.grades[mineGrades.size-1]);

        mineGrades.add(3);
        mineGrades.add(3);
        mineGrades.add(3);
        mineGrades.add(3);
        mineGrades.add(3);
        System.out.println("\n"+Arrays.toString(mineGrades.grades));
        System.out.println("rozmiar: "+mineGrades.size);
        System.out.println("ostatnio dodana: "+mineGrades.showLastGrade());
        System.out.println("średnia: " + mineGrades.calcAverage());

    }
}
