package ConditionalStatements_2.ConditionalStatementsAdvancedExercises_04;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String typeAccommodation = "";
        String destination = "";
        double sum = 0;

        if (budget <= 100) {
            destination = "Somewhere in Bulgaria";
            if (season.equals("summer")) {
                typeAccommodation = "Camp";
                sum = budget * 0.3;
            } else if (season.equals("winter")) {
                typeAccommodation = "Hotel";
                sum = budget * 0.7;
            }

        } else if (budget <= 1000) {
            destination = "Somewhere in Balkans";
            if (season.equals("summer")) {
                typeAccommodation = "Camp";
                sum = budget * 0.4;
            } else if (season.equals("winter")) {
                typeAccommodation = "Hotel";
                sum = budget * 0.8;
            }

        } else if (budget > 1000) {
            destination = "Somewhere in Europe";
            typeAccommodation = "Hotel";
            sum = budget*0.9;

        }
        System.out.println(destination);
        System.out.printf("%s - %.2f",typeAccommodation,sum);
    }
}
