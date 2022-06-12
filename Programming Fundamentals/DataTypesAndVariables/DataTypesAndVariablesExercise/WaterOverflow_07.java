package DataTypesAndVariables.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());
        int capacityTank = 255;
        int currentLiters = 0;

        for (int i = 1; i <= numOfLines; i++) {
            int pouredLiters = Integer.parseInt(scanner.nextLine());
            currentLiters += pouredLiters;
            if (currentLiters > capacityTank) {
                System.out.println("Insufficient capacity!");
                currentLiters -= pouredLiters;
            }

        }
        System.out.println(currentLiters);
    }
}
