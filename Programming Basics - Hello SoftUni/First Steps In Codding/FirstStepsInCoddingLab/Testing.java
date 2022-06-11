package FirstStepsInCodding_1.FirstStepsInCodding_01;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = Integer.parseInt(scanner.nextLine());
        double moneyWithdraw = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();

        System.out.println(money);
        System.out.println(moneyWithdraw);
        System.out.println(name);

    }

}
