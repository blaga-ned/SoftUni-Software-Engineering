package FirstStepsInCodding_1.FirstStepsInCoddingMoreExercises;

import java.util.Scanner;

public class TrapeziodArea_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideA = Double.parseDouble(scanner.nextLine());
        double sideB = Double.parseDouble(scanner.nextLine());
        double hightH = Double.parseDouble(scanner.nextLine());

        double area = (sideA + sideB)* hightH/2;
        System.out.printf("%.2f", area);


    }
}
