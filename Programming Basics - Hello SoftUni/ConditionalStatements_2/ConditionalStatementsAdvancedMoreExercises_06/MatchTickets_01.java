package ConditionalStatements_2.ConditionalStatementsAdvancedMoreExercises_06;

import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numPeople = Integer.parseInt(scanner.nextLine());


        double ticketPrice = 0;
        double transportExpenses = 0;

        if (category.equals("VIP")) {
            ticketPrice = 499.99;
            if (numPeople >= 1 && numPeople <= 4) {
                transportExpenses = budget - (budget * 0.75);
                ticketPrice = numPeople * ticketPrice;

            } else if (numPeople >= 5 && numPeople <= 9) {
                transportExpenses = budget - (budget * 0.60);
                ticketPrice = numPeople * ticketPrice;

            } else if (numPeople >= 10 && numPeople <= 24) {
                transportExpenses = budget - (budget * 0.50);
                ticketPrice = numPeople * ticketPrice;

            } else if (numPeople >= 25 && numPeople <= 49) {
                transportExpenses = budget - (budget * 0.40);
                ticketPrice = numPeople * ticketPrice;

            } else if (numPeople >= 50) {
                transportExpenses = budget - (budget * 0.25);
                ticketPrice = numPeople * ticketPrice;

            }

        } else if (category.equals("Normal")) {
            ticketPrice = 249.99;
            if (numPeople >= 1 && numPeople <= 4) {
                transportExpenses = budget - (budget * 0.75);
                ticketPrice = numPeople * ticketPrice;

            } else if (numPeople >= 5 && numPeople <= 9) {
                transportExpenses = budget - (budget * 0.60);
                ticketPrice = numPeople * ticketPrice;

            } else if (numPeople >= 10 && numPeople <= 24) {
                transportExpenses = budget - (budget * 0.50);
                ticketPrice = numPeople * ticketPrice;

            } else if (numPeople >= 25 && numPeople <= 49) {
                transportExpenses = budget - (budget * 0.40);
                ticketPrice = numPeople * ticketPrice;

            } else if (numPeople >= 50) {
                transportExpenses = budget - (budget * 0.25);
                ticketPrice = numPeople * ticketPrice;
            }

        }
        if (transportExpenses >= ticketPrice) {
            double diff = transportExpenses - ticketPrice;
            System.out.printf("Yes! You have %.2f leva left.", diff);

        } else {
            double diff = ticketPrice - transportExpenses;
            System.out.printf("Not enough money! You need %.2f leva.", diff);

        }


    }
}

