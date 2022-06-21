package SetsAndMapsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (!map.containsKey(symbol)) {
                map.put(symbol, 1);
            } else {
                int value = map.get(symbol);
                map.put(symbol, value+1);

            }
        }
        map.entrySet().forEach(e-> System.out.println(e.getKey() + ": " + e.getValue() + " time/s"));

    }
}
