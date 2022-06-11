package ConditionalStatements_2.ConditionalStatementsAdvancedMoreExercises_06;

import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int numStudents = Integer.parseInt(scanner.nextLine());
        int numNights = Integer.parseInt(scanner.nextLine());

        double sumNights = 0;

        if (season.equals("Winter")) {
            if (group.equals("boys")) {
                if (numStudents >= 50) {
                    sumNights = ((numStudents * 9.60) * numNights) * 0.50;
                    System.out.printf("Judo %.2f lv.", sumNights);
                } else if (numStudents >= 20 && numStudents < 50) {
                    sumNights = ((numStudents * 9.60) * numNights) * 0.85;
                    System.out.printf("Judo %.2f lv.", sumNights);
                } else if (numStudents >= 10 && numStudents < 20) {
                    sumNights = ((numStudents * 9.60) * numNights) * 0.95;
                    System.out.printf("Judo %.2f lv.", sumNights);
                } else {
                    sumNights = (numStudents * 9.60) * numNights;
                    System.out.printf("Judo %.2f lv.", sumNights);
                }
            } else if (group.equals("girls")) {
                if (numStudents >= 50) {
                    sumNights = ((numStudents * 9.60) * numNights) * 0.50;
                    System.out.printf("Gymnastics %.2f lv.", sumNights);
                } else if (numStudents >= 20 && numStudents < 50) {
                    sumNights = ((numStudents * 9.60) * numNights) * 0.85;
                    System.out.printf("Gymnastics %.2f lv.", sumNights);
                } else if (numStudents >= 10 && numStudents < 20) {
                    sumNights = ((numStudents * 9.60) * numNights) * 0.95;
                    System.out.printf("Gymnastics %.2f lv.", sumNights);
                } else {
                    sumNights = (numStudents * 9.60) * numNights;
                    System.out.printf("Gymnastics %.2f lv.", sumNights);
                }
            } else if (group.equals("mixed")) {
                if (numStudents >= 50) {
                    sumNights = ((numStudents * 10) * numNights) * 0.50;
                    System.out.printf("Ski %.2f lv.", sumNights);
                } else if (numStudents >= 20 && numStudents < 50) {
                    sumNights = ((numStudents * 10) * numNights) * 0.85;
                    System.out.printf("Ski %.2f lv.", sumNights);
                } else if (numStudents >= 10 && numStudents < 20) {
                    sumNights = ((numStudents * 10) * numNights) * 0.95;
                    System.out.printf("Ski %.2f lv.", sumNights);
                } else {
                    sumNights = (numStudents * 10) * numNights;
                    System.out.printf("Ski %.2f lv.", sumNights);
                }
            }
        } else if (season.equals("Spring")) {
            if (group.equals("boys")) {
                if (numStudents >= 50) {
                    sumNights = ((numStudents * 7.20) * numNights) * 0.50;
                    System.out.printf("Tennis %.2f lv.", sumNights);
                } else if (numStudents >= 20 && numStudents < 50) {
                    sumNights = ((numStudents * 7.20) * numNights) * 0.85;
                    System.out.printf("Tennis %.2f lv.", sumNights);
                } else if (numStudents >= 10 && numStudents < 20) {
                    sumNights = ((numStudents * 7.20) * numNights) * 0.95;
                    System.out.printf("Tennis %.2f lv.", sumNights);
                } else {
                    sumNights = (numStudents * 7.20) * numNights;
                    System.out.printf("Tennis %.2f lv.", sumNights);
                }
            } else if (group.equals("girls")) {
                if (numStudents >= 50) {
                    sumNights = ((numStudents * 7.20) * numNights) * 0.50;
                    System.out.printf("Athletics %.2f lv.", sumNights);
                } else if (numStudents >= 20 && numStudents < 50) {
                    sumNights = ((numStudents * 7.20) * numNights) * 0.85;
                    System.out.printf("Athletics %.2f lv.", sumNights);
                } else if (numStudents >= 10 && numStudents < 20) {
                    sumNights = ((numStudents * 7.20) * numNights) * 0.95;
                    System.out.printf("Athletics %.2f lv.", sumNights);
                } else {
                    sumNights = (numStudents * 7.20) * numNights;
                    System.out.printf("Athletics %.2f lv.", sumNights);
                }
            } else if (group.equals("mixed")) {
                if (numStudents >= 50) {
                    sumNights = ((numStudents * 9.50) * numNights) * 0.50;
                    System.out.printf("Cycling %.2f lv.", sumNights);
                } else if (numStudents >= 20 && numStudents < 50) {
                    sumNights = ((numStudents * 9.50) * numNights) * 0.85;
                    System.out.printf("Cycling %.2f lv.", sumNights);
                } else if (numStudents >= 10 && numStudents < 20) {
                    sumNights = ((numStudents * 9.50) * numNights) * 0.95;
                    System.out.printf("Cycling %.2f lv.", sumNights);
                } else {
                    sumNights = (numStudents * 9.50) * numNights;
                    System.out.printf("Cycling %.2f lv.", sumNights);
                }
            }
        } else if (season.equals("Summer")) {
            if (group.equals("boys")) {
                if (numStudents >= 50) {
                    sumNights = ((numStudents * 15) * numNights) * 0.50;
                    System.out.printf("Football %.2f lv.", sumNights);
                } else if (numStudents >= 20 && numStudents < 50) {
                    sumNights = ((numStudents * 15) * numNights) * 0.85;
                    System.out.printf("Football %.2f lv.", sumNights);
                } else if (numStudents >= 10 && numStudents < 20) {
                    sumNights = ((numStudents * 15) * numNights) * 0.95;
                    System.out.printf("Football %.2f lv.", sumNights);
                } else {
                    sumNights = (numStudents * 15) * numNights;
                    System.out.printf("Football %.2f lv.", sumNights);
                }
            } else if (group.equals("girls")) {
                if (numStudents >= 50) {
                    sumNights = ((numStudents * 15) * numNights) * 0.50;
                    System.out.printf("Volleyball %.2f lv.", sumNights);
                } else if (numStudents >= 20 && numStudents < 50) {
                    sumNights = ((numStudents * 15) * numNights) * 0.85;
                    System.out.printf("Volleyball %.2f lv.", sumNights);
                } else if (numStudents >= 10 && numStudents < 20) {
                    sumNights = ((numStudents * 15) * numNights) * 0.95;
                    System.out.printf("Volleyball %.2f lv.", sumNights);
                } else {
                    sumNights = (numStudents * 15) * numNights;
                    System.out.printf("Volleyball %.2f lv.", sumNights);
                }
            } else if (group.equals("mixed")) {
                if (numStudents >= 50) {
                    sumNights = ((numStudents * 20) * numNights) * 0.50;
                    System.out.printf("Swimming %.2f lv.", sumNights);
                } else if (numStudents >= 20 && numStudents < 50) {
                    sumNights = ((numStudents * 20) * numNights) * 0.85;
                    System.out.printf("Swimming %.2f lv.", sumNights);
                } else if (numStudents >= 10 && numStudents < 20) {
                    sumNights = ((numStudents * 20) * numNights) * 0.95;
                    System.out.printf("Swimming %.2f lv.", sumNights);
                } else {
                    sumNights = (numStudents * 20) * numNights;
                    System.out.printf("Swimming %.2f lv.", sumNights);
                }
            }
        }
    }
}
