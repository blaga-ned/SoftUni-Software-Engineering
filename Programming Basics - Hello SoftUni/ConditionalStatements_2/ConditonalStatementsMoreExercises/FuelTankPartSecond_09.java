package ConditionalStatements_2.ConditonalStatementsMoreExercises_05;

import java.util.Scanner;

public class FuelTankPartSecond_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOil = scanner.nextLine();
        double oilLitres = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double priceOil = 0;
        double sumPriceOil = 0;
        double totalPriceOil = 0;


        if (typeOil.equals("Gas")) {
            if (clubCard.equals("Yes")) {
                priceOil = 0.93 - 0.08;
                sumPriceOil = priceOil * oilLitres;
            } else if (clubCard.equals("No")){
                priceOil = 0.93;
                sumPriceOil = priceOil * oilLitres;
            }
        } else if (typeOil.equals("Gasoline")) {
            if (clubCard.equals("Yes")) {
                priceOil = 2.22 - 0.18;
                sumPriceOil = priceOil * oilLitres;
            } else if (clubCard.equals("No")){
                priceOil = 2.22;
                sumPriceOil = priceOil * oilLitres;
            }
        } else if (typeOil.equals("Diesel")) {
            if (clubCard.equals("Yes")) {
                priceOil = 2.33 - 0.12;
                sumPriceOil = priceOil * oilLitres;
            } else if (clubCard.equals("No")){
                priceOil = 2.33;
                sumPriceOil = priceOil * oilLitres;
            }

        }
        if (oilLitres >= 20 && oilLitres <= 25){
            totalPriceOil = sumPriceOil * 0.92;

        }else if (oilLitres > 25){
            totalPriceOil = sumPriceOil * 0.90;
        }else {
            totalPriceOil = sumPriceOil;
        }
        System.out.printf("%.2f lv.",totalPriceOil);
    }
}
