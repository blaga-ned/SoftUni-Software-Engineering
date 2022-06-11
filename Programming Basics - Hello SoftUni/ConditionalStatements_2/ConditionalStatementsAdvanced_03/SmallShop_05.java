package ConditionalStatements_2.ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double pricePerProduct = 0;

        if (town.equals("Sofia")){
            if(product.equals("coffee")){
                pricePerProduct = 0.50;
            }else if(product.equals("water")){
                pricePerProduct = 0.80;
            }else if(product.equals("beer")){
                pricePerProduct = 1.20;
            }else if(product.equals("sweets")){
                pricePerProduct = 1.45;
            }else if(product.equals("peanuts")){
                pricePerProduct = 1.60;
            }
        }else if(town.equals("Plovdiv")){
            if(product.equals("coffee")){
                pricePerProduct = 0.40;
            }else if(product.equals("water")){
                pricePerProduct = 0.70;
            }else if(product.equals("beer")){
                pricePerProduct = 1.15;
            }else if(product.equals("sweets")){
                pricePerProduct = 1.30;
            }else if(product.equals("peanuts")){
                pricePerProduct = 1.50;
            }

        }else if(town.equals("Varna")){
            if(product.equals("coffee")){
                pricePerProduct = 0.45;
            }else if(product.equals("water")){
                pricePerProduct = 0.70;
            }else if(product.equals("beer")){
                pricePerProduct = 1.10;
            }else if(product.equals("sweets")){
                pricePerProduct = 1.35;
            }else if(product.equals("peanuts")){
                pricePerProduct = 1.55;
            }

        }
        double sum = pricePerProduct*quantity;
        System.out.println(sum);

    }
}
