package AssociativeArrays.AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> lettersCount = new LinkedHashMap<>();

        for (int i = 0; i <= text.length() - 1; i++) {
            char currentSymbol = text.charAt(i);
            if (currentSymbol == ' ') {
                continue;
            }
            if (!lettersCount.containsKey(currentSymbol)) {
                lettersCount.put(currentSymbol, 1);
            } else {
                lettersCount.put(currentSymbol, lettersCount.get(currentSymbol) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        //moje da printirame i sas stream
        //lettersCount.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        //ili
        //lettersCount.forEach((k, v) -> System.out.println(k + " -> " + v));
        
        
    }
}
