package LoopsForWhileAndNested_3.ForLoopMoreExercises_3;

import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());
        double averageGrade = 0;
        double finalAverageGrade = 0;
        int fail = 0;
        int second = 0;
        int third = 0;
        int top = 0;
        double totalFail = 0;
        double totalSecond = 0;
        double totalThird = 0;
        double totalTop = 0;

        for (int i = 1; i <= numStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if ( grade <= 2.99) {
                fail+=1;
            } else if (grade <= 3.99) {
                second+=1;
            } else if (grade <= 4.99) {
                third+=1;
            } else if (grade >= 5.00) {
                top+=1;
            }
            averageGrade += grade;

        }
        finalAverageGrade = averageGrade / numStudents;
        totalFail = 100.0 * fail / numStudents;
        totalSecond = 100.0 * second / numStudents;
        totalThird = 100.0 * third / numStudents;
        totalTop = 100.0 * top / numStudents;

        System.out.printf("Top students: %.2f%%%n", totalTop);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", totalThird);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", totalSecond);
        System.out.printf("Fail: %.2f%%%n", totalFail);
        System.out.printf("Average: %.2f", finalAverageGrade);

    }
}
