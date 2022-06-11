package Exam_4.ExamPreparation_1;

import java.util.Scanner;

public class TennisEquipment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerRacket = Double.parseDouble(scanner.nextLine());
        int numRackets = Integer.parseInt(scanner.nextLine());
        int numRunners = Integer.parseInt(scanner.nextLine());

        double totalRacket = numRackets*pricePerRacket;
        double pricePerRunners = pricePerRacket/6;
        double totalRunners = numRunners*pricePerRunners;
        double priceEquipment = (totalRacket+totalRunners)*0.20;

        double totalPrice = totalRacket + totalRunners + priceEquipment;
        double priceDjokovic = totalPrice / 8;
        double Sponsors = 7*totalPrice / 8;

        System.out.printf("Price to be paid by Djokovic %.0f%n",Math.floor(priceDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(Sponsors));

    }
}
