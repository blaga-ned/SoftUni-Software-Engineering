package Methods.MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_0102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(getSmallestNumber(numbers));

    }

    private static int getSmallestNumber(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber < min) {
                min = currentNumber;
            }
        }
        return min;
    }
}
