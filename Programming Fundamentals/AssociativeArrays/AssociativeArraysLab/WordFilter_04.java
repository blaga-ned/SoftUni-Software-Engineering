package AssociativeArrays.AssociativeArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" "))
                .filter(word -> word.length() % 2 == 0)
                .forEach(word -> System.out.println(word));
    }
}
