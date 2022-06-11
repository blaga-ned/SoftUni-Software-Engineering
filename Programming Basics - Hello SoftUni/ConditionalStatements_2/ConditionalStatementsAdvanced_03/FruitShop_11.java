package ConditionalStatements_2.ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String weekDay = scanner.nextLine();
        double fruitPrice = Double.parseDouble(scanner.nextLine());

        double productPrice = 0;

        if (weekDay.equals("Monday") || weekDay.equals("Tuesday") || weekDay.equals("Wednesday")
                || weekDay.equals("Thursday") || weekDay.equals("Friday")) {
            if (fruit.equals("banana")) {
                productPrice = 2.50;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);


            } else if (fruit.equals("apple")) {
                productPrice = 1.20;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);


            } else if (fruit.equals("orange")) {
                productPrice = 0.85;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);


            } else if (fruit.equals("grapefruit")) {
                productPrice = 1.45;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);


            } else if (fruit.equals("kiwi")) {
                productPrice = 2.70;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);


            } else if(fruit.equals("pineapple")){
                productPrice = 5.50;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);


            }else if (fruit.equals("grapes")){
                productPrice = 3.85;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);


            }else{
                System.out.println("error");
            }

        }else if (weekDay.equals("Saturday")||weekDay.equals("Sunday")) {
            if (fruit.equals("banana")) {
                productPrice = 2.70;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);


            } else if (fruit.equals("apple")) {
                productPrice = 1.25;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);


            } else if (fruit.equals("orange")) {
                productPrice = 0.90;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);


            } else if (fruit.equals("grapefruit")) {
                productPrice = 1.60;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);


            } else if (fruit.equals("kiwi")) {
                productPrice = 3.00;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);


            } else if (fruit.equals("pineapple")) {
                productPrice = 5.60;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);


            } else if (fruit.equals("grapes")) {
                productPrice = 4.20;
                double sum = productPrice * fruitPrice;
                System.out.printf("%.2f", sum);
            }else{
                System.out.println("error");
            }
        }else{
            System.out.println("error");
        }




    }
}
