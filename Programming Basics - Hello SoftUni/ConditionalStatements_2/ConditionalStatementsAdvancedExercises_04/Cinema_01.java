package ConditionalStatements_2.ConditionalStatementsAdvancedExercises_04;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        switch (projection) {
            case "Premiere":
                sum = (rows * columns) * 12.00;
                break;

            case "Normal":
                sum = (rows*columns)*7.50;
                break;

            case "Discount":
                sum = (rows*columns)*5.00;
                break;

        }
        System.out.printf("%.2f leva",sum);


    }
}
