package Exam_4.ExamPreparation_1;

import java.util.Scanner;

public class AddBags_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOver20kg = Double.parseDouble(scanner.nextLine());
        double kg = Double.parseDouble(scanner.nextLine());
        int daysToTrip = Integer.parseInt(scanner.nextLine());
        int numBags = Integer.parseInt(scanner.nextLine());

        double pricePerBaggage = 0;

        if (kg < 10) {
            pricePerBaggage = 0.20 * priceOver20kg;
        } else if (kg >= 10 && kg <= 20) {
            pricePerBaggage = 0.50 * priceOver20kg;
        } else if (kg > 20) {
            pricePerBaggage = priceOver20kg;
        }
        if (daysToTrip > 30) {
            pricePerBaggage = pricePerBaggage + 0.10 * pricePerBaggage;
        } else if (daysToTrip >= 7) {
            pricePerBaggage = pricePerBaggage + 0.15 * pricePerBaggage;

        } else {
            pricePerBaggage = pricePerBaggage + 0.4 * pricePerBaggage;
        }


        double totalPrice = pricePerBaggage * numBags;

        System.out.printf("The total price of bags is: %.2f lv.", totalPrice);

    }
}
