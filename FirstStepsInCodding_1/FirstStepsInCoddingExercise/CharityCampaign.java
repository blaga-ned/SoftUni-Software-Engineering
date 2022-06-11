package FirstStepsInCodding_1.FirstStepsInCoddingExercise;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int backers = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double sumCakes = cakes*45;
        double sumWaffles = waffles*5.80;
        double sumPancakes = pancakes*3.20;
        double totalSumPerDay = (sumCakes + sumWaffles + sumPancakes)*backers;
        double totalSum = totalSumPerDay * days;
        double result = totalSum - (totalSum/8);

        System.out.printf("%.2f", result);


    }
}
