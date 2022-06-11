package LoopsForWhileAndNested_3.WhileLoopExercise_5;

import java.util.Scanner;

public class MyExercise{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottlesDishwasher = Integer.parseInt(scanner.nextLine());
        int totalDishwasher = bottlesDishwasher * 750;
        int countCharging = 0;
        int countDishes = 0;
        int countPots = 0;
        boolean notEnough = false;
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            int quantity = Integer.parseInt(input);
            countCharging++;

            if (countCharging % 3 == 0) {
                totalDishwasher -= quantity * 15;
                countPots += quantity;
            } else {
                totalDishwasher -= quantity * 5;
                countDishes += quantity;
            }

            if (totalDishwasher < 0) {
                notEnough = true;
                break;
            }

            input = scanner.nextLine();
        }
        if (notEnough) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(totalDishwasher));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", countDishes, countPots);
            System.out.printf("Leftover detergent %d ml.", totalDishwasher);
        }
    }
}
