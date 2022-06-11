package ConditionalStatements_2.ConditionalStatementsAdvancedMoreExercises_06;

import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double priceVacation = 0;

        if (budget <= 1000){
            if (season.equals("Summer")){
                priceVacation = budget*0.65;
                System.out.printf("Alaska - Camp - %.2f",priceVacation);
            }else if (season.equals("Winter")){
                priceVacation = budget*0.45;
                System.out.printf("Morocco - Camp - %.2f",priceVacation);
            }

        }else if (budget > 1000 && budget <= 3000){
            if (season.equals("Summer")){
                priceVacation = budget*0.80;
                System.out.printf("Alaska - Hut - %.2f",priceVacation);
            }else if (season.equals("Winter")){
                priceVacation = budget*0.60;
                System.out.printf("Morocco - Hut - %.2f",priceVacation);
            }

        }else if (budget > 3000){
            if (season.equals("Summer")){
                priceVacation = budget*0.90;
                System.out.printf("Alaska - Hotel - %.2f",priceVacation);
            }else if (season.equals("Winter")){
                priceVacation = budget*0.90;
                System.out.printf("Morocco - Hotel - %.2f",priceVacation);
            }


        }
    }
}
