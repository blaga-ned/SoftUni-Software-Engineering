package LoopsForWhileAndNested_3.ForLoopMoreExercises_3;

import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityStadium = Integer.parseInt(scanner.nextLine());
        int numFen = Integer.parseInt(scanner.nextLine());
        int a = 0;
        double percentageA = 0;
        int b = 0;
        double percentageB = 0;
        int v = 0;
        double percentageV = 0;
        int g = 0;
        double percentageG = 0;
        double totalPercentage = 0;
        for (int i = 1; i <= numFen; i++) {
            String sector = scanner.nextLine();
            if (sector.equals("A")) {
                a++;
            } else if (sector.equals("B")) {
                b++;
            } else if (sector.equals("V")) {
                v++;
            } else if (sector.equals("G")) {
                g++;
            }
        }

        System.out.printf("%.2f%%%n", percentageA=1.0 * a/numFen * 100);
        System.out.printf("%.2f%%%n", percentageB=1.0 * b/numFen * 100);
        System.out.printf("%.2f%%%n", percentageV=1.0*v/numFen*100);
        System.out.printf("%.2f%%%n", percentageG=1.0*g/numFen*100);
        System.out.printf("%.2f%%%n", totalPercentage=1.0*numFen/capacityStadium*100);

    }
}
