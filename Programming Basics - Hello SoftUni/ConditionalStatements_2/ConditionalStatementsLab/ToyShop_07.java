package ConditionalStatements_2.ConditionalStatements_01;

import java.util.Scanner;

public class ToyShop_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int numPuzzles = Integer.parseInt(scanner.nextLine());
        int numTalkingDolls = Integer.parseInt(scanner.nextLine());
        int numTeddyBears = Integer.parseInt(scanner.nextLine());
        int numMinions = Integer.parseInt(scanner.nextLine());
        int numCars = Integer.parseInt(scanner.nextLine());


        double sales = numPuzzles * 2.60 + numTalkingDolls * 3.00 +
                numTeddyBears * 4.10 + numMinions * 8.20 + numCars * 2.00;
        int countToys = numPuzzles + numTalkingDolls +
                numTeddyBears + numMinions + numCars;
        if (countToys >= 50){
            sales = sales * 0.75;
        }
        double finalAmount = sales * 0.9;

        if (finalAmount >= tripPrice){
            System.out.printf("Yes! %.2f lv left.",finalAmount - tripPrice);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - finalAmount);
        }


    }
}
