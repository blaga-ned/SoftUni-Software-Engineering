package SetsAndMapsAdvanced.SetsAndMapsAdvancedExercise;

import java.util.*;

public class HandsOfCards_0702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] tokens = input.split(":\\s+");
            String playerName = tokens[0];
            String cardsTokens = tokens[1];

            players.putIfAbsent(playerName, new HashSet<>());

            String[] cards = cardsTokens.split(", ");
            //1st way
            Collections.addAll(players.get(playerName), cards);

            //2nd way
            /*for (int i = 0; i < cards.length; i++) {
                String currentCard = cards[i].trim();
                players.get(playerName).add(currentCard);
            }*/
            input = scanner.nextLine();
        }
        for (var player : players.entrySet()) {
            String name = player.getKey();
            int points = calculatePoints(player.getValue());
            System.out.printf("%s: %d%n", name, points);
        }
    }

    private static int calculatePoints(Set<String> cards) {
        int points = 0;
        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            String colour = card.substring(card.length() - 1);
            int cardPoint = getPower(power) * getColour(colour);
            points += cardPoint;
        }
        return points;
    }

    private static int getColour(String colour) {
        switch (colour) {
            case "S":
                return 4;
            case "H":
                return 3;
            case "D":
                return 2;
            case "C":
                return 1;
        }
        return 0;
    }

    private static int getPower(String power) {
        switch (power) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
        }
        return 0;
    }
}
