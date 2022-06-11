package FirstStepsInCodding_1.FirstStepsInCoddingExercise;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rad = Double.parseDouble(scanner.nextLine());
        double degree = rad * 180/Math.PI;
        System.out.printf("%.0f", degree);
    }
}
