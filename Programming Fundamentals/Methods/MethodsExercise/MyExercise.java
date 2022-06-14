package Methods.MethodsExercise;

import java.util.Scanner;

public class MyExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            if (isSumDigitsDivisible(i) && holdsOddDigits(i)){
                System.out.println(i);
            }

        }
    }

    public static boolean isSumDigitsDivisible(int i) {
        int sum = 0;
        while (i > 0) {
            int lastDigit = i % 10;
            sum += lastDigit;
            i = i / 10;
        }
        return sum % 8 == 0;
    }

    private static boolean holdsOddDigits(int i) {
        while (i > 0){
            int lastDigit = i % 10;
            if (lastDigit % 2 == 1){
                return true;
            }
            i = i / 10;
        }
        return false;
    }

}
