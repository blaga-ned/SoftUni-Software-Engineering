package FirstStepsInCodding_1.FirstStepsInCoddingMoreExercises;

import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegKg = Double.parseDouble(scanner.nextLine());
        double priceFruitsKg = Double.parseDouble(scanner.nextLine());
        int totalVegKg = Integer.parseInt(scanner.nextLine());
        int totalFruitsKg = Integer.parseInt(scanner.nextLine());

        double costVeg = priceVegKg*totalVegKg;
        double costFruits = priceFruitsKg*totalFruitsKg;
        double totalCost = costVeg+costFruits;
        double costBgnToEuro = totalCost/1.94;
        System.out.printf("%.2f", costBgnToEuro);

    }
}
