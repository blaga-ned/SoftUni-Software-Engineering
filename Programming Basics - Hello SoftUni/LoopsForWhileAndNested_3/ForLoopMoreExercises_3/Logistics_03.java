package LoopsForWhileAndNested_3.ForLoopMoreExercises_3;

import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLoading = Integer.parseInt(scanner.nextLine());

        double minivan = 0;
        double truck = 0;
        double train = 0;
        double averageLoading = 0;
        double totalLoading = 0;
        double percentageMinivan = 0;
        double percentageTruck = 0;
        double percentageTrain = 0;

        for (int i = 1; i <= numLoading; i++) {
            int loadingTon = Integer.parseInt(scanner.nextLine());
            totalLoading += loadingTon;
            if (loadingTon <= 3) {
                minivan += loadingTon;
            } else if (loadingTon >= 4 && loadingTon <= 11) {
                truck += loadingTon;
            } else if (loadingTon >= 12) {
                train+=loadingTon;
            }


        }
        averageLoading = (minivan*200 + truck*175 + train*120)/totalLoading;
        percentageMinivan = minivan/totalLoading*100;
        percentageTruck = truck/totalLoading*100;
        percentageTrain = train/totalLoading*100;

        System.out.printf("%.2f%n",averageLoading);
        System.out.printf("%.2f%%%n", percentageMinivan);
        System.out.printf("%.2f%%%n", percentageTruck);
        System.out.printf("%.2f%%%n", percentageTrain);
    }
}
