package ConditionalStatements_2.ConditionalStatementsAdvancedMoreExercises_06;

import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numJuniors = Integer.parseInt(scanner.nextLine());
        int numSeniors = Integer.parseInt(scanner.nextLine());
        String typeRoad = scanner.nextLine();

        double sumCollected = 0;
        double totalSum = 0;
        int totalJuniorSeniors = 0;

        if (typeRoad.equals("trail")) {
            sumCollected = numJuniors*5.5 + numSeniors*7;
            totalSum = sumCollected*0.95;

        } else if (typeRoad.equals("cross-country")) {
            totalJuniorSeniors = numJuniors+numSeniors;
            if (totalJuniorSeniors>=50){
                sumCollected = numJuniors*6 +numSeniors*7.125;
                totalSum = sumCollected*0.95;

            }else{
                sumCollected = numJuniors*8 + numSeniors*9.50;
                totalSum =sumCollected*0.95;

            }

        } else if (typeRoad.equals("downhill")) {
            sumCollected = numJuniors*12.25 + numSeniors*13.75;
            totalSum = sumCollected*0.95;

        } else if (typeRoad.equals("road")) {
            sumCollected = numJuniors*20 + numSeniors*21.5;
            totalSum = sumCollected*0.95;

        }
        System.out.printf("%.2f",totalSum);


    }
}
