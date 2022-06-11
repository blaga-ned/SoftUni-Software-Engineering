package LoopsForWhileAndNested_3.ForLoopMoreExercises_3;

import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double willMoney = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());
        int years = 18;
        double spend = 0;
        double sum1 = 0;
        double sum2 = 0;
        double total = 0;

        for (int i = 1800; i <= yearToLive; i++) {

            if (i % 2 == 0) {
                spend = 12000;
                sum1 = spend + sum1;
            } else {
                spend = 12000 + 50 * years;
                sum2 = spend + sum2;
            }
            years++;

            total = willMoney - (sum1 + sum2);

        }
        if (total >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", total);
        } else {

            System.out.printf("He will need %.2f dollars to survive.", Math.abs(total));
        }


    }
}
