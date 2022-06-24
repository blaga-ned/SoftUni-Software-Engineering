package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers_0101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringNumber = scanner.nextLine().split(", ");
        List<String> evenNumbers = Arrays.stream(stringNumber)
                .map(e -> Integer.parseInt(e))
                .filter(e -> e % 2 == 0)
                .map(e -> e.toString())
                .collect(Collectors.toList());

        System.out.println(String.join(", ", evenNumbers));
        evenNumbers = evenNumbers.stream()
                .map(e -> Integer.parseInt(e))
                .sorted()
                .map(e -> e.toString())
                .collect(Collectors.toList());
        System.out.println(String.join(", ", evenNumbers));


    }
}
