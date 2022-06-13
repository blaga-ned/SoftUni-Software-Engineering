package Arrays.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int count = 1;
        int maxLength = 0;
        int numbers = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
                if (count > maxLength) {
                    maxLength = count;
                    numbers = array[i];
                }
            } else {
                count = 1;
            }
        }
        for (int i = 0; i < maxLength; i++) {
            System.out.print(numbers + " ");
        }
    }
}
