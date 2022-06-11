package FirstStepsInCodding_1.FirstStepsInCoddingMoreExercises;

import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double xHeightHouse = Double.parseDouble(scanner.nextLine());
        double yleSide = Double.parseDouble(scanner.nextLine());
        double hHeightRoofSide = Double.parseDouble(scanner.nextLine());

        double sideWall = xHeightHouse*yleSide;
        double window = 1.5*1.5;
        double twoWalls = 2*sideWall-2*window;
        double backWall = xHeightHouse*xHeightHouse;
        double entrance = 1.2*2;
        double frontEnd = 2*backWall - entrance;
        double commonArea = twoWalls + frontEnd;
        double greenPaint = commonArea/3.4;

        double recRoof = 2 * (xHeightHouse*yleSide);
        double tria = 2 * (xHeightHouse*hHeightRoofSide/2);
        double triaCommonArea = recRoof+tria;
        double redPaint = triaCommonArea/4.3;

        System.out.printf("%.2f%n%.2f", greenPaint, redPaint);

    }
}
