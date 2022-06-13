package Arrays.ArraysExercise;


import java.util.Arrays;
import java.util.Scanner;

public class MyExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();


        boolean isEquals = true;
        for (int i = 0; i < numbers.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int j = i - 1; j >= 0; j--) {
                leftSum += numbers[j];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum) {
                System.out.print(i);
                isEquals = true;
                break;
            }
        }
        if (isEquals) {
            System.out.print("no");
        }

    }
}




