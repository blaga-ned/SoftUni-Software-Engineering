package Exam_4.PreExam_3;

import java.util.Scanner;

public class GoldMine_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLocations = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= numLocations; i++) {
            int goldExpected = Integer.parseInt(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double goldAdded = 0;
            double averageGold = 0;

            for (int j = 1; j <= days; j++) {
                int gold = Integer.parseInt(scanner.nextLine());
                goldAdded += gold;

                averageGold = goldAdded / days;

                }
            double diff = Math.abs(averageGold-goldExpected);
            if (averageGold >= goldExpected){
                System.out.printf("Good job! Average gold per day: %.2f.%n",averageGold);

            }
            if (averageGold < goldExpected) {
                System.out.printf("You need %.2f gold.%n", diff);
            }


            }
        }


    }


