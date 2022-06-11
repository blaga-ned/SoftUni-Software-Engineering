package LoopsForWhileAndNested_3.WhileLoopExercise_5;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        boolean isFailed = false;
        double finalSum = availableMoney;
        int countDays = 0;
        int spendingCount = 0;

        while (finalSum < neededMoney) {
            if (spendingCount == 5) {
                isFailed = true;
                break;
            }
            String action = scanner.nextLine();
            double value = Double.parseDouble(scanner.nextLine());

            countDays++;

            if (action.equals("save")) {
                finalSum += value;
                spendingCount = 0;
            } else {
                spendingCount++;
                if (finalSum - value < 0) {
                    finalSum = 0;
                } else {
                    finalSum -= value;
                }
            }
        }
        if (isFailed) {
            System.out.println("You can't save the money.");
            System.out.println(countDays);
        } else {
            System.out.printf("You saved the money for %d days.", countDays);
        }


    }
}
