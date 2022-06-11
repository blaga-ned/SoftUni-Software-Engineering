package ConditionalStatements_2.ConditionalStatementsAdvancedExercises_04;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numFisherman = Integer.parseInt(scanner.nextLine());

        double sumRentBoat = 0;
        if (season.equals("Spring")) {
            if (numFisherman <= 6) {
                sumRentBoat = 3000 * 0.95;
            } else if (numFisherman <= 11) {
                sumRentBoat = 3000 * 0.85;
            } else {
                sumRentBoat = 3000 * 0.75;
            }

        } else if (season.equals("Summer || Autumn")) {
            if (numFisherman <= 6) {
                sumRentBoat = 4200 * 0.9;
            } else if (numFisherman <= 11) {
                sumRentBoat = 4200 * 0.85;
            } else {
                sumRentBoat = 4200 * 0.75;
            }


        } else if (season.equals("Winter")) {
            if (numFisherman <= 6) {
                sumRentBoat = 2600 * 0.95;
            } else if (numFisherman <= 11) {
                sumRentBoat = 2600 * 0.85;
            } else {
                sumRentBoat = 2600 * 0.75;
            }

        }
        if (numFisherman % 2 == 0 && !season.equals("Autumn")) {
            sumRentBoat = sumRentBoat * 0.95;

        }

        double difference = Math.abs(budget - sumRentBoat);
        if (budget >= sumRentBoat) {
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else if (budget < sumRentBoat) {
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }
    }
}
