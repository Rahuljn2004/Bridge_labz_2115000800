import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                marks[i][j] = scanner.nextInt();
                while (marks[i][j] < 0) {
                    System.out.print("Enter positive value for " + subject + ": ");
                    marks[i][j] = scanner.nextInt();
                }
            }
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (double) totalMarks / 3;
            grades[i] = (percentages[i] >= 80) ? "A" :
                        (percentages[i] >= 70) ? "B" :
                        (percentages[i] >= 60) ? "C" :
                        (percentages[i] >= 50) ? "D" :
                        (percentages[i] >= 40) ? "E" : "R";
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%, Grade: " + grades[i]);
        }
    }
}
