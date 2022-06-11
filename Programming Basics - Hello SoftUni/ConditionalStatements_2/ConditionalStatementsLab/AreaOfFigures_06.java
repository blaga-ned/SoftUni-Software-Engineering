package ConditionalStatements_2.ConditionalStatements_01;

import java.util.Scanner;

public class AreaOfFigures_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        if(type.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            double squareArea = a*a;
            System.out.printf("%.3f", squareArea);

        }else if(type.equals("rectangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            double rectangleArea = sideA*sideB;
            System.out.printf("%.3f", rectangleArea);

        }else if(type.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            double areaCircle = Math.PI*radius*radius;
            System.out.printf("%.3f", areaCircle);

        }else if(type.equals("triangle")){
            double b = Double.parseDouble(scanner.nextLine());
            double hb = Double.parseDouble(scanner.nextLine());
            double triangleArea = b*hb/2;
            System.out.printf("%.3f", triangleArea);


        }

        }
}
