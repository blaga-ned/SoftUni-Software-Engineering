package Methods.MethodsLab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        //•	coffee – 1.50
        //•	water – 1.00
        //•	coke – 1.40
        //•	snacks – 2.00

        printPrice(product, quantity);
    }

    private static void printPrice(String product, double quantity) {
        double result = 0;
        switch (product){
            case "coffee":
                result = quantity * 1.50;
                break;
            case "water":
                result = quantity * 1.00;
                break;
            case "coke":
                result = quantity * 1.40;
                break;
            case "snacks":
                result = quantity * 2.00;
                break;
        }
        System.out.printf("%.2f", result);
    }
}
