package LoopsForWhileAndNested_3.NestedLoopsLab_7;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();


        while (!command.equals("End")){
            double budget = Double.parseDouble(scanner.nextLine());
            double money = 0;

            while (money < budget){
                double savedMoney = Double.parseDouble(scanner.nextLine());
                money+=savedMoney;
            }
            System.out.println("Going to " + command + "!");

            command = scanner.nextLine();
        }
    }
}
