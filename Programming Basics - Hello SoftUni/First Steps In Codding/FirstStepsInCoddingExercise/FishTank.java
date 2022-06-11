package FirstStepsInCodding_1.FirstStepsInCoddingExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lengthSm = Double.parseDouble(scanner.nextLine());
        double widthSm = Double.parseDouble(scanner.nextLine());
        double heightSm = Double.parseDouble(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double volume = lengthSm*widthSm*heightSm;
        double LitresFit = volume * 0.001;
        double percent = percentage*0.01;
        double totalLitNeeded = LitresFit*(1-percent);
        System.out.printf("%.2f", totalLitNeeded);

    }
}
