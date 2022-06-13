package Arrays.ArraysExercise;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countRotations; i++) {
            String firstElement = numbers[0];
            for (int j = 0; j < numbers.length - 1; j++){
                numbers[j] = numbers[j + 1];
            }
            numbers[numbers.length - 1] = firstElement;

        }
        System.out.println(String.join(" ",numbers));
    }
}
