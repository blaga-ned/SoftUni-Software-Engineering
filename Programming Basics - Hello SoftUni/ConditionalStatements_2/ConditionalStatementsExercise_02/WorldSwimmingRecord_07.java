package ConditionalStatements_2.ConditionalStatementsExercise_02;

import java.util.Scanner;

public class WorldSwimmingRecord_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double secForOneMetre = Double.parseDouble(scanner.nextLine());

        double finalWaterSlower = Math.floor(distanceInMetres / 15)*12.5;
        double result = distanceInMetres * secForOneMetre;
        double finalResult = result + finalWaterSlower;
        double dif = 0;

        if (finalResult<recordInSec){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalResult);
        }else if (finalResult>=recordInSec){
            dif = finalResult-recordInSec;
            System.out.printf("No, he failed! He was %.2f seconds slower.",dif);
        }

    }
}
