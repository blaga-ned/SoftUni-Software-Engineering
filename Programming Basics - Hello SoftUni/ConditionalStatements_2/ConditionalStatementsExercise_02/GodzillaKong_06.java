package ConditionalStatements_2.ConditionalStatementsExercise_02;

import java.util.Scanner;

public class GodzillaKong_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double pricePerOneClothes = Double.parseDouble(scanner.nextLine());

        double decor = budget*0.10;
        double clothesPrice = people*pricePerOneClothes;

        if (people>=150){
            clothesPrice = clothesPrice - clothesPrice*0.10;

        }

     double totalExpenses = clothesPrice+decor;
        double finalPrice = 0;

        if (totalExpenses>budget){
            finalPrice = totalExpenses - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", finalPrice);
        }else if (totalExpenses<=budget){
            finalPrice = budget-totalExpenses;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",finalPrice);
        }

    }
}
