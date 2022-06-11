package Exam_4.PreExam_3;

import java.util.Scanner;

public class AndProcessors_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededProcessor = Integer.parseInt(scanner.nextLine());
        int numPeople = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int numHours = days * numPeople * 8;
        double processorsDone = Math.floor(numHours*1.0/3);


        if (neededProcessor > processorsDone){
            double diff = neededProcessor - processorsDone;
            double losses = diff * 110.10;
            System.out.printf("Losses: -> %.2f BGN",losses);

        }else{
            double diff = neededProcessor - processorsDone;
            double profit = Math.abs(diff * 110.10);
            System.out.printf("Profit: -> %.2f BGN",profit);

        }
    }
}
