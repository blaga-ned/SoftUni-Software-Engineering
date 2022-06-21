package SetsAndMapsAdvanced.SetsAndMapsAdvancedLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Largest3Numbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((a,b) -> b.compareTo(a)).limit(3)
                .forEach(number -> System.out.printf("%d ", number));

    }
}
