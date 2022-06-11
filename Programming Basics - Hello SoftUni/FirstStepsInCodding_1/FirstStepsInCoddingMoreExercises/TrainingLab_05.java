package FirstStepsInCodding_1.FirstStepsInCoddingMoreExercises;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wCm = w * 100;
        double hCm = (h * 100) - 100;

        double hTables = Math.floor(hCm / 70);
        double wTables = Math.floor(wCm / 120);


        double result = hTables * wTables - 3;

        System.out.printf("%.0f", result);

    }
}
