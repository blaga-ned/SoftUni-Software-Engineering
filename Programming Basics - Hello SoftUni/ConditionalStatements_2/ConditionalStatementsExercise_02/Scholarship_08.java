package ConditionalStatements_2.ConditionalStatementsExercise_02;

import java.util.Scanner;

public class Scholarship_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double minWage = Double.parseDouble(scanner.nextLine());

        double socialScholarship = Math.floor(minWage * 0.35);
        double gradeScholarship = Math.floor(grade * 25);

        if (income >= minWage) {
            if (grade >= 5.5) {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", gradeScholarship);
            } else if (grade < 5.5) {
                System.out.println("You cannot get a scholarship!");
            }

        } else if (income < minWage) {
            if (grade>=5.5){
                if (gradeScholarship>=socialScholarship){
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", gradeScholarship);
                }else if (gradeScholarship<socialScholarship){
                    System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
                }
            }else if (grade>=4.5){
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
            }else if (grade<4.5){
                System.out.println("You cannot get a scholarship!");

            }


        }

    }
}
