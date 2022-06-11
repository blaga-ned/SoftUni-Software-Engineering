package Exam_4.PreExam_3;

import java.util.Scanner;

public class MiningRig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pricePerVideoCard = Integer.parseInt(scanner.nextLine());
        int pricePerAdapter = Integer.parseInt(scanner.nextLine());
        double priceElectricity = Double.parseDouble(scanner.nextLine());
        double earnPerCardPerDay = Double.parseDouble(scanner.nextLine());

        double priceCards = pricePerVideoCard * 13;
        double priceAdapter = pricePerAdapter * 13;
        double totalSpending = priceCards + priceAdapter + 1000;

        double earnCardDay = earnPerCardPerDay - priceElectricity;
        double totalEarnCards = 13 * earnCardDay;
        double daysToReturn = totalSpending/totalEarnCards;


        System.out.printf("%.0f%n" , Math.ceil(totalSpending));
        System.out.printf("%.0f" , Math.ceil(daysToReturn));
    }
}
