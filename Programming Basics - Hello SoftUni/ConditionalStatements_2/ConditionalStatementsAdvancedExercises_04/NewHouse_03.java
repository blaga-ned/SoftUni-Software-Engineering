package ConditionalStatements_2.ConditionalStatementsAdvancedExercises_04;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlower = scanner.nextLine();
        int amountFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double sumFlowers = 0;

        switch (typeFlower) {

            case "Roses":
                sumFlowers = amountFlower * 5;
                if (amountFlower > 80) {
                    sumFlowers = sumFlowers * 0.90;
                }
                break;

            case "Dahlias":
                sumFlowers = amountFlower * 3.80;
                if (amountFlower > 90) {
                    sumFlowers = sumFlowers * 0.85;
                }
                break;

            case "Tulips":
                sumFlowers = amountFlower * 2.80;
                if (amountFlower > 80) {
                    sumFlowers = sumFlowers * 0.85;
                }
                break;

            case "Narcissus":
                sumFlowers = amountFlower * 3;
                if (amountFlower < 120) {
                    sumFlowers = sumFlowers * 1.15;
                }
                break;

            case "Gladiolus":
                sumFlowers = amountFlower * 2.50;
                if (amountFlower < 80) {
                    sumFlowers = sumFlowers * 1.20;
                }
                break;
        }
        double difference = Math.abs(budget - sumFlowers);
        if (budget >= sumFlowers) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    amountFlower, typeFlower, difference);

        }
        if (budget < sumFlowers) {
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }


    }

}

