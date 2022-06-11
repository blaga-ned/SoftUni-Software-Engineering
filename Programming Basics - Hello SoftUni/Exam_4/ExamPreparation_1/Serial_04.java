package Exam_4.ExamPreparation_1;

import java.util.Scanner;

public class Serial_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countSeries = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countSeries ; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            switch (name) {
                case "Thrones":
                    price = price - 0.50 * price;   // price*0.5
                    break;
                case "Lucifer":
                    price = price - 0.40 * price; //price*0.4
                    break;
                case "Protector":
                    price = price - 0.30 * price; //price*0.3
                    break;
                case "TotalDrama":
                    price = price - 0.2 * price;  //price*0.2
                    break;
                case "Area":
                    price = price - 0.10 * price; //price*0.1
                    break;
            }
             budget -= price;
            
        }
        if (budget >= 0 ){
            System.out.printf("You bought all the series and left with %.2f lv.",budget);

        }else{
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget));
        }

    }
}
