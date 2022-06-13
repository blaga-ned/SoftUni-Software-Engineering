package BasicSyntaxConditionalStatementAndLoops.BasicSyntaxConditionalStatementAndLoopsLab;

import java.util.Scanner;

public class RefactorSumOfOddNumbers_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= number + count ; i+=2) {
            System.out.println(i);
            count++;
            sum+=number;

        }
        System.out.println("Sum: " + sum);
    }
}

