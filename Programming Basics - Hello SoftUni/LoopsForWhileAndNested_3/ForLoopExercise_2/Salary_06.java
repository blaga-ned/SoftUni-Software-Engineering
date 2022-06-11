package LoopsForWhileAndNested_3.ForLoopExercise_2;

import java.util.Scanner;

public class Salary_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean isLost = false;

        for (int i = 1; i <= tabs; i++) {
            String webSite = scanner.nextLine();

            if (webSite.equals("Facebook")) {
                salary -= 150;
            } else if (webSite.equals("Instagram")) {
                salary -= 100;
            } else if (webSite.equals("Reddit")) {
                salary -= 50;

            }
            if (salary <= 0) {
                isLost = true;
                break;
            }

        }

        if (isLost) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);

        }

    }
}
