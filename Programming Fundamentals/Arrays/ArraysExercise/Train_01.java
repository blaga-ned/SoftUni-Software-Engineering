package Arrays.ArraysExercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int number : numbers ) {
            System.out.print(number + " ");
            sum+=number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
