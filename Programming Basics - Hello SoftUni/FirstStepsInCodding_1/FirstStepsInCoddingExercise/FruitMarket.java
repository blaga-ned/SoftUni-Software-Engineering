package FirstStepsInCodding_1.FirstStepsInCoddingExercise;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double priceStrawberry = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double raspberriesKg = Double.parseDouble(scanner.nextLine());
        double strawberryKg = Double.parseDouble(scanner.nextLine());

        double priceRaspberries = priceStrawberry -(priceStrawberry*0.5);
        double priceOranges = priceRaspberries - (priceRaspberries*0.4);
        double priceBananas = priceRaspberries - (priceRaspberries*0.8);

        double sumStrawberry = strawberryKg*priceStrawberry;
        double sumRaspberry = raspberriesKg*priceRaspberries;
        double sumOranges = orangesKg*priceOranges;
        double sumBananas = bananasKg*priceBananas;
        double totalSum = sumStrawberry+sumRaspberry+sumOranges+sumBananas;
        System.out.printf("%.2f", totalSum);

    }
}
