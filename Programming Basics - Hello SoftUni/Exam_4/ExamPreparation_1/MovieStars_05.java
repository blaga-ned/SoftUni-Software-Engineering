package Exam_4.ExamPreparation_1;

import java.util.Scanner;

public class MovieStars_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("ACTION")) {
            String actorName = command;
            double salary = 0;
            if (actorName.length() > 15) {
                salary = 0.2 * budget;
            } else {
                salary = Double.parseDouble(scanner.nextLine());
            }
            budget -= salary;
            if (budget <= 0) {
                break;
            }

            command = scanner.nextLine();
        }
        if (budget >= 0) {
            System.out.printf("We are left with %.2f leva.", budget);

        } else {
            double needMoney = Math.abs(budget);
            System.out.printf("We need %.2f leva for our actors.", needMoney);

        }
    }
}


