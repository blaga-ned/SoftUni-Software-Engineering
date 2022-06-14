package Lists.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHandOfCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondHandOfCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumFirstPlayer = 0;
        int sumSecondPlayer = 0;

        for (int i = 0; i < firstHandOfCards.size(); i++) {
            for (int j = 0; j < secondHandOfCards.size(); j++) {

                int firstPlayerCurrentCard = firstHandOfCards.get(i);
                int secondPlayerCurrentCard = secondHandOfCards.get(j);

                if (firstPlayerCurrentCard > secondPlayerCurrentCard) {
                    firstHandOfCards.add(firstPlayerCurrentCard);
                    firstHandOfCards.add(secondPlayerCurrentCard);

                    firstHandOfCards.remove(0);
                    secondHandOfCards.remove(0);
                    j--;
                    if (firstHandOfCards.size() == 0 || secondHandOfCards.size() == 0) {
                        break;
                    }

                } else if (secondPlayerCurrentCard > firstPlayerCurrentCard) {
                    secondHandOfCards.add(secondPlayerCurrentCard);
                    secondHandOfCards.add(firstPlayerCurrentCard);

                    secondHandOfCards.remove(0);
                    firstHandOfCards.remove(0);
                    j--;

                    if (firstHandOfCards.size() == 0 || secondHandOfCards.size() == 0) {
                        break;
                    }
                } else if (secondPlayerCurrentCard == firstPlayerCurrentCard) {
                    secondHandOfCards.remove(0);
                    firstHandOfCards.remove(0);
                    j--;

                    if (firstHandOfCards.size() == 0 || secondHandOfCards.size() == 0) {
                        break;
                    }
                }
            }
        }
        if (firstHandOfCards.size() > secondHandOfCards.size()) {
            for (int number : firstHandOfCards) {
                sumFirstPlayer += number;
            }
            System.out.printf("First player wins! Sum: %d", sumFirstPlayer);

        } else if (secondHandOfCards.size() > firstHandOfCards.size()) {
            for (int number : secondHandOfCards) {
                sumSecondPlayer += number;
            }
            System.out.printf("Second player wins! Sum: %d", sumSecondPlayer);

        }
    }
}
