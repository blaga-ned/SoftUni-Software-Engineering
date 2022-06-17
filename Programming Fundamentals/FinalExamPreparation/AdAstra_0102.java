package FinalExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_0102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "([#]|[|])(?<nameItem>[A-Za-z\\s+]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int totalCalories = 0;
        List<String> products = new ArrayList<>();

        while (matcher.find()){
             String nameItem = matcher.group("nameItem");
             String date = matcher.group("date");
             String calories = matcher.group("calories");
             int caloriesInt = Integer.parseInt(calories);
             String productsToAdd = nameItem + "," + date + "," + calories;

            totalCalories += caloriesInt;
            products.add(productsToAdd);


        }
        int daysToLast = totalCalories/2000;
        if (daysToLast <= 0){
            System.out.printf("You have food to last you for: %d days!%n", daysToLast);
        }else{
        System.out.printf("You have food to last you for: %d days!%n", daysToLast);
            for (String product : products) {
                String[] dataProduct = product.split(",");

                System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", dataProduct[0], dataProduct[1], dataProduct[2]);
            }

        }

    }
}
