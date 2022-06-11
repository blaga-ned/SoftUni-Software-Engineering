package FirstStepsInCodding_1.FirstStepsInCoddingMoreExercises;

import java.util.Scanner;

public class FishLand_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPriceKg = Double.parseDouble(scanner.nextLine());
        double spratPriceKg = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        int musselsKg = Integer.parseInt(scanner.nextLine());

        double bonitoPriceKg = mackerelPriceKg + mackerelPriceKg*0.60;
        double bonitoSum = bonitoPriceKg*bonitoKg;
        double scadPriceKg = spratPriceKg + spratPriceKg*0.80;
        double scadSum = scadPriceKg*scadKg;
        double musselsSum = 7.5*musselsKg;

        double moneyNeeded = bonitoSum + scadSum + musselsSum;
        System.out.printf("%.2f", moneyNeeded);




    }
}
