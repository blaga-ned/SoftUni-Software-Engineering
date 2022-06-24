package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AddVAT_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] prices = scanner.nextLine().split(", ");
        Function<String, Double> parse = e -> Double.parseDouble(e);
        Function<Double, Double> addVat = e -> 1.2 * e;
        Consumer<Double> printer = e -> System.out.printf("%.2f%n", e);

        System.out.println("Prices with VAT:");
        Arrays.stream(prices)
                .map(parse)
                .map(addVat)
                .forEach(printer);
    }
}
