package ConditionalStatements_2.ConditionalStatementsAdvancedMoreExercises_06;

import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numChrysanthemums = Integer.parseInt(scanner.nextLine());
        int numRoses = Integer.parseInt(scanner.nextLine());
        int numTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double flowersFirstPrice = 0;
        double totalFlowers = numChrysanthemums+numRoses+numTulips;
        double totalPrice = 0;

        if (season.equals("Spring")){
            flowersFirstPrice = numChrysanthemums*2.00 + numRoses*4.10 + numTulips*2.50;
            if (holiday.equals("Y")){
                flowersFirstPrice = flowersFirstPrice +(flowersFirstPrice*0.15);
            }else if (holiday.equals("N")){
                flowersFirstPrice = flowersFirstPrice;
            }
            if (numTulips >= 7){
                flowersFirstPrice = flowersFirstPrice * 0.95;
            }

        }else if (season.equals("Summer")){
            flowersFirstPrice = numChrysanthemums*2.00 + numRoses*4.10 + numTulips*2.50;
            if (holiday.equals("Y")){
                flowersFirstPrice = flowersFirstPrice +(flowersFirstPrice*0.15);
            }else if (holiday.equals("N")){
                flowersFirstPrice = flowersFirstPrice;
            }

        }else if (season.equals("Autumn")){
            flowersFirstPrice = numChrysanthemums*3.75 + numRoses*4.50 + numTulips*4.15;
            if (holiday.equals("Y")){
                flowersFirstPrice = flowersFirstPrice +(flowersFirstPrice*0.15);
            }else if (holiday.equals("N")){
                flowersFirstPrice = flowersFirstPrice;
            }

        }else if (season.equals("Winter")){
            flowersFirstPrice = numChrysanthemums*3.75 + numRoses*4.50 + numTulips*4.15;
            if (holiday.equals("Y")){
                flowersFirstPrice = flowersFirstPrice +(flowersFirstPrice*0.15);
            }else if (holiday.equals("N")){
                flowersFirstPrice = flowersFirstPrice;
            }
            if (numRoses >= 10){
                flowersFirstPrice = flowersFirstPrice * 0.90;
            }

        }
        if (totalFlowers >= 20){
            flowersFirstPrice = flowersFirstPrice*0.80;
        }
        totalPrice = flowersFirstPrice+2;
        System.out.printf("%.2f",totalPrice);

    }
}
