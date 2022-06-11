package ConditionalStatements_2.ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        if (town.equals("Sofia")){
            if (sales<=0){
                System.out.println("error");
            }else if (sales<=500){
                double sum = sales*0.05;
                System.out.printf("%.2f",sum);
            }else if (sales<=1000){
                double sum = sales*0.07;
                System.out.printf("%.2f",sum);
            }else if (sales<=10000){
                double sum = sales*0.08;
                System.out.printf("%.2f",sum);
            }else if (sales>10000){
                double sum = sales*0.12;
                System.out.printf("%.2f",sum);
            }
        }else if (town.equals("Varna")){
            if (sales<=0){
                System.out.println("error");
            }else if (sales<=500){
                double sum = sales*0.045;
                System.out.printf("%.2f",sum);
            }else if (sales<=1000){
                double sum = sales*0.075;
                System.out.printf("%.2f",sum);
            }else if (sales<=10000){
                double sum = sales*0.10;
                System.out.printf("%.2f",sum);
            }else if (sales>10000){
                double sum = sales*0.13;
                System.out.printf("%.2f",sum);
            }

        }else if (town.equals("Plovdiv")){
            if (sales<=0){
                System.out.println("error");
            }else if (sales<=500){
                double sum = sales*0.055;
                System.out.printf("%.2f",sum);
            }else if (sales<=1000){
                double sum = sales*0.08;
                System.out.printf("%.2f",sum);
            }else if (sales<=10000){
                double sum = sales*0.12;
                System.out.printf("%.2f",sum);
            }else if (sales>10000){
                double sum = sales*0.145;
                System.out.printf("%.2f",sum);
            }

        }else{
            System.out.println("error");
        }




            }
}
