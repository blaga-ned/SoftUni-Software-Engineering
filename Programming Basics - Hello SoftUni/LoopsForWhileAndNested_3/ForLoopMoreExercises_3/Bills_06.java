package LoopsForWhileAndNested_3.ForLoopMoreExercises_3;

import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        int water = 20;
        double totalWater = 0;
        double internet = 15;
        double totalInternet = 0;
        double others = 0;
        double totalOthers = 0;
        double totalElectricity = 0;
        double total = 0;
        double average = 0;
        for (int i = 1; i <= months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());

            totalElectricity += electricity;
            totalWater += water;
            totalInternet += internet;
            total = water+internet+electricity;
            others = total*0.2 + total;
            totalOthers += others;


        }
        average = (totalWater+totalInternet+totalElectricity+totalOthers)/months;
        System.out.printf("Electricity: %.2f lv%n",totalElectricity);
        System.out.printf("Water: %.2f lv%n",totalWater);
        System.out.printf("Internet: %.2f lv%n",totalInternet);
        System.out.printf("Other: %.2f lv%n",totalOthers);
        System.out.printf("Average: %.2f lv%n",average);
    }
}
