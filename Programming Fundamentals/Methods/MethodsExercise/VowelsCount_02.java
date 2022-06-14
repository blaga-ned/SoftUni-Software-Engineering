package Methods.MethodsExercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        printVowelsCount(text);
    }

    private static void printVowelsCount(String text) {
        int count = 0;
        for (int i = 0; i <= text.length() - 1; i++) {
            char currentSymbol = text.charAt(i);
            switch (currentSymbol){
                case 'a':
                case 'e':
                case 'u':
                case 'o':
                case 'i':
                    count++;
                    break;
            }
        }
        System.out.println(count);

    }
}
