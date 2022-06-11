package FirstStepsInCodding_1.FirstStepsInCoddingMoreExercises;

import java.util.Scanner;

public class TriangleArea_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double area = side * height/2;
        System.out.printf("%.2f", area);
    }
}
