package BasicSyntaxConditionalStatementAndLoops.MoreExercises;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String text = "";
        for (int i = name.length() - 1; i >= 0 ; i--) {
            char currentSymbol = name.charAt(i);
            text+=currentSymbol;
        }
        System.out.println(text);
    }
}
