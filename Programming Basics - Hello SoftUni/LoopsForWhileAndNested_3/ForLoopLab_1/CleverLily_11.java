package LoopsForWhileAndNested_3.ForLoopLab_1;

import java.util.Scanner;

public class CleverLily_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());

        int countOfToys = 0;
        double money = 0;
        double currentBdayMoney = 10;

        for (int age = 1; age <= n; age++) {
            if (age % 2 != 0) {
                countOfToys++;

            } else {
                money += currentBdayMoney;
                currentBdayMoney += 10;
            }

        }
        money -= 1.00 * (n / 2);
        double totalMoney = money + (countOfToys * toyPrice);
        double diff = Math.abs(totalMoney - price);
        if (totalMoney >= price) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }


    }
}
