import java.util.Scanner;
 class Gradecalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int numberOfSubjects;
        do {
            System.out.print("Enter the number of subjects: ");
            numberOfSubjects = scanner.nextInt();
        } while (numberOfSubjects <= 0);
        int[] subjectMarks = new int[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            do {
                System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                int marks = scanner.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid input! Marks must be between 0 and 100.");
                } else {
                    subjectMarks[i] = marks;
                    break;
                }
            } while (true);
        }
        int totalMarks = calculateTotalMarks(subjectMarks);
        double averagePercentage = calculateAveragePercentage(totalMarks, numberOfSubjects);
        char grade = calculateGrade(averagePercentage);
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static int calculateTotalMarks(int[] subjectMarks) {
        int totalMarks = 0;
        for (int marks : subjectMarks) {
            totalMarks += marks;
        }
        return totalMarks;
    }

    private static double calculateAveragePercentage(int totalMarks, int numberOfSubjects) {
        return (double) totalMarks / numberOfSubjects;
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
