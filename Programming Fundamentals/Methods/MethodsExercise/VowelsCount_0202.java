package Methods.MethodsExercise;

import java.util.Scanner;

public class VowelsCount_0202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        int count = getVowelsCount(text);
        System.out.println(count);
    }

    private static int getVowelsCount (String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if (currentSymbol == 'a' || currentSymbol == 'e' ||
            currentSymbol == 'o' || currentSymbol == 'i' || currentSymbol == 'u'){
                count++;
            }
        }
        return count;
    }
}
