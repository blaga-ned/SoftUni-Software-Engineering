package SetsAndMapsAdvanced.SetsAndMapsAdvancedLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<String, Map<String, Double>> shopsData = new TreeMap<>();
        while (!text.equals("Revision")) {
            String[] data = text.split(", ");
            String shopName = data[0];
            String productName = data[1];
            double price = Double.parseDouble(data[2]);
            if (!shopsData.containsKey(shopName)) {
                shopsData.put(shopName, new LinkedHashMap<>());
                shopsData.get(shopName).put(productName, price);
            } else {
                shopsData.get(shopName).put(productName, price);
            }
            text = scanner.nextLine();
        }
        for(Map.Entry<String, Map<String, Double>> entry : shopsData.entrySet()){
            String nameShop = entry.getKey();
            Map<String, Double> products = entry.getValue();
            System.out.println(nameShop + "->");

            for (Map.Entry<String, Double> product : products.entrySet()){
                String currentProduct = product.getKey();
                double price = product.getValue();

                System.out.printf("Product: %s, Price: %.1f%n", currentProduct, price);
            }
        }
    }
}
