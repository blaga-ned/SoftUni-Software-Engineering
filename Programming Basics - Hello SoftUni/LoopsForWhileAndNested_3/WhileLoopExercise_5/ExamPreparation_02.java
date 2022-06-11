package LoopsForWhileAndNested_3.WhileLoopExercise_5;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLowGrade = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int countLowGrade = 0;
        double sumGrades = 0;
        int problemCount = 0;
        String lastProblemName = "";
        while (!input.equals("Enough")) {
            String problemName = input;
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                countLowGrade++;
            }
            if (countLowGrade >= maxLowGrade) {
                break;
            }
            problemCount++;
            sumGrades += grade;
            lastProblemName = problemName;
            input = scanner.nextLine();
        }
        if (countLowGrade == maxLowGrade) {
            System.out.printf("You need a break, %d poor grades.", countLowGrade);

        } else {
            System.out.printf("Average score: %.2f%n", sumGrades / problemCount);
            System.out.printf("Number of problems: %d%n", problemCount);
            System.out.printf("Last problem: %s", lastProblemName);

        }


    }
}
