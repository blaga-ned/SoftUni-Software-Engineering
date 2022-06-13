package AssociativeArrays.AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!input.equals("buy")) {

            String product = input.split(" ")[0];
            double pricePerProduct = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            productsPrice.put(product, pricePerProduct);

            if (!productQuantity.containsKey(product)){
                productQuantity.put(product, quantity);
            }else{
                productQuantity.put(product, productQuantity.get(product) + quantity);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productsPrice.entrySet()){
            String productName = entry.getKey();
            double finalSum = entry.getValue() * productQuantity.get(productName);
            System.out.printf("%s -> %.2f%n",productName, finalSum);
        }
        //productQuantity.forEach((k, v)-> System.out.println(String.format("%s -> %.2f", k, v * productsPrice.get(k))));

    }
}
