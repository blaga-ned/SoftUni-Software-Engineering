package FunctionalProgrammingLab;

import java.util.Scanner;
import java.util.function.BiFunction;

public class BiFunctionSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(", ");

        System.out.println("Count = " + numbers.length);

        BiFunction<Integer, String, Integer> parseAndSum = (x, y) -> x + Integer.parseInt(y);
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = parseAndSum.apply(sum, numbers[i]);
        }
        System.out.println("Sum = " + sum);
    }
}
