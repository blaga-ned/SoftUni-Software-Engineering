package ConditionalStatements_2.ConditionalStatementsAdvancedMoreExercises_06;

import java.util.Scanner;

public class CarToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double priceCar = 0;

        if (budget <= 100) {
            if (season.equals("Summer")) {
                priceCar = budget * 0.35;
                System.out.println("Economy class");
                System.out.printf("Cabrio - %.2f", priceCar);
            } else if (season.equals("Winter")) {
                priceCar = budget * 0.65;
                System.out.println("Economy class");
                System.out.printf("Jeep - %.2f", priceCar);
            }
        } else if (budget > 100 && budget <= 500) {
            if (season.equals("Summer")) {
                priceCar = budget * 0.45;
                System.out.println("Compact class");
                System.out.printf("Cabrio - %.2f", priceCar);
            } else if (season.equals("Winter")) {
                priceCar = budget * 0.80;
                System.out.println("Compact class");
                System.out.printf("Jeep - %.2f", priceCar);
            }
        } else if (budget > 500) {
            priceCar = budget * 0.90;
            System.out.println("Luxury class");
            System.out.printf("Jeep - %.2f", priceCar);

        }
    }
}
