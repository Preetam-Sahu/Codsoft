import java.util.Scanner; // import package

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int totalSubjects = 0;
        double averagePercentage = 0;

        System.out.println("Enter the number of subjects:");
        totalSubjects = scanner.nextInt(); //Runtime input no. subjects 

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.println("Enter the marks you got in subject " + i + " (out of 100):");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        averagePercentage = (double) totalMarks / totalSubjects;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
       // Grading Systems
        if (averagePercentage >= 90) {
            System.out.println("Grade: O");
        } else if (averagePercentage >= 80) {
            System.out.println("Grade: E");
        } else if (averagePercentage >= 70) {
            System.out.println("Grade: A");
        } else if (averagePercentage >= 60) {
            System.out.println("Grade: B");
        } else if (averagePercentage >= 50) {
            System.out.println("Grade: c");
        } else if (averagePercentage >= 37) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}