package AssociativeArrays.AssociativeArraysExercise;

import java.util.*;

public class CountCharsInString_0102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String text = scanner.nextLine();
        Map<Character, Integer> charsCount = new LinkedHashMap<>();

       for (char symbol : text.toCharArray()){
           if (symbol == ' '){
               continue;
           }
           if (!charsCount.containsKey(symbol)){
               charsCount.put(symbol, 1);
           }else{
               int currentCount = charsCount.get(symbol);
               charsCount.put(symbol, currentCount+1);
           }
       }
        //charsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        for (Map.Entry<Character, Integer> entry : charsCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
