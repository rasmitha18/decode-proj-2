import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Grade Calculator ===");
        
        // 1. Take the number of subjects
        System.out.print("Enter the total number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Array to store marks of each subject
        double[] marks = new double[numSubjects];
        double totalMarks = 0;

        // 2. Loop to take marks for each subject (with validation)
        for (int i = 0; i < numSubjects; i++) {
            while (true) {
                System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
                double currentMarks = scanner.nextDouble();

                // Validation: Marks should be between 0 and 100
                if (currentMarks >= 0 && currentMarks <= 100) {
                    marks[i] = currentMarks;
                    totalMarks += currentMarks;
                    break; // Exit the validation loop if input is valid
                } else {
                    System.out.println("Invalid input! Marks must be between 0 and 100. Try again.");
                }
            }
        }

        // 3. Calculate average percentage
        // Since each subject is out of 100, the average percentage is total / numSubjects
        double averagePercentage = totalMarks / numSubjects;

        // 4. Assign grades based on percentage using conditional statements
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 35) {
            grade = 'E';
        } else {
            grade = 'F'; // Fail
        }

        // 5. Display results clearly
        System.out.println("\n=================================");
        System.out.println("         FINAL RESULTS           ");
        System.out.println("=================================");
        System.out.printf("Total Marks Obtained : %.2f / %d\n", totalMarks, (numSubjects * 100));
        System.out.printf("Average Percentage   : %.2f%%\n", averagePercentage);
        System.out.println("Assigned Grade       : " + grade);
        System.out.println("=================================");

        // Close the scanner resource
        scanner.close();
    }
}