package FirstStepsInCodding_1.FirstStepsInCodding_01;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double yardGreening = Double.parseDouble(scanner.nextLine());
        double price = yardGreening*7.61;
        double discount = price*0.18;
        double finalPrice = price - discount;

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.%n", discount);


    }
}
