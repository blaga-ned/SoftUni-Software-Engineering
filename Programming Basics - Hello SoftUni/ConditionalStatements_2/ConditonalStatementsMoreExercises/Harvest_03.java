package ConditionalStatements_2.ConditonalStatementsMoreExercises_05;

import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xKvM = Integer.parseInt(scanner.nextLine());
        double yOneKvMGrape = Double.parseDouble(scanner.nextLine());
        int neededWine = Integer.parseInt(scanner.nextLine());
        int numWorkers = Integer.parseInt(scanner.nextLine());

        double wine = xKvM * yOneKvMGrape;
        double totalWine = (wine * 0.4) / 2.5;


        if (totalWine >= neededWine){
            double diff = Math.ceil(totalWine - neededWine);
            double winePerPerson = Math.ceil(diff/numWorkers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.floor(totalWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",diff,winePerPerson);

        }else{
            double diff = Math.floor(neededWine - totalWine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",diff);

        }


    }
}
