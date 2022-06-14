package TextProcessing.TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion_0702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        int strength = 0;

        for (int i = 0; i < sb.length(); i++) {
            char currentSymbol = sb.charAt(i);

            if (currentSymbol == '>'){
                strength += Integer.parseInt("" +sb.charAt(i+1));

            }else if (currentSymbol != '>' && strength > 0){
                sb.deleteCharAt(i);
                strength--;
                i--;

            }
        }
        System.out.println(sb);
    }
}