package ConditionalStatements_2.ConditionalStatementsAdvancedExercises_04;

import java.util.Scanner;

public class Volleyball_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double volleyballTime = 0.0;

        volleyballTime += (48 - h) * 3.0/4;
        volleyballTime += p * 2.0/3;
        volleyballTime += h;

        if (year.equals("leap")){
            volleyballTime *= 1.15;
        }

        System.out.printf("%.0f", Math.floor(volleyballTime));

    }
}
