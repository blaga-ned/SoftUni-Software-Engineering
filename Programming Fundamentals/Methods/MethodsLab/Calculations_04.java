package Methods.MethodsLab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        //add", "multiply", "subtract", "divide


        switch (command){
            case "add":
                addMetod(num1, num2);
                break;
            case "multiply":
                multiplyMetod(num1, num2);
                break;
            case "subtract":
                subtractMetod(num1, num2);
                break;
            case "divide":
                divideMetod(num1, num2);
                break;
        }
    }

    private static void addMetod(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    private static void multiplyMetod(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    private static void subtractMetod(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    private static void divideMetod(int num1, int num2) {
        System.out.println(num1 / num2);
    }


}