package Methods.MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

         addAndSubtract(num1,num2,num3);
    }

    private static void addAndSubtract(int num1, int num2, int num3) {
        getTheSum(num1,num2,num3);

    }

    private static void getTheSum(int num1, int num2, int num3) {
        int sum = num1+num2;
        printResult(sum,num3);

    }

    private static void printResult(int sum, int num3) {
        int totalResult = sum - num3;
        System.out.println(totalResult);
    }


}
