package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int sizeFirstSet = Integer.parseInt(input[0]);
        int sizeSecondSet = Integer.parseInt(input[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 1; i <= sizeFirstSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        for (int i = 1; i <= sizeSecondSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);

        }
        Set<Integer> duplicateElement = new LinkedHashSet<>();
        for (int number : firstSet) {
            if (secondSet.contains(number)){
                duplicateElement.add(number);
            }
        }
        duplicateElement.forEach(el -> System.out.print(el + " "));
    }
}
