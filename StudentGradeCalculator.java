import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for 3 subjects: ");
        double sub1 = sc.nextDouble();
        double sub2 = sc.nextDouble();
        double sub3 = sc.nextDouble();

        double total = sub1 + sub2 + sub3;
        double percentage = total / 3;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        sc.close();
    }
}
