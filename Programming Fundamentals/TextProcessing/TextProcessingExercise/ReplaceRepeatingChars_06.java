package TextProcessing.TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        StringBuilder newText = new StringBuilder();

        char firstLetter = inputText.charAt(0);
        newText.append(firstLetter);
        for (int i = 1; i < inputText.length(); i++) {
            char currentSymbol = inputText.charAt(i);
            char lastAddedSymbolInNewText = newText.charAt(newText.length()-1);
            if (currentSymbol != lastAddedSymbolInNewText){
                newText.append(currentSymbol);
            }
        }
        System.out.println(newText);

    }
}
