package ConditionalStatements_2.ConditionalStatementsAdvancedExercises_04;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numNights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;

        if (month.equals("May")) {
            if (numNights <= 7) {
                priceStudio = numNights * 50;
                priceApartment = numNights * 65;
            } else if (numNights <= 14) {
                priceStudio = (numNights * 50) * 0.95;
                priceApartment = numNights * 65;
            } else {
                priceStudio = (numNights * 50) * 0.70;
                priceApartment = (numNights * 65) * 0.90;

            }
        } else if (month.equals("October")) {
            if (numNights <= 7) {
                priceStudio = numNights * 50;
                priceApartment = numNights * 65;
            } else if (numNights <= 14) {
                priceStudio = (numNights * 50) * 0.95;
                priceApartment = numNights * 65;
            } else {
                priceStudio = (numNights * 50) * 0.70;
                priceApartment = (numNights * 65) * 0.90;

            }
        } else if (month.equals("June")) {
            if (numNights <= 14) {
                priceStudio = numNights * 75.20;
                priceApartment = numNights * 68.70;

            } else {
                priceStudio = (numNights * 75.20) * 0.80;
                priceApartment = (numNights * 68.70) * 0.90;
            }
        } else if (month.equals("September")) {
            if (numNights <= 14) {
                priceStudio = numNights * 75.20;
                priceApartment = numNights * 68.70;

            } else{
                priceStudio = (numNights * 75.20) * 0.80;
                priceApartment = (numNights * 68.70) * 0.90;
            }


        } else if (month.equals("July")) {
            if (numNights <= 14) {
                priceStudio = numNights * 76;
                priceApartment = numNights * 77;
            } else {
                priceStudio = numNights * 76;
                priceApartment = (numNights * 77) * 0.90;
            }

        } else if (month.equals("August")) {
            if (numNights <= 14) {
                priceStudio = numNights * 76;
                priceApartment = numNights * 77;
            } else {
                priceStudio = numNights * 76;
                priceApartment = (numNights * 77) * 0.90;
            }


        }
        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);


    }


}
