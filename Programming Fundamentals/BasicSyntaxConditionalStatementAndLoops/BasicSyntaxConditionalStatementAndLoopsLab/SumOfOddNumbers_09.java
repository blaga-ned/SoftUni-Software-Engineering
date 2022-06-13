package BasicSyntaxConditionalStatementAndLoops.BasicSyntaxConditionalStatementAndLoopsLab;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;

        for (int i = 1; i <= number + counter; i += 2) {
            System.out.println(i);
            sum+=i;
            counter++;
        }
        System.out.println("Sum: " + sum);
    }
}
